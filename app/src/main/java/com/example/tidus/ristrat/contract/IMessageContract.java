package com.example.tidus.ristrat.contract;

import com.example.lib_core.base.mvp.BasePresenter;
import com.example.lib_core.base.mvp.IBaseModel;
import com.example.lib_core.base.mvp.IBaseView;
import com.example.tidus.ristrat.callback.IRequestCallback;
import com.example.tidus.ristrat.mvp.model.MessageModel;

import java.util.HashMap;

public interface IMessageContract {
    abstract class MessagePresenter extends BasePresenter<IMessageModel, IMessageView> {
        public abstract void getMessage(HashMap<String, Object> params);

        public abstract void getUpdateMessageType(HashMap<String, Object> params);

        @Override
        public IMessageModel getModel() {
            return new MessageModel();
        }
    }

    interface IMessageModel extends IBaseModel {
        void getMessage(HashMap<String, Object> params, IRequestCallback iRequestCallback);

        void getUpdateMessageType(HashMap<String, Object> params, IRequestCallback iRequestCallback);
    }

    interface IMessageView extends IBaseView {
        void onMessageSuccess(Object result);

        void onUpdateMessageTypeSuccess(Object result);

    }
}
