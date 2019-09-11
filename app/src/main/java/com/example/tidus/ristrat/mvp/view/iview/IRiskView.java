package com.example.tidus.ristrat.mvp.view.iview;

import com.example.tidus.ristrat.base.IView;
import com.example.tidus.ristrat.bean.RiskBean;

public interface IRiskView extends IView {
    void success(RiskBean riskBean);

    void faild(Throwable t);
}
