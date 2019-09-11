package com.example.tidus.ristrat.mvp.presenter;

import com.example.tidus.ristrat.callback.IRequestCallback;
import com.example.tidus.ristrat.contract.IMessageTypeContract;
import com.example.tidus.ristrat.mvp.model.MessageTypeModel;

import java.text.ParseException;
import java.util.HashMap;

public class MessageTypePresenter extends IMessageTypeContract.MessageTypePresenter {
    private MessageTypeModel messageTypeModel;
    private IMessageTypeContract.IMessageTypeView iMessageTypeView;

    public MessageTypePresenter(IMessageTypeContract.IMessageTypeView iMessageTypeView) {
        messageTypeModel = new MessageTypeModel();
        this.iMessageTypeView = iMessageTypeView;
    }

    @Override
    public void getMessageType(HashMap<String, Object> params) {
        messageTypeModel.getMessageType(params, new IRequestCallback() {
            @Override
            public void onSuccess(Object result) throws ParseException {
                if (iMessageTypeView != null) {
                    iMessageTypeView.onMessageTypeSuccess(result);
                }
            }

            @Override
            public void onFailed(Object error) {
                if (iMessageTypeView != null) {
                    iMessageTypeView.onMessageTypeFailed(error);
                }
            }
        });
    }
}
