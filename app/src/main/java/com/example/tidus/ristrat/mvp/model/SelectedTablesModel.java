package com.example.tidus.ristrat.mvp.model;

import android.annotation.SuppressLint;

import com.example.lib_network.api.ApiService;
import com.example.tidus.ristrat.bean.SelectedTablesBean;
import com.example.tidus.ristrat.callback.IRequestCallback;
import com.example.tidus.ristrat.callback.IRetrofitServer;
import com.example.tidus.ristrat.contract.ISelectedTablesContract;
import com.example.tidus.ristrat.utils.RetrofitUtils;

import java.util.HashMap;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by TriumphalSun
 * on 2019/7/15 0015
 */
public class SelectedTablesModel implements ISelectedTablesContract.ISelectedTablesModel {
    @SuppressLint("CheckResult")
    @Override
    public void getSelectedTables(HashMap<String, Object> params, final IRequestCallback iRequestCallback) {
        RetrofitUtils.getInstance().createService(IRetrofitServer.class)
                .doSelectedTablesGet(ApiService.SELECT_TABLES, params)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<SelectedTablesBean>() {
                    @Override
                    public void accept(SelectedTablesBean selectedTablesBean) throws Exception {
                        if (iRequestCallback != null) {
                            iRequestCallback.onSuccess(selectedTablesBean);
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
