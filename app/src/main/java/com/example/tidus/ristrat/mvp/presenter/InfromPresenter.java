package com.example.tidus.ristrat.mvp.presenter;

import com.example.tidus.ristrat.base.BasePresenter;
import com.example.tidus.ristrat.bean.Assessment;
import com.example.tidus.ristrat.bean.Infrom;
import com.example.tidus.ristrat.bean.Patient;
import com.example.tidus.ristrat.mvp.model.Model;
import com.example.tidus.ristrat.mvp.view.iview.IRuestionnaireView;
import com.example.tidus.ristrat.mvp.view.iview.IinfromView;

import java.util.Map;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class InfromPresenter extends BasePresenter<IinfromView> {
    Model model;

    @Override
    public void initModel() {
        model = new Model();
    }

    public void getInfrom(Map<String, String> params) {
        model.model(v.context()).getInfrom(params)
             .subscribeOn(Schedulers.io())
             .observeOn(AndroidSchedulers.mainThread())
             .subscribe(new Consumer<Infrom>() {
                 @Override
                 public void accept(Infrom infrom) throws Exception {
                     if(infrom!=null&&"0".equals(infrom.getCode())){
                         if (v != null) {
                             v.Success(infrom);
                         }
                         return;
                     }
                     if (v != null) {
                         v.Success(infrom);
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
