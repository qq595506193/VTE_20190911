package com.example.tidus.ristrat.utils;

import android.content.Context;

import com.example.tidus.ristrat.interceptor.AddCookiesInterceptor;
import com.example.tidus.ristrat.interceptor.ReceivedCookiesInterceptor;
import com.google.gson.Gson;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

/**
 * 网络请求工具类
 */
public class RetrofitManager {
    //public static final String BASE_URL = "http://192.168.1.222:9090/XiaoYiRobotSer/";
    public static final String BASE_URL = "http://220.194.46.204/XiaoYiRobotSer/";
    private Retrofit mRetrofit;
    private static Context context1;

    public static String cookie = null;

    private static class SingleHolder {
        private static final RetrofitManager _INSTANT = new RetrofitManager(BASE_URL);
    }

    public static RetrofitManager getDefault(Context context) {
        context1 = context;
        return SingleHolder._INSTANT;
    }

    private RetrofitManager(String baseUrl) {
        mRetrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(new NullOnEmptyConverterFactory())
                .addConverterFactory(LenientGsonConverterFactory.create(new Gson()))
                .client(buildOkhttpClinet())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }

    /**
     * 让ok支持https
     *
     * @return
     */
    private OkHttpClient buildOkhttpClinet() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder()
                .readTimeout(5, TimeUnit.SECONDS)
                .writeTimeout(5000, TimeUnit.MILLISECONDS)
                .addInterceptor(new ReceivedCookiesInterceptor())//保存cookie
                .addInterceptor(new AddCookiesInterceptor());//添加cookie到接口中
//                .addInterceptor(new Interceptor() {
//                    @Override
//                    public Response intercept(Chain chain) throws IOException {
//                        Request request = chain.request();
//                        Request.Builder builder = request.newBuilder();
//                        if(cookie!=null) {
//                            builder.addHeader("Cookie", cookie);
//                            if (Build.VERSION.SDK != null && Build.VERSION.SDK_INT > 13) {
//                                builder.addHeader("Connection", "close");
//                            }
//                        }
//                        else{
//                            Log.e("Cookie","Cookie not found");
//                        }
//
//                        return chain.proceed(builder.build());
//
//                    }
//                });
        return builder.build();
    }

    public <T> T create(Class<T> Clazz) {
        return mRetrofit.create(Clazz);
    }

}
