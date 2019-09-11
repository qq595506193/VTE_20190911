package com.example.tidus.ristrat.bean;

import java.io.Serializable;
import java.util.List;

public class CheckRiskBean implements Serializable {


    /**
     * code : 0
     * message : 成功
     * server_code :
     * server_params : [{"MERCHANT_ID":1400,"SITE_ID":1400,"DEPARTMENT":100,"FORM_ID":1,"FORM_NAME":"Caprini风险评估量表","FORM_TYPE":10,"FORM_SEQ":1,"BUSINESS_CLASS":"Assess","sublist":[{"MERCHANT_ID":1400,"SITE_ID":1400,"VISIT_SQ_NO":"234353465436","BED_NUMBER":"01","PATIENT_ID":"TMP138","FORM_ID":1,"USER_ID":205,"RECORD_TIME":"20190718171659","LATER_TIME":"20190718171659","REPORT_ID":null,"BUSINESS_ID":null,"PATIENT_NAME":"蔡徐坤","USER_NAME":"王医生","FORM_NAME":"Caprini风险评估量表"}]},{"MERCHANT_ID":1400,"SITE_ID":1400,"DEPARTMENT":100,"FORM_ID":2,"FORM_NAME":"出血风险评估量表","FORM_TYPE":20,"FORM_SEQ":2,"BUSINESS_CLASS":"Assess","sublist":[]}]
     */

    private String code;
    private String message;
    private String server_code;
    private List<ServerParamsBean> server_params;

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

    public List<ServerParamsBean> getServer_params() {
        return server_params;
    }

    public void setServer_params(List<ServerParamsBean> server_params) {
        this.server_params = server_params;
    }

    public static class ServerParamsBean implements Serializable {
        /**
         * MERCHANT_ID : 1400
         * SITE_ID : 1400
         * DEPARTMENT : 100
         * FORM_ID : 1
         * FORM_NAME : Caprini风险评估量表
         * FORM_TYPE : 10
         * FORM_SEQ : 1
         * BUSINESS_CLASS : Assess
         * sublist : [{"MERCHANT_ID":1400,"SITE_ID":1400,"VISIT_SQ_NO":"234353465436","BED_NUMBER":"01","PATIENT_ID":"TMP138","FORM_ID":1,"USER_ID":205,"RECORD_TIME":"20190718171659","LATER_TIME":"20190718171659","REPORT_ID":null,"BUSINESS_ID":null,"PATIENT_NAME":"蔡徐坤","USER_NAME":"王医生","FORM_NAME":"Caprini风险评估量表"}]
         */

        private int MERCHANT_ID;
        private int SITE_ID;
        private int DEPARTMENT;
        private int FORM_ID;
        private String FORM_NAME;
        private int FORM_TYPE;
        private int FORM_SEQ;
        private String BUSINESS_CLASS;
        private List<SublistBean> sublist;

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

        public int getDEPARTMENT() {
            return DEPARTMENT;
        }

        public void setDEPARTMENT(int DEPARTMENT) {
            this.DEPARTMENT = DEPARTMENT;
        }

        public int getFORM_ID() {
            return FORM_ID;
        }

        public void setFORM_ID(int FORM_ID) {
            this.FORM_ID = FORM_ID;
        }

        public String getFORM_NAME() {
            return FORM_NAME;
        }

        public void setFORM_NAME(String FORM_NAME) {
            this.FORM_NAME = FORM_NAME;
        }

        public int getFORM_TYPE() {
            return FORM_TYPE;
        }

        public void setFORM_TYPE(int FORM_TYPE) {
            this.FORM_TYPE = FORM_TYPE;
        }

        public int getFORM_SEQ() {
            return FORM_SEQ;
        }

        public void setFORM_SEQ(int FORM_SEQ) {
            this.FORM_SEQ = FORM_SEQ;
        }

        public String getBUSINESS_CLASS() {
            return BUSINESS_CLASS;
        }

        public void setBUSINESS_CLASS(String BUSINESS_CLASS) {
            this.BUSINESS_CLASS = BUSINESS_CLASS;
        }

        public List<SublistBean> getSublist() {
            return sublist;
        }

        public void setSublist(List<SublistBean> sublist) {
            this.sublist = sublist;
        }

        public static class SublistBean implements Serializable {
            /**
             * MERCHANT_ID : 1400
             * SITE_ID : 1400
             * VISIT_SQ_NO : 234353465436
             * BED_NUMBER : 01
             * PATIENT_ID : TMP138
             * FORM_ID : 1
             * USER_ID : 205
             * RECORD_TIME : 20190718171659
             * LATER_TIME : 20190718171659
             * REPORT_ID : null
             * BUSINESS_ID : null
             * PATIENT_NAME : 蔡徐坤
             * USER_NAME : 王医生
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
            private Object BUSINESS_ID;
            private String PATIENT_NAME;
            private String USER_NAME;
            private String FORM_NAME;

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

            public Object getBUSINESS_ID() {
                return BUSINESS_ID;
            }

            public void setBUSINESS_ID(Object BUSINESS_ID) {
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
    }
}
