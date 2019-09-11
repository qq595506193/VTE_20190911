package com.example.tidus.ristrat.mvp.presenter;

import com.example.tidus.ristrat.base.BasePresenter;
import com.example.tidus.ristrat.bean.Infrom;
import com.example.tidus.ristrat.bean.PlanBean;
import com.example.tidus.ristrat.mvp.model.Model;
import com.example.tidus.ristrat.mvp.view.iview.IMainView;
import com.example.tidus.ristrat.mvp.view.iview.IinfromView;

import java.util.Map;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class MainPresenter extends BasePresenter<IMainView> {
    Model model;

    @Override
    public void initModel() {
        model = new Model();
    }

    public void getInfrom(Map<String, String> params) {
        model.model(v.context()).getPlanBean(params)
             .subscribeOn(Schedulers.io())
             .observeOn(AndroidSchedulers.mainThread())
             .subscribe(new Consumer<PlanBean>() {
                 @Override
                 public void accept(PlanBean planBean) throws Exception {
                     if(planBean!=null&&"0".equals(planBean.getCode())){
                         if (v != null) {
                             v.Success(planBean);
                         }
                         return;
                     }
                     if (v != null) {
                         v.Success(planBean);
                     }
                 }
             }, new Consumer<Throwable>() {
                 @Override
                 public void accept(Throwable throwable) throws Exception {
                     if (v != null) {
                         v.Faild(throwable);
                     }
                 }
             });
    }


    }
