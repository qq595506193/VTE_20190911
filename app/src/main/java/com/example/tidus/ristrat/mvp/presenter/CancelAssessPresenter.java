package com.example.tidus.ristrat.mvp.presenter;

import com.example.tidus.ristrat.callback.IRequestCallback;
import com.example.tidus.ristrat.contract.ICancelAssessContract;
import com.example.tidus.ristrat.mvp.model.CancelAssessModel;

import java.util.HashMap;

public class CancelAssessPresenter extends ICancelAssessContract.CancelAssessPresenter {
    private CancelAssessModel cancelAssessModel;
    private ICancelAssessContract.ICancelAssessView iCancelAssessView;

    public CancelAssessPresenter(ICancelAssessContract.ICancelAssessView iCancelAssessView) {
        this.iCancelAssessView = iCancelAssessView;
        cancelAssessModel = new CancelAssessModel();
    }

    @Override
    public void getCancelAssess(HashMap<String, Object> params) {
        cancelAssessModel.getCancelAssess(params, new IRequestCallback() {
            @Override
            public void onSuccess(Object result) {
                if (iCancelAssessView != null) {
                    iCancelAssessView.onCancelAssessSuccess(result);
                }
            }

            @Override
            public void onFailed(Object error) {
                if (iCancelAssessView != null) {
                    iCancelAssessView.onFailed(error);
                }
            }
        });
    }
}
