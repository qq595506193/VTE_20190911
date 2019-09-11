package com.example.tidus.ristrat.bean;

import java.util.List;

public class CommitDataBean {
    private List<DataBean> list;

    public List<DataBean> getList() {
        return list;
    }

    public void setList(List<DataBean> list) {
        this.list = list;
    }

    public class DataBean {
        private String CURRENT_OPTION_ID;
        private String CURRENT_VALUE;
        private String RISK_FACTOR_ID;

        public String getCURRENT_OPTION_ID() {
            return CURRENT_OPTION_ID;
        }

        public void setCURRENT_OPTION_ID(String CURRENT_OPTION_ID) {
            this.CURRENT_OPTION_ID = CURRENT_OPTION_ID;
        }

        public String getCURRENT_VALUE() {
            return CURRENT_VALUE;
        }

        public void setCURRENT_VALUE(String CURRENT_VALUE) {
            this.CURRENT_VALUE = CURRENT_VALUE;
        }

        public String getRISK_FACTOR_ID() {
            return RISK_FACTOR_ID;
        }

        public void setRISK_FACTOR_ID(String RISK_FACTOR_ID) {
            this.RISK_FACTOR_ID = RISK_FACTOR_ID;
        }
    }
}
