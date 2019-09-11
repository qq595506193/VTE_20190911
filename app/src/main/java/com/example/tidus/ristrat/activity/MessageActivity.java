package com.example.tidus.ristrat.activity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lib_core.base.mvp.BaseMvpActivity;
import com.example.lib_core.base.mvp.BasePresenter;
import com.example.tidus.ristrat.R;
import com.example.tidus.ristrat.adapter.MessageListAdapter;
import com.example.tidus.ristrat.application.App;
import com.example.tidus.ristrat.bean.LoginBean;
import com.example.tidus.ristrat.bean.MessageBean;
import com.example.tidus.ristrat.bean.MessageUpdateBean;
import com.example.tidus.ristrat.bean.QueryHMBean;
import com.example.tidus.ristrat.contract.IMessageContract;
import com.example.tidus.ristrat.mvp.presenter.MessagePresenter;
import com.example.tidus.ristrat.utils.LogUtils;
import com.jcodecraeer.xrecyclerview.XRecyclerView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import butterknife.BindView;

public class MessageActivity extends BaseMvpActivity<IMessageContract.IMessageModel, IMessageContract.MessagePresenter> implements IMessageContract.IMessageView {


    @BindView(R.id.xrv_message_list)
    XRecyclerView xrv_message_list;
    private ImageView iv_back;
    private TextView tv_back;
    private LoginBean loginBean;
    private Handler handler = new Handler();//加载刷新handler
    private boolean isloding;//是否加载
    private int PAGE = 1;
    private int COUNT = 10;
    private MessageListAdapter messageListAdapter;
    private List<MessageBean.ServerParamsBean.ListBean> list = new ArrayList<>();
    private ImageView iv_message;
    private TextView tv_login_name;
    private ImageView iv_close;
    private QueryHMBean.ServerParamsBean.LISTBean tixingListBean;


    @Override
    protected void init() {

    }

    @Override
    protected void initView(Intent intent) {
        loginBean = (LoginBean) intent.getSerializableExtra("loginBean");
        iv_back = findViewById(R.id.iv_back);
        tv_back = findViewById(R.id.tv_back);
        iv_message = findViewById(R.id.iv_message);
        iv_message.setVisibility(View.GONE);
        tv_login_name = findViewById(R.id.tv_login_name);
        tv_login_name.setText(loginBean.getServer_params().getUSER_NAME());
        iv_close = findViewById(R.id.iv_close);
        iv_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(App.getContext(), UserLoginActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                finish();
            }
        });
        iv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        tv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        messageListAdapter = new MessageListAdapter(App.getContext());
        xrv_message_list.setLayoutManager(new LinearLayoutManager(App.getContext()));
        xrv_message_list.setAdapter(messageListAdapter);
        xrv_message_list.setLoadingListener(new XRecyclerView.LoadingListener() {
            @Override
            public void onRefresh() {
                PAGE = 1;
                initPresenterData(PAGE);
                isloding = false;
                //设置定制刷新时间
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        xrv_message_list.refreshComplete();
                    }
                }, 2000);
            }

            @Override
            public void onLoadMore() {
                PAGE++;
                initPresenterData(PAGE);
                isloding = true;
                //设置定制刷新时间
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        xrv_message_list.refreshComplete();
                    }
                }, 2000);
            }
        });

        messageListAdapter.setSetMessageType(new MessageListAdapter.SetMessageType() {
            @Override
            public void onMessageType(int message_id, String message_content) {
                initMessageTypeChange(message_id);// 修改消息状态
                Intent intent = new Intent(MessageActivity.this, MessageItemActivity.class);
                intent.putExtra("message_content", message_content);
                intent.putExtra("loginBean", loginBean);
                startActivity(intent);
            }
        });

    }

    /**
     * 修改消息状态
     *
     * @param message_id
     */
    private void initMessageTypeChange(int message_id) {
        HashMap<String, Object> params = new HashMap<>();
        params.put("Type", "updateAS_User_MessageBybid");
        params.put("MESSAGE_ID", message_id);
        params.put("MESSAGE_STATUS", "1");
        presenter.getUpdateMessageType(params);
        LogUtils.e("修改消息状态" + params.toString());
    }

    @Override
    protected void initData() {
        super.initData();
        initPresenterData(PAGE);
    }

    /**
     * 查询消息列表
     *
     * @param PAGE
     */
    private void initPresenterData(int PAGE) {
        HashMap<String, Object> params = new HashMap<>();
        params.put("Type", "queryAS_User_MessageByuid");
        params.put("USER_ID", loginBean.getServer_params().getUSER_ID());
        params.put("PAGE", PAGE);
        params.put("PAGESIZE", COUNT);
        presenter.getMessage(params);
    }

    /**
     * 布局
     *
     * @return
     */
    @Override
    protected int bindLayoutId() {
        return R.layout.activity_message;
    }

    @Override
    public BasePresenter initPresenter() {
        return new MessagePresenter();
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void failure(String msg) {
        LogUtils.e(msg);
    }

    @Override
    public void onMessageSuccess(final Object result) {
        if (result != null) {
            if (result instanceof MessageBean) {
                if (((MessageBean) result).getCode().equals("0")) {
                    if (!isloding) {
                        list.clear();
                        list.addAll(((MessageBean) result).getServer_params().getList());
                        messageListAdapter.setListBeans(list);
                    } else {
                        list.addAll(((MessageBean) result).getServer_params().getList());
                        messageListAdapter.setListBeans(list);
                    }
                }
            }
        }
    }

    @Override
    public void onUpdateMessageTypeSuccess(Object result) {
        if (result != null) {
            if (result instanceof MessageUpdateBean) {
                if (((MessageUpdateBean) result).getCode().equals("0")) {
                    LogUtils.e("修改消息状态===" + ((MessageUpdateBean) result).getMessage());
                    initPresenterData(PAGE);
                    messageListAdapter.notifyDataSetChanged();
                }
            }
        }
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        //handler销毁
        handler.removeCallbacksAndMessages(null);
    }
}
