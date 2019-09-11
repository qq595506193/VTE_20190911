package com.example.tidus.ristrat.callback;

public interface IOkHttpCallback {
    void onSuccess(Object result);

    void onFailed(Object error);
}
