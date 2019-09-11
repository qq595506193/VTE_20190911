package com.example.tidus.ristrat.mvp.presenter;

import com.example.tidus.ristrat.base.BasePresenter;
import com.example.tidus.ristrat.bean.Assessment;
import com.example.tidus.ristrat.bean.Patient;
import com.example.tidus.ristrat.bean.RiskBean;
import com.example.tidus.ristrat.mvp.model.Model;
import com.example.tidus.ristrat.mvp.view.iview.IRiskView;
import com.example.tidus.ristrat.mvp.view.iview.IRuestionnaireView;

import java.util.Map;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class RiskPresenter extends BasePresenter<IRiskView> {
    Model model;

    @Override
    public void initModel() {
        model = new Model();
    }

    public void getRiskBean(Map<String, String> params) {
        model.model(v.context()).getRiskBean(params)
             .subscribeOn(Schedulers.io())
             .observeOn(AndroidSchedulers.mainThread())
             .subscribe(new Consumer<RiskBean>() {
                            @Override
                            public void accept(RiskBean riskBean) throws Exception {
                                if (riskBean != null && "0".equals(riskBean.getCode())) {
                                    if (v != null) {
                                        v.success(riskBean);
                                    }
                                    return;
                                }
                                if (v != null) {
                                    v.success(riskBean);
                                }
                            }
                        },
                        new Consumer<Throwable>() {
                            @Override
                            public void accept(Throwable throwable) throws Exception {
                                if (v != null) {
                                    v.faild(throwable);
                                }
                            }
                        });
    }


}
