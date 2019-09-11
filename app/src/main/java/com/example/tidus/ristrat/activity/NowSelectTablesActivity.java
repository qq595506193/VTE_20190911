package com.example.tidus.ristrat.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lib_core.base.mvp.BaseMvpActivity;
import com.example.lib_core.base.mvp.BasePresenter;
import com.example.tidus.ristrat.R;
import com.example.tidus.ristrat.adapter.SelectTablesAdapter;
import com.example.tidus.ristrat.application.App;
import com.example.tidus.ristrat.bean.CaseControlBean;
import com.example.tidus.ristrat.bean.CheckRiskBean;
import com.example.tidus.ristrat.bean.EvaluatingBean;
import com.example.tidus.ristrat.bean.LoginBean;
import com.example.tidus.ristrat.bean.NowSelectTablesBean;
import com.example.tidus.ristrat.bean.QueryHMBean;
import com.example.tidus.ristrat.bean.SelectQuestionListBean;
import com.example.tidus.ristrat.contract.ICheckRiskContract;
import com.example.tidus.ristrat.contract.IEvaluatingContract;
import com.example.tidus.ristrat.contract.INowSelectTablesContract;
import com.example.tidus.ristrat.fragment.SelectTablesFragment;
import com.example.tidus.ristrat.mvp.presenter.CancelAssessPresenter;
import com.example.tidus.ristrat.mvp.presenter.CheckRiskPresenter;
import com.example.tidus.ristrat.mvp.presenter.EvaluatingPresenter;
import com.example.tidus.ristrat.mvp.presenter.NowSelectTablesPresenter;
import com.example.tidus.ristrat.utils.LoadingDialog;
import com.example.tidus.ristrat.utils.LogUtils;
import com.example.tidus.ristrat.utils.ToastUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import butterknife.BindView;

public class NowSelectTablesActivity extends BaseMvpActivity<INowSelectTablesContract.INowSelectTablesModel, NowSelectTablesPresenter> implements INowSelectTablesContract.INowSelectTablesView, IEvaluatingContract.IEvaluatingView, ICheckRiskContract.ICheckRiskView {

    // 患者名字
    @BindView(R.id.tv_name)
    TextView tv_name;
    // 患者性别
    @BindView(R.id.tv_sex)
    TextView tv_sex;
    // 患者科室
    @BindView(R.id.tv_office)
    TextView tv_office;
    // 患者床位
    @BindView(R.id.tv_bed_id)
    TextView tv_bed_id;
    // 选表列表
    @BindView(R.id.rv_select_tables)
    RecyclerView rv_select_tables;
    // 切换页签
    @BindView(R.id.fragment_container)
    FrameLayout fragment_container;
    // 立即评估按钮
    @BindView(R.id.btn_start_assess)
    Button btn_start_assess;

    private List<String> list = new ArrayList<>();
    private SelectTablesFragment selectTablesFragment;
    private LoginBean loginBean;
    private CaseControlBean.ServerParamsBean serverParamsBean;
    private List<String> list_form_id = new ArrayList<>();
    private CancelAssessPresenter cancelAssessPresenter;
    private EvaluatingPresenter evaluatingPresenter;
    private CheckRiskPresenter checkRiskPresenter;
    private QueryHMBean.ServerParamsBean queryHMBean;
    private List<List<Integer>> departmentList = new ArrayList<>();
    private List<Integer> keshi_id = new ArrayList<>();
    private SelectQuestionListBean selectQuestionListBean;
    private SelectTablesAdapter selectTablesAdapter;
    private LoadingDialog loadingDialog;
    private AlertDialog.Builder builder;
    private List<NowSelectTablesBean.ServerParamsBean.BusinesslistBean> businesslist0;

    @Override
    protected void init() {

    }

    @Override
    protected void initView(Intent intent) {
        // 评估中监控P层
        evaluatingPresenter = new EvaluatingPresenter(this);
        // 判断是否有人在评估P层
        checkRiskPresenter = new CheckRiskPresenter(this);
        // 接取用户信息
        loginBean = (LoginBean) intent.getSerializableExtra("loginBean");
        // 接取提醒信息
        queryHMBean = (QueryHMBean.ServerParamsBean) intent.getSerializableExtra("queryHMBean");
        // 接取患者信息
        serverParamsBean = (CaseControlBean.ServerParamsBean) intent.getSerializableExtra("serverParamsBean");

        // title findViewById
        initFindViewById();
        // 患者信息赋值
        initPatientValue();

        keshi_id.add(loginBean.getServer_params().getDEPARTMENT());
        departmentList.add(keshi_id);

    }

    @Override
    protected void initData() {
        super.initData();
        // 网络请求入参
        initPresenterData();

    }

    private void initPresenterData() {
        HashMap<String, Object> params = new HashMap<>();
        params.put("Type", "queryBusinessForms");
        params.put("PATIENT_ID", serverParamsBean.getPATIENT_ID());
        presenter.getNowSelectTables(params);
    }

    private void initViewPagerFragment(final List<NowSelectTablesBean.ServerParamsBean.BusinesslistBean> businesslist) {

        businesslist0 = businesslist;

        selectQuestionListBean = new SelectQuestionListBean();
        selectTablesAdapter = new SelectTablesAdapter(App.getContext(), businesslist);
        // 加勾选请求
        initCheckData();
        rv_select_tables.setLayoutManager(new LinearLayoutManager(App.getContext()));
        rv_select_tables.setAdapter(selectTablesAdapter);
        selectTablesAdapter.notifyDataSetChanged();
//        // fragment
//        selectTablesFragment = new SelectTablesFragment();
//        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
//        fragmentTransaction.replace(R.id.fragment_container, selectTablesFragment);
//        // 通过bundle传值给MyFragment
//        Bundle bundle = new Bundle();
//        bundle.putSerializable(SelectTablesFragment.TAG, businesslist.get(0));
//        selectTablesFragment.setArguments(bundle);
//        fragmentTransaction.commit();


        selectTablesAdapter.setSetSelectTables(new SelectTablesAdapter.SetSelectTables() {
            @Override
            public void onSelectTables(int position, NowSelectTablesBean.ServerParamsBean.BusinesslistBean businesslistBean, CheckRiskBean checkRiskBean) {
                initFragmentView(businesslistBean, checkRiskBean, businesslist);
            }
        });


    }

    private void initFragmentView(NowSelectTablesBean.ServerParamsBean.BusinesslistBean businesslistBean, CheckRiskBean checkRiskBean, final List<NowSelectTablesBean.ServerParamsBean.BusinesslistBean> businesslist) {
        // fragment
        selectTablesFragment = new SelectTablesFragment();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, selectTablesFragment);
        // 通过bundle传值给MyFragment
        Bundle bundle = new Bundle();
        bundle.putSerializable(SelectTablesFragment.TAG, businesslistBean);
        if (checkRiskBean != null) {
            bundle.putSerializable("checkRiskBean", checkRiskBean);
        }
        selectTablesFragment.setArguments(bundle);
        fragmentTransaction.commit();

        selectTablesFragment.setSetFormId(new SelectTablesFragment.SetFormId() {
            @Override
            public void onFormId(boolean checked, int form_id) {

                LogUtils.e("form_id===" + form_id);
                if (checked) {
                    list_form_id.add(form_id + "");
                    selectQuestionListBean.setIndexTable(list_form_id);
                } else {
                    list_form_id.remove(form_id + "");
                    selectQuestionListBean.setIndexTable(list_form_id);
                }
                LogUtils.e("选了===" + selectQuestionListBean.getIndexTable().toString());
                initButAssess(selectQuestionListBean, businesslist);// 选了几个表
            }
        });
    }

    private void initButAssess(final SelectQuestionListBean selectQuestionListBean, final List<NowSelectTablesBean.ServerParamsBean.BusinesslistBean> businesslist) {
        btn_start_assess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder = new AlertDialog.Builder(NowSelectTablesActivity.this).setIcon(R.mipmap.tixing).setTitle("提醒")
                        .setMessage("确认评估吗？").setPositiveButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Intent intent = new Intent(App.getContext(), RiskAssessmentActivity.class);
                                intent.putExtra("selectQuestionListBean", selectQuestionListBean);
                                intent.putExtra("loginBean", loginBean);
                                intent.putExtra("serverParamsBean", serverParamsBean);
                                intent.putExtra("selectQuestionListBean", selectQuestionListBean);
                                for (NowSelectTablesBean.ServerParamsBean.BusinesslistBean businesslistBean : businesslist) {
                                    intent.putExtra("businesslistBean_now", businesslistBean);
                                }
                                startActivity(intent);
                                // 监控
                                initPresenterEvalutingData();/// 开始监控评估中
                                finish();
                            }
                        }).setNegativeButton("取消", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                            }
                        });
                builder.create().show();
            }
        });

    }

    private void initCheckData() {
        HashMap<String, Object> params = new HashMap<>();
        params.put("Type", "queryWENJUANNames");
        params.put("PATIENT_ID", serverParamsBean.getPATIENT_ID());
        LogUtils.e("加勾选请求接口" + params);
        checkRiskPresenter.getCheckRisk(params);
    }

    private void initPresenterEvalutingData() {
        HashMap<String, Object> params = new HashMap<>();
        params.put("Type", "isAssess");
        params.put("FORM_IDS", selectQuestionListBean.getIndexTable());
        params.put("VISIT_SQ_NO", serverParamsBean.getVISIT_SQ_NO());
        params.put("PATIENT_ID", serverParamsBean.getPATIENT_ID());
        params.put("BED_NUMBER", serverParamsBean.getBED_NUMBER());
        evaluatingPresenter.getEvaluating(params);
    }

    private void initPatientValue() {
        tv_name.setText(serverParamsBean.getPATIENT_NAME());
        if (serverParamsBean.getPATIENT_SEX().equals("M")) {
            tv_sex.setText("男");
        } else {
            tv_sex.setText("女");
        }
        tv_office.setText(serverParamsBean.getIN_DEPT_NAME());
        tv_bed_id.setText(serverParamsBean.getBED_NUMBER() + "床");
    }

    private void initFindViewById() {
        // 上一页
        ImageView iv_back = findViewById(R.id.iv_back);
        TextView tv_back = findViewById(R.id.tv_back);
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

    }

    /**
     * 布局
     *
     * @return
     */
    @Override
    protected int bindLayoutId() {
        return R.layout.activity_now_select_tables;
    }

    @Override
    public BasePresenter initPresenter() {
        return new NowSelectTablesPresenter();
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void failure(String msg) {
        ToastUtils.show("网路请求失败");
    }

    // 立即查询表成功回调
    @Override
    public void onNowSelectTablesSuccess(Object result) {
        if (result != null) {
            if (result instanceof NowSelectTablesBean) {
                if (((NowSelectTablesBean) result).getCode().equals("0")) {
                    // 切换设置
                    ((NowSelectTablesBean) result).getServer_params().getBusinesslist().get(0).setChe_color(true);
                    initViewPagerFragment(((NowSelectTablesBean) result).getServer_params().getBusinesslist());
                }
            }
        }
    }

    @Override
    public void showProgressDialog() {
        if (loadingDialog == null) {
            loadingDialog = LoadingDialog.getDialog(NowSelectTablesActivity.this,
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

    @Override
    public void onEvaluatingSuccess(Object result) {
        if (result != null) {
            if (result instanceof EvaluatingBean) {
                if (((EvaluatingBean) result).getCode().equals("0")) {
                    LogUtils.e("监控" + ((EvaluatingBean) result).getMessage());
                } else {
                    LogUtils.e("监控" + ((EvaluatingBean) result).getMessage());
                }
            }
        }
    }

    @Override
    public void onFailed(Object error) {

    }

    // 判断是否有人正在评估成功回调
    @Override
    public void onCheckRiskSuccess(Object result) {
        if (result != null) {
            if (result instanceof CheckRiskBean) {
                if (((CheckRiskBean) result).getCode().equals("0")) {
                    if (((CheckRiskBean) result).getServer_params() != null) {
                        selectTablesAdapter.setServerParamsBeans(((CheckRiskBean) result));
                        initFragmentView(businesslist0.get(0), (CheckRiskBean) result, businesslist0);

                    }
                }
            }
        }
    }

    @Override
    public void onCheckRiskFailed(Object error) {

    }
}
