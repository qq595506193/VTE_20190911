package com.example.tidus.ristrat.mvp.view.iview;

import com.example.tidus.ristrat.base.IView;
import com.example.tidus.ristrat.bean.Infrom;
import com.example.tidus.ristrat.bean.LoginBean;

public interface IinfromView extends IView {
    void Success(Infrom  infrom);

    void Faild(Throwable e);
}
