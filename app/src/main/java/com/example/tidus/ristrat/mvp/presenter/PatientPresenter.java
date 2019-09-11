package com.example.tidus.ristrat.mvp.presenter;

import android.util.Log;
import android.widget.Toast;

import com.example.tidus.ristrat.base.BasePresenter;
import com.example.tidus.ristrat.bean.Assessment;
import com.example.tidus.ristrat.bean.LoginBean;
import com.example.tidus.ristrat.bean.Patient;
import com.example.tidus.ristrat.mvp.model.Model;
import com.example.tidus.ristrat.mvp.view.iview.ILoginView;
import com.example.tidus.ristrat.mvp.view.iview.IRuestionnaireView;

import java.util.Map;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PatientPresenter extends BasePresenter<IRuestionnaireView> {
    Model model;

    @Override
    public void initModel() {
        model = new Model();
    }

    public void getPatient(Map<String, String> params) {
        model.model(v.context()).getPatient(params)
             .subscribeOn(Schedulers.io())
             .observeOn(AndroidSchedulers.mainThread())
             .subscribe(new Consumer<Patient>() {
                 @Override
                 public void accept(Patient patient) throws Exception {
                     if(patient!=null&&"0".equals(patient.getCode())){
                         if (v != null) {
                             v.Success(patient);
                         }
                         return;
                     }
                     if (v != null) {
                         v.Success(patient);
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

//    public void getAssessment(Map<String, String> params) {
//        model.model(v.context()).getAssessment(params)
////             .enqueue(new Callback<Assessment>() {
////                 @Override
////                 public void onResponse(Call<Assessment> call, Response<Assessment> response) {
////                     v.succ(response.body());
////                 }
////
////                 @Override
////                 public void onFailure(Call<Assessment> call, Throwable t) {
////                     v.Faild(t);
////                 }
////             });
//             .subscribeOn(Schedulers.io())
//             .observeOn(AndroidSchedulers.mainThread())
//             .subscribe(new Consumer<Assessment>() {
//                 @Override
//                 public void accept(Assessment assessment) throws Exception {
//                     if(assessment!=null&&"0".equals(assessment.getCode())){
//                         if (v != null) {
//                             v.succ(assessment);
//                         }
//                         return;
//                     }
//                     if (v != null) {
//                         v.succ(assessment);
//                     }
//                 }
//             }, new Consumer<Throwable>() {
//                 @Override
//                 public void accept(Throwable throwable) throws Exception {
//                     if (v != null) {
//                         v.Faild(throwable);
//                     }
//                 }
//             });
//    }
}
