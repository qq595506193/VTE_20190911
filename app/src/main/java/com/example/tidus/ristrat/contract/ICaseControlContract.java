package com.example.tidus.ristrat.contract;

import com.example.lib_core.base.mvp.BasePresenter;
import com.example.lib_core.base.mvp.IBaseModel;
import com.example.lib_core.base.mvp.IBaseView;
import com.example.tidus.ristrat.callback.IRequestCallback;
import com.example.tidus.ristrat.mvp.model.CaseControlModel;

import java.util.HashMap;

public interface ICaseControlContract {
    abstract class CaseControlPresenter extends BasePresenter<ICaseControlModel, ICaseControlView> {

        public abstract void getCaseControl(HashMap<String, Object> params);

        public abstract void getQueryHM(HashMap<String, Object> params);


        @Override
        public ICaseControlModel getModel() {
            return new CaseControlModel();
        }
    }

    interface ICaseControlModel extends IBaseModel {
        void getCaseControl(HashMap<String, Object> params, IRequestCallback iRequestCallback);

        void getQueryHM(HashMap<String, Object> params, IRequestCallback iRequestCallback);
    }

    interface ICaseControlView extends IBaseView {

        void onQueryHMSuccess(Object result);

        void onCaseControlSuccess(Object result);

        void onFailed(Object error);

        void showProgressDialog();

        void hideProgressDialog();
    }
}
