package com.example.tidus.ristrat.activity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.lib_core.base.mvp.BaseMvpActivity;
import com.example.lib_core.base.mvp.BasePresenter;
import com.example.tidus.ristrat.R;
import com.example.tidus.ristrat.adapter.BusinessListAdalter;
import com.example.tidus.ristrat.adapter.SelectedTablesAdapter;
import com.example.tidus.ristrat.application.App;
import com.example.tidus.ristrat.bean.CancelAssessBean;
import com.example.tidus.ristrat.bean.CaseControlBean;
import com.example.tidus.ristrat.bean.CheckRiskBean;
import com.example.tidus.ristrat.bean.EvaluatingBean;
import com.example.tidus.ristrat.bean.LoginBean;
import com.example.tidus.ristrat.bean.MessageStartBean;
import com.example.tidus.ristrat.bean.QueryHMBean;
import com.example.tidus.ristrat.bean.SelectQuestionListBean;
import com.example.tidus.ristrat.bean.SelectedTablesBean;
import com.example.tidus.ristrat.contract.ICancelAssessContract;
import com.example.tidus.ristrat.contract.ICheckRiskContract;
import com.example.tidus.ristrat.contract.IEvaluatingContract;
import com.example.tidus.ristrat.contract.ISelectedTablesContract;
import com.example.tidus.ristrat.fragment.SelectedTablesFragment;
import com.example.tidus.ristrat.mvp.presenter.CancelAssessPresenter;
import com.example.tidus.ristrat.mvp.presenter.CheckRiskPresenter;
import com.example.tidus.ristrat.mvp.presenter.EvaluatingPresenter;
import com.example.tidus.ristrat.mvp.presenter.SelectedTablesPresenter;
import com.example.tidus.ristrat.utils.LoadingDialog;
import com.example.tidus.ristrat.utils.ToastUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import butterknife.BindView;

/**
 * Created by TriumphalSun
 * on 2019/7/15 0015
 */
public class SelectedTablesActivity extends BaseMvpActivity<ISelectedTablesContract.ISelectedTablesModel, ISelectedTablesContract.SelectedTablesPresenter> implements ISelectedTablesContract.ISelectedTablesView, ICancelAssessContract.ICancelAssessView, IEvaluatingContract.IEvaluatingView, ICheckRiskContract.ICheckRiskView {

    // 姓名
    @BindView(R.id.tv_name)
    TextView tv_name;
    // 性别
    @BindView(R.id.tv_sex)
    TextView tv_sex;
    // 科室
    @BindView(R.id.tv_office)
    TextView tv_office;
    // 床位号
    @BindView(R.id.tv_bed_id)
    TextView tv_bed_id;
    // 业务列表
    @BindView(R.id.rv_select_business)
    RecyclerView rv_select_business;
    // 选题布局
    @BindView(R.id.lly_select_type)
    LinearLayout lly_select_type;
    // 选表列表
    @BindView(R.id.rv_select_tables)
    RecyclerView rv_select_tables;
    // 切换页签
    @BindView(R.id.fragment_container)
    FrameLayout fragment_container;
    // 立即评估按钮
    @BindView(R.id.btn_start_assess)
    Button btn_start_assess;

    private String TAG = "SelectedTablesActivity";
    private List<String> list = new ArrayList<>();
    private SelectedTablesFragment selectTablesFragment;
    private LoginBean loginBean;
    private CaseControlBean.ServerParamsBean serverParamsBean;
    private List<String> list_form_id = new ArrayList<>();
    private SelectQuestionListBean selectQuestionListBean;
    private QueryHMBean.ServerParamsBean.LISTBean tixingListBean;
    private AlertDialog.Builder builder;
    private CancelAssessPresenter cancelAssessPresenter;
    private EvaluatingPresenter evaluatingPresenter;
    private CheckRiskPresenter checkRiskPresenter;
    private List<List<Integer>> departmentList = new ArrayList<>();
    private List<Integer> keshi_id = new ArrayList<>();
    private SelectedTablesAdapter selectedTablesAdapter;
    private BusinessListAdalter businessListAdalter;
    private LoadingDialog loadingDialog;
    private List<SelectedTablesBean.ServerParamsBean.BusinesslistBean> businesslist0;
    private MessageStartBean messageStratBean;

    @Override
    protected void init() {

    }

    @Override
    protected void initView(Intent intent) {
        // 不再评估P层
        cancelAssessPresenter = new CancelAssessPresenter(this);
        // 评估中监控P层
        evaluatingPresenter = new EvaluatingPresenter(this);
        // 判断是否有人在评估P层
        checkRiskPresenter = new CheckRiskPresenter(this);
        // 接取用户信息
        loginBean = (LoginBean) intent.getSerializableExtra("loginBean");
        // 接取提醒信息
        tixingListBean = (QueryHMBean.ServerParamsBean.LISTBean) intent.getSerializableExtra("tixingListBean");
        // 接取患者信息
        serverParamsBean = (CaseControlBean.ServerParamsBean) intent.getSerializableExtra("serverParamsBean");
        // 接取消息页面的值
        messageStratBean = (MessageStartBean) intent.getSerializableExtra("messageStratBean");
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
        //查询可选的表网络请求
        initPresenterData();

    }

    private void initPresenterData() {
        HashMap<String, Object> params = new HashMap<>();
        params.put("Type", "queryBusinessForms");
        if (serverParamsBean != null) {
            params.put("PATIENT_ID", serverParamsBean.getPATIENT_ID());
        } else {
            params.put("PATIENT_ID", messageStratBean.getPatient_id());
        }

        presenter.getSelectedTables(params);
    }

    private void initPatientValue() {
        if (serverParamsBean != null) {
            tv_name.setText(serverParamsBean.getPATIENT_NAME());
            if (serverParamsBean.getPATIENT_SEX().equals("M")) {
                tv_sex.setText("男");
            } else {
                tv_sex.setText("女");
            }
            tv_office.setText(serverParamsBean.getIN_DEPT_NAME());
            tv_bed_id.setText(serverParamsBean.getBED_NUMBER() + "床");
        }
    }

    private void initViewPagerFragment(final List<SelectedTablesBean.ServerParamsBean.BusinesslistBean> businesslist) {

        businesslist0 = businesslist;
        selectQuestionListBean = new SelectQuestionListBean();
        selectedTablesAdapter = new SelectedTablesAdapter(App.getContext(), businesslist);

        // 加勾选请求
        initCheckData();
        rv_select_tables.setLayoutManager(new LinearLayoutManager(App.getContext()));
        rv_select_tables.setAdapter(selectedTablesAdapter);
        selectedTablesAdapter.notifyDataSetChanged();
        selectedTablesAdapter.setSetSelectTables(new SelectedTablesAdapter.SetSelectTables() {
            @Override
            public void onSelectTables(int position, SelectedTablesBean.ServerParamsBean.BusinesslistBean businesslistBean, CheckRiskBean checkRiskBean) {
                initFragmentView(businesslistBean, checkRiskBean, businesslist);
            }
        });
//        SelectTablesAdapter selectTablesAdapter = new SelectTablesAdapter(App.getContext(), list);
//        rv_select_tables.setLayoutManager(new LinearLayoutManager(App.getContext()));
//        rv_select_tables.setAdapter(selectTablesAdapter);
//        selectTablesAdapter.setSetSelectTables(new SelectTablesAdapter.SetSelectTables() {
//            @Override
//            public void onSelectTables(int position, List<NowSelectTablesBean.ServerParamsBean.BusinesslistBean.ListformsBean> listforms) {
//                // fragment
//                selectTablesFragment = new SelectTablesFragment();
//                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
//                fragmentTransaction.replace(R.id.fragment_container, selectTablesFragment);
//                // 通过bundle传值给MyFragment
//                Bundle bundle = new Bundle();
//                bundle.putString(SelectTablesFragment.TAG, strs[position]);
//                selectTablesFragment.setArguments(bundle);
//                fragmentTransaction.commit();
//            }
//        });
    }

    private void initFragmentView(SelectedTablesBean.ServerParamsBean.BusinesslistBean businesslistBean, CheckRiskBean checkRiskBean, final List<SelectedTablesBean.ServerParamsBean.BusinesslistBean> businesslist) {
        // fragment
        selectTablesFragment = new SelectedTablesFragment();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, selectTablesFragment);
        // 通过bundle传值给MyFragment
        Bundle bundle = new Bundle();
        bundle.putSerializable(SelectedTablesFragment.TAG, businesslistBean);
        if (checkRiskBean != null) {
            bundle.putSerializable("checkRiskBean", checkRiskBean);
        }
        selectTablesFragment.setArguments(bundle);
        fragmentTransaction.commit();

        selectTablesFragment.setSetFormId(new SelectedTablesFragment.SetFormId() {
            @Override
            public void onFormId(boolean checked, int form_id) {

                Log.e(TAG, "form_id===" + form_id);
                if (checked) {
                    list_form_id.add(form_id + "");
                    selectQuestionListBean.setIndexTable(list_form_id);
                } else {
                    list_form_id.remove(form_id + "");
                    selectQuestionListBean.setIndexTable(list_form_id);
                }
                Log.e(TAG, "选了===" + list.size() + "个表");
                initButAssess(selectQuestionListBean, businesslist);// 选了几个表
            }
        });
    }

    private void initButAssess(final SelectQuestionListBean selectQuestionListBean, final List<SelectedTablesBean.ServerParamsBean.BusinesslistBean> businesslist) {
        btn_start_assess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(App.getContext(), RiskAssessmentActivity.class);
                intent.putExtra("selectQuestionListBean", selectQuestionListBean);
                intent.putExtra("loginBean", loginBean);
                if (serverParamsBean != null) {
                    intent.putExtra("serverParamsBean", serverParamsBean);
                } else {
                    intent.putExtra("patient_id", messageStratBean.getPatient_id());
                }
                for (SelectedTablesBean.ServerParamsBean.BusinesslistBean businesslistBean : businesslist) {
                    intent.putExtra("businesslistBean", businesslistBean);
                }
                startActivity(intent);
                // 监控
                initPresenterEvalutingData();/// 开始监控评估中
                finish();
            }
        });

    }

    private void initCheckData() {
        HashMap<String, Object> params = new HashMap<>();
        params.put("Type", "queryBusinessForms");
        if (serverParamsBean != null) {
            params.put("PATIENT_ID", serverParamsBean.getPATIENT_ID());
        } else {
            params.put("PATIENT_ID", messageStratBean.getPatient_id());
        }
        Log.e(TAG, "加勾选请求接口" + params.toString());
        checkRiskPresenter.getCheckRisk(params);
    }

    private void initPresenterEvalutingData() {
        HashMap<String, Object> params = new HashMap<>();
        params.put("Type", "isAssess");
        params.put("FORM_IDS", selectQuestionListBean.getIndexTable());
        if (serverParamsBean != null) {
            params.put("VISIT_SQ_NO", serverParamsBean.getVISIT_SQ_NO());
            params.put("PATIENT_ID", serverParamsBean.getPATIENT_ID());
        } else {
            params.put("VISIT_SQ_NO", messageStratBean.getVISIT_SQ_NO());
            params.put("PATIENT_ID", messageStratBean.getPatient_id());
        }

        evaluatingPresenter.getEvaluating(params);
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
        return R.layout.activity_select_tables;
    }

    @Override
    public BasePresenter initPresenter() {
        return new SelectedTablesPresenter();
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void failure(String msg) {
        ToastUtils.show("网络请求失败");
    }

    /**
     * 查询成功回调
     *
     * @param result
     */
    @Override
    public void onSelectedTablesSuccess(Object result) {
        if (result != null) {
            if (result instanceof SelectedTablesBean) {
                if (((SelectedTablesBean) result).getCode().equals("0")) {
                    // 患者信息
                    tv_name.setText(((SelectedTablesBean) result).getServer_params().getPATIENT_NAME());
                    if (((SelectedTablesBean) result).getServer_params().getPATIENT_SEX().equals("M")) {
                        tv_sex.setText("男");
                    } else {
                        tv_sex.setText("女");
                    }
                    tv_office.setText(((SelectedTablesBean) result).getServer_params().getIN_DEPT_NAME());
                    tv_bed_id.setText(((SelectedTablesBean) result).getServer_params().getBED_NUMBER() + "床");
                    // 业务列表
                    businessListAdalter = new BusinessListAdalter(App.getContext());
                    rv_select_business.setLayoutManager(new LinearLayoutManager(App.getContext()));
                    rv_select_business.setAdapter(businessListAdalter);
                    final List<SelectedTablesBean.ServerParamsBean.RemindlistBean> remindlist = ((SelectedTablesBean) result).getServer_params().getRemindlist();
                    Log.e(TAG, "业务列表长度===" + remindlist.size() + "");
                    businessListAdalter.setRemindlistBeans(remindlist);
                    // 下次评估回调
                    businessListAdalter.setSetBusinessNext(new BusinessListAdalter.SetBusinessNext() {
                        @Override
                        public void onBusinessNext() {
                            builder = new AlertDialog.Builder(SelectedTablesActivity.this).setIcon(R.mipmap.tixing).setTitle("提醒")
                                    .setMessage("确认下次评估吗？").setPositiveButton("确定", new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialogInterface, int i) {
                                            Intent intent = new Intent(App.getContext(), CancelQuestionActivity.class);
                                            intent.putExtra("tixingListBean", tixingListBean);
                                            startActivity(intent);
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
                    // 不再评估回调
                    businessListAdalter.setSetBusinessOver(new BusinessListAdalter.SetBusinessOver() {
                        @Override
                        public void onBusinessOver(final int position) {
                            @SuppressLint("InflateParams") View view = LayoutInflater.from(App.getContext()).inflate(R.layout.dialog_over_tixing, null);
                            final TextView tv_queren_content = view.findViewById(R.id.tv_queren_content);
                            tv_queren_content.setText("确认 " + serverParamsBean.getPATIENT_NAME() + "(" + serverParamsBean.getVISIT_SQ_NO() + ")" + "在院期间不再接受VTE风险评估吗？");
                            builder = new AlertDialog.Builder(SelectedTablesActivity.this).setView(view).setTitle("提醒").setIcon(R.mipmap.tixing)
                                    .setPositiveButton("确认", new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialogInterface, int i) {
                                            initOverAssessPresenter();// 不再评估请求网络
                                            remindlist.remove(position);
                                            businessListAdalter.setRemindlistBeans(remindlist);
                                        }
                                    }).setNegativeButton("取消", new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialog, int which) {
                                            dialog.dismiss();
                                        }
                                    });

                            builder.create().show();
                        }
                    });
                    //
                    // 切换设置
                    initViewPagerFragment(((SelectedTablesBean) result).getServer_params().getBusinesslist());
                }
            }
        }
    }

    @Override
    public void showProgressDialog() {
        if (loadingDialog == null) {
            loadingDialog = LoadingDialog.getDialog(SelectedTablesActivity.this,
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

    private void initOverAssessPresenter() {
        HashMap<String, Object> params = new HashMap<>();
        params.put("Type", "saveHM_Patient_Assess_Cancel");
        params.put("VISIT_SQ_NO", serverParamsBean.getVISIT_SQ_NO());
        params.put("REMINDE_ID", tixingListBean.getREMINDE_ID());
        params.put("PATIENT_ID", serverParamsBean.getPATIENT_ID());
        params.put("OPERATE_RESULT", "99");
        cancelAssessPresenter.getCancelAssess(params);
    }

    // 不再评估成功回调
    @Override
    public void onCancelAssessSuccess(Object result) {
        if (result != null) {
            if (result instanceof CancelAssessBean) {
                if (((CancelAssessBean) result).getCode().equals("0")) {
                    ToastUtils.show("不再评估" + ((CancelAssessBean) result).getMessage());
                } else {
                    ToastUtils.show("不再评估" + ((CancelAssessBean) result).getMessage());
                }
            }
        }
    }

    // 监控中成功回调
    @Override
    public void onEvaluatingSuccess(Object result) {
        if (result != null) {
            if (result instanceof EvaluatingBean) {
                if (((EvaluatingBean) result).getCode().equals("0")) {
                    Log.e(TAG, "监控" + ((EvaluatingBean) result).getMessage());
                } else {
                    Log.e(TAG, "监控" + ((EvaluatingBean) result).getMessage());
                }
            }
        }
    }

    @Override
    public void onFailed(Object error) {

    }

    // 判断是否有人在评估成功回调
    @Override
    public void onCheckRiskSuccess(Object result) {
        if (result != null) {
            if (result instanceof CheckRiskBean) {
                if (((CheckRiskBean) result).getCode().equals("0")) {
                    if (((CheckRiskBean) result).getServer_params() != null) {
                        selectedTablesAdapter.setServerParamsBeans(((CheckRiskBean) result));
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
