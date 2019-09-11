package com.example.tidus.ristrat.mvp.model;

import android.annotation.SuppressLint;

import com.example.lib_network.api.ApiService;
import com.example.tidus.ristrat.bean.MessageBean;
import com.example.tidus.ristrat.bean.MessageUpdateBean;
import com.example.tidus.ristrat.callback.IRequestCallback;
import com.example.tidus.ristrat.callback.IRetrofitServer;
import com.example.tidus.ristrat.contract.IMessageContract;
import com.example.tidus.ristrat.utils.RetrofitUtils;

import java.util.HashMap;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class MessageModel implements IMessageContract.IMessageModel {
    @SuppressLint("CheckResult")
    @Override
    public void getMessage(HashMap<String, Object> params, final IRequestCallback iRequestCallback) {
        RetrofitUtils.getInstance().createService(IRetrofitServer.class)
                .doMessageListGet(ApiService.MESSAGE_LIST, params)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<MessageBean>() {
                    @Override
                    public void accept(MessageBean messageBean) throws Exception {
                        if (iRequestCallback != null) {
                            iRequestCallback.onSuccess(messageBean);
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

    @SuppressLint("CheckResult")
    @Override
    public void getUpdateMessageType(HashMap<String, Object> params, final IRequestCallback iRequestCallback) {
        RetrofitUtils.getInstance().createService(IRetrofitServer.class)
                .doMessageTypeUpdateGet(ApiService.MESSAGE_TYPE, params)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<MessageUpdateBean>() {
                    @Override
                    public void accept(MessageUpdateBean messageUpdateBean) throws Exception {
                        if (iRequestCallback != null) {
                            iRequestCallback.onSuccess(messageUpdateBean);
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
