package com.example.tidus.ristrat.mvp.presenter;

import com.example.tidus.ristrat.callback.IRequestCallback;
import com.example.tidus.ristrat.contract.IAssessCancelContract;
import com.example.tidus.ristrat.mvp.model.AssessCancelModel;

import java.text.ParseException;
import java.util.HashMap;

public class AssessCancelPresenter extends IAssessCancelContract.AssessCancelPresenter {
    private AssessCancelModel assessCancelModel;
    private IAssessCancelContract.IAssessCanceTixinglView iAssessCancelView;

    public AssessCancelPresenter(IAssessCancelContract.IAssessCanceTixinglView iAssessCancelView) {
        assessCancelModel = new AssessCancelModel();
        this.iAssessCancelView = iAssessCancelView;
    }

    @Override
    public void getAssessCancel(HashMap<String, Object> params) {
        assessCancelModel.getAssessCancel(params, new IRequestCallback() {
            @Override
            public void onSuccess(Object result) throws ParseException {
                if (iAssessCancelView != null) {
                    iAssessCancelView.onAssessCancelSuccess(result);
                }
            }

            @Override
            public void onFailed(Object error) {
                if (iAssessCancelView != null) {
                    iAssessCancelView.onAssessCancelFailed(error);
                }
            }
        });
    }
}
