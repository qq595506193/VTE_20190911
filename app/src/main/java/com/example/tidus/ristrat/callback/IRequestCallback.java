package com.example.tidus.ristrat.callback;

import java.text.ParseException;

public interface IRequestCallback {
    void onSuccess(Object result) throws ParseException;

    void onFailed(Object error);
}
