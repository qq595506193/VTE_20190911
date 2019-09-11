package com.example.tidus.ristrat.activity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.lib_core.base.mvp.BaseMvpActivity;
import com.example.lib_core.base.mvp.BasePresenter;
import com.example.tidus.ristrat.R;
import com.example.tidus.ristrat.adapter.CaseContrilAdapter;
import com.example.tidus.ristrat.adapter.EvaluatingAdapter;
import com.example.tidus.ristrat.application.App;
import com.example.tidus.ristrat.bean.CancelAssessBean;
import com.example.tidus.ristrat.bean.CaseControlBean;
import com.example.tidus.ristrat.bean.LaterOnBean;
import com.example.tidus.ristrat.bean.LoginBean;
import com.example.tidus.ristrat.bean.MessageNumBean;
import com.example.tidus.ristrat.bean.OfficeBean;
import com.example.tidus.ristrat.bean.QueryHMBean;
import com.example.tidus.ristrat.contract.IAssessCancelContract;
import com.example.tidus.ristrat.contract.ICancelAssessContract;
import com.example.tidus.ristrat.contract.ICaseControlContract;
import com.example.tidus.ristrat.contract.ILaterOnContract;
import com.example.tidus.ristrat.contract.IMessageTypeContract;
import com.example.tidus.ristrat.mvp.presenter.AssessCancelPresenter;
import com.example.tidus.ristrat.mvp.presenter.CaseControlPresenter;
import com.example.tidus.ristrat.mvp.presenter.LaterOnPresenter;
import com.example.tidus.ristrat.mvp.presenter.MessageTypePresenter;
import com.example.tidus.ristrat.utils.CommonPopupWindow;
import com.example.tidus.ristrat.utils.LoadingDialog;
import com.example.tidus.ristrat.utils.LogUtils;
import com.example.tidus.ristrat.utils.ToastUtils;
import com.jcodecraeer.xrecyclerview.XRecyclerView;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;

import butterknife.BindView;

public class CaseControlActivity extends BaseMvpActivity<ICaseControlContract.ICaseControlModel, ICaseControlContract.CaseControlPresenter> implements ICaseControlContract.ICaseControlView, ICancelAssessContract.ICancelAssessView, IMessageTypeContract.IMessageTypeView, IAssessCancelContract.IAssessCanceTixinglView, ILaterOnContract.ILaterOnView {


    @BindView(R.id.et_hospital_id)
    EditText et_hospital_id;
    @BindView(R.id.et_name)
    EditText et_name;
    @BindView(R.id.sp_sex)
    Spinner sp_sex;
    @BindView(R.id.et_sex)
    EditText et_sex;
    @BindView(R.id.et_danger_level)
    EditText et_danger_level;
    @BindView(R.id.et_wait_assess)
    EditText et_wait_assess;
    @BindView(R.id.et_bed)
    EditText et_bed;
    @BindView(R.id.sp_danger_level)
    Spinner sp_danger_level;
    @BindView(R.id.sp_wait_assess)
    Spinner sp_wait_assess;
    @BindView(R.id.rg_check)
    RadioGroup rg_check;
    @BindView(R.id.rb_section)
    RadioButton rb_section;
    @BindView(R.id.rb_element)
    RadioButton rb_element;
    @BindView(R.id.xrv_patient_list)
    XRecyclerView xrv_patient_list;


    private CaseContrilAdapter caseContrilAdapter;
    private List<CaseControlBean.ServerParamsBean> server_params;
    private ImageView iv_close;
    private ImageView iv_message;
    private String VISIT_SQ_NO = "";// 床位号
    private String PATIENT_NAME = "";// 患者名称
    private String PATIENT_SEX = "";// 性别
    private String BED_NUMBER = "";// 床位Id
    private Set<Integer> DEPARTMENT_ID = new HashSet<>();// 本科室
    private String CARE_UNIT = "";// 本单元
    private Set<String> CURRENT_RISK_LEVEL = new HashSet<>();// 危险等级
    private String sp_sex_str = "";// 性别的值
    private String sp_danger_level_str = "";// 危险等级的值
    private String sp_wait_assess_str = "";// 待评估的值
    private String sp_wait_time_str = "";// 提醒时间的值
    private LoginBean loginBean;
    private TextView tv_login_name;
    private Timer timer;
    private boolean isShowDialog = false;

    // (2) 使用handler处理接收到的消息
    @SuppressLint("HandlerLeak")
    private Handler mHandlerQueryHM = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            if (msg.what == 10000) {
                //LogUtils.e("提醒了");
                initPresenterData();
                initQueryHMPresenterData();
            }
        }
    };
    private OfficeBean officeBean;
    private MessageTypePresenter messageTypePresenter;
    private AssessCancelPresenter assessCancelPresenter;
    private CommonPopupWindow popipWindow;
    private EvaluatingAdapter evaluatingAdapter;
    private List<QueryHMBean.ServerParamsBean.TixingLISTBean> tixingLIST;
    private QueryHMBean.ServerParamsBean queryHMServerBean;
    private LaterOnPresenter laterOnPresenter;
    private AlertDialog.Builder builder;
    private HashMap<String, Object> tixingParams = new HashMap<>();
    private List<String> tixingParamsList = new ArrayList<String>();
    private LoadingDialog loadingDialog;


    @Override
    protected void init() {

    }

    @Override
    protected void onResume() {
        super.onResume();
        initPresenterData();

    }


    @Override
    protected void initView(final Intent intent) {


        officeBean = new OfficeBean();

        messageTypePresenter = new MessageTypePresenter(this);
        assessCancelPresenter = new AssessCancelPresenter(this);
        laterOnPresenter = new LaterOnPresenter(this);
        loginBean = (LoginBean) intent.getSerializableExtra("loginBean");
        tv_login_name = findViewById(R.id.tv_login_name);
        tv_login_name.setText(loginBean.getServer_params().getUSER_NAME());
        iv_close = findViewById(R.id.iv_close);
        iv_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        iv_message = findViewById(R.id.iv_message);
        iv_message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(App.getContext(), MessageActivity.class);
                intent.putExtra("loginBean", loginBean);
                startActivity(intent);
            }
        });

        // 适配器
        xrv_patient_list.setLayoutManager(new GridLayoutManager(App.getContext(), 4));
        caseContrilAdapter = new CaseContrilAdapter(CaseControlActivity.this, CaseControlActivity.this);
        xrv_patient_list.setAdapter(caseContrilAdapter);

        xrv_patient_list.setLoadingListener(new XRecyclerView.LoadingListener() {
            @Override
            public void onRefresh() {
                initPresenterData();
                xrv_patient_list.refreshComplete();
            }

            @Override
            public void onLoadMore() {
                xrv_patient_list.loadMoreComplete();
            }
        });

        VISIT_SQ_NO = et_hospital_id.getText().toString().trim();
        PATIENT_NAME = et_name.getText().toString().trim();
        BED_NUMBER = et_bed.getText().toString().trim();
        sp_sex_str = et_sex.getText().toString().trim();
        sp_danger_level_str = et_danger_level.getText().toString().trim();

        initListener();


        // 立即跳转详情
        caseContrilAdapter.setSetOnIntentStartActivity(new CaseContrilAdapter.SetOnIntentStartActivity() {
            @Override
            public void onStartActivity(List<CaseControlBean.ServerParamsBean> serverParamsBeans, QueryHMBean.ServerParamsBean queryHMBean, int position) {
                CaseControlBean.ServerParamsBean serverParamsBean = serverParamsBeans.get(position);
                Intent intent = new Intent(App.getContext(), HistoryAssessActivity.class);
                intent.putExtra("loginBean", loginBean);
                intent.putExtra("serverParamsBean", serverParamsBean);
                List<QueryHMBean.ServerParamsBean.LISTBean> list = queryHMBean.getLIST();

                if (list.size() != 0) {
                    for (QueryHMBean.ServerParamsBean.LISTBean listBean : queryHMBean.getLIST()) {
                        intent.putExtra("listBean", listBean);
                    }
                }
                startActivity(intent);
            }
        });


        // 点击评字跳转
        caseContrilAdapter.setSetPingTiaoZhuan(new CaseContrilAdapter.SetPingTiaoZhuan() {
            @Override
            public void onPingTiaoZhuan(CaseControlBean.ServerParamsBean serverParamsBean, QueryHMBean.ServerParamsBean queryHMBean) {
                Intent intent = new Intent(App.getContext(), SelectedTablesActivity.class);
                intent.putExtra("loginBean", loginBean);
                for (QueryHMBean.ServerParamsBean.LISTBean listBean : queryHMBean.getLIST()) {
                    if (listBean.getVISIT_SQ_NO().equals(serverParamsBean.getVISIT_SQ_NO())) {
                        intent.putExtra("listBean", listBean);
                    }
                }
                intent.putExtra("queryHMBean", queryHMBean);
                intent.putExtra("serverParamsBean", serverParamsBean);
                startActivity(intent);
            }
        });

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                // (1) 使用handler发送消息
                Message message = new Message();
                message.what = 10000;
                mHandlerQueryHM.sendMessage(message);
            }
        }, 0, 5000);//每隔一秒使用handler发送一下消息,也就是每隔一秒执行一次,一直重复执行


//        intent = new Intent();
//        intent.setAction("com.example.tidus.ristrat.service.MessageService");
//        //Android 5.0之后，隐式调用是除了设置setAction()外，还需要设置setPackage();
//        intent.setPackage("com.example.tidus.ristrat");
//        startService(intent);
    }


    private void initQueryHMPresenterData() {
        HashMap<String, Object> params = new HashMap<>();
        params.put("Type", "queryHM_Patient_To_Assess");
        presenter.getQueryHM(params);


    }

    private <T> boolean compareList(List<T> list1, List<T> list2) {
        if (list1 == null) {
            return false;
        }
        if (list1.size() != list2.size()) {
            return false;
        }

        Set<Integer> hashCodeSet = new HashSet<>();
        for (T adInfoData : list1) {
            hashCodeSet.add(adInfoData.hashCode());
        }
        for (T adInfoData : list2) {
            if (!hashCodeSet.contains(adInfoData.hashCode())) {
                return false;
            }
        }
        return true;
    }

    @Override
    protected void initData() {
        super.initData();
        et_hospital_id.addTextChangedListener(new MyTextWatcher());////////////////////////////
        et_bed.addTextChangedListener(new MyTextWatcher());
        et_name.addTextChangedListener(new MyTextWatcher());
        et_danger_level.addTextChangedListener(new MyTextWatcher());
        et_sex.addTextChangedListener(new MyTextWatcher());
        et_wait_assess.addTextChangedListener(new MyTextWatcher());
        DEPARTMENT_ID.add(loginBean.getServer_params().getDEPARTMENT());
        officeBean.setOffice(DEPARTMENT_ID);
        initPresenterData();// 患者列表查询
        initQueryHMPresenterData();// 提醒查询
        initMessageTypePresenterData();// 未读消息查询


    }

    private void initMessageTypePresenterData() {
        HashMap<String, Object> params = new HashMap<>();
        params.put("Type", "queryAS_User_MessageCount");
        messageTypePresenter.getMessageType(params);
    }

    private void initPresenterData() {
        initListener();
        HashMap<String, Object> params = new HashMap<>();
        params.put("Type", "queryPatient_Basic_InfoBybed");
        params.put("VISIT_SQ_NO", VISIT_SQ_NO);
        params.put("PATIENT_NAME", PATIENT_NAME);
        params.put("PATIENT_SEX", PATIENT_SEX);
        params.put("BED_NUMBER", BED_NUMBER);
        if (CURRENT_RISK_LEVEL.size() != 0) {
            params.put("CURRENT_RISK_LEVEL", CURRENT_RISK_LEVEL);// 危险等级
        } else {
            params.put("CURRENT_RISK_LEVEL", "");
        }


        if (DEPARTMENT_ID.size() != 0) {
            params.put("DEPARTMENT_ID", officeBean.getOffice());
            //params.put("CARE_UNIT", CARE_UNIT);
        } else {
            params.put("CARE_UNIT", loginBean.getServer_params().getCARE_UNIT());
        }


//        LogUtils.e("请求了一次列表"
//                + "----住院号："
//                + VISIT_SQ_NO + "----患者名："
//                + PATIENT_NAME
//                + "----患者性别："
//                + PATIENT_SEX
//                + "----床位："
//                + BED_NUMBER
//                + "----危险等级："
//                + CURRENT_RISK_LEVEL
//                + "----本科室："
//                + officeBean.getOffice()
//                + "----本单元："
//                + CARE_UNIT);
//
//        LogUtils.e("请求了一次列表---拼参" + params);
        presenter.getCaseControl(params);
    }

    private void initListener() {
        if (et_hospital_id != null) {
            VISIT_SQ_NO = et_hospital_id.getText().toString().trim();
        }
        if (et_name != null) {
            PATIENT_NAME = et_name.getText().toString().trim();
        }
        if (et_bed != null) {
            BED_NUMBER = et_bed.getText().toString().trim();
        }
        if (et_sex != null) {
            sp_sex_str = et_sex.getText().toString().trim();
        }

        if (et_danger_level != null) {
            sp_danger_level_str = et_danger_level.getText().toString().trim();
        }
        if (sp_sex != null) {
            sp_sex.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {// 监听获取Spinner的值

                @Override
                public void onItemSelected(AdapterView<?> parent, View view,
                                           int position, long id) {

                    //拿到被选择项的值
                    sp_sex_str = (String) sp_sex.getSelectedItem();
                    //把该值传给 TextView
                    et_sex.setText(sp_sex_str);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {
                    // TODO Auto-generated method stub

                }
            });
        }
        if (sp_danger_level != null) {
            sp_danger_level.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {// 监听获取Spinner的值

                @Override
                public void onItemSelected(AdapterView<?> parent, View view,
                                           int position, long id) {

                    //拿到被选择项的值
                    sp_danger_level_str = (String) sp_danger_level.getSelectedItem();
                    //把该值传给 TextView
                    et_danger_level.setText(sp_danger_level_str);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {
                    // TODO Auto-generated method stub

                }
            });
        }

        if (sp_wait_assess != null) {
            sp_wait_assess.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {// 监听获取Spinner的值

                @Override
                public void onItemSelected(AdapterView<?> parent, View view,
                                           int position, long id) {

                    //拿到被选择项的值
                    sp_wait_assess_str = (String) sp_wait_assess.getSelectedItem();
                    //把该值传给 TextView
                    et_wait_assess.setText(sp_wait_assess_str);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {
                    // TODO Auto-generated method stub

                }
            });
        }

        if (sp_sex_str.equals("男")) {
            PATIENT_SEX = "M";
        } else if (sp_sex_str.equals("女")) {
            PATIENT_SEX = "W";
        } else {
            PATIENT_SEX = "";
        }

        if (sp_danger_level_str.equals("低危")) {
            CURRENT_RISK_LEVEL.clear();
            CURRENT_RISK_LEVEL.add("5");
        } else if (sp_danger_level_str.equals("中危")) {
            CURRENT_RISK_LEVEL.clear();
            CURRENT_RISK_LEVEL.add("6");
        } else if (sp_danger_level_str.equals("高危")) {
            CURRENT_RISK_LEVEL.clear();
            CURRENT_RISK_LEVEL.add("7");
        } else if (sp_danger_level_str.equals("极高危")) {
            CURRENT_RISK_LEVEL.clear();
            CURRENT_RISK_LEVEL.add("8");
        } else if (sp_danger_level_str.equals("确诊")) {
            CURRENT_RISK_LEVEL.clear();
            CURRENT_RISK_LEVEL.add("9");
        } else {
            CURRENT_RISK_LEVEL.clear();
        }

        if (rg_check != null) {
            rg_check.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    switch (checkedId) {
                        case R.id.rb_section:
                            CARE_UNIT = "";
                            if (DEPARTMENT_ID.size() == 0) {
                                DEPARTMENT_ID.add(loginBean.getServer_params().getDEPARTMENT());
                                officeBean.setOffice(DEPARTMENT_ID);
                            }
                            isShowDialog = false;
                            initPresenterData();
                            break;
                        case R.id.rb_element:
                            DEPARTMENT_ID.clear();
                            officeBean.setOffice(null);
                            CARE_UNIT = loginBean.getServer_params().getCARE_UNIT();// 本单元
                            isShowDialog = false;
                            initPresenterData();
                            break;
                    }
                }
            });
        }


//        OfficeBean officeBean = new OfficeBean();
//        // 本科室本单元
//        if (rb_section.isChecked()) {
//            officeBean.setOffice("1");
//        } else if (rb_element.isChecked()) {
//            officeBean.setOffice("2");
//        } else {
//            officeBean.setOffice("");
//        }
//        LogUtils.e(DEPARTMENT_ID.toString() + "");

    }

    /**
     * 布局
     *
     * @return
     */
    @Override
    protected int bindLayoutId() {
        return R.layout.activity_case_control;
    }

    @Override
    public void onQueryHMSuccess(Object result) {
        if (result != null) {
            if (result instanceof QueryHMBean) {
                if (((QueryHMBean) result).getCode().equals("0")) {
                    queryHMServerBean = ((QueryHMBean) result).getServer_params();
                    //LogUtils.e("提醒" + ((QueryHMBean) result).getMessage());
                    caseContrilAdapter.setQueryHMBean(queryHMServerBean);
                    tixingLIST = ((QueryHMBean) result).getServer_params().getTixingLIST();
                    // 有未评估的人
                    final QueryHMBean.ServerParamsBean server_params1 = ((QueryHMBean) result).getServer_params();
                    if (server_params1 != null) {
                        //弹出PopupWindow
                        if (popipWindow == null) {
                            popipWindow = new CommonPopupWindow.Builder(CaseControlActivity.this)
                                    //设置PopupWindow布局
                                    .setView(R.layout.activity_evaluating)
                                    //设置宽高
                                    .setWidthAndHeight(RadioGroup.LayoutParams.MATCH_PARENT,
                                            RadioGroup.LayoutParams.MATCH_PARENT)
                                    //设置动画
                                    .setAnimationStyle(R.style.PopupWindow)
                                    //设置背景颜色，取值范围0.0f-1.0f 值越小越暗 1.0f为透明
                                    .setBackGroundLevel(1.0f)
                                    //设置PopupWindow里的子View及点击事件
                                    .setViewOnclickListener(new CommonPopupWindow.ViewInterface() {
                                        @Override
                                        public void getChildView(View view, int layoutResId) {
                                            evaluatingAdapter = new EvaluatingAdapter(CaseControlActivity.this);
                                            RecyclerView rv_evaluating = view.findViewById(R.id.rv_evaluating);
                                            final TextView tv_wait_time = view.findViewById(R.id.tv_wait_time);
                                            final Spinner sp_wait_time = view.findViewById(R.id.sp_wait_time);
                                            rv_evaluating.setLayoutManager(new LinearLayoutManager(App.getContext()));
                                            rv_evaluating.setAdapter(evaluatingAdapter);
                                            TextView tv_shaohou = view.findViewById(R.id.tv_shaohou);
                                            final CheckBox ck_all_selected = view.findViewById(R.id.ck_all_selected);
//                                            ck_all_selected.setOnClickListener(new View.OnClickListener() {
//                                                @Override
//                                                public void onClick(View v) {
//                                                    if (ck_all_selected.isChecked()) {
//                                                        evaluatingAdapter.setChecked(true);
//                                                    } else {
//                                                        evaluatingAdapter.setChecked(false);
//                                                    }
//                                                }
//                                            });

                                            // 选择提醒时间
                                            if (sp_wait_time != null) {
                                                sp_wait_time.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {// 监听获取Spinner的值

                                                    @Override
                                                    public void onItemSelected(AdapterView<?> parent, View view,
                                                                               int position, long id) {

                                                        //拿到被选择项的值
                                                        sp_wait_time_str = (String) sp_wait_time.getSelectedItem();
                                                        //把该值传给 TextView
                                                        tv_wait_time.setText(sp_wait_time_str);
                                                    }

                                                    @Override
                                                    public void onNothingSelected(AdapterView<?> parent) {
                                                        // TODO Auto-generated method stub

                                                    }
                                                });
                                            }

                                            evaluatingAdapter.setSetTixingItemListener(new EvaluatingAdapter.SetTixingItemListener() {


                                                @Override
                                                public void onTixingItemListener(boolean isChecked, String patient_id, int form_id) {
                                                    try {
                                                        JSONObject object = new JSONObject();
                                                        object.put("PATIENT_ID", patient_id);
                                                        object.put("FORM_ID", form_id);
                                                        String s = object.toString();
                                                        if (isChecked) {
                                                            tixingParamsList.add(s);
                                                        } else {
                                                            tixingParamsList.remove(s);
                                                        }
                                                    } catch (JSONException e) {
                                                        e.printStackTrace();
                                                    }
                                                    LogUtils.e("选择的人===" + tixingParamsList + "");

                                                }
                                            });

                                            // 设置稍后提醒时间
                                            tv_shaohou.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    builder = new AlertDialog.Builder(CaseControlActivity.this).setIcon(R.mipmap.tixing).setTitle("提醒")
                                                            .setMessage("确认设置提醒时间吗？").setPositiveButton("确定", new DialogInterface.OnClickListener() {
                                                                @Override
                                                                public void onClick(DialogInterface dialogInterface, int i) {
                                                                    // 设置提醒时间接口请求

                                                                    HashMap<String, Object> params = new HashMap<>();
                                                                    params.put("Type", "updateHM_Patient_In_Assess");
                                                                    if (sp_wait_time_str.equals("15分钟")) {
                                                                        sp_wait_time_str = "900000";
                                                                    } else if (sp_wait_time_str.equals("30分钟")) {
                                                                        sp_wait_time_str = "1800000";
                                                                    } else if (sp_wait_time_str.equals("1小时")) {
                                                                        sp_wait_time_str = "3600000";
                                                                    } else if (sp_wait_time_str.equals("3小时")) {
                                                                        sp_wait_time_str = "10800000";
                                                                    } else if (sp_wait_time_str.equals("6小时")) {
                                                                        sp_wait_time_str = "21600000";
                                                                    } else if (sp_wait_time_str.equals("12小时")) {
                                                                        sp_wait_time_str = "43200000";
                                                                    } else if (sp_wait_time_str.equals("24小时")) {
                                                                        sp_wait_time_str = "86400000";
                                                                    } else if (sp_wait_time_str.equals("48小时")) {
                                                                        sp_wait_time_str = "172800000";
                                                                    }

                                                                    params.put("LATER_TIME", sp_wait_time_str);// 延迟时间
                                                                    params.put("PFDATA", tixingParamsList);// 患者
                                                                    laterOnPresenter.getLaterOn(params);
                                                                    LogUtils.e("设置提醒时间入参===" + params);
                                                                    popipWindow.dismiss();
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
                                            evaluatingAdapter.setTixingListBean(tixingLIST);
                                            // 终止评估
                                            evaluatingAdapter.setSetAssessCancelListener(new EvaluatingAdapter.SetAssessCancelListener() {
                                                @Override
                                                public void onAssessCancel(QueryHMBean.ServerParamsBean.TixingLISTBean tixingListBean, List<QueryHMBean.ServerParamsBean.TixingLISTBean> tixingListBeans, int position) {
                                                    if (tixingListBeans.size() != 0) {
                                                        HashMap<String, Object> params = new HashMap<>();
                                                        params.put("Type", "saveHM_Patient_Assess_Cancel");
                                                        params.put("VISIT_SQ_NO", tixingListBean.getVISIT_SQ_NO());
                                                        params.put("REMINDE_ID", "");
                                                        params.put("PATIENT_ID", tixingListBean.getPATIENT_ID());
                                                        params.put("CANCEL_REASON", "");
                                                        params.put("OPERATE_RESULT", "99");
                                                        params.put("REPORT_ID", tixingListBean.getREPORT_ID());
                                                        params.put("FORM_ID", tixingListBean.getFORM_ID());
                                                        assessCancelPresenter.getAssessCancel(params);
                                                        tixingListBeans.remove(position);
                                                        evaluatingAdapter.notifyDataSetChanged();
                                                        if (tixingListBeans.size() == 0) {
                                                            popipWindow.dismiss();
                                                        }
                                                    }
                                                }
                                            });
                                            // 继续评估
                                            evaluatingAdapter.setSetAssessAnewListener(new EvaluatingAdapter.SetAssessAnewListener() {
                                                @Override
                                                public void onAssessAnew(QueryHMBean.ServerParamsBean.TixingLISTBean tixingListBean) {
                                                    Intent intent = new Intent(CaseControlActivity.this, RiskAssessmentActivity.class);
                                                    intent.putExtra("loginBean", loginBean);
                                                    intent.putExtra("tixingListBean", tixingListBean);
                                                    startActivity(intent);
                                                    popipWindow.dismiss();
                                                }
                                            });
                                        }
                                    })
                                    //设置外部是否可点击 默认是true
                                    .setOutsideTouchable(false)
                                    //开始构建
                                    .create();

                        } else {
                            evaluatingAdapter.setTixingListBean(tixingLIST);
                        }
                        if (tixingLIST.size() != 0) {
                            if (!popipWindow.isShowing()) {
                                popipWindow.showAtLocation(xrv_patient_list, Gravity.CENTER, 0, 0);
                            }
                        } else {
                            popipWindow.dismiss();
                        }

                        //LogUtils.e("有未评估完的人====" + server_params1.getTixingLIST().size());
                    }
                }
            }
        }
    }

    @Override
    public void onCaseControlSuccess(Object result) {

        if (result != null) {
            if (result instanceof CaseControlBean) {
                if (((CaseControlBean) result).getCode().equals("0")) {
                    LogUtils.e(((CaseControlBean) result).getServer_params() + "");
                    LogUtils.e(((CaseControlBean) result).getMessage());
                    List<CaseControlBean.ServerParamsBean> server_params = ((CaseControlBean) result).getServer_params();
                    this.server_params = server_params;
                    caseContrilAdapter.setCaseControlBean(server_params);
                } else {
                    LogUtils.e(((CaseControlBean) result).getMessage() + "没数据");

                }
            }
        }
    }

    @Override
    public void onCancelAssessSuccess(Object result) {
        if (result != null) {
            if (result instanceof CancelAssessBean) {
                if (((CancelAssessBean) result).getCode().equals("0")) {
                    ToastUtils.show("不再评估成功");
                    LogUtils.e(((CancelAssessBean) result).getMessage());
                } else {
                    ToastUtils.show("不再评估失败");
                    LogUtils.e(((CancelAssessBean) result).getMessage());
                }
            }
        }
    }


    @Override
    public void onFailed(Object error) {
        LogUtils.e(error + "");
    }

    @Override
    public void showProgressDialog() {
        if (!isShowDialog) {
            if (loadingDialog == null) {
                loadingDialog = LoadingDialog.getDialog(CaseControlActivity.this,
                        "努力加载中",
                        true,
                        null);
            } else if (loadingDialog.isShowing()) {
                loadingDialog.setMessage("努力加载中");
            }
            loadingDialog.show();
            isShowDialog = true;
        }

    }

    @Override
    public void hideProgressDialog() {
        if (loadingDialog != null && loadingDialog.isShowing()) {
            loadingDialog.dismiss();
            loadingDialog = null;
        }
    }

    @Override
    public BasePresenter initPresenter() {
        return new CaseControlPresenter(this);
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


    private final int searchWhat = 1;
    private int pageNum;
    @SuppressLint("HandlerLeak")
    private Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {

            if (msg.what == searchWhat) {
                if (msg.obj.toString().equals(et_hospital_id.getText().toString())) {//进行判断
                    pageNum = 1;
                    isShowDialog = false;
                    initPresenterData();
                } else if (msg.obj.toString().equals(et_bed.getText().toString())) {
                    pageNum += 1;
                    isShowDialog = false;
                    initPresenterData();
                } else if (msg.obj.toString().equals(et_danger_level.getText().toString())) {
                    pageNum += 1;
                    isShowDialog = false;
                    initPresenterData();
                } else if (msg.obj.toString().equals(et_name.getText().toString())) {
                    pageNum += 1;
                    isShowDialog = false;
                    initPresenterData();
                } else if (msg.obj.toString().equals(et_sex.getText().toString())) {
                    pageNum += 1;
                    isShowDialog = false;
                    initPresenterData();
                } else if (msg.obj.toString().equals(rb_section.getText().toString())) {
                    pageNum += 1;
                    isShowDialog = false;
                    initPresenterData();
                } else if (msg.obj.toString().equals(rb_element.getText().toString())) {
                    pageNum += 1;
                    isShowDialog = false;
                    initPresenterData();
                } else if (msg.obj.toString().equals(et_wait_assess.getText().toString())) {
                    pageNum += 1;
                    isShowDialog = false;
                    initPresenterData();
                }
            }
        }
    };

    /**
     * 查询有多少条未读消息
     *
     * @param result
     */
    @Override
    public void onMessageTypeSuccess(Object result) {
        if (result != null) {
            if (result instanceof MessageNumBean) {
                if (((MessageNumBean) result).getCode().equals("0")) {
                    LogUtils.e(((MessageNumBean) result).getMessage());
                    if (((MessageNumBean) result).getServer_params() > 0) {
                        iv_message.setImageResource(R.mipmap.xiaoxi2);
                    } else {
                        iv_message.setImageResource(R.mipmap.xiaoxi2);
                    }

                } else {
                    LogUtils.e(((MessageNumBean) result).getMessage());
                }
            }
        }
    }

    @Override
    public void onMessageTypeFailed(Object error) {

    }

    @Override
    public void onAssessCancelSuccess(Object result) {

    }

    @Override
    public void onAssessCancelFailed(Object error) {

    }

    /**
     * 稍后提醒成功回调
     *
     * @param result
     */
    @Override
    public void onLaterOnSuccess(Object result) {
        if (result != null) {
            if (result instanceof LaterOnBean) {
                if (((LaterOnBean) result).getCode().equals("0")) {
                    LogUtils.e("设置提醒时间===" + ((LaterOnBean) result).getMessage());
                } else {
                    LogUtils.e("设置提醒时间===" + ((LaterOnBean) result).getMessage());
                }
            }
        }
    }

    @Override
    public void onLaterOnFailed(Object error) {

    }


    private class MyTextWatcher implements TextWatcher {

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }

        @Override
        public void afterTextChanged(Editable s) {
            if (s.length() != 0 && s.toString().trim().length() != 0) {
                Message msg = Message.obtain();
                msg.what = searchWhat;
                msg.obj = s.toString(); //携带当前值
                mHandler.sendMessageDelayed(msg, 1000);//隔一小段时间发送msg
            } else {
                initPresenterData();
                //caseContrilAdapter.notifyDataSetChanged();
            }
        }
    }


    @Override
    protected void onPause() {
        super.onPause();
        mHandler.removeCallbacksAndMessages(null);
        mHandlerQueryHM.removeCallbacksAndMessages(null);
    }

    @Override
    protected void onStop() {
        super.onStop();
        mHandler.removeCallbacksAndMessages(null);
        mHandlerQueryHM.removeCallbacksAndMessages(null);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mHandler.removeCallbacksAndMessages(null);
        mHandlerQueryHM.removeCallbacksAndMessages(null);
    }
}
