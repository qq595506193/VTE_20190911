package com.example.tidus.ristrat.mvp.model;

import android.annotation.SuppressLint;

import com.example.lib_network.api.ApiService;
import com.example.tidus.ristrat.bean.EvaluatingBean;
import com.example.tidus.ristrat.callback.IRequestCallback;
import com.example.tidus.ristrat.callback.IRetrofitServer;
import com.example.tidus.ristrat.contract.IEvaluatingContract;
import com.example.tidus.ristrat.utils.RetrofitUtils;

import java.util.HashMap;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class EvaluatingModel implements IEvaluatingContract.IEvaluatingModel {
    @SuppressLint("CheckResult")
    @Override
    public void getEvaluating(HashMap<String, Object> params, final IRequestCallback iRequestCallback) {
        RetrofitUtils.getInstance().createService(IRetrofitServer.class)
                .doEvaluatingGet(ApiService.EVALUATING, params)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<EvaluatingBean>() {
                    @Override
                    public void accept(EvaluatingBean evaluatingBean) throws Exception {
                        if (iRequestCallback != null) {
                            iRequestCallback.onSuccess(evaluatingBean);
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
