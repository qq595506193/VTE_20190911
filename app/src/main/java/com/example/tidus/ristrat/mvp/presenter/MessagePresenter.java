package com.example.tidus.ristrat.mvp.presenter;

import com.example.tidus.ristrat.callback.IRequestCallback;
import com.example.tidus.ristrat.contract.IMessageContract;

import java.text.ParseException;
import java.util.HashMap;

public class MessagePresenter extends IMessageContract.MessagePresenter {
    @Override
    public void getMessage(HashMap<String, Object> params) {
        model.getMessage(params, new IRequestCallback() {
            @Override
            public void onSuccess(Object result) {
                if (view != null) {
                    view.onMessageSuccess(result);
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

    @Override
    public void getUpdateMessageType(HashMap<String, Object> params) {
        model.getUpdateMessageType(params, new IRequestCallback() {
            @Override
            public void onSuccess(Object result) throws ParseException {
                if (view != null) {
                    view.onUpdateMessageTypeSuccess(result);
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
