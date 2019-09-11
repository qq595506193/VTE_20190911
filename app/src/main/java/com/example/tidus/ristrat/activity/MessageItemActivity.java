package com.example.tidus.ristrat.activity;

import android.content.Intent;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lib_core.base.mvp.BaseMvpActivity;
import com.example.lib_core.base.mvp.BasePresenter;
import com.example.tidus.ristrat.R;
import com.example.tidus.ristrat.bean.LoginBean;
import com.example.tidus.ristrat.bean.MessageStartBean;
import com.example.tidus.ristrat.bean.MessageStratBean;
import com.example.tidus.ristrat.bean.TiaoBean;
import com.example.tidus.ristrat.contract.ICheckAssessStatusContract;
import com.example.tidus.ristrat.mvp.presenter.CheckAssessStatusPresenter;
import com.example.tidus.ristrat.utils.ToastUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.HashMap;
import java.util.List;

import butterknife.BindView;

public class MessageItemActivity extends BaseMvpActivity<ICheckAssessStatusContract.ICheckAssessStatusModel, ICheckAssessStatusContract.CheckAssessStatusPresenter> implements ICheckAssessStatusContract.ICheckAssessStatusView {

    @BindView(R.id.tv_message_item)
    TextView tv_message_item;

    private String TAG = "MessageItemActivity";
    private String message_content;// 单个一条的数据
    private ImageView iv_back;
    private TextView tv_back;
    private ImageView iv_close;
    private ImageView iv_message;
    private TextView tv_message_num;
    private TextView tv_login_name;
    private LoginBean loginBean;
    private SpannableString spanString;

    private String item_0;
    private String item_1;
    private String item_2;
    private int messageType = 0;
    private String patient_id;
    private String VISIT_SQ_NO;
    private String REPORT_ID;
    private MessageStartBean messageStratBean;


    @Override
    protected void initView(Intent intent) {
        // 接值
        initGetIntent(intent);
        // include控件
        initInclude();
        // 设置数据
        initMessageContent();
    }

    private void initInclude() {
        iv_back = findViewById(R.id.iv_back);
        iv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        tv_back = findViewById(R.id.tv_back);
        tv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        iv_close = findViewById(R.id.iv_close);
        iv_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MessageItemActivity.this, UserLoginActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                finish();
            }
        });
        iv_message = findViewById(R.id.iv_message);
        iv_message.setVisibility(View.GONE);// 隐藏消息图标
        tv_message_num = findViewById(R.id.tv_message_num);
        tv_login_name = findViewById(R.id.tv_login_name);
        tv_login_name.setText(loginBean.getServer_params().getUSER_NAME());
    }

    private void initMessageContent() {
        if (message_content != null && !"".equals(message_content)) {
            if (message_content.startsWith("[")) {
                String replace = message_content.replace("\\", "");
                Gson gson = new Gson();
                List<TiaoBean> tiaoBeans = gson.fromJson(replace, new TypeToken<List<TiaoBean>>() {
                }.getType());
                String str = "";

                for (int i = 0; i < tiaoBeans.size(); i++) {
                    item_0 = tiaoBeans.get(0).getCont();
                    if (tiaoBeans.size() > 1) {
                        item_1 = tiaoBeans.get(1).getCont();
                        // 消息状态
                        messageStratBean.setMessageType(tiaoBeans.get(1).getType());
                        // 患者ID
                        messageStratBean.setPatient_id(tiaoBeans.get(1).getPatient_id());
                        // 消息ID
                        messageStratBean.setREPORT_ID(tiaoBeans.get(1).getReport_id());
                        // 流水号
                        messageStratBean.setVISIT_SQ_NO(tiaoBeans.get(1).getVisit_sq_no());
                        item_2 = tiaoBeans.get(2).getCont();
                    }

                    str += tiaoBeans.get(i).getCont();
                }
                if (messageStratBean.getMessageType() == 2) {
                    tv_message_item.setText(item_0);
                    if (item_1 != null) {
                        spanString = new SpannableString(item_1);
                        spanString.setSpan(new ClickableSpan() {
                            @Override
                            public void onClick(View view) {
                                //点击的响应事件
                                Log.e(TAG, "点击了");
                                initMessageStratData();// 查询是否可以跳转
                            }
                        }, 0, spanString.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                        tv_message_item.append(spanString);
                        tv_message_item.append(item_2);
                        tv_message_item.setMovementMethod(LinkMovementMethod.getInstance());//开始响应点击事件
                    }
                } else {
                    tv_message_item.setText(str);
                }
            } else {
                tv_message_item.setText(message_content);
            }
        }
    }

    private void initMessageStratData() {
        HashMap<String, Object> params = new HashMap<>();
        params.put("Type", "Hm_Check_Assess_Status");
        params.put("PATIENT_ID", messageStratBean.getPatient_id());
        params.put("VISIT_SQ_NO", messageStratBean.getVISIT_SQ_NO());
        params.put("REPORT_ID", messageStratBean.getREPORT_ID());
        params.put("fun_type", messageStratBean.getMessageType());
        presenter.getCheckAssessStatus(params);
    }

    private void initGetIntent(Intent intent) {
        messageStratBean = new MessageStartBean();
        // 登录信息
        loginBean = (LoginBean) intent.getSerializableExtra("loginBean");
        // 单挑消息json
        message_content = (String) intent.getSerializableExtra("message_content");
    }

    /**
     * 布局
     *
     * @return
     */
    @Override
    protected int bindLayoutId() {
        return R.layout.activity_message_item;
    }

    @Override
    protected void init() {

    }

    @Override
    public BasePresenter initPresenter() {
        return new CheckAssessStatusPresenter();
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void failure(String msg) {

    }

    @Override
    public void onCheckAssessStatusSuccess(Object result) {
        if (result != null) {
            if (result instanceof MessageStratBean) {
                if (((MessageStratBean) result).getCode().equals("0")) {
                    Log.e(TAG, ((MessageStratBean) result).getMessage());
                    Intent intent = new Intent(MessageItemActivity.this, SelectedTablesActivity.class);
                    intent.putExtra("loginBean", loginBean);
                    intent.putExtra("messageStratBean", messageStratBean);
                    startActivity(intent);
                    finish();
                } else {
                    Log.e(TAG, ((MessageStratBean) result).getMessage());
                    ToastUtils.show(((MessageStratBean) result).getServer_params());
                    Log.e(TAG, ((MessageStratBean) result).getServer_params());
                }
            }
        }
    }
}
