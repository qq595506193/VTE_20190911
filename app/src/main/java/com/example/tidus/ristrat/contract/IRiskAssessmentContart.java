package com.example.tidus.ristrat.contract;

import com.example.lib_core.base.mvp.BasePresenter;
import com.example.lib_core.base.mvp.IBaseModel;
import com.example.lib_core.base.mvp.IBaseView;
import com.example.tidus.ristrat.callback.IRequestCallback;
import com.example.tidus.ristrat.mvp.model.RiskAssessmentModel;

import java.util.HashMap;

public interface IRiskAssessmentContart {

    abstract class RiskAssessmentPresenter extends BasePresenter<IRiskAssessmentModel, IRiskAssessmentView> {
        public abstract void getRiskAssessment(HashMap<String, Object> params);

        public abstract void getCommit(HashMap<String, Object> params);

        public abstract void getSave(HashMap<String, Object> params);

        @Override
        public IRiskAssessmentModel getModel() {
            return new RiskAssessmentModel();
        }
    }

    interface IRiskAssessmentModel extends IBaseModel {
        void getRiskAssessment(HashMap<String, Object> params, IRequestCallback iRequestCallback);

        void getCommit(HashMap<String, Object> params, IRequestCallback iRequestCallback);

        void getSave(HashMap<String, Object> params, IRequestCallback iRequestCallback);
    }

    interface IRiskAssessmentView extends IBaseView {
        void onCommitSuccess(Object result);

        void onRiskAssessmentSuccess(Object result);

        void onSaveSuccess(Object result);

        void showProgressDialog();

        void hideProgressDialog();
    }
}
