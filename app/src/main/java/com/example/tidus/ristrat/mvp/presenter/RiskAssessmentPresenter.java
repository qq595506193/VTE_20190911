package com.example.tidus.ristrat.mvp.presenter;

import com.example.tidus.ristrat.callback.IRequestCallback;
import com.example.tidus.ristrat.contract.IRiskAssessmentContart;

import java.text.ParseException;
import java.util.HashMap;

public class RiskAssessmentPresenter extends IRiskAssessmentContart.RiskAssessmentPresenter {

    @Override
    public void getRiskAssessment(HashMap<String, Object> params) {
        if (view != null) {
            view.showProgressDialog();
        }
        model.getRiskAssessment(params, new IRequestCallback() {
            @Override
            public void onSuccess(Object result) {
                if (view != null) {
                    view.onRiskAssessmentSuccess(result);
                    view.hideProgressDialog();
                }
            }

            @Override
            public void onFailed(Object error) {
                if (view != null) {
                    view.failure(error + "");
                    view.hideProgressDialog();
                }
            }
        });
    }

    @Override
    public void getCommit(HashMap<String, Object> params) {
        if (view != null) {
            view.showProgressDialog();
        }
        model.getCommit(params, new IRequestCallback() {
            @Override
            public void onSuccess(Object result) {
                if (view != null) {
                    view.onCommitSuccess(result);
                    view.hideProgressDialog();
                }
            }

            @Override
            public void onFailed(Object error) {
                if (view != null) {
                    view.failure(error + "");
                }
            }
        });
    }

    @Override
    public void getSave(HashMap<String, Object> params) {
        if (view != null) {
            view.showProgressDialog();
        }
        model.getSave(params, new IRequestCallback() {
            @Override
            public void onSuccess(Object result) throws ParseException {
                if (view != null) {
                    view.onSaveSuccess(result);
                    view.hideProgressDialog();
                }
            }

            @Override
            public void onFailed(Object error) {
                if (view != null) {
                    view.failure(error + "");
                    view.hideProgressDialog();
                }
            }
        });
    }
}
