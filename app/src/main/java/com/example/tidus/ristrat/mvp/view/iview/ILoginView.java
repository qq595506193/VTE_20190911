package com.example.tidus.ristrat.mvp.view.iview;

import com.example.tidus.ristrat.base.IView;
import com.example.tidus.ristrat.bean.LoginBean;

import okhttp3.Response;

public interface ILoginView extends IView {
    void Success(retrofit2.Response<LoginBean> loginBean);

    void Faild(Throwable e);
}
