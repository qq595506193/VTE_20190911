package com.example.tidus.ristrat.interceptor;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;

import com.example.tidus.ristrat.application.App;

import java.io.IOException;
import java.util.HashSet;

import okhttp3.Interceptor;
import okhttp3.Response;

public class ReceivedCookiesInterceptor implements Interceptor {

    @NonNull
    @Override
    public Response intercept(@NonNull Chain chain) throws IOException {
        Response originalResponse = chain.proceed(chain.request());

        if (!originalResponse.headers("Set-Cookie").isEmpty()) {

            HashSet<String> cookies = new HashSet<>(originalResponse.headers("Set-Cookie"));

            SharedPreferences.Editor config = App.getContext().getSharedPreferences("config", Context.MODE_PRIVATE)
                    .edit();
            config.putStringSet("cookie", cookies);
            config.apply();
        }

        return originalResponse;
    }
}
