package com.example.tidus.ristrat.contract;

import com.example.tidus.ristrat.callback.IRequestCallback;

import java.util.HashMap;

public interface IMessageTypeContract {
    abstract class MessageTypePresenter {
        public abstract void getMessageType(HashMap<String, Object> params);
    }

    interface IMessageTypeModel {
        void getMessageType(HashMap<String, Object> params, IRequestCallback iRequestCallback);
    }

    interface IMessageTypeView {
        void onMessageTypeSuccess(Object result);

        void onMessageTypeFailed(Object error);
    }
}
