package com.example.tidus.ristrat.contract;

import com.example.tidus.ristrat.callback.IRequestCallback;

import java.util.HashMap;

public interface ICancelAssessContract {
    abstract class CancelAssessPresenter {
        public abstract void getCancelAssess(HashMap<String, Object> params);
    }

    interface ICancelAssessModel {
        void getCancelAssess(HashMap<String, Object> params, IRequestCallback iRequestCallback);
    }

    interface ICancelAssessView {
        void onCancelAssessSuccess(Object result);

        void onFailed(Object error);
    }
}
