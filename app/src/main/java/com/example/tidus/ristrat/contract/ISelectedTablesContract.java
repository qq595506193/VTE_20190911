package com.example.tidus.ristrat.contract;

import com.example.lib_core.base.mvp.BasePresenter;
import com.example.lib_core.base.mvp.IBaseModel;
import com.example.lib_core.base.mvp.IBaseView;
import com.example.tidus.ristrat.callback.IRequestCallback;
import com.example.tidus.ristrat.mvp.model.SelectedTablesModel;

import java.util.HashMap;

/**
 * Created by TriumphalSun
 * on 2019/7/15 0015
 */
public interface ISelectedTablesContract {
    abstract class SelectedTablesPresenter extends BasePresenter<ISelectedTablesModel, ISelectedTablesView> {
        public abstract void getSelectedTables(HashMap<String, Object> params);

        @Override
        public ISelectedTablesModel getModel() {
            return new SelectedTablesModel();
        }
    }

    interface ISelectedTablesModel extends IBaseModel {
        void getSelectedTables(HashMap<String, Object> params, IRequestCallback iRequestCallback);
    }

    interface ISelectedTablesView extends IBaseView {
        void onSelectedTablesSuccess(Object result);

        void showProgressDialog();

        void hideProgressDialog();
    }
}
