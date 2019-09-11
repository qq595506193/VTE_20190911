package com.example.tidus.ristrat.mvp.presenter;

import com.example.tidus.ristrat.callback.IRequestCallback;
import com.example.tidus.ristrat.contract.ILaterOnContract;
import com.example.tidus.ristrat.mvp.model.LaterOnModel;

import java.text.ParseException;
import java.util.HashMap;

/**
 * Created by TriumphalSun
 * on 2019/7/16 0016
 */
public class LaterOnPresenter extends ILaterOnContract.LaterOnPresenter {
    private LaterOnModel laterOnModel;
    private ILaterOnContract.ILaterOnView iLaterOnView;

    public LaterOnPresenter(ILaterOnContract.ILaterOnView iLaterOnView) {
        laterOnModel = new LaterOnModel();
        this.iLaterOnView = iLaterOnView;
    }

    @Override
    public void getLaterOn(HashMap<String, Object> params) {
        laterOnModel.getLaterOn(params, new IRequestCallback() {
            @Override
            public void onSuccess(Object result) throws ParseException {
                if (iLaterOnView != null) {
                    iLaterOnView.onLaterOnSuccess(result);
                }
            }

            @Override
            public void onFailed(Object error) {
                if (iLaterOnView != null) {
                    iLaterOnView.onLaterOnFailed(error);
                }
            }
        });
    }
}
