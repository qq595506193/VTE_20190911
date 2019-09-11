package com.example.tidus.ristrat.mvp.model;

import android.annotation.SuppressLint;

import com.example.lib_network.api.ApiService;
import com.example.tidus.ristrat.bean.CommitBean;
import com.example.tidus.ristrat.bean.RiskAssessmentBean;
import com.example.tidus.ristrat.bean.SaveCommitBean;
import com.example.tidus.ristrat.callback.IRequestCallback;
import com.example.tidus.ristrat.callback.IRetrofitServer;
import com.example.tidus.ristrat.contract.IRiskAssessmentContart;
import com.example.tidus.ristrat.utils.RetrofitUtils;

import java.util.HashMap;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class RiskAssessmentModel implements IRiskAssessmentContart.IRiskAssessmentModel {
    @SuppressLint("CheckResult")
    @Override
    public void getRiskAssessment(HashMap<String, Object> params, final IRequestCallback iRequestCallback) {
        RetrofitUtils.getInstance().createService(IRetrofitServer.class)
                .doRiskTableListGet(ApiService.RISK_TABLE_LIST, params)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<RiskAssessmentBean>() {
                    @Override
                    public void accept(RiskAssessmentBean riskAssessmentBean) throws Exception {
                        if (iRequestCallback != null) {
                            iRequestCallback.onSuccess(riskAssessmentBean);
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

    /**
     * 提交
     *
     * @param params
     * @param iRequestCallback
     */
    @SuppressLint("CheckResult")
    @Override
    public void getCommit(HashMap<String, Object> params, final IRequestCallback iRequestCallback) {
        RetrofitUtils.getInstance().createService(IRetrofitServer.class)
                .doCommitGet(ApiService.COMMIT, params)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<CommitBean>() {
                    @Override
                    public void accept(CommitBean commitBean) throws Exception {
                        if (iRequestCallback != null) {
                            iRequestCallback.onSuccess(commitBean);
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

    /**
     * 保存
     *
     * @param params
     * @param iRequestCallback
     */
    @SuppressLint("CheckResult")
    @Override
    public void getSave(HashMap<String, Object> params, final IRequestCallback iRequestCallback) {
        RetrofitUtils.getInstance().createService(IRetrofitServer.class)
                .doSaveGet(ApiService.SAVE, params)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<SaveCommitBean>() {
                    @Override
                    public void accept(SaveCommitBean saveCommitBean) throws Exception {
                        if (iRequestCallback != null) {
                            iRequestCallback.onSuccess(saveCommitBean);
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
