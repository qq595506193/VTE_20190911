package com.example.tidus.ristrat.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.tidus.ristrat.R;
import com.example.tidus.ristrat.bean.CancelAssessBean;
import com.example.tidus.ristrat.bean.QueryHMBean;
import com.example.tidus.ristrat.contract.ICancelAssessContract;
import com.example.tidus.ristrat.mvp.presenter.CancelAssessPresenter;
import com.example.tidus.ristrat.utils.ToastUtils;

import java.util.HashMap;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CancelQuestionActivity extends AppCompatActivity implements ICancelAssessContract.ICancelAssessView {
    @BindView(R.id.iv_close)
    ImageView iv_close;
    @BindView(R.id.help_feedback)
    EditText help_feedback;
    @BindView(R.id.btn_sure)
    Button btn_sure;
    private CancelAssessPresenter cancelAssessPresenter;
    private String trim;
    private QueryHMBean.ServerParamsBean.LISTBean listBean;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cancel_assess);
        initView();
        initData();
        initListener();
    }

    private void initData() {
        btn_sure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                trim = help_feedback.getText().toString().trim();// 取消评估原因
                if (trim.equals("")) {
                    ToastUtils.show("请输入取消原因");
                    return;
                }
                HashMap<String, Object> params = new HashMap<>();
                params.put("Type", "saveHM_Patient_Assess_Cancel");
                params.put("VISIT_SQ_NO", listBean.getVISIT_SQ_NO());// 流水号
                params.put("REMINDE_ID", listBean.getREMINDE_ID());// 提醒ID
                params.put("PATIENT", listBean.getPATIENT_ID());// 患者ID
                params.put("CANCEL_RESON", trim);// 取消原因
                params.put("OPERATE_RESULT", listBean.getOPERATE_RESULT());// 当前状态
                cancelAssessPresenter.getCancelAssess(params);


            }
        });
    }

    private void initListener() {


    }


    private void initView() {
        ButterKnife.bind(this);
        listBean = (QueryHMBean.ServerParamsBean.LISTBean) getIntent().getSerializableExtra("listBean");
        cancelAssessPresenter = new CancelAssessPresenter(this);
        iv_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        help_feedback.setHintTextColor(Color.GRAY);
    }


    @Override
    public void onCancelAssessSuccess(Object result) {
        if (result != null) {
            if (result instanceof CancelAssessBean) {
                if (((CancelAssessBean) result).getCode().equals("0")) {
                    ToastUtils.show("取消成功");
                    finish();
                } else {
                    ToastUtils.show("取消失败");
                }
            }
        }
    }

    @Override
    public void onFailed(Object error) {

    }
}
