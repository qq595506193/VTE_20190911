package com.example.tidus.ristrat.mvp.model;

import android.content.Context;

import com.example.tidus.ristrat.api.RetrofitApi;
import com.example.tidus.ristrat.utils.RetrofitManager;

public class Model {
    public RetrofitApi model(Context context){
        return RetrofitManager.getDefault(context).create(RetrofitApi.class);
    }
}
