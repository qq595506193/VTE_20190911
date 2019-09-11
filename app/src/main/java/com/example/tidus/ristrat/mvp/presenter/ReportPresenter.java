package com.example.tidus.ristrat.mvp.presenter;

import android.annotation.SuppressLint;

import com.example.tidus.ristrat.base.BasePresenter;
import com.example.tidus.ristrat.bean.CommitBean;
import com.example.tidus.ristrat.bean.ReportBean;
import com.example.tidus.ristrat.mvp.model.Model;
import com.example.tidus.ristrat.mvp.view.iview.IReportView;

import java.util.Map;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class ReportPresenter extends BasePresenter<IReportView> {
    Model model;

    @Override
    public void initModel() {
        model = new Model();
    }

    @SuppressLint("CheckResult")
    public void getReport(Map<String, String> params) {
        model.model(v.context()).getReport(params)
             .subscribeOn(Schedulers.io())
             .observeOn(AndroidSchedulers.mainThread())
             .subscribe(
                     new Consumer<ReportBean>() {
                         @Override
                         public void accept(ReportBean reportBean) throws Exception {
                             if (reportBean != null && "0".equals(reportBean.getCode())) {
                                 if (v != null) {
                                     v.success(reportBean);
                                 }
                                 return;
                             }
                             if (v != null) {
                                 v.success(reportBean);
                             }
                         }
                     }, new Consumer<Throwable>() {
                         @Override
                         public void accept(Throwable throwable) throws Exception {
                             if (v != null) {
                                 v.faild(throwable);
                             }
                         }
                     });



    }
    public void getCommit(Map<String, String> params) {
        model.model(v.context()).getCommit(params)
             .subscribeOn(Schedulers.io())
             .observeOn(AndroidSchedulers.mainThread())
             .subscribe(new Consumer<CommitBean>() {
                         @Override
                         public void accept(CommitBean commit) throws Exception {
                             if (commit != null && "0".equals(commit.getCode())) {
                                 if (v != null) {
                                     v.succ(commit);
                                 }
                                 return;
                             }
                             if (v != null) {
                                 v.succ(commit);
                             }
                         }
                     }, new Consumer<Throwable>() {
                         @Override
                         public void accept(Throwable throwable) throws Exception {
                             if (v != null) {
                                 v.faild(throwable);
                             }
                         }
                     });



    }
}
