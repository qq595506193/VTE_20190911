package com.example.tidus.ristrat.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lib_core.base.mvp.BaseMvpActivity;
import com.example.lib_core.base.mvp.BasePresenter;
import com.example.tidus.ristrat.R;
import com.example.tidus.ristrat.adapter.HazardsAdapter;
import com.example.tidus.ristrat.adapter.HistoryTableListAdapter;
import com.example.tidus.ristrat.application.App;
import com.example.tidus.ristrat.bean.CaseControlBean;
import com.example.tidus.ristrat.bean.HistoryAssessBean;
import com.example.tidus.ristrat.bean.LoginBean;
import com.example.tidus.ristrat.bean.QueryHMBean;
import com.example.tidus.ristrat.contract.IHistoryAssessContract;
import com.example.tidus.ristrat.mvp.presenter.HistoryAssessPresenter;
import com.example.tidus.ristrat.utils.LoadingDialog;
import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import butterknife.BindView;

import static com.example.tidus.ristrat.application.App.getContext;

public class HistoryAssessActivity extends BaseMvpActivity<IHistoryAssessContract.IHistoryAssessModel, IHistoryAssessContract.HistoryAssessPresenter> implements IHistoryAssessContract.IHistoryAssessView {


    private String TAG = "HistoryAssessActivity";
    private LoginBean loginBean;
    private CaseControlBean.ServerParamsBean serverParamsBean;
    private ArrayList<Integer> colors = new ArrayList<Integer>();

    @BindView(R.id.rv_table_list)
    RecyclerView rv_table_list;
    @BindView(R.id.chartview)
    LineChart chartview;


    @BindView(R.id.tv_name)
    TextView tv_name;
    @BindView(R.id.tv_sex)
    TextView tv_sex;
    @BindView(R.id.tv_office)
    TextView tv_office;
    @BindView(R.id.tv_mark)
    TextView tv_mark;
    @BindView(R.id.txt_coding)
    TextView txt_coding;// 报告编码

    @BindView(R.id.txt_time)
    TextView txt_time;// 评估时间

    @BindView(R.id.txt_total)
    TextView txt_total;// 评估总分

    @BindView(R.id.txt_grade)
    TextView txt_grade;// 风险等级

    @BindView(R.id.txt_show)
    TextView txt_show;// 评估说明

    @BindView(R.id.rv_element)
    RecyclerView rv_element;// 危险因素

    @BindView(R.id.tv_txt_element)
    TextView tv_txt_element;// 危险因素

    @BindView(R.id.txt_advise)
    TextView txt_advise;// 预防处理建议

    @BindView(R.id.txt_nursing)
    TextView txt_nursing;// 护士处理建议

    @BindView(R.id.txt_note)
    TextView txt_note;// 注意事项和温馨提示

    @BindView(R.id.btn_log)
    Button btn_log;// 评估按钮
    @BindView(R.id.cly_01)
    ConstraintLayout cly_01;

    @BindView(R.id.tv_zhenduan_content)
    TextView tv_zhenduan_content;
    @BindView(R.id.cly_visib_02)
    ConstraintLayout cly_visib_02;
    @BindView(R.id.cly_visib)
    ConstraintLayout cly_visib;
    @BindView(R.id.tv_table_name)
    TextView tv_table_name;
    @BindView(R.id.iv_yuan)
    ImageView iv_yuan;
    @BindView(R.id.txt_other)
    TextView txt_other;
    @BindView(R.id.cly_02)
    ConstraintLayout cly_02;
    private HistoryTableListAdapter historyTableListAdapter;
    private LineData data;
    private TextView tv_login_name;
    private ImageView iv_message;
    private ImageView iv_close;

    private ImageView iv_back;
    private TextView tv_back;
    private Object operate_time;
    private QueryHMBean.ServerParamsBean.LISTBean listBean;
    private HistoryAssessBean historyAssessBean;
    private List<Entry> entries = new ArrayList<>();
    private List<String> listX = new ArrayList<>();
    private int position;
    private int form_id = 1;
    private List<String> listY;
    private List<HistoryAssessBean.ServerParamsBean.ReportListBean.WENJUANBean> wenjuan;
    private String report_time;
    private HistoryAssessBean.ServerParamsBean server_params;
    private int server_params_message_num;
    private LoadingDialog loadingDialog;

    @Override
    protected void init() {

    }


    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void initView(Intent intent) {
        loginBean = (LoginBean) intent.getSerializableExtra("loginBean");
        serverParamsBean = (CaseControlBean.ServerParamsBean) intent.getSerializableExtra("serverParamsBean");
        listBean = (QueryHMBean.ServerParamsBean.LISTBean) intent.getSerializableExtra("listBean");
        data = new LineData();
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
        tv_login_name = findViewById(R.id.tv_login_name);
        tv_login_name.setText(loginBean.getServer_params().getUSER_NAME());
        iv_message = findViewById(R.id.iv_message);
        iv_message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(App.getContext(), MessageActivity.class);
                intent.putExtra("loginBean", loginBean);
                startActivity(intent);
            }
        });
        iv_close = findViewById(R.id.iv_close);
        iv_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(App.getContext(), UserLoginActivity.class);
                startActivity(intent);
                finish();
            }
        });

        // 点击评估
        btn_log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(App.getContext(), NowSelectTablesActivity.class);
                intent.putExtra("loginBean", loginBean);
                intent.putExtra("serverParamsBean", serverParamsBean);
                startActivity(intent);
                finish();
            }
        });
        rv_table_list.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        historyTableListAdapter = new HistoryTableListAdapter(getContext());
        rv_table_list.setAdapter(historyTableListAdapter);

        // 条目点击接口回调
        historyTableListAdapter.setSetTableItem(new HistoryTableListAdapter.SetTableItem() {
            @Override
            public void setOnClickTableItem(int form_id, HistoryAssessBean.ServerParamsBean.ReportListBean reportListBean1) {
                HistoryAssessActivity.this.form_id = form_id;
                initPresenterData(form_id);
                if (form_id == 1) {
                    if (entries.size() != 0 && entries != null) {
                        entries.clear();
                    }
                    if (listX.size() != 0 && listX != null) {
                        listX.clear();
                    }
                    if (colors.size() != 0 && colors != null) {
                        colors.clear();
                    }
                    cly_visib.setVisibility(View.VISIBLE);
                    cly_visib_02.setVisibility(View.GONE);
                } else if (form_id == 2) {
                    if (entries.size() != 0 && entries != null) {
                        entries.clear();
                    }
                    if (listX.size() != 0 && listX != null) {
                        listX.clear();
                    }
                    if (colors.size() != 0 && colors != null) {
                        colors.clear();
                    }
                    cly_visib.setVisibility(View.VISIBLE);
                    cly_visib_02.setVisibility(View.GONE);
                }


            }
        });


    }


    @Override
    protected void initData() {
        super.initData();
        initPresenterData(form_id);
    }


    private void initPresenterData(int form_id) {
        HashMap<String, Object> params = new HashMap<>();
        params.put("Type", "queryJibingReportLIST");
        params.put("PATIENT_ID", serverParamsBean.getPATIENT_ID());
        params.put("CONFIRM_FLAG", "20");
        presenter.getHistoryAssess(params);
    }

    /**
     * 布局
     *
     * @return
     */
    @Override
    protected int bindLayoutId() {
        return R.layout.activity_history_assess;
    }

    @Override
    public BasePresenter initPresenter() {
        return new HistoryAssessPresenter();
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
    public void onHistoryAssessSuccess(Object result) throws ParseException {
        if (result != null) {
            if (result instanceof HistoryAssessBean) {
                if (((HistoryAssessBean) result).getCode().equals("0")) {
                    server_params = ((HistoryAssessBean) result).getServer_params();
                    String zhenduan = "";
                    for (HistoryAssessBean.ServerParamsBean.JibinlistBean jibinlistBean : ((HistoryAssessBean) result).getServer_params().getJibinlist()) {
                        // 诊断说明
                        String replace = jibinlistBean.getDIAGNOSIS_DISEASE_NAME().replace("\n", "");
                        String diagnosis_date = jibinlistBean.getDIAGNOSIS_DATE();
                        String year = diagnosis_date.substring(0, 4);// 年
                        String month = diagnosis_date.substring(4, 6);// 月
                        String day = diagnosis_date.substring(6, 8);// 日
                        String time = diagnosis_date.substring(8, 10);// 时
                        String minute = diagnosis_date.substring(10, 12);// 分
                        String second = diagnosis_date.substring(12, 14);// 秒
                        zhenduan += "(" + year + "-" + month + "-" + day + "  " + time + ":" + minute + ":" + second + ")" + replace + "\n";
                    }
                    tv_zhenduan_content.setText(zhenduan);
                    tv_name.setText(((HistoryAssessBean) result).getServer_params().getPATIENT_NAME());
                    if (((HistoryAssessBean) result).getServer_params().getPATIENT_SEX().equals("M")) {
                        tv_sex.setText("男");
                    } else {
                        tv_sex.setText("女");
                    }
                    tv_office.setText(((HistoryAssessBean) result).getServer_params().getIN_DEPT_NAME());
                    tv_mark.setText(((HistoryAssessBean) result).getServer_params().getVISIT_SQ_NO());
                }
                if (((HistoryAssessBean) result).getServer_params().getReportList().size() != 0) {
                    cly_02.setVisibility(View.VISIBLE);
                    cly_visib.setVisibility(View.VISIBLE);
                    cly_visib_02.setVisibility(View.GONE);
                    historyTableListAdapter.setWenjuannameBeans(((HistoryAssessBean) result).getServer_params().getReportList());
                    historyTableListAdapter.notifyDataSetChanged();
                    for (HistoryAssessBean.ServerParamsBean.ReportListBean reportListBean : ((HistoryAssessBean) result).getServer_params().getReportList()) {
                        // 判断是哪个表
                        if (reportListBean.getFORM_ID() == form_id) {
                            reportListBean.che_color = true;// 按钮颜色
                            tv_table_name.setText(reportListBean.getFORM_NAME());
                            wenjuan = reportListBean.getWENJUAN();
                            // 表
                            // 预生成报告没有暂无报告
                            if (reportListBean.getWENJUAN().size() != 0) {
                                for (HistoryAssessBean.ServerParamsBean.ReportListBean.WENJUANBean wenjuanBean : reportListBean.getWENJUAN()) {
                                    initInfo(wenjuanBean);
                                }
                            } else {
                                //cly_02.setVisibility(View.GONE);
                                cly_visib.setVisibility(View.GONE);
                                cly_visib_02.setVisibility(View.VISIBLE);
                            }
                        }

                    }
                } else {
                    //cly_02.setVisibility(View.GONE);
                    cly_visib.setVisibility(View.GONE);
                    cly_visib_02.setVisibility(View.VISIBLE);
                }

                initViewChart();
            }
        }
    }

    @Override
    public void showProgressDialog() {
        if (loadingDialog == null) {
            loadingDialog = LoadingDialog.getDialog(HistoryAssessActivity.this,
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

    private void initInfo(HistoryAssessBean.ServerParamsBean.ReportListBean.WENJUANBean wenjuanBean) {
        // 危险等级sub
        for (HistoryAssessBean.ServerParamsBean.ReportListBean.WENJUANBean.SublistBean sublistBean : wenjuanBean.getSublist()) {
            report_time = sublistBean.getREPORT_TIME();
            txt_coding.setText(sublistBean.getREPORT_CODE());// 报告编码
            String report_time = sublistBean.getREPORT_TIME();
            String year = report_time.substring(0, 4);// 年
            String month = report_time.substring(4, 6);// 月
            String day = report_time.substring(6, 8);// 日
            String time = report_time.substring(8, 10);// 时
            String minute = report_time.substring(10, 12);// 分
            String second = report_time.substring(12, 14);// 秒
            txt_time.setText(year + "年" + month + "月" + day + "日" + time + "时" + minute + "分" + second + "秒");// 评估时间
            // 评分
            txt_total.setText(sublistBean.getCURRENT_RISK_VALUE() + "分");
            if (sublistBean.getRISK_DETAIL_DESC() != null) {
                txt_show.setText(sublistBean.getRISK_DETAIL_DESC());
            }

            switch (sublistBean.getCURRENT_RISK_LEVEL()) {
                case "5":
                    iv_yuan.setImageResource(R.mipmap.diwei_yuan);
                    txt_grade.setText(sublistBean.getRISK_NAME());
                    txt_grade.setTextColor(getContext().getResources().getColorStateList(R.color.levelGreenColor));
                    break;
                case "6":
                    iv_yuan.setImageResource(R.mipmap.zhongwei_yuan);
                    txt_grade.setText(sublistBean.getRISK_NAME());
                    txt_grade.setTextColor(getContext().getResources().getColorStateList(R.color.levelBlueColor));

                    break;
                case "7":
                    iv_yuan.setImageResource(R.mipmap.gaowei_yuan);
                    txt_grade.setText(sublistBean.getRISK_NAME());
                    txt_grade.setTextColor(getContext().getResources().getColorStateList(R.color.levelYellowColor));

                    break;
                case "8":
                    iv_yuan.setImageResource(R.mipmap.jigaowei_yuan);
                    txt_grade.setText(sublistBean.getRISK_NAME());
                    txt_grade.setTextColor(getContext().getResources().getColorStateList(R.color.levelOrangeColor));

                    break;
                case "9":
                    iv_yuan.setImageResource(R.mipmap.quezhen_yuan);
                    txt_grade.setText(sublistBean.getRISK_NAME());
                    txt_grade.setTextColor(getContext().getResources().getColorStateList(R.color.levelRedColor));

                    break;
                case "21":
                    iv_yuan.setImageResource(R.mipmap.chuxue_diwei);
                    txt_grade.setText(sublistBean.getRISK_NAME());
                    txt_grade.setTextColor(getContext().getResources().getColorStateList(R.color.levelGreenColor));

                    break;
                case "22":
                    iv_yuan.setImageResource(R.mipmap.chuxue_gaowei);
                    txt_grade.setText(sublistBean.getRISK_NAME());
                    txt_grade.setTextColor(getContext().getResources().getColorStateList(R.color.levelRedColor));

                    break;
                default:
                    txt_grade.setText("暂无危险等级");
                    txt_grade.setTextColor(getContext().getResources().getColorStateList(R.color.levelRedColor));
                    break;
            }
            // 评估说明
            if (wenjuanBean.getSublist().size() != 0 && wenjuanBean.getSublist() != null) {
                String sub = "";
                for (HistoryAssessBean.ServerParamsBean.ReportListBean.WENJUANBean.SublistBean bean : wenjuanBean.getSublist()) {
                    if (bean.getRISK_DETAIL_DESC() != null) {
                        sub += bean.getRISK_DETAIL_DESC();
                    } else {
                        sub = "暂无评估说明";
                    }
                }
                txt_show.setText(sub);
            } else {
                txt_show.setText("暂无评估说明");
            }


        }
        // 危险因素集合
        rv_element.setLayoutManager(new LinearLayoutManager(App.getContext()));
        HazardsAdapter hazardsAdapter = new HazardsAdapter(getContext());
        rv_element.setAdapter(hazardsAdapter);
        if (wenjuanBean.getWxys().size() != 0) {
            rv_element.setVisibility(View.VISIBLE);
            tv_txt_element.setVisibility(View.GONE);
            hazardsAdapter.setWxysBeans(wenjuanBean.getWxys());
        } else {
            rv_element.setVisibility(View.GONE);
            tv_txt_element.setVisibility(View.VISIBLE);
            tv_txt_element.setText("暂无危险因素");
        }


        // 预防处理建议
        if (wenjuanBean.getDOCTOR_ADVICE().size() != 0) {
            List<HistoryAssessBean.ServerParamsBean.ReportListBean.WENJUANBean.DOCTORADVICEBean> doctor_advice = wenjuanBean.getDOCTOR_ADVICE();
            String s = "";
            for (int i = 0; i < doctor_advice.size(); i++) {
                HistoryAssessBean.ServerParamsBean.ReportListBean.WENJUANBean.DOCTORADVICEBean doctoradviceBean = doctor_advice.get(i);
                s += doctoradviceBean.getADVICE_CONTENT() + "\n";
            }
            txt_advise.setText(s);
        } else {
            txt_advise.setText("暂无建议");
        }

        // 护理处理建议
        if (wenjuanBean.getNURSE_ADVICE().size() != 0) {
            List<HistoryAssessBean.ServerParamsBean.ReportListBean.WENJUANBean.NURSEADVICEBean> nurse_advice = wenjuanBean.getNURSE_ADVICE();
            String s = "";
            for (int i = 0; i < nurse_advice.size(); i++) {
                HistoryAssessBean.ServerParamsBean.ReportListBean.WENJUANBean.NURSEADVICEBean nurseadviceBean = nurse_advice.get(i);
                s += nurseadviceBean.getADVICE_CONTENT() + "\n";
            }
            txt_nursing.setText(s);
        } else {
            txt_nursing.setText("暂无建议");
        }

        // 患者温馨提示
        if (wenjuanBean.getPATIENT_ADVICE().size() != 0) {
            List<HistoryAssessBean.ServerParamsBean.ReportListBean.WENJUANBean.PATIENTADVICEBean> patient_advice = wenjuanBean.getPATIENT_ADVICE();
            String s = "";
            for (int i = 0; i < patient_advice.size(); i++) {
                HistoryAssessBean.ServerParamsBean.ReportListBean.WENJUANBean.PATIENTADVICEBean patientadviceBean = patient_advice.get(i);
                if (patientadviceBean.getADVICE_CONTENT() != null) {
                    s += patientadviceBean.getADVICE_CONTENT() + "\n";
                } else {
                    s = "暂无建议";
                }

            }
            txt_note.setText(s);
        } else {
            txt_note.setText("暂无建议");
        }

        // 其他
        if (wenjuanBean.getELSE_ADVICE().size() != 0) {
            List<HistoryAssessBean.ServerParamsBean.ReportListBean.WENJUANBean.ELSEADVICEBean> else_advice = wenjuanBean.getELSE_ADVICE();
            String s = "";
            for (int i = 0; i < else_advice.size(); i++) {
                HistoryAssessBean.ServerParamsBean.ReportListBean.WENJUANBean.ELSEADVICEBean else_adviceBean = else_advice.get(i);
                if (else_adviceBean.getADVICE_CONTENT() != null) {
                    s += else_adviceBean.getADVICE_CONTENT() + "\n";
                } else {
                    s = "暂无建议";
                }
            }
            txt_other.setText(s);
        } else {
            txt_other.setText("暂无建议");
        }
    }

    private void initInfo_02(HistoryAssessBean.ServerParamsBean.ReportListBean.WENJUANBean wenjuanBean) {
        // 危险等级sub
        for (HistoryAssessBean.ServerParamsBean.ReportListBean.WENJUANBean.SublistBean sublistBean : wenjuanBean.getSublist()) {
            report_time = sublistBean.getREPORT_TIME();
            txt_coding.setText(sublistBean.getREPORT_CODE());// 报告编码
            String report_time = sublistBean.getREPORT_TIME();
            String year = report_time.substring(0, 4);// 年
            String month = report_time.substring(4, 6);// 月
            String day = report_time.substring(6, 8);// 日
            String time = report_time.substring(8, 10);// 时
            String minute = report_time.substring(10, 12);// 分
            String second = report_time.substring(12, 14);// 秒
            txt_time.setText(year + "年" + month + "月" + day + "日" + time + "时" + minute + "分" + second + "秒");// 评估时间
            // 评分
            txt_total.setText(sublistBean.getCURRENT_RISK_VALUE() + "分");
            if (sublistBean.getRISK_DETAIL_DESC() != null) {
                txt_show.setText(sublistBean.getRISK_DETAIL_DESC());
            }

            switch (sublistBean.getCURRENT_RISK_LEVEL()) {
                case "5":
                    iv_yuan.setImageResource(R.mipmap.diwei_yuan);
                    txt_grade.setText(sublistBean.getRISK_NAME());
                    txt_grade.setTextColor(getContext().getResources().getColorStateList(R.color.levelGreenColor));
                    break;
                case "6":
                    iv_yuan.setImageResource(R.mipmap.zhongwei_yuan);
                    txt_grade.setText(sublistBean.getRISK_NAME());
                    txt_grade.setTextColor(getContext().getResources().getColorStateList(R.color.levelBlueColor));

                    break;
                case "7":
                    iv_yuan.setImageResource(R.mipmap.gaowei_yuan);
                    txt_grade.setText(sublistBean.getRISK_NAME());
                    txt_grade.setTextColor(getContext().getResources().getColorStateList(R.color.levelYellowColor));

                    break;
                case "8":
                    iv_yuan.setImageResource(R.mipmap.jigaowei_yuan);
                    txt_grade.setText(sublistBean.getRISK_NAME());
                    txt_grade.setTextColor(getContext().getResources().getColorStateList(R.color.levelOrangeColor));

                    break;
                case "9":
                    iv_yuan.setImageResource(R.mipmap.quezhen_yuan);
                    txt_grade.setText(sublistBean.getRISK_NAME());
                    txt_grade.setTextColor(getContext().getResources().getColorStateList(R.color.levelRedColor));

                    break;
                case "21":
                    iv_yuan.setImageResource(R.mipmap.chuxue_diwei);
                    txt_grade.setText(sublistBean.getRISK_NAME());
                    txt_grade.setTextColor(getContext().getResources().getColorStateList(R.color.levelGreenColor));

                    break;
                case "22":
                    iv_yuan.setImageResource(R.mipmap.chuxue_gaowei);
                    txt_grade.setText(sublistBean.getRISK_NAME());
                    txt_grade.setTextColor(getContext().getResources().getColorStateList(R.color.levelRedColor));

                    break;
                default:
                    txt_grade.setText("暂无危险等级");
                    txt_grade.setTextColor(getContext().getResources().getColorStateList(R.color.levelRedColor));
                    break;
            }
            // 评估说明
            if (wenjuanBean.getSublist().size() != 0 && wenjuanBean.getSublist() != null) {
                String sub = "";
                for (HistoryAssessBean.ServerParamsBean.ReportListBean.WENJUANBean.SublistBean bean : wenjuanBean.getSublist()) {
                    if (bean.getRISK_DETAIL_DESC() != null) {
                        sub += bean.getRISK_DETAIL_DESC();
                    } else {
                        sub = "暂无评估说明";
                    }
                }
                txt_show.setText(sub);
            } else {
                txt_show.setText("暂无评估说明");
            }


        }
        // 危险因素集合
        rv_element.setLayoutManager(new LinearLayoutManager(App.getContext()));
        HazardsAdapter hazardsAdapter = new HazardsAdapter(getContext());
        rv_element.setAdapter(hazardsAdapter);
        if (wenjuanBean.getWxys().size() != 0) {
            rv_element.setVisibility(View.VISIBLE);
            tv_txt_element.setVisibility(View.GONE);
            hazardsAdapter.setWxysBeans(wenjuanBean.getWxys());
        } else {
            rv_element.setVisibility(View.GONE);
            tv_txt_element.setVisibility(View.VISIBLE);
            tv_txt_element.setText("暂无危险因素");
        }


        // 预防处理建议
        if (wenjuanBean.getDOCTOR_ADVICE().size() != 0) {
            List<HistoryAssessBean.ServerParamsBean.ReportListBean.WENJUANBean.DOCTORADVICEBean> doctor_advice = wenjuanBean.getDOCTOR_ADVICE();
            String s = "";
            for (int i = 0; i < doctor_advice.size(); i++) {
                HistoryAssessBean.ServerParamsBean.ReportListBean.WENJUANBean.DOCTORADVICEBean doctoradviceBean = doctor_advice.get(i);
                s += doctoradviceBean.getADVICE_CONTENT() + "\n";
            }
            txt_advise.setText(s);
        } else {
            txt_advise.setText("暂无建议");
        }

        // 护理处理建议
        if (wenjuanBean.getNURSE_ADVICE().size() != 0) {
            List<HistoryAssessBean.ServerParamsBean.ReportListBean.WENJUANBean.NURSEADVICEBean> nurse_advice = wenjuanBean.getNURSE_ADVICE();
            String s = "";
            for (int i = 0; i < nurse_advice.size(); i++) {
                HistoryAssessBean.ServerParamsBean.ReportListBean.WENJUANBean.NURSEADVICEBean nurseadviceBean = nurse_advice.get(i);
                s += nurseadviceBean.getADVICE_CONTENT() + "\n";
            }
            txt_nursing.setText(s);
        } else {
            txt_nursing.setText("暂无建议");
        }

        // 患者温馨提示
        if (wenjuanBean.getPATIENT_ADVICE().size() != 0) {
            List<HistoryAssessBean.ServerParamsBean.ReportListBean.WENJUANBean.PATIENTADVICEBean> patient_advice = wenjuanBean.getPATIENT_ADVICE();
            String s = "";
            for (int i = 0; i < patient_advice.size(); i++) {
                HistoryAssessBean.ServerParamsBean.ReportListBean.WENJUANBean.PATIENTADVICEBean patientadviceBean = patient_advice.get(i);
                if (patientadviceBean.getADVICE_CONTENT() != null) {
                    s += patientadviceBean.getADVICE_CONTENT() + "\n";
                } else {
                    s = "暂无建议";
                }

            }
            txt_note.setText(s);
        } else {
            txt_note.setText("暂无建议");
        }

        // 其他
        if (wenjuanBean.getELSE_ADVICE().size() != 0) {
            List<HistoryAssessBean.ServerParamsBean.ReportListBean.WENJUANBean.ELSEADVICEBean> else_advice = wenjuanBean.getELSE_ADVICE();
            String s = "";
            for (int i = 0; i < else_advice.size(); i++) {
                HistoryAssessBean.ServerParamsBean.ReportListBean.WENJUANBean.ELSEADVICEBean else_adviceBean = else_advice.get(i);
                if (else_adviceBean.getADVICE_CONTENT() != null) {
                    s += else_adviceBean.getADVICE_CONTENT() + "\n";
                } else {
                    s = "暂无建议";
                }
            }
            txt_other.setText(s);
        } else {
            txt_other.setText("暂无建议");
        }
    }

    private void initViewChart() {
        if (form_id == 1) {
            //准备好每个点对应的y轴数值
            listY = new ArrayList<>();
            listY.clear();
            listY.add("");
            listY.add("低危");
            listY.add("中危");
            listY.add("高危");
            listY.add("极高危");
            listY.add("确诊");
        } else if (form_id == 2) {
            listY = new ArrayList<>();
            listY.clear();
            listY.add("");
            listY.add("低危");
            listY.add("");
            listY.add("高危");
            listY.add("");
            listY.add("");
        }
        //折线图
        //是否缩放X轴
        chartview.setScaleXEnabled(false);
        //是否缩放Y轴
        chartview.setScaleYEnabled(false);
        //设置支持触控手势
        chartview.setTouchEnabled(true);
        //设置推动
        chartview.setScaleEnabled(false);
        chartview.setDragDecelerationFrictionCoef(0.9f);
        //设置是否可以拖拽
        chartview.setDragEnabled(true);
        //设置一页最大显示个数为6，超出部分就滑动
        float ratio = (float) wenjuan.size() / (float) 6;
        //显示的时候是按照多大的比率缩放显示,1f表示不放大缩小
        chartview.zoom(ratio, 1f, 0, 0);
        //无数据时显示的文字
        chartview.setNoDataText("暂无数据");

        chartview.getXAxis().setGridColor(getResources().getColor(R.color.color_shenhui_));
        //设置从X轴出来的动画时间
        //mLineChart.animateX(1500);
        //设置XY轴动画
        chartview.animateXY(1500, 1500, Easing.EasingOption.EaseInSine, Easing.EasingOption.EaseInSine);
        //准备好每个点对应的x轴数
        //Log.e(TAG,"问卷长度===" + wenjuan.size());
        // 点击事件
        chartview.setOnChartValueSelectedListener(new OnChartValueSelectedListener() {
            private float valEntry;
            private int iEntry;

            @Override
            public void onValueSelected(Entry e, Highlight h) {
                // 获取Entry
                iEntry = (int) e.getX();
                valEntry = e.getY();

                Log.e(TAG, "e.getX() = " + iEntry + "     e.getY() = " + valEntry);
                for (int i = 0; i < wenjuan.size(); i++) {
                    HistoryAssessBean.ServerParamsBean.ReportListBean.WENJUANBean wenjuanBean_chart = wenjuan.get(i);
                    if (i + 1 == iEntry) {
                        if (wenjuanBean_chart.getFORM_ID() == form_id) {
                            initInfo_02(wenjuanBean_chart);
                        }
                    }
                }

            }

            @Override
            public void onNothingSelected() {

            }
        });

        listX.add("");
        for (int i = 0; i < wenjuan.size(); i++) {
            HistoryAssessBean.ServerParamsBean.ReportListBean.WENJUANBean wenjuanBean = wenjuan.get(i);
            String send_time = wenjuanBean.getREPORT_TIME();
            String year = send_time.substring(0, 4);// 年
            String month = send_time.substring(4, 6);// 月
            String day = send_time.substring(6, 8);// 日
            String time = send_time.substring(8, 10);// 时
            String minute = send_time.substring(10, 12);// 分
            String second = send_time.substring(12, 14);// 秒
            listX.add(year + "-" + month + "-" + day + "  " + time + "：" + minute + "：" + second);
        }
        //Log.e(TAG,"X轴的长度===" + listX.size());
        //设置样式
        YAxis rightAxis = chartview.getAxisRight();
        //设置图表右边的y轴禁用
        rightAxis.setEnabled(false);
        YAxis yAxis = chartview.getAxisLeft();
        yAxis.setValueFormatter(new IndexAxisValueFormatter(listY));
        //设置Y极值，我这里没设置最大值，因为项目需要没有设置最大值
        yAxis.setXOffset(0);
        yAxis.setYOffset(0);
        yAxis.setAxisMinimum(0f);
        yAxis.setAxisMaximum((float) listY.size());
        yAxis.setDrawGridLines(false);
        //1.设置x轴和y轴的点
        for (int i = 0; i < wenjuan.size(); i++) {
            HistoryAssessBean.ServerParamsBean.ReportListBean.WENJUANBean wenjuanBean = wenjuan.get(i);
            List<HistoryAssessBean.ServerParamsBean.ReportListBean.WENJUANBean.SublistBean> sublist = wenjuanBean.getSublist();
            for (HistoryAssessBean.ServerParamsBean.ReportListBean.WENJUANBean.SublistBean sublistBean : sublist) {
                Log.e(TAG, "subList长度==" + sublist.size() + "");
                String current_risk_level = sublistBean.getCURRENT_RISK_LEVEL();

                final int s = Integer.parseInt(current_risk_level);
                if (5 == s) {
                    entries.add(new Entry(i + 1, 1));
                    colors.add(Color.parseColor("#05a558"));
                } else if (6 == s) {
                    entries.add(new Entry(i + 1, 2));
                    colors.add(Color.parseColor("#6cbdfe"));
                } else if (7 == s) {
                    entries.add(new Entry(i + 1, 3));
                    colors.add(Color.parseColor("#fed700"));
                } else if (8 == s) {
                    entries.add(new Entry(i + 1, 4));
                    colors.add(Color.parseColor("#ff7e00"));
                } else if (9 == s) {
                    entries.add(new Entry(i + 1, 5));
                    colors.add(Color.parseColor("#ff4e6b"));
                } else if (21 == s) {
                    entries.add(new Entry(i + 1, 1));
                    colors.add(Color.parseColor("#05a558"));
                } else if (22 == s) {
                    entries.add(new Entry(i + 1, 3));
                    colors.add(Color.parseColor("#ff4e6b"));
                }
            }
        }
        initX(wenjuan);
    }

    /**
     * 配置X轴
     *
     * @param wenjuan
     */
    private void initX(List<HistoryAssessBean.ServerParamsBean.ReportListBean.WENJUANBean> wenjuan) {
        //隐藏描述
        Description description = new Description();
        description.setEnabled(false);
        chartview.setDescription(description);
        //X轴
        XAxis xAxis = chartview.getXAxis();
        xAxis.setValueFormatter(new IndexAxisValueFormatter(listX));
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);//设置x轴的显示位置
        //设置X轴高度
        xAxis.setAxisLineWidth(1);
        xAxis.setGranularity(1f);
        //设置X轴的刻度数量，第二个参数为true,将会画出明确数量（带有小数点），但是可能值导致不均匀，默认（6，false）
        xAxis.setLabelCount(listX.size(), false);
        // 标签倾斜
        //xAxis.setLabelRotationAngle(45);
        // 设置x轴数据偏移量
        xAxis.setXOffset(0);
        //设置X轴的值（最小值、最大值、然后会根据设置的刻度数量自动分配刻度显示）
        xAxis.setAxisMinimum(0f);
        xAxis.setAxisMaximum((float) listX.size() + 1);
        //设置字体大小10sp
        xAxis.setTextSize(9f);
        // 设置垂直线
        xAxis.setDrawGridLines(false);
        setDiscounting(entries);
    }

    public void setDiscounting(List<Entry> entries) {

        LineDataSet dataSet = new LineDataSet(entries, "");
        // 设置数据内容的样式
        dataSet.setColor(Color.WHITE);                     // 设置数据中线的颜色
        dataSet.setDrawValues(false);                     // 设置是否显示数据点的值
        dataSet.setDrawCircleHole(false);                // 设置数据点是空心还是实心，默认空心
        dataSet.setCircleColors(colors);                // 设置数据点的颜色
        dataSet.setCircleSize(13);                     // 设置数据点大小
        dataSet.setHighlightEnabled(true);            //设置显示十字线，必须显示十字线，否则MarkerView不生效
        // 设置数据点的大小
        dataSet.setHighLightColor(Color.WHITE);

        //chart设置数据
        LineData lineData = new LineData(dataSet);
        //是否绘制线条上的文字
        lineData.setDrawValues(false);
        // x轴执行动画
        //chartview.animateX(2000);
        chartview.setData(lineData);
        chartview.invalidate(); // refresh


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (entries != null) {
            entries.clear();
        }
        if (listY != null) {
            listY.clear();
        }
    }
}
