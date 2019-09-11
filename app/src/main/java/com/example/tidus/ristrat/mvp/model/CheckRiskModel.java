package com.example.tidus.ristrat.mvp.model;

import android.annotation.SuppressLint;

import com.example.lib_network.api.ApiService;
import com.example.tidus.ristrat.bean.CheckRiskBean;
import com.example.tidus.ristrat.callback.IRequestCallback;
import com.example.tidus.ristrat.callback.IRetrofitServer;
import com.example.tidus.ristrat.contract.ICheckRiskContract;
import com.example.tidus.ristrat.utils.RetrofitUtils;

import java.util.HashMap;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class CheckRiskModel implements ICheckRiskContract.ICheckRiskModel {
    @SuppressLint("CheckResult")
    @Override
    public void getCheckRisk(HashMap<String, Object> params, final IRequestCallback iRequestCallback) {
        RetrofitUtils.getInstance().createService(IRetrofitServer.class)
                .doCheckRiskGet(ApiService.CHECK_RISK, params)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<CheckRiskBean>() {
                    @Override
                    public void accept(CheckRiskBean checkRiskBean) throws Exception {
                        if (iRequestCallback != null) {
                            iRequestCallback.onSuccess(checkRiskBean);
                        }
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        if (iRequestCallback != null) {
                            iRequestCallback.onFailed(throwable);
                        }
                    }
                });
    }
}
