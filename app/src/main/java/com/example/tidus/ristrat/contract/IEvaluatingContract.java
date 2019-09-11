package com.example.tidus.ristrat.contract;

import com.example.tidus.ristrat.callback.IRequestCallback;

import java.util.HashMap;

public interface IEvaluatingContract {
    abstract class EvaluatingPresenter {
        public abstract void getEvaluating(HashMap<String, Object> params);
    }

    interface IEvaluatingModel {
        void getEvaluating(HashMap<String, Object> params, IRequestCallback iRequestCallback);
    }

    interface IEvaluatingView {
        void onEvaluatingSuccess(Object result);

        void onFailed(Object error);
    }
}
