package com.example.tidus.ristrat.bean;

import java.io.Serializable;
import java.util.List;

public class QueryHMBean implements Serializable {


    /**
     * code : 0
     * message : 成功
     * server_code :
     * server_params : {"tixingLIST":[{"MERCHANT_ID":1400,"SITE_ID":1400,"VISIT_SQ_NO":"A5665566566","BED_NUMBER":"07","PATIENT_ID":"TMP120","FORM_ID":1,"USER_ID":222,"RECORD_TIME":"20190718114452","LATER_TIME":"20190718114452","REPORT_ID":null,"BUSINESS_ID":"2","PATIENT_NAME":"ping","USER_NAME":"李护士","FORM_NAME":"Caprini风险评估量表"}],"LIST":[{"MERCHANT_ID":1400,"SITE_ID":1400,"VISIT_SQ_NO":"345436456","REMINDE_ID":1132,"PATIENT_ID":"TMP135","PATIENT_TYPE":"Patient","REMINDE_TIME":"20190718095434","OPERATE_RESULT":10,"USER_ID":null,"OPERATE_TIME":null,"REMINDE_TYPE":"入院","REMINDE_LEVEL":"20","REMINDE_COLOR":"#ff4e6b","BUSINESS_ID":"1","POINT_ID":"1","FORM_ID":1,"TASK_BEGIN":"20190718095434","TASK_END":"20190718115434","TASK_END_DELAY":"20190718155434","ASSESS_BUSINESS":"VTE风险评估","ASSESS_POINT":null}]}
     */

    private String code;
    private String message;
    private String server_code;
    private ServerParamsBean server_params;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getServer_code() {
        return server_code;
    }

    public void setServer_code(String server_code) {
        this.server_code = server_code;
    }

    public ServerParamsBean getServer_params() {
        return server_params;
    }

    public void setServer_params(ServerParamsBean server_params) {
        this.server_params = server_params;
    }

    public static class ServerParamsBean implements Serializable {
        private List<TixingLISTBean> tixingLIST;
        private List<LISTBean> LIST;

        public List<TixingLISTBean> getTixingLIST() {
            return tixingLIST;
        }

        public void setTixingLIST(List<TixingLISTBean> tixingLIST) {
            this.tixingLIST = tixingLIST;
        }

        public List<LISTBean> getLIST() {
            return LIST;
        }

        public void setLIST(List<LISTBean> LIST) {
            this.LIST = LIST;
        }

        public static class TixingLISTBean implements Serializable {
            /**
             * MERCHANT_ID : 1400
             * SITE_ID : 1400
             * VISIT_SQ_NO : A5665566566
             * BED_NUMBER : 07
             * PATIENT_ID : TMP120
             * FORM_ID : 1
             * USER_ID : 222
             * RECORD_TIME : 20190718114452
             * LATER_TIME : 20190718114452
             * REPORT_ID : null
             * BUSINESS_ID : 2
             * PATIENT_NAME : ping
             * USER_NAME : 李护士
             * FORM_NAME : Caprini风险评估量表
             */

            private int MERCHANT_ID;
            private int SITE_ID;
            private String VISIT_SQ_NO;
            private String BED_NUMBER;
            private String PATIENT_ID;
            private int FORM_ID;
            private int USER_ID;
            private String RECORD_TIME;
            private String LATER_TIME;
            private Object REPORT_ID;
            private String BUSINESS_ID;
            private String PATIENT_NAME;
            private String USER_NAME;
            private String FORM_NAME;
            private boolean checkBox;

            public boolean isCheckBox() {
                return checkBox;
            }

            public void setCheckBox(boolean checkBox) {
                this.checkBox = checkBox;
            }

            public int getMERCHANT_ID() {
                return MERCHANT_ID;
            }

            public void setMERCHANT_ID(int MERCHANT_ID) {
                this.MERCHANT_ID = MERCHANT_ID;
            }

            public int getSITE_ID() {
                return SITE_ID;
            }

            public void setSITE_ID(int SITE_ID) {
                this.SITE_ID = SITE_ID;
            }

            public String getVISIT_SQ_NO() {
                return VISIT_SQ_NO;
            }

            public void setVISIT_SQ_NO(String VISIT_SQ_NO) {
                this.VISIT_SQ_NO = VISIT_SQ_NO;
            }

            public String getBED_NUMBER() {
                return BED_NUMBER;
            }

            public void setBED_NUMBER(String BED_NUMBER) {
                this.BED_NUMBER = BED_NUMBER;
            }

            public String getPATIENT_ID() {
                return PATIENT_ID;
            }

            public void setPATIENT_ID(String PATIENT_ID) {
                this.PATIENT_ID = PATIENT_ID;
            }

            public int getFORM_ID() {
                return FORM_ID;
            }

            public void setFORM_ID(int FORM_ID) {
                this.FORM_ID = FORM_ID;
            }

            public int getUSER_ID() {
                return USER_ID;
            }

            public void setUSER_ID(int USER_ID) {
                this.USER_ID = USER_ID;
            }

            public String getRECORD_TIME() {
                return RECORD_TIME;
            }

            public void setRECORD_TIME(String RECORD_TIME) {
                this.RECORD_TIME = RECORD_TIME;
            }

            public String getLATER_TIME() {
                return LATER_TIME;
            }

            public void setLATER_TIME(String LATER_TIME) {
                this.LATER_TIME = LATER_TIME;
            }

            public Object getREPORT_ID() {
                return REPORT_ID;
            }

            public void setREPORT_ID(Object REPORT_ID) {
                this.REPORT_ID = REPORT_ID;
            }

            public String getBUSINESS_ID() {
                return BUSINESS_ID;
            }

            public void setBUSINESS_ID(String BUSINESS_ID) {
                this.BUSINESS_ID = BUSINESS_ID;
            }

            public String getPATIENT_NAME() {
                return PATIENT_NAME;
            }

            public void setPATIENT_NAME(String PATIENT_NAME) {
                this.PATIENT_NAME = PATIENT_NAME;
            }

            public String getUSER_NAME() {
                return USER_NAME;
            }

            public void setUSER_NAME(String USER_NAME) {
                this.USER_NAME = USER_NAME;
            }

            public String getFORM_NAME() {
                return FORM_NAME;
            }

            public void setFORM_NAME(String FORM_NAME) {
                this.FORM_NAME = FORM_NAME;
            }
        }

        public static class LISTBean implements Serializable {
            /**
             * MERCHANT_ID : 1400
             * SITE_ID : 1400
             * VISIT_SQ_NO : 345436456
             * REMINDE_ID : 1132
             * PATIENT_ID : TMP135
             * PATIENT_TYPE : Patient
             * REMINDE_TIME : 20190718095434
             * OPERATE_RESULT : 10
             * USER_ID : null
             * OPERATE_TIME : null
             * REMINDE_TYPE : 入院
             * REMINDE_LEVEL : 20
             * REMINDE_COLOR : #ff4e6b
             * BUSINESS_ID : 1
             * POINT_ID : 1
             * FORM_ID : 1
             * TASK_BEGIN : 20190718095434
             * TASK_END : 20190718115434
             * TASK_END_DELAY : 20190718155434
             * ASSESS_BUSINESS : VTE风险评估
             * ASSESS_POINT : null
             */

            private int MERCHANT_ID;
            private int SITE_ID;
            private String VISIT_SQ_NO;
            private int REMINDE_ID;
            private String PATIENT_ID;
            private String PATIENT_TYPE;
            private String REMINDE_TIME;
            private int OPERATE_RESULT;
            private Object USER_ID;
            private Object OPERATE_TIME;
            private String REMINDE_TYPE;
            private String REMINDE_LEVEL;
            private String REMINDE_COLOR;
            private String BUSINESS_ID;
            private String POINT_ID;
            private int FORM_ID;
            private String TASK_BEGIN;
            private String TASK_END;
            private String TASK_END_DELAY;
            private String ASSESS_BUSINESS;
            private Object ASSESS_POINT;

            public int getMERCHANT_ID() {
                return MERCHANT_ID;
            }

            public void setMERCHANT_ID(int MERCHANT_ID) {
                this.MERCHANT_ID = MERCHANT_ID;
            }

            public int getSITE_ID() {
                return SITE_ID;
            }

            public void setSITE_ID(int SITE_ID) {
                this.SITE_ID = SITE_ID;
            }

            public String getVISIT_SQ_NO() {
                return VISIT_SQ_NO;
            }

            public void setVISIT_SQ_NO(String VISIT_SQ_NO) {
                this.VISIT_SQ_NO = VISIT_SQ_NO;
            }

            public int getREMINDE_ID() {
                return REMINDE_ID;
            }

            public void setREMINDE_ID(int REMINDE_ID) {
                this.REMINDE_ID = REMINDE_ID;
            }

            public String getPATIENT_ID() {
                return PATIENT_ID;
            }

            public void setPATIENT_ID(String PATIENT_ID) {
                this.PATIENT_ID = PATIENT_ID;
            }

            public String getPATIENT_TYPE() {
                return PATIENT_TYPE;
            }

            public void setPATIENT_TYPE(String PATIENT_TYPE) {
                this.PATIENT_TYPE = PATIENT_TYPE;
            }

            public String getREMINDE_TIME() {
                return REMINDE_TIME;
            }

            public void setREMINDE_TIME(String REMINDE_TIME) {
                this.REMINDE_TIME = REMINDE_TIME;
            }

            public int getOPERATE_RESULT() {
                return OPERATE_RESULT;
            }

            public void setOPERATE_RESULT(int OPERATE_RESULT) {
                this.OPERATE_RESULT = OPERATE_RESULT;
            }

            public Object getUSER_ID() {
                return USER_ID;
            }

            public void setUSER_ID(Object USER_ID) {
                this.USER_ID = USER_ID;
            }

            public Object getOPERATE_TIME() {
                return OPERATE_TIME;
            }

            public void setOPERATE_TIME(Object OPERATE_TIME) {
                this.OPERATE_TIME = OPERATE_TIME;
            }

            public String getREMINDE_TYPE() {
                return REMINDE_TYPE;
            }

            public void setREMINDE_TYPE(String REMINDE_TYPE) {
                this.REMINDE_TYPE = REMINDE_TYPE;
            }

            public String getREMINDE_LEVEL() {
                return REMINDE_LEVEL;
            }

            public void setREMINDE_LEVEL(String REMINDE_LEVEL) {
                this.REMINDE_LEVEL = REMINDE_LEVEL;
            }

            public String getREMINDE_COLOR() {
                return REMINDE_COLOR;
            }

            public void setREMINDE_COLOR(String REMINDE_COLOR) {
                this.REMINDE_COLOR = REMINDE_COLOR;
            }

            public String getBUSINESS_ID() {
                return BUSINESS_ID;
            }

            public void setBUSINESS_ID(String BUSINESS_ID) {
                this.BUSINESS_ID = BUSINESS_ID;
            }

            public String getPOINT_ID() {
                return POINT_ID;
            }

            public void setPOINT_ID(String POINT_ID) {
                this.POINT_ID = POINT_ID;
            }

            public int getFORM_ID() {
                return FORM_ID;
            }

            public void setFORM_ID(int FORM_ID) {
                this.FORM_ID = FORM_ID;
            }

            public String getTASK_BEGIN() {
                return TASK_BEGIN;
            }

            public void setTASK_BEGIN(String TASK_BEGIN) {
                this.TASK_BEGIN = TASK_BEGIN;
            }

            public String getTASK_END() {
                return TASK_END;
            }

            public void setTASK_END(String TASK_END) {
                this.TASK_END = TASK_END;
            }

            public String getTASK_END_DELAY() {
                return TASK_END_DELAY;
            }

            public void setTASK_END_DELAY(String TASK_END_DELAY) {
                this.TASK_END_DELAY = TASK_END_DELAY;
            }

            public String getASSESS_BUSINESS() {
                return ASSESS_BUSINESS;
            }

            public void setASSESS_BUSINESS(String ASSESS_BUSINESS) {
                this.ASSESS_BUSINESS = ASSESS_BUSINESS;
            }

            public Object getASSESS_POINT() {
                return ASSESS_POINT;
            }

            public void setASSESS_POINT(Object ASSESS_POINT) {
                this.ASSESS_POINT = ASSESS_POINT;
            }
        }
    }
}
