package com.example.tidus.ristrat.application;

import android.app.Application;
import android.content.Context;
import android.os.StrictMode;

import com.squareup.leakcanary.LeakCanary;

public class App extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder()
                .detectDiskReads()
                .detectDiskWrites()
                .detectNetwork() // 这里可以替换为detectAll() 就包括了磁盘读写和网络I/O
                .penaltyLog() //打印logcat，当然也可以定位到dropbox，通过文件保存相应的log
                .build());
        StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder()
                .detectLeakedSqlLiteObjects() //探测SQLite数据库操作
                .penaltyLog() //打印logcat
                .penaltyDeath()
                .build());
        super.onCreate();
        context = getApplicationContext();
        initLeakCanary();

    }

    /**
     * 获取全局上下文
     */
    public static Context getContext() {
        return context;
    }

    /**
     * Explain : 初始化内存泄漏检测
     *
     * @author LiXaing
     */
    private void initLeakCanary() {
        if (LeakCanary.isInAnalyzerProcess(this)) {
            return;
        }
        LeakCanary.install(this);
    }
}
