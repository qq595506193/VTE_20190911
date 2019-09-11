package com.example.tidus.ristrat.mvp.presenter;

import com.example.tidus.ristrat.callback.IRequestCallback;
import com.example.tidus.ristrat.contract.ICheckAssessStatusContract;

import java.text.ParseException;
import java.util.HashMap;

/**
 * Created by TriumphalSun
 * on 2019/7/31 0031
 */
public class CheckAssessStatusPresenter extends ICheckAssessStatusContract.CheckAssessStatusPresenter {
    @Override
    public void getCheckAssessStatus(HashMap<String, Object> params) {
        model.getCheckAssessStatus(params, new IRequestCallback() {
            @Override
            public void onSuccess(Object result) throws ParseException {
                if (view != null) {
                    view.onCheckAssessStatusSuccess(result);
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
