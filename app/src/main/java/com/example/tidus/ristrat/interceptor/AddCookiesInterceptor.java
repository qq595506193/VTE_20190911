package com.example.tidus.ristrat.interceptor;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;

import com.example.tidus.ristrat.application.App;
import com.example.tidus.ristrat.utils.LogUtils;

import java.io.IOException;
import java.util.HashSet;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class AddCookiesInterceptor implements Interceptor {
    @NonNull
    @Override
    public Response intercept(@NonNull Chain chain) throws IOException {
        Request.Builder builder = chain.request().newBuilder();
        HashSet preferences = (HashSet) App.getContext().getSharedPreferences("config",
                Context.MODE_PRIVATE).getStringSet("cookie", null);
        if (preferences != null) {
            for (Object cookie : preferences) {
                builder.addHeader("Cookie", (String) cookie);
                //LogUtils.e("cookie===="+cookie); // This is done so I know which headers are being added; this interceptor is used after the normal logging of OkHttp
            }
        }
        return chain.proceed(builder.build());
    }
}
