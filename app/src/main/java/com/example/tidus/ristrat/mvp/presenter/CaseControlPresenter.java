package com.example.tidus.ristrat.mvp.presenter;

import com.example.tidus.ristrat.callback.IRequestCallback;
import com.example.tidus.ristrat.contract.ICaseControlContract;
import com.example.tidus.ristrat.mvp.model.CaseControlModel;

import java.util.HashMap;

public class CaseControlPresenter extends ICaseControlContract.CaseControlPresenter {

    public CaseControlPresenter(ICaseControlContract.ICaseControlView view) {
        model = new CaseControlModel();
        this.view = view;
    }

    @Override
    public void getCaseControl(HashMap<String, Object> params) {

        if (view != null) {
            view.showProgressDialog();
        }

        model.getCaseControl(params, new IRequestCallback() {
            @Override
            public void onSuccess(Object result) {
                if (view != null) {
                    view.onCaseControlSuccess(result);
                    view.hideProgressDialog();
                }
            }

            @Override
            public void onFailed(Object error) {
                if (view != null) {
                    view.onFailed(error);
                }
            }
        });
    }

    @Override
    public void getQueryHM(HashMap<String, Object> params) {
        model.getQueryHM(params, new IRequestCallback() {
            @Override
            public void onSuccess(Object result) {
                if (view != null) {
                    view.onQueryHMSuccess(result);
                }
            }

            @Override
            public void onFailed(Object error) {
                if (view != null) {
                    view.onFailed(error);
                }
            }
        });
    }
}
