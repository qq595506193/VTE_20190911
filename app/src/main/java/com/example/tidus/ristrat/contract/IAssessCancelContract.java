package com.example.tidus.ristrat.contract;

import com.example.tidus.ristrat.callback.IRequestCallback;

import java.util.HashMap;

public interface IAssessCancelContract {
    abstract class AssessCancelPresenter {
        public abstract void getAssessCancel(HashMap<String, Object> params);
    }

    interface IAssessCancelModel {
        void getAssessCancel(HashMap<String, Object> params, IRequestCallback iRequestCallback);
    }

    interface IAssessCanceTixinglView {
        void onAssessCancelSuccess(Object result);

        void onAssessCancelFailed(Object error);
    }
}
