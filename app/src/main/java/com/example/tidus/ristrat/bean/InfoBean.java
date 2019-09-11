package com.example.tidus.ristrat.bean;

public class InfoBean {
    private SelectQuestionListBean selectQuestionListBean;
    private CaseControlBean.ServerParamsBean serverParamsBean;

    public SelectQuestionListBean getSelectQuestionListBean() {
        return selectQuestionListBean;
    }

    public void setSelectQuestionListBean(SelectQuestionListBean selectQuestionListBean) {
        this.selectQuestionListBean = selectQuestionListBean;
    }

    public CaseControlBean.ServerParamsBean getServerParamsBean() {
        return serverParamsBean;
    }

    public void setServerParamsBean(CaseControlBean.ServerParamsBean serverParamsBean) {
        this.serverParamsBean = serverParamsBean;
    }
}
