package com.example.tidus.ristrat.interceptor;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

import com.example.tidus.ristrat.application.App;
import com.example.tidus.ristrat.utils.SpUtil;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class MyInterceptor implements Interceptor {
    private static final String COOKIE_PREF = "cookies_prefs";


    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        Request.Builder builder = request.newBuilder();
        builder.addHeader("USER_ID", SpUtil.getString(App.getContext(), "USER_ID", ""));
        String cookie = getCookie(request.url().toString(), request.url().host());
//        builder.addHeader("USER_ID", SpUtil.getString(App.getContext(), "USER_ID", ""));
//        builder.addHeader("SITE_ID", SpUtil.getString(App.getContext(), "SITE_ID", ""));
        Request build = builder.build();
        Response response = chain.proceed(build);
        return response;
    }
    private String getCookie(String url, String domain) {
        SharedPreferences sp = App.getContext().getSharedPreferences(COOKIE_PREF, Context.MODE_PRIVATE);
        if (!TextUtils.isEmpty(url) && sp.contains(url) && !TextUtils.isEmpty(sp.getString(url, ""))) {
            return sp.getString(url, "");
        }
        if (!TextUtils.isEmpty(domain) && sp.contains(domain) && !TextUtils.isEmpty(sp.getString(domain, ""))) {
            return sp.getString(domain, "");
        }

        return null;
    }
}
