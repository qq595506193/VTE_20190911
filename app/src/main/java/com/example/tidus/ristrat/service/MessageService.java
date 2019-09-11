package com.example.tidus.ristrat.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import io.reactivex.annotations.Nullable;

public class MessageService extends Service {
    private final String TAG = "MessageService";

    //必须实现的方法
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.e(TAG, "onBind方法被调用");
        return null;
    }

    //Service被创建时调用
    @Override
    public void onCreate() {
        Log.e(TAG, "onCreate方法被调用");
        super.onCreate();
    }

    //Service被启动时调用
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.e(TAG, "onStartCommand方法被调用");
        return super.onStartCommand(intent, flags, startId);
    }

    //Service被销毁时调用
    @Override
    public void onDestroy() {
        Log.e(TAG, "onDestroy方法被调用");
        super.onDestroy();
    }

}
