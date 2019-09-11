package com.example.tidus.ristrat.mvp.presenter;

import com.example.tidus.ristrat.callback.IRequestCallback;
import com.example.tidus.ristrat.contract.ISelectedTablesContract;

import java.text.ParseException;
import java.util.HashMap;

/**
 * Created by TriumphalSun
 * on 2019/7/15 0015
 */
public class SelectedTablesPresenter extends ISelectedTablesContract.SelectedTablesPresenter {
    @Override
    public void getSelectedTables(HashMap<String, Object> params) {
        if (view != null) {
            view.showProgressDialog();
        }
        model.getSelectedTables(params, new IRequestCallback() {
            @Override
            public void onSuccess(Object result) throws ParseException {
                if (view != null) {
                    view.onSelectedTablesSuccess(result);
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
