package com.example.tidus.ristrat.mvp.presenter;

import com.example.tidus.ristrat.callback.IRequestCallback;
import com.example.tidus.ristrat.contract.ICheckRiskContract;
import com.example.tidus.ristrat.mvp.model.CheckRiskModel;

import java.util.HashMap;

public class CheckRiskPresenter extends ICheckRiskContract.CheckRiskPresenter {
    private CheckRiskModel checkRiskModel;
    private ICheckRiskContract.ICheckRiskView iCheckRiskView;

    public CheckRiskPresenter(ICheckRiskContract.ICheckRiskView iCheckRiskView) {
        checkRiskModel = new CheckRiskModel();
        this.iCheckRiskView = iCheckRiskView;
    }

    @Override
    public void getCheckRisk(HashMap<String, Object> params) {
        if (iCheckRiskView != null) {
            iCheckRiskView.showProgressDialog();
        }
        checkRiskModel.getCheckRisk(params, new IRequestCallback() {
            @Override
            public void onSuccess(Object result) {
                if (iCheckRiskView != null) {
                    iCheckRiskView.onCheckRiskSuccess(result);
                    iCheckRiskView.hideProgressDialog();
                }
            }

            @Override
            public void onFailed(Object error) {
                if (iCheckRiskView != null) {
                    iCheckRiskView.onCheckRiskFailed(error);
                    iCheckRiskView.hideProgressDialog();
                }
            }
        });
    }
}
