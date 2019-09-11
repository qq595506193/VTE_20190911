package com.example.tidus.ristrat.contract;

import com.example.lib_core.base.mvp.BasePresenter;
import com.example.lib_core.base.mvp.IBaseModel;
import com.example.lib_core.base.mvp.IBaseView;
import com.example.tidus.ristrat.callback.IRequestCallback;
import com.example.tidus.ristrat.mvp.model.NowSelectTablesModel;

import java.util.HashMap;

/**
 * Created by TriumphalSun
 * on 2019/7/15 0015
 */
public interface INowSelectTablesContract {
    abstract class NowSelectTablesPresenter extends BasePresenter<INowSelectTablesModel, INowSelectTablesView> {
        public abstract void getNowSelectTables(HashMap<String, Object> params);

        @Override
        public INowSelectTablesModel getModel() {
            return new NowSelectTablesModel();
        }
    }

    interface INowSelectTablesModel extends IBaseModel {
        void getNowSelectTables(HashMap<String, Object> params, IRequestCallback iRequestCallback);
    }

    interface INowSelectTablesView extends IBaseView {
        void onNowSelectTablesSuccess(Object result);

        void showProgressDialog();

        void hideProgressDialog();
    }
}
