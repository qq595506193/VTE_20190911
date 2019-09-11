package com.example.tidus.ristrat.mvp.presenter;

import com.example.tidus.ristrat.callback.IRequestCallback;
import com.example.tidus.ristrat.contract.IHistoryAssessContract;

import java.text.ParseException;
import java.util.HashMap;

public class HistoryAssessPresenter extends IHistoryAssessContract.HistoryAssessPresenter {


    @Override
    public void getHistoryAssess(HashMap<String, Object> params) {
        if (view != null) {
            view.showProgressDialog();
        }
        model.getHistoryAssess(params, new IRequestCallback() {
            @Override
            public void onSuccess(Object result) throws ParseException {
                if (view != null) {
                    view.onHistoryAssessSuccess(result);
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
