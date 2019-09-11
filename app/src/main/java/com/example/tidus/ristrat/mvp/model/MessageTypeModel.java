package com.example.tidus.ristrat.mvp.model;

import android.annotation.SuppressLint;

import com.example.lib_network.api.ApiService;
import com.example.tidus.ristrat.callback.IRequestCallback;
import com.example.tidus.ristrat.callback.IRetrofitServer;
import com.example.tidus.ristrat.contract.IMessageTypeContract;
import com.example.tidus.ristrat.utils.RetrofitUtils;

import java.util.HashMap;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import okhttp3.ResponseBody;

public class MessageTypeModel implements IMessageTypeContract.IMessageTypeModel {
    @SuppressLint("CheckResult")
    @Override
    public void getMessageType(HashMap<String, Object> params, final IRequestCallback iRequestCallback) {
        RetrofitUtils.getInstance().createService(IRetrofitServer.class)
                .doMessageNumGet(ApiService.MESSAGE_NUM, params)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<ResponseBody>() {
                    @Override
                    public void accept(ResponseBody responseBody) throws Exception {
                        if (iRequestCallback != null) {
                            iRequestCallback.onSuccess(responseBody);
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
