package com.example.tidus.ristrat.contract;

import com.example.lib_core.base.mvp.BasePresenter;
import com.example.lib_core.base.mvp.IBaseModel;
import com.example.lib_core.base.mvp.IBaseView;
import com.example.tidus.ristrat.callback.IRequestCallback;
import com.example.tidus.ristrat.mvp.model.CheckAssessStatusModel;

import java.util.HashMap;

/**
 * Created by TriumphalSun
 * on 2019/7/31 0031
 */
public interface ICheckAssessStatusContract {
    abstract class CheckAssessStatusPresenter extends BasePresenter<ICheckAssessStatusModel, ICheckAssessStatusView> {
        public abstract void getCheckAssessStatus(HashMap<String, Object> params);

        @Override
        public ICheckAssessStatusModel getModel() {
            return new CheckAssessStatusModel();
        }
    }

    interface ICheckAssessStatusModel extends IBaseModel {
        void getCheckAssessStatus(HashMap<String, Object> params, IRequestCallback iRequestCallback);
    }

    interface ICheckAssessStatusView extends IBaseView {
        void onCheckAssessStatusSuccess(Object result);
    }
}
