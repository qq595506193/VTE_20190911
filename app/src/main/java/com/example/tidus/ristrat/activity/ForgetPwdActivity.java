package com.example.tidus.ristrat.activity;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tidus.ristrat.R;
import com.example.tidus.ristrat.base.BaseActivity;
import com.example.tidus.ristrat.base.BasePresenter;

import butterknife.BindView;
import butterknife.OnClick;

public class ForgetPwdActivity extends BaseActivity {

    @BindView(R.id.ed_photo) EditText edPhoto;
    @BindView(R.id.ed_code) EditText edCode;
    @BindView(R.id.btn_send_code) Button btnSendCode;
    @BindView(R.id.btn_sure) Button btnSure;
    @BindView(R.id.title_back) ImageView titleBack;
    @BindView(R.id.title_left_lable) TextView titleLeftLable;
    @BindView(R.id.title_lable) TextView titleLable;

    @Override
    protected void initData() {
        final String leftable = getIntent().getStringExtra("leftable");
        titleLeftLable.setVisibility(View.GONE);
        titleBack.setVisibility(View.GONE);
        titleLable.setText(leftable);

    }

    @Override
    protected BasePresenter getProduct() {
        return null;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_forget_pwd;
    }

    @OnClick({R.id.title_back, R.id.title_left_lable,R.id.btn_sure,R.id.btn_send_code})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.title_back:
                finish();
                break;
            case R.id.title_left_lable:
                finish();
                break;
            case R.id.btn_sure:
                break;
            case R.id.btn_send_code:
                break;
        }
    }

    @Override
    public Context context() {
        return this;
    }
}
