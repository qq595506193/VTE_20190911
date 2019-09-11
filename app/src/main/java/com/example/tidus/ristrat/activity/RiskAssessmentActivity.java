package com.example.tidus.ristrat.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lib_core.base.mvp.BaseMvpActivity;
import com.example.lib_core.base.mvp.BasePresenter;
import com.example.tidus.ristrat.R;
import com.example.tidus.ristrat.adapter.RiskTitleTableListAdapter;
import com.example.tidus.ristrat.application.App;
import com.example.tidus.ristrat.bean.AnwyAssessBean;
import com.example.tidus.ristrat.bean.CaseControlBean;
import com.example.tidus.ristrat.bean.CommitBean;
import com.example.tidus.ristrat.bean.LoginBean;
import com.example.tidus.ristrat.bean.NowSelectTablesBean;
import com.example.tidus.ristrat.bean.QueryHMBean;
import com.example.tidus.ristrat.bean.RiskAssessmentBean;
import com.example.tidus.ristrat.bean.SelectQuestionListBean;
import com.example.tidus.ristrat.bean.SelectedTablesBean;
import com.example.tidus.ristrat.contract.IRiskAssessmentContart;
import com.example.tidus.ristrat.fragment.RiskAssessFragment;
import com.example.tidus.ristrat.mvp.presenter.RiskAssessmentPresenter;
import com.example.tidus.ristrat.utils.LoadingDialog;
import com.example.tidus.ristrat.utils.ToastUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import butterknife.BindView;

public class RiskAssessmentActivity extends BaseMvpActivity<IRiskAssessmentContart.IRiskAssessmentModel, IRiskAssessmentContart.RiskAssessmentPresenter> implements IRiskAssessmentContart.IRiskAssessmentView {

    private String TAG = "RiskAssessmentActivity";
    // 患者姓名
    @BindView(R.id.tv_name)
    TextView tv_name;
    // 患者性别
    @BindView(R.id.tv_sex)
    TextView tv_sex;
    // 患者科室
    @BindView(R.id.tv_office)
    TextView tv_office;
    // 患者住院号
    @BindView(R.id.tv_mark)
    TextView tv_mark;
    // 表页签列表
    @BindView(R.id.rv_question_list)
    RecyclerView rv_question_list;
    // 占位布局
    @BindView(R.id.fl_fragment)
    FrameLayout fl_fragment;
    private SelectedTablesBean.ServerParamsBean.BusinesslistBean businesslistBean;
    private NowSelectTablesBean.ServerParamsBean.BusinesslistBean businesslistBean_now;
    private SelectQuestionListBean selectQuestionListBean;
    private LoginBean loginBean;
    private CaseControlBean.ServerParamsBean serverParamsBean;
    private RiskTitleTableListAdapter riskTitleTableListAdapter;
    private RiskAssessFragment riskAssessFragment;
    private QueryHMBean.ServerParamsBean.TixingLISTBean tixingListBean;
    private LoadingDialog loadingDialog;
    private String patient_id;


    // View绘制
    @Override
    protected void initView(Intent intent) {
        // intent接值
        initIntent(intent);
        // title操作
        initFindViewById();
        // 页签
        initTitleTables();
        // 切换fragment
        initTabFragment();

    }

    private void initTabFragment() {

    }

    private void initTitleTables() {
        // 表页签适配器
        riskTitleTableListAdapter = new RiskTitleTableListAdapter(App.getContext());
        rv_question_list.setLayoutManager(new LinearLayoutManager(App.getContext(), LinearLayoutManager.HORIZONTAL, false));
        rv_question_list.setAdapter(riskTitleTableListAdapter);
    }

    private void initFindViewById() {
        TextView tv_back = findViewById(R.id.tv_back);
        tv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        ImageView iv_back = findViewById(R.id.iv_back);
        iv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        TextView tv_login_name = findViewById(R.id.tv_login_name);
        tv_login_name.setText(loginBean.getServer_params().getUSER_NAME());
        ImageView iv_message = findViewById(R.id.iv_message);
        iv_message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(App.getContext(), MessageActivity.class);
                intent.putExtra("loginBean", loginBean);
                startActivity(intent);
            }
        });
        ImageView iv_close = findViewById(R.id.iv_close);
        iv_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(App.getContext(), UserLoginActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    private void initIntent(Intent intent) {
        // 业务对象
        businesslistBean = (SelectedTablesBean.ServerParamsBean.BusinesslistBean) intent.getSerializableExtra("businesslistBean");
        // 业务对象_now
        businesslistBean_now = (NowSelectTablesBean.ServerParamsBean.BusinesslistBean) intent.getSerializableExtra("businesslistBean_now");
        // 选的表对象
        selectQuestionListBean = (SelectQuestionListBean) intent.getSerializableExtra("selectQuestionListBean");
        // 登录信息的对象
        loginBean = (LoginBean) intent.getSerializableExtra("loginBean");
        // 患者信息的对象
        serverParamsBean = (CaseControlBean.ServerParamsBean) intent.getSerializableExtra("serverParamsBean");
        // 接点击继续评估按钮后接过来的对象
        tixingListBean = (QueryHMBean.ServerParamsBean.TixingLISTBean) intent.getSerializableExtra("tixingListBean");
        // 接消息页面的患者ID
        patient_id = intent.getStringExtra("patient_id");
    }

    /**
     * 网络请求
     */
    @Override
    protected void initData() {
        super.initData();
        initPresenterData();// 选题网络请求
    }

    private void initPresenterData() {
        HashMap<String, Object> params = new HashMap<>();
        params.put("Type", "queryHZfengxianPG");
        // 判断是否是点继续评估
        if (tixingListBean != null) {
            AnwyAssessBean anwyAssessBean = new AnwyAssessBean();
            List<String> anwyAssessList = new ArrayList<>();
            anwyAssessList.add(tixingListBean.getFORM_ID() + "");
            anwyAssessBean.setList(anwyAssessList);
            params.put("FORM_ID", anwyAssessBean.getList());// 继续评估的表Id
            params.put("PATIENT_ID", tixingListBean.getPATIENT_ID());// 继续评估的患者Id
        } else {
            if (selectQuestionListBean.getIndexTable() != null && selectQuestionListBean != null) {
                params.put("FORM_ID", selectQuestionListBean.getIndexTable());// 正常评估的表ID
            }
            if (serverParamsBean != null) {
                params.put("PATIENT_ID", serverParamsBean.getPATIENT_ID());// 正常评估的患者Id
            } else {
                params.put("PATIENT_ID", patient_id);// 从消息页面跳过来评估的患者Id
            }
        }
        Log.e(TAG, "评估页面拼参===" + params.toString());
        presenter.getRiskAssessment(params);
    }

    /**
     * 布局
     *
     * @return
     */
    @Override
    protected int bindLayoutId() {
        return R.layout.activity_risk_assessment2;
    }

    @Override
    protected void init() {

    }

    @Override
    public BasePresenter initPresenter() {
        return new RiskAssessmentPresenter();
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    /**
     * 请求失败回调
     *
     * @param msg
     */
    @Override
    public void failure(String msg) {

    }

    /**
     * 提交成功回调
     *
     * @param result
     */
    @Override
    public void onCommitSuccess(Object result) {

    }

    /**
     * 查询列表成功回调
     *
     * @param result
     */
    @Override
    public void onRiskAssessmentSuccess(Object result) {
        if (result != null) {
            if (result instanceof RiskAssessmentBean) {
                if (((RiskAssessmentBean) result).getCode().equals("0")) {
                    Log.e(TAG, "查询" + ((RiskAssessmentBean) result).getMessage());
                    final RiskAssessmentBean.ServerParamsBean server_params = ((RiskAssessmentBean) result).getServer_params();
                    initPatientInfo(server_params);// 患者信息
                    // 页签表title设置数据
                    for (RiskAssessmentBean.ServerParamsBean.WENJUANNAMEBean wenjuannameBean : server_params.getWENJUANNAME()) {
                        int form_id = wenjuannameBean.getFORM_ID();
                        if (tixingListBean != null) {
                            if (tixingListBean.getFORM_ID() == form_id) {
                                wenjuannameBean.setChe_color(true);
                            } else {
                                wenjuannameBean.setChe_color(false);
                            }
                        } else {
                            for (String s : selectQuestionListBean.getIndexTable()) {
                                String ss = form_id + "";
                                if (ss.equals(s)) {
                                    wenjuannameBean.setChe_color(true);
                                } else {
                                    wenjuannameBean.setChe_color(false);
                                }
                            }
                        }

                    }
                    riskTitleTableListAdapter.setWenjuannameBeans(server_params.getWENJUANNAME());

                    // fragment
                    riskAssessFragment = new RiskAssessFragment();
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fl_fragment, riskAssessFragment);
                    // 通过bundle传值给MyFragment
                    Bundle bundle = new Bundle();
                    for (RiskAssessmentBean.ServerParamsBean.WENJUANNAMEBean wenjuannameBean : server_params.getWENJUANNAME()) {
                        int form_id = wenjuannameBean.getFORM_ID();
                        // 判断是否是继续评估
                        if (tixingListBean != null) {
                            if (tixingListBean.getFORM_ID() == form_id) {
                                List<String> indexTable = new ArrayList<>();
                                SelectQuestionListBean selectQuestionListBean = new SelectQuestionListBean();
                                indexTable.add(tixingListBean.getFORM_ID() + "");
                                selectQuestionListBean.setIndexTable(indexTable);
                                Log.e(TAG, selectQuestionListBean + "");
                                bundle.putSerializable(RiskAssessFragment.TAG, wenjuannameBean);
                                bundle.putSerializable("businesslistBean", businesslistBean);
                                bundle.putSerializable("businesslistBean_now", businesslistBean_now);
                                bundle.putSerializable("serverParamsBean", serverParamsBean);
                                bundle.putSerializable("loginBean", loginBean);
                                bundle.putSerializable("tixingListBean", tixingListBean);
                                bundle.putSerializable("selectQuestionListBean", selectQuestionListBean);
                            }
                        } else {
                            for (String s : selectQuestionListBean.getIndexTable()) {
                                String ss = form_id + "";
                                if (ss.equals(s)) {
                                    bundle.putSerializable(RiskAssessFragment.TAG, wenjuannameBean);
                                    bundle.putSerializable("businesslistBean", businesslistBean);
                                    bundle.putSerializable("businesslistBean_now", businesslistBean_now);
                                    if (serverParamsBean != null) {
                                        bundle.putSerializable("serverParamsBean", serverParamsBean);
                                    } else {
                                        bundle.putSerializable("patient_id", patient_id);
                                    }
                                    bundle.putSerializable("loginBean", loginBean);
                                    bundle.putSerializable("tixingListBean", tixingListBean);
                                    bundle.putSerializable("selectQuestionListBean", selectQuestionListBean);
                                }
                            }
                        }

                    }
                    riskAssessFragment.setArguments(bundle);
                    fragmentTransaction.commit();

                    // 点击页签回调
                    riskTitleTableListAdapter.setSetOnItemClickListener(new RiskTitleTableListAdapter.SetOnItemClickListener() {
                        @Override
                        public void onItemClickListener(int form_id) {
                            // fragment
                            riskAssessFragment = new RiskAssessFragment();
                            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                            fragmentTransaction.replace(R.id.fl_fragment, riskAssessFragment);
                            // 通过bundle传值给MyFragment
                            Bundle bundle = new Bundle();
                            for (RiskAssessmentBean.ServerParamsBean.WENJUANNAMEBean wenjuannameBean : server_params.getWENJUANNAME()) {
                                if (wenjuannameBean.getFORM_ID() == form_id) {
                                    bundle.putSerializable(RiskAssessFragment.TAG, wenjuannameBean);
                                    bundle.putSerializable("businesslistBean", businesslistBean);
                                    bundle.putSerializable("businesslistBean_now", businesslistBean_now);
                                    if (serverParamsBean != null) {
                                        bundle.putSerializable("serverParamsBean", serverParamsBean);
                                    } else {
                                        bundle.putSerializable("patient_id", patient_id);
                                    }
                                    bundle.putSerializable("loginBean", loginBean);
                                    bundle.putSerializable("tixingListBean", tixingListBean);
                                    bundle.putSerializable("selectQuestionListBean", selectQuestionListBean);
                                    bundle.putSerializable("form_id", form_id);
                                }
                            }
                            riskAssessFragment.setArguments(bundle);
                            fragmentTransaction.commit();
                        }
                    });
                } else {
                    Log.e(TAG, "查询" + ((RiskAssessmentBean) result).getMessage());
                }
            }
        }
    }

    @Override
    public void onSaveSuccess(Object result) {
        if (result != null) {
            if (result instanceof CommitBean) {
                if (((CommitBean) result).getCode().equals("0")) {
                    Log.e(TAG, "保存" + ((CommitBean) result).getMessage());
                    ToastUtils.show("保存" + ((CommitBean) result).getMessage());
                } else {
                    Log.e(TAG, "保存" + ((CommitBean) result).getMessage());
                    ToastUtils.show("保存" + ((CommitBean) result).getMessage());
                }
            }
        }
    }

    @Override
    public void showProgressDialog() {
        if (loadingDialog == null) {
            loadingDialog = LoadingDialog.getDialog(RiskAssessmentActivity.this,
                    "努力加载中",
                    true,
                    null);
        } else if (loadingDialog.isShowing()) {
            loadingDialog.setMessage("努力加载中");
        }
        loadingDialog.show();
    }

    @Override
    public void hideProgressDialog() {
        if (loadingDialog != null && loadingDialog.isShowing()) {
            loadingDialog.dismiss();
            loadingDialog = null;
        }
    }

    private void initPatientInfo(RiskAssessmentBean.ServerParamsBean server_params) {
        // 设置患者姓名
        tv_name.setText(server_params.getPATIENT_NAME());
        // 设置患者性别
        if (server_params.getPATIENT_SEX().equals("M")) {
            tv_sex.setText("男");
        } else {
            tv_sex.setText("女");
        }
        // 患者科室
        tv_office.setText(server_params.getIN_DEPT_NAME());
        // 患者流水号
        tv_mark.setText(server_params.getVISIT_SQ_NO());
    }


}
