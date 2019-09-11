package com.example.tidus.ristrat.activity;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.provider.MediaStore;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tidus.ristrat.R;
import com.example.tidus.ristrat.application.App;
import com.example.tidus.ristrat.base.BaseActivity;
import com.example.tidus.ristrat.bean.LoginBean;
import com.example.tidus.ristrat.mvp.presenter.LoginPresenter;
import com.example.tidus.ristrat.mvp.view.iview.ILoginView;
import com.example.tidus.ristrat.utils.LogUtils;
import com.example.tidus.ristrat.utils.NetUtils;
import com.example.tidus.ristrat.utils.NoFastClickUtils;
import com.example.tidus.ristrat.utils.RetrofitManager;
import com.example.tidus.ristrat.utils.ToastUtils;

import java.net.ConnectException;
import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import io.reactivex.annotations.NonNull;
import retrofit2.Response;

public class UserLoginActivity extends BaseActivity<LoginPresenter> implements ILoginView {


    @BindView(R.id.ed_username)
    EditText edUsername;
    @BindView(R.id.ed_password)
    EditText edPassword;
    @BindView(R.id.btn_login)
    Button btnLogin;
    @BindView(R.id.txt_forget_pwd)
    TextView txtForgetPwd;
    @BindView(R.id.title_lable)
    TextView titleLable;
    @BindView(R.id.title_back)
    ImageView titleBack;
    @BindView(R.id.title_left_lable)
    TextView titleLeftLable;
    private String leftLable = "AI疾病（风险）管理系统";

    @Override
    protected void initData() {
        titleLable.setText(leftLable);

    }

    @Override
    protected LoginPresenter getProduct() {
        return new LoginPresenter();
    }




    @Override
    protected void initView() {



        titleBack.setVisibility(View.GONE);
        titleLeftLable.setVisibility(View.GONE);
        NetUtils.getNetWorkStart(this);
        initClick();

    }

    private void initClick() {
        if (NoFastClickUtils.isFastClick()) {
            ToastUtils.show("您点击的太快了");
        } else {
            btnLogin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    login();
                }
            });
            txtForgetPwd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(App.getContext(), ForgetPwdActivity.class);
                    intent.putExtra("leftable", leftLable);
                    startActivity(intent);
                }
            });
        }

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_user_login;
    }

    @Override
    public Context context() {
        return this;
    }


    private void login() {
        Map<String, String> params = new HashMap<>();
        String userName = edUsername.getText().toString().trim();
        String passWord = edPassword.getText().toString().trim();
        if (TextUtils.isEmpty(userName)) {
            Toast.makeText(this, "请输入账号", Toast.LENGTH_SHORT).show();
            return;
        }
        if (TextUtils.isEmpty(passWord)) {
            Toast.makeText(this, "请输入密码", Toast.LENGTH_SHORT).show();
            return;
        }
        params.put("Type", "login");
        params.put("ACCOUNT", userName);
        params.put("PASS_WORD", passWord);
        params.put("SITE_ID", "1400");
        params.put("MERCHANT_ID", "1400");
        //params.put("", "1554710308852");
        presenter.login(params);
    }


    @Override
    public void Success(Response<LoginBean> loginBean) {
        if (RetrofitManager.cookie == null) {
            RetrofitManager.cookie = loginBean.headers().get("set-cookie");
        }
        LogUtils.e("cookie: " + RetrofitManager.cookie);
        if (loginBean.body().getCode().equals("0") && loginBean != null) {
            Toast.makeText(this, "" + loginBean.body().getMessage(), Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, CaseControlActivity.class);
            intent.putExtra("leftable", leftLable);
            intent.putExtra("loginBean", loginBean.body());
            startActivity(intent);
        } else {
            Toast.makeText(this, "" + loginBean.body().getMessage(), Toast.LENGTH_SHORT).show();

        }

    }

    @Override
    protected void onResume() {
        super.onResume();
//        final SharedPreferences sp = getSharedPreferences("config", MODE_PRIVATE);
//        SharedPreferences sp1 = getSharedPreferences("config",
//                Context.MODE_PRIVATE);
//        sp1.getStringSet("cookie", null);
//        sp1.edit().clear().apply();
//        sp.edit().clear().apply();
    }

    @Override
    public void Faild(Throwable e) {
        Log.e("login", "Faild: " + e.getMessage());
        if (e == null || e.getCause() instanceof IllegalStateException) {
            Toast.makeText(this, "账号或密码错误", Toast.LENGTH_SHORT).show();
            return;
        } else if (e == null || e.getCause() instanceof ConnectException) {
            Toast.makeText(this, "请查看网络", Toast.LENGTH_SHORT).show();
            return;
        }

    }


}
