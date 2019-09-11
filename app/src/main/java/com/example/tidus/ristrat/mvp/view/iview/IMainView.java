package com.example.tidus.ristrat.mvp.view.iview;

import com.example.tidus.ristrat.base.IView;
import com.example.tidus.ristrat.bean.Infrom;
import com.example.tidus.ristrat.bean.PlanBean;

public interface IMainView extends IView {
    void Success(PlanBean planBean);

    void Faild(Throwable e);
}
