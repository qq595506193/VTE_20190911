package com.example.tidus.ristrat.contract;

import com.example.tidus.ristrat.callback.IRequestCallback;

import java.util.HashMap;

public interface ICheckRiskContract {
    abstract class CheckRiskPresenter {
        public abstract void getCheckRisk(HashMap<String, Object> params);
    }

    interface ICheckRiskModel {
        void getCheckRisk(HashMap<String, Object> params, IRequestCallback iRequestCallback);
    }

    interface ICheckRiskView {
        void onCheckRiskSuccess(Object result);

        void onCheckRiskFailed(Object error);

        void showProgressDialog();

        void hideProgressDialog();
    }
}
