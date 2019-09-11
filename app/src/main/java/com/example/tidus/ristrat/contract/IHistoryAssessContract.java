package com.example.tidus.ristrat.contract;

import com.example.lib_core.base.mvp.BasePresenter;
import com.example.lib_core.base.mvp.IBaseModel;
import com.example.lib_core.base.mvp.IBaseView;
import com.example.tidus.ristrat.callback.IRequestCallback;
import com.example.tidus.ristrat.mvp.model.HistoryAssessModel;

import java.text.ParseException;
import java.util.HashMap;

public interface IHistoryAssessContract {
    abstract class HistoryAssessPresenter extends BasePresenter<IHistoryAssessModel, IHistoryAssessView> {
        public abstract void getHistoryAssess(HashMap<String, Object> params);

        @Override
        public IHistoryAssessModel getModel() {
            return new HistoryAssessModel();
        }
    }

    interface IHistoryAssessModel extends IBaseModel {
        void getHistoryAssess(HashMap<String, Object> params, IRequestCallback iRequestCallback);
    }

    interface IHistoryAssessView extends IBaseView {
        void onHistoryAssessSuccess(Object result) throws ParseException;

        void showProgressDialog();

        void hideProgressDialog();
    }
}
