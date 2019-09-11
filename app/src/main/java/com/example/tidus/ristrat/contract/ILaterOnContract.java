package com.example.tidus.ristrat.contract;

import com.example.tidus.ristrat.callback.IRequestCallback;

import java.util.HashMap;

/**
 * Created by TriumphalSun
 * on 2019/7/16 0016
 */
public interface ILaterOnContract {
    abstract class LaterOnPresenter {
        public abstract void getLaterOn(HashMap<String, Object> params);
    }

    interface ILaterOnModel {
        void getLaterOn(HashMap<String, Object> params, IRequestCallback iRequestCallback);
    }

    interface ILaterOnView {
        void onLaterOnSuccess(Object result);

        void onLaterOnFailed(Object error);
    }
}
