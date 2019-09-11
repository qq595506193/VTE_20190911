package com.example.tidus.ristrat.mvp.view.iview;

import com.example.tidus.ristrat.base.IView;
import com.example.tidus.ristrat.bean.Assessment;
import com.example.tidus.ristrat.bean.LoginBean;
import com.example.tidus.ristrat.bean.Patient;

import retrofit2.Response;

public interface IRuestionnaireView extends IView {
    void Success(Patient patient);
    void Faild(Throwable e);
}
