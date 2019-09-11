package com.example.tidus.ristrat.mvp.presenter;

import com.example.tidus.ristrat.callback.IRequestCallback;
import com.example.tidus.ristrat.contract.INowSelectTablesContract;

import java.text.ParseException;
import java.util.HashMap;

/**
 * Created by TriumphalSun
 * on 2019/7/15 0015
 */
public class NowSelectTablesPresenter extends INowSelectTablesContract.NowSelectTablesPresenter {
    @Override
    public void getNowSelectTables(HashMap<String, Object> params) {
        if (view != null) {
            view.showProgressDialog();
        }
        model.getNowSelectTables(params, new IRequestCallback() {
            @Override
            public void onSuccess(Object result) throws ParseException {
                if (view != null) {
                    view.onNowSelectTablesSuccess(result);
                    view.hideProgressDialog();
                }
            }

            @Override
            public void onFailed(Object error) {
                if (view != null) {
                    view.failure(error + "");
                }
            }
        });
    }
}
