package com.example.tidus.ristrat.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by TriumphalSun
 * on 2019/7/15 0015
 */
public class SelectedTablesBean implements Serializable {

    /**
     * code : 0
     * message : 成功
     * server_code :
     * server_params : {"PATIENT_ID":"TMP110","DOCTOR_NAME":null,"REPORT_CODE":null,"REPORT_ID":null,"IN_DEPT_CODE":"134","IN_DEPT_NAME":"血管外科","PATIENT_NAME":"张林峰","BIRTHDAY":"19730304000000","PATIENT_SEX":"M","MEDICAL_REC_NUMBER":null,"VISIT_SQ_NO":"ZY001","businesslist":[{"BUSINESS_ID":"1","ASSESS_BUSINESS":"VTE风险评估","BUSINESS_DESC":"VTE风险评估","USED_FLAG":1,"BUSINESS_SEQ":1,"listforms":[{"MERCHANT_ID":1400,"SITE_ID":1400,"DEPARTMENT":100,"FORM_ID":1,"FORM_NAME":"Caprini风险评估量表","FORM_TYPE":10,"FORM_SEQ":1,"BUSINESS_CLASS":"Assess","sublist":[]}]},{"BUSINESS_ID":"2","ASSESS_BUSINESS":"大出血风险评估","BUSINESS_DESC":"大出血风险评估","USED_FLAG":1,"BUSINESS_SEQ":2,"listforms":[{"MERCHANT_ID":1400,"SITE_ID":1400,"DEPARTMENT":100,"FORM_ID":2,"FORM_NAME":"出血风险评估量表","FORM_TYPE":20,"FORM_SEQ":2,"BUSINESS_CLASS":"Assess","sublist":[]}]}],"remindlist":[{"MERCHANT_ID":1400,"SITE_ID":1400,"VISIT_SQ_NO":"ZY001","REMINDE_ID":1,"PATIENT_ID":"TMP110","PATIENT_TYPE":"Patient","REMINDE_TIME":"20190715135803","OPERATE_RESULT":10,"USER_ID":null,"OPERATE_TIME":null,"REMINDE_TYPE":"病程","REMINDE_LEVEL":"20","REMINDE_COLOR":"#ff4e6b","BUSINESS_ID":"1","POINT_ID":"6","FORM_ID":1,"TASK_BEGIN":"20190715135803","TASK_END":"20190715155803","TASK_END_DELAY":"20190715195803","ASSESS_BUSINESS":"VTE风险评估","ASSESS_POINT":null}]}
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
        /**
         * PATIENT_ID : TMP110
         * DOCTOR_NAME : null
         * REPORT_CODE : null
         * REPORT_ID : null
         * IN_DEPT_CODE : 134
         * IN_DEPT_NAME : 血管外科
         * PATIENT_NAME : 张林峰
         * BIRTHDAY : 19730304000000
         * PATIENT_SEX : M
         * MEDICAL_REC_NUMBER : null
         * VISIT_SQ_NO : ZY001
         * businesslist : [{"BUSINESS_ID":"1","ASSESS_BUSINESS":"VTE风险评估","BUSINESS_DESC":"VTE风险评估","USED_FLAG":1,"BUSINESS_SEQ":1,"listforms":[{"MERCHANT_ID":1400,"SITE_ID":1400,"DEPARTMENT":100,"FORM_ID":1,"FORM_NAME":"Caprini风险评估量表","FORM_TYPE":10,"FORM_SEQ":1,"BUSINESS_CLASS":"Assess","sublist":[]}]},{"BUSINESS_ID":"2","ASSESS_BUSINESS":"大出血风险评估","BUSINESS_DESC":"大出血风险评估","USED_FLAG":1,"BUSINESS_SEQ":2,"listforms":[{"MERCHANT_ID":1400,"SITE_ID":1400,"DEPARTMENT":100,"FORM_ID":2,"FORM_NAME":"出血风险评估量表","FORM_TYPE":20,"FORM_SEQ":2,"BUSINESS_CLASS":"Assess","sublist":[]}]}]
         * remindlist : [{"MERCHANT_ID":1400,"SITE_ID":1400,"VISIT_SQ_NO":"ZY001","REMINDE_ID":1,"PATIENT_ID":"TMP110","PATIENT_TYPE":"Patient","REMINDE_TIME":"20190715135803","OPERATE_RESULT":10,"USER_ID":null,"OPERATE_TIME":null,"REMINDE_TYPE":"病程","REMINDE_LEVEL":"20","REMINDE_COLOR":"#ff4e6b","BUSINESS_ID":"1","POINT_ID":"6","FORM_ID":1,"TASK_BEGIN":"20190715135803","TASK_END":"20190715155803","TASK_END_DELAY":"20190715195803","ASSESS_BUSINESS":"VTE风险评估","ASSESS_POINT":null}]
         */

        private String PATIENT_ID;
        private Object DOCTOR_NAME;
        private Object REPORT_CODE;
        private Object REPORT_ID;
        private String IN_DEPT_CODE;
        private String IN_DEPT_NAME;
        private String PATIENT_NAME;
        private String BIRTHDAY;
        private String PATIENT_SEX;
        private Object MEDICAL_REC_NUMBER;
        private String VISIT_SQ_NO;
        private List<BusinesslistBean> businesslist;
        private List<RemindlistBean> remindlist;
        private int BED_NUMBER;

        public int getBED_NUMBER() {
            return BED_NUMBER;
        }

        public void setBED_NUMBER(int BED_NUMBER) {
            this.BED_NUMBER = BED_NUMBER;
        }

        public String getPATIENT_ID() {
            return PATIENT_ID;
        }

        public void setPATIENT_ID(String PATIENT_ID) {
            this.PATIENT_ID = PATIENT_ID;
        }

        public Object getDOCTOR_NAME() {
            return DOCTOR_NAME;
        }

        public void setDOCTOR_NAME(Object DOCTOR_NAME) {
            this.DOCTOR_NAME = DOCTOR_NAME;
        }

        public Object getREPORT_CODE() {
            return REPORT_CODE;
        }

        public void setREPORT_CODE(Object REPORT_CODE) {
            this.REPORT_CODE = REPORT_CODE;
        }

        public Object getREPORT_ID() {
            return REPORT_ID;
        }

        public void setREPORT_ID(Object REPORT_ID) {
            this.REPORT_ID = REPORT_ID;
        }

        public String getIN_DEPT_CODE() {
            return IN_DEPT_CODE;
        }

        public void setIN_DEPT_CODE(String IN_DEPT_CODE) {
            this.IN_DEPT_CODE = IN_DEPT_CODE;
        }

        public String getIN_DEPT_NAME() {
            return IN_DEPT_NAME;
        }

        public void setIN_DEPT_NAME(String IN_DEPT_NAME) {
            this.IN_DEPT_NAME = IN_DEPT_NAME;
        }

        public String getPATIENT_NAME() {
            return PATIENT_NAME;
        }

        public void setPATIENT_NAME(String PATIENT_NAME) {
            this.PATIENT_NAME = PATIENT_NAME;
        }

        public String getBIRTHDAY() {
            return BIRTHDAY;
        }

        public void setBIRTHDAY(String BIRTHDAY) {
            this.BIRTHDAY = BIRTHDAY;
        }

        public String getPATIENT_SEX() {
            return PATIENT_SEX;
        }

        public void setPATIENT_SEX(String PATIENT_SEX) {
            this.PATIENT_SEX = PATIENT_SEX;
        }

        public Object getMEDICAL_REC_NUMBER() {
            return MEDICAL_REC_NUMBER;
        }

        public void setMEDICAL_REC_NUMBER(Object MEDICAL_REC_NUMBER) {
            this.MEDICAL_REC_NUMBER = MEDICAL_REC_NUMBER;
        }

        public String getVISIT_SQ_NO() {
            return VISIT_SQ_NO;
        }

        public void setVISIT_SQ_NO(String VISIT_SQ_NO) {
            this.VISIT_SQ_NO = VISIT_SQ_NO;
        }

        public List<BusinesslistBean> getBusinesslist() {
            return businesslist;
        }

        public void setBusinesslist(List<BusinesslistBean> businesslist) {
            this.businesslist = businesslist;
        }

        public List<RemindlistBean> getRemindlist() {
            return remindlist;
        }

        public void setRemindlist(List<RemindlistBean> remindlist) {
            this.remindlist = remindlist;
        }

        public static class BusinesslistBean implements Serializable {
            /**
             * BUSINESS_ID : 1
             * ASSESS_BUSINESS : VTE风险评估
             * BUSINESS_DESC : VTE风险评估
             * USED_FLAG : 1
             * BUSINESS_SEQ : 1
             * listforms : [{"MERCHANT_ID":1400,"SITE_ID":1400,"DEPARTMENT":100,"FORM_ID":1,"FORM_NAME":"Caprini风险评估量表","FORM_TYPE":10,"FORM_SEQ":1,"BUSINESS_CLASS":"Assess","sublist":[]}]
             */

            private String BUSINESS_ID;
            private String ASSESS_BUSINESS;
            private String BUSINESS_DESC;
            private int USED_FLAG;
            private int BUSINESS_SEQ;
            private List<ListformsBean> listforms;
            private boolean che_color;

            public boolean isChe_color() {
                return che_color;
            }

            public void setChe_color(boolean che_color) {
                this.che_color = che_color;
            }

            public String getBUSINESS_ID() {
                return BUSINESS_ID;
            }

            public void setBUSINESS_ID(String BUSINESS_ID) {
                this.BUSINESS_ID = BUSINESS_ID;
            }

            public String getASSESS_BUSINESS() {
                return ASSESS_BUSINESS;
            }

            public void setASSESS_BUSINESS(String ASSESS_BUSINESS) {
                this.ASSESS_BUSINESS = ASSESS_BUSINESS;
            }

            public String getBUSINESS_DESC() {
                return BUSINESS_DESC;
            }

            public void setBUSINESS_DESC(String BUSINESS_DESC) {
                this.BUSINESS_DESC = BUSINESS_DESC;
            }

            public int getUSED_FLAG() {
                return USED_FLAG;
            }

            public void setUSED_FLAG(int USED_FLAG) {
                this.USED_FLAG = USED_FLAG;
            }

            public int getBUSINESS_SEQ() {
                return BUSINESS_SEQ;
            }

            public void setBUSINESS_SEQ(int BUSINESS_SEQ) {
                this.BUSINESS_SEQ = BUSINESS_SEQ;
            }

            public List<ListformsBean> getListforms() {
                return listforms;
            }

            public void setListforms(List<ListformsBean> listforms) {
                this.listforms = listforms;
            }

            public static class ListformsBean implements Serializable {
                /**
                 * MERCHANT_ID : 1400
                 * SITE_ID : 1400
                 * DEPARTMENT : 100
                 * FORM_ID : 1
                 * FORM_NAME : Caprini风险评估量表
                 * FORM_TYPE : 10
                 * FORM_SEQ : 1
                 * BUSINESS_CLASS : Assess
                 * sublist : []
                 */

                private int MERCHANT_ID;
                private int SITE_ID;
                private int DEPARTMENT;
                private int FORM_ID;
                private String FORM_NAME;
                private int FORM_TYPE;
                private int FORM_SEQ;
                private String BUSINESS_CLASS;
                private List<?> sublist;

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

                public List<?> getSublist() {
                    return sublist;
                }

                public void setSublist(List<?> sublist) {
                    this.sublist = sublist;
                }
            }
        }

        public static class RemindlistBean implements Serializable {
            /**
             * MERCHANT_ID : 1400
             * SITE_ID : 1400
             * VISIT_SQ_NO : ZY001
             * REMINDE_ID : 1
             * PATIENT_ID : TMP110
             * PATIENT_TYPE : Patient
             * REMINDE_TIME : 20190715135803
             * OPERATE_RESULT : 10
             * USER_ID : null
             * OPERATE_TIME : null
             * REMINDE_TYPE : 病程
             * REMINDE_LEVEL : 20
             * REMINDE_COLOR : #ff4e6b
             * BUSINESS_ID : 1
             * POINT_ID : 6
             * FORM_ID : 1
             * TASK_BEGIN : 20190715135803
             * TASK_END : 20190715155803
             * TASK_END_DELAY : 20190715195803
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
            private String RETIMECONTENT;

            public String getRETIMECONTENT() {
                return RETIMECONTENT;
            }

            public void setRETIMECONTENT(String RETIMECONTENT) {
                this.RETIMECONTENT = RETIMECONTENT;
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
