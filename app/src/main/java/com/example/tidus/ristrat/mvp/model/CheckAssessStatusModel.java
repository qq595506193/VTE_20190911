package com.example.tidus.ristrat.mvp.model;

import android.annotation.SuppressLint;

import com.example.lib_network.api.ApiService;
import com.example.tidus.ristrat.bean.MessageStratBean;
import com.example.tidus.ristrat.callback.IRequestCallback;
import com.example.tidus.ristrat.callback.IRetrofitServer;
import com.example.tidus.ristrat.contract.ICheckAssessStatusContract;
import com.example.tidus.ristrat.utils.RetrofitUtils;

import java.util.HashMap;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by TriumphalSun
 * on 2019/7/31 0031
 */
public class CheckAssessStatusModel implements ICheckAssessStatusContract.ICheckAssessStatusModel {
    @SuppressLint("CheckResult")
    @Override
    public void getCheckAssessStatus(HashMap<String, Object> params, final IRequestCallback iRequestCallback) {
        RetrofitUtils.getInstance().createService(IRetrofitServer.class)
                .doMessageStartGet(ApiService.MESSAGE_START, params)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<MessageStratBean>() {
                    @Override
                    public void accept(MessageStratBean messageStratBean) throws Exception {
                        if (iRequestCallback != null) {
                            iRequestCallback.onSuccess(messageStratBean);
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
