package com.example.tidus.ristrat.mvp.presenter;

import com.example.tidus.ristrat.callback.IRequestCallback;
import com.example.tidus.ristrat.contract.IEvaluatingContract;
import com.example.tidus.ristrat.mvp.model.EvaluatingModel;

import java.util.HashMap;

public class EvaluatingPresenter extends IEvaluatingContract.EvaluatingPresenter {
    private EvaluatingModel evaluatingModel;
    private IEvaluatingContract.IEvaluatingView iEvaluatingView;

    public EvaluatingPresenter(IEvaluatingContract.IEvaluatingView iEvaluatingView) {
        evaluatingModel = new EvaluatingModel();
        this.iEvaluatingView = iEvaluatingView;
    }

    @Override
    public void getEvaluating(HashMap<String, Object> params) {
        evaluatingModel.getEvaluating(params, new IRequestCallback() {
            @Override
            public void onSuccess(Object result) {
                if (iEvaluatingView != null) {
                    iEvaluatingView.onEvaluatingSuccess(result);
                }
            }

            @Override
            public void onFailed(Object error) {
                if (iEvaluatingView != null) {
                    iEvaluatingView.onFailed(error);
                }
            }
        });
    }
}
