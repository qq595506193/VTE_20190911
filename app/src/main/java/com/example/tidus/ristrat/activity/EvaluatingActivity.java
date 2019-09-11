package com.example.tidus.ristrat.activity;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.example.tidus.ristrat.R;
import com.example.tidus.ristrat.adapter.EvaluatingAdapter;
import com.example.tidus.ristrat.application.App;
import com.example.tidus.ristrat.bean.QueryHMBean;
import com.example.tidus.ristrat.contract.IAssessCancelContract;
import com.example.tidus.ristrat.mvp.presenter.AssessCancelPresenter;

import java.util.HashMap;
import java.util.List;

public class EvaluatingActivity extends AppCompatActivity implements IAssessCancelContract.IAssessCanceTixinglView {

    private QueryHMBean.ServerParamsBean server_params;
    private AssessCancelPresenter assessCancelPresenter;
    private RecyclerView rv_evaluating;
    private ConstraintLayout ctl_select_question;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluating);

        //immersiveStatusBar();
        initView();
        initData();
    }

    private void initData() {

    }


    private void initView() {
        rv_evaluating = findViewById(R.id.rv_evaluating);
        ctl_select_question = findViewById(R.id.ctl_select_question);
        //ctl_select_question.getBackground().setAlpha(200);
        assessCancelPresenter = new AssessCancelPresenter(this);
        server_params = (QueryHMBean.ServerParamsBean) getIntent().getSerializableExtra("server_params");
        EvaluatingAdapter evaluatingAdapter = new EvaluatingAdapter(App.getContext());
        rv_evaluating.setLayoutManager(new LinearLayoutManager(App.getContext()));
        rv_evaluating.setAdapter(evaluatingAdapter);
        evaluatingAdapter.setTixingListBean(server_params.getTixingLIST());

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
                    assessCancelPresenter.getAssessCancel(params);
                }

            }
        });
    }


    @Override
    public void onAssessCancelSuccess(Object result) {

    }

    @Override
    public void onAssessCancelFailed(Object error) {

    }

    private void immersiveStatusBar() {
        Window window = getWindow();
        //4.4版本及以上
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            window.setFlags(
                    WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS,
                    WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }
        //5.0版本及以上
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS
                    | WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
            //View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR|
            window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);

            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.TRANSPARENT);
            window.setNavigationBarColor(Color.BLACK);

        }

    }
}
