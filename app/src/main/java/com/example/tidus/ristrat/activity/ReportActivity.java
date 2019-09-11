package com.example.tidus.ristrat.activity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tidus.ristrat.R;
import com.example.tidus.ristrat.adapter.ReportAdapter;
import com.example.tidus.ristrat.base.BaseActivity;
import com.example.tidus.ristrat.bean.CommitBean;
import com.example.tidus.ristrat.bean.ReportBean;
import com.example.tidus.ristrat.bean.RiskBean;
import com.example.tidus.ristrat.mvp.presenter.ReportPresenter;
import com.example.tidus.ristrat.mvp.view.iview.IReportView;
import com.example.tidus.ristrat.weight.MaxHeightRecyclerView;

import java.util.ArrayList;
import java.util.HashMap;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * 提交评估报告
 */
public class ReportActivity extends BaseActivity<ReportPresenter> implements IReportView {

    @BindView(R.id.title_back) ImageView titleBack;
    @BindView(R.id.btn_person) ImageView btnPerson;
    @BindView(R.id.txt_num) TextView txtNum;
    @BindView(R.id.rl_factor) MaxHeightRecyclerView rlFactor;
    @BindView(R.id.txt_fenxian) TextView txtFenxian;
    @BindView(R.id.txt_rank) TextView txtRank;
    @BindView(R.id.txt_dvt) TextView txtDvt;
    @BindView(R.id.txt_plan) TextView txtPlan;
    @BindView(R.id.btn_overwrite) Button btnOverwrite;
    @BindView(R.id.btn_commit) Button btnCommit;
    @BindView(R.id.title_lable) TextView titleLable;
    @BindView(R.id.title_left_lable) TextView titleLeftLable;
    private HashMap<String, String> params;
    private ReportAdapter reportAdapter;
    private int allnum;
    private String leftLable = "静脉血栓(VTE)风险个人评估报告";
    private String patient_id;
    private SharedPreferences sp;
    private String topic_id;
    private ArrayList<RiskBean.ServerParamsBean> intentList;
    private int service_plan_id;

    @Override
    protected void initData() {
        final Intent intent = getIntent();
        String leftable = getIntent().getStringExtra("leftable");
        titleLeftLable.setText(leftable);
        sp = getSharedPreferences("model", MODE_PRIVATE);
        patient_id = sp.getString("PATIENT_ID", "");
        titleLable.setText(leftLable);
        intentList = (ArrayList<RiskBean.ServerParamsBean>) intent.getSerializableExtra("intentList");
        allnum = intent.getIntExtra("allnum", 0);
        topic_id = intent.getStringExtra("topic_id");
        txtNum.setText(allnum + "分");
        params = new HashMap<>();
        params.put("Type", "queryHM_Risk_Level");
        params.put("INTEGRAL", allnum + "");
        params.put("TOPIC_ID", topic_id + "");
        presenter.getReport(params);
        SharedPreferences sp = getSharedPreferences("model", MODE_PRIVATE);
        service_plan_id = sp.getInt("SERVICE_PLAN_ID", 0);
        reportAdapter = new ReportAdapter(intentList, this);
        rlFactor.setLayoutManager(new LinearLayoutManager(this) {
            @Override
            public void onMeasure(RecyclerView.Recycler recycler, RecyclerView.State state, int widthSpec, int heightSpec) {
                super.onMeasure(recycler, state, widthSpec, heightSpec);
                int count = state.getItemCount();
                if (count > 0) {
                    if (count > 4) {
                        count = 4;
                    }
                    int realHeight = 0;
                    int realWidth = 0;
                    int height = 0;
                    int he = 0;
                    for (int i = 0; i < count; i++) {
                        View view = recycler.getViewForPosition(0);
                        if (view != null) {
                            measureChild(view, widthSpec, heightSpec);
                            int measuredWidth = View.MeasureSpec.getSize(widthSpec);
                            int measuredHeight = view.getMeasuredHeight();
                            realWidth = realWidth > measuredWidth ? realWidth : measuredWidth;
                            realHeight += measuredHeight;
                            height = measuredHeight;
                            he = measuredHeight;
                        }
                        if (intentList.size() == 2) {
                            height = height * 2;
                        } else if (intentList.size() == 3) {
                            height = height * 3;
                        } else if (intentList.size() > 4) {
                            height = height * 4;
                        } else if (intentList.size() == 1) {
                            height = height;
                        } else {
                            height = height * 4;
                        }

                        setMeasuredDimension(realWidth, height);
                        LinearLayout.LayoutParams lp = (LinearLayout.LayoutParams) txtFenxian.getLayoutParams();
                        lp.setMargins(0, height - 20, 0, he - 10);
                        txtFenxian.setLayoutParams(lp);
                    }
                } else {
                    super.onMeasure(recycler, state, widthSpec, widthSpec);
                }


            }
        });
        rlFactor.setAdapter(reportAdapter);
    }

    @Override
    protected ReportPresenter getProduct() {
        return new ReportPresenter();
    }

    @Override
    protected void initView() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_report;
    }

    @OnClick({R.id.title_back, R.id.btn_overwrite, R.id.btn_commit,R.id.title_left_lable})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.title_back:
                finish();
                break;
            case R.id.btn_overwrite:
                alertDialog();
                break;
            case R.id.btn_commit:
                commitDialog();

                break;
            case  R.id.title_left_lable:
                finish();
                break;
        }
    }

    private void commitDialog() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setMessage("现在提交并保存");
        alertDialogBuilder.setPositiveButton("是", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                params = new HashMap<>();
                String riskFactorId = "";
                for (RiskBean.ServerParamsBean serverParamsBean : intentList) {
                    riskFactorId += serverParamsBean.getRISK_FACTOR_ID() + ",";
                }

                params.put("Type", "Set_Hm_Report_Hp");
                params.put("PATIENT_ID", patient_id);
                params.put("SERVICE_PLAN_ID", "" + service_plan_id);
                params.put("INTEGRAL", allnum + "");
                params.put("RISK_FACTOR_ID", riskFactorId);
                params.put("GATHER_TYPE", "" + 30);
                presenter.getCommit(params);
            }
        });
        alertDialogBuilder.setNegativeButton("否", null);
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

    private void alertDialog() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setMessage("现在重新进行评估");
        alertDialogBuilder.setPositiveButton("是", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        alertDialogBuilder.setNegativeButton("否", null);
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

    @Override
    public void success(ReportBean reportBean) {
        txtRank.setText(reportBean.getServer_params().get(0).getRISK_NAME());
        String risk_detail_desc = reportBean.getServer_params().get(0).getRISK_DETAIL_DESC();
        txtDvt.setText(risk_detail_desc.substring(7, risk_detail_desc.length() - 1));
        txtPlan.setText(reportBean.getServer_params().get(0).getPATIENT_ADVICE());


    }

    @Override
    public void succ(CommitBean commit) {
        Toast.makeText(this, "提交" + commit.getMessage(), Toast.LENGTH_SHORT).show();
        finish();
        RiskActivity.mActivity.finish();
    }

    @Override
    public void faild(Throwable t) {

    }

    @Override
    public Context context() {
        return this;
    }



}
