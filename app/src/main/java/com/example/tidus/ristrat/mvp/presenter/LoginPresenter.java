package com.example.tidus.ristrat.mvp.presenter;


import com.example.tidus.ristrat.base.BasePresenter;
import com.example.tidus.ristrat.bean.LoginBean;
import com.example.tidus.ristrat.mvp.model.Model;
import com.example.tidus.ristrat.mvp.view.iview.ILoginView;
import com.example.tidus.ristrat.utils.LogUtils;
import com.example.tidus.ristrat.utils.RetrofitManager;

import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginPresenter extends BasePresenter<ILoginView> {
    Model model;

    @Override
    public void initModel() {
        model = new Model();
    }

    public void login(Map<String, String> params) {
        LogUtils.e(RetrofitManager.BASE_URL + params);
        model.model(v.context()).Login(params)
                .enqueue(new Callback<LoginBean>() {
                    @Override
                    public void onResponse(Call<LoginBean> call, Response<LoginBean> response) {
                        v.Success(response);
                    }

                    @Override
                    public void onFailure(Call<LoginBean> call, Throwable t) {
                        v.Faild(t);
                    }
                });
//             .subscribeOn(Schedulers.io())
//             .observeOn(AndroidSchedulers.mainThread())
//             .subscribe(new Consumer<LoginBean>() {
//                 @Override
//                 public void accept(LoginBean loginBean) throws Exception {
//                        if(loginBean!=null&&"0".equals(loginBean.getCode())){
//                            if (v != null) {
//                                v.Success(loginBean);
//                            }
//                            return;
//                        }
//                         v.Success(loginBean);
//                     }
//                 }
//             }, new Consumer<Throwable>() {
//                 @Override
//                 public void accept(Throwable throwable) throws Exception {
//                     if (v != null) {
//                         Log.e("aaaa", "accept: "+throwable.getMessage() );
//                         v.Faild(throwable);
//                     }
//                 }
//             });
    }
}