package com.example.tidus.ristrat.bean;

import android.view.View;

import java.io.Serializable;
import java.util.List;

public class RiskAssessmentBean implements Serializable {

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

        private String PATIENT_ID;
        private Object DOCTOR_NAME;
        private Object REPORT_CODE;
        private Object REPORT_ID;
        private String IN_DEPT_CODE;
        private String IN_DEPT_NAME;
        private String PATIENT_NAME;
        private String BIRTHDAY;
        private String PATIENT_SEX;
        private String MEDICAL_REC_NUMBER;
        private String VISIT_SQ_NO;
        private String BED_NUMBER;
        private List<WENJUANNAMEBean> WENJUANNAME;

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

        public String getMEDICAL_REC_NUMBER() {
            return MEDICAL_REC_NUMBER;
        }

        public void setMEDICAL_REC_NUMBER(String MEDICAL_REC_NUMBER) {
            this.MEDICAL_REC_NUMBER = MEDICAL_REC_NUMBER;
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

        public List<WENJUANNAMEBean> getWENJUANNAME() {
            return WENJUANNAME;
        }

        public void setWENJUANNAME(List<WENJUANNAMEBean> WENJUANNAME) {
            this.WENJUANNAME = WENJUANNAME;
        }

        public static class WENJUANNAMEBean implements Serializable {


            private int MERCHANT_ID;
            private int SITE_ID;
            private int DEPARTMENT;
            private int FORM_ID;
            private String FORM_NAME;
            private int FORM_TYPE;
            private int FORM_SEQ;
            private String BUSINESS_CLASS;
            private List<XUANXIANGBean> XUANXIANG;
            private boolean che_color;
            private int form_id;

            public int getForm_id() {
                return form_id;
            }

            public void setForm_id(int form_id) {
                this.form_id = form_id;
            }

            public boolean isChe_color() {
                return che_color;
            }

            public void setChe_color(boolean che_color) {
                this.che_color = che_color;
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

            public List<XUANXIANGBean> getXUANXIANG() {
                return XUANXIANG;
            }

            public void setXUANXIANG(List<XUANXIANGBean> XUANXIANG) {
                this.XUANXIANG = XUANXIANG;
            }

            public static class XUANXIANGBean implements Serializable {


                private String GROUP_TAB;
                private int GROUP_TAB_ID;
                private List<WENJUANBean> WENJUAN;

                public String getGROUP_TAB() {
                    return GROUP_TAB;
                }

                public void setGROUP_TAB(String GROUP_TAB) {
                    this.GROUP_TAB = GROUP_TAB;
                }

                public int getGROUP_TAB_ID() {
                    return GROUP_TAB_ID;
                }

                public void setGROUP_TAB_ID(int GROUP_TAB_ID) {
                    this.GROUP_TAB_ID = GROUP_TAB_ID;
                }

                public List<WENJUANBean> getWENJUAN() {
                    return WENJUAN;
                }

                public void setWENJUAN(List<WENJUANBean> WENJUAN) {
                    this.WENJUAN = WENJUAN;
                }

                public static class WENJUANBean implements Serializable {


                    private int FACTOR_GROUP_SEQ;
                    private String FACTOR_GROUP_ID;
                    private String FACTOR_GROUP_NAME;
                    private List<SublistBean> sublist;

                    public int getFACTOR_GROUP_SEQ() {
                        return FACTOR_GROUP_SEQ;
                    }

                    public void setFACTOR_GROUP_SEQ(int FACTOR_GROUP_SEQ) {
                        this.FACTOR_GROUP_SEQ = FACTOR_GROUP_SEQ;
                    }

                    public String getFACTOR_GROUP_ID() {
                        return FACTOR_GROUP_ID;
                    }

                    public void setFACTOR_GROUP_ID(String FACTOR_GROUP_ID) {
                        this.FACTOR_GROUP_ID = FACTOR_GROUP_ID;
                    }

                    public String getFACTOR_GROUP_NAME() {
                        return FACTOR_GROUP_NAME;
                    }

                    public void setFACTOR_GROUP_NAME(String FACTOR_GROUP_NAME) {
                        this.FACTOR_GROUP_NAME = FACTOR_GROUP_NAME;
                    }

                    public List<SublistBean> getSublist() {
                        return sublist;
                    }

                    public void setSublist(List<SublistBean> sublist) {
                        this.sublist = sublist;
                    }

                    public static class SublistBean implements Serializable {


                        private int FACTOR_GROUP_ID;
                        private String FACTOR_GROUP_NAME;
                        private String FACTOR_GROUP_DESC;
                        private int FACTOR_GROUP_SEQ;
                        private Object GROUP_SHOW_LAYOUT;
                        private int RISK_FACTOR_ID;
                        private String RISK_FACTOR_NAME;
                        private int SCORE_SHOW_TYPE;
                        private int MUTEX_GROUP;
                        private String isslect;
                        private String ANALYSIS_SOURCE_STR;
                        private String CURRENT_DESC;
                        private List<OptionListBean> optionList;
                        private String shuruValue;
                        private boolean checked;


                        public boolean isChecked() {
                            return checked;
                        }

                        public void setChecked(boolean checked) {
                            this.checked = checked;
                        }

                        public String getShuruValue() {
                            return shuruValue;
                        }

                        public void setShuruValue(String shuruValue) {
                            this.shuruValue = shuruValue;
                        }

                        //                        public View getShuruValue() {
//                            return shuruValue;
//                        }
//
//                        public void setShuruValue(View shuruValue) {
//                            this.shuruValue = shuruValue;
//                        }

                        public int getFACTOR_GROUP_ID() {
                            return FACTOR_GROUP_ID;
                        }

                        public void setFACTOR_GROUP_ID(int FACTOR_GROUP_ID) {
                            this.FACTOR_GROUP_ID = FACTOR_GROUP_ID;
                        }

                        public String getFACTOR_GROUP_NAME() {
                            return FACTOR_GROUP_NAME;
                        }

                        public void setFACTOR_GROUP_NAME(String FACTOR_GROUP_NAME) {
                            this.FACTOR_GROUP_NAME = FACTOR_GROUP_NAME;
                        }

                        public String getFACTOR_GROUP_DESC() {
                            return FACTOR_GROUP_DESC;
                        }

                        public void setFACTOR_GROUP_DESC(String FACTOR_GROUP_DESC) {
                            this.FACTOR_GROUP_DESC = FACTOR_GROUP_DESC;
                        }

                        public int getFACTOR_GROUP_SEQ() {
                            return FACTOR_GROUP_SEQ;
                        }

                        public void setFACTOR_GROUP_SEQ(int FACTOR_GROUP_SEQ) {
                            this.FACTOR_GROUP_SEQ = FACTOR_GROUP_SEQ;
                        }

                        public Object getGROUP_SHOW_LAYOUT() {
                            return GROUP_SHOW_LAYOUT;
                        }

                        public void setGROUP_SHOW_LAYOUT(Object GROUP_SHOW_LAYOUT) {
                            this.GROUP_SHOW_LAYOUT = GROUP_SHOW_LAYOUT;
                        }

                        public int getRISK_FACTOR_ID() {
                            return RISK_FACTOR_ID;
                        }

                        public void setRISK_FACTOR_ID(int RISK_FACTOR_ID) {
                            this.RISK_FACTOR_ID = RISK_FACTOR_ID;
                        }

                        public String getRISK_FACTOR_NAME() {
                            return RISK_FACTOR_NAME;
                        }

                        public void setRISK_FACTOR_NAME(String RISK_FACTOR_NAME) {
                            this.RISK_FACTOR_NAME = RISK_FACTOR_NAME;
                        }

                        public int getSCORE_SHOW_TYPE() {
                            return SCORE_SHOW_TYPE;
                        }

                        public void setSCORE_SHOW_TYPE(int SCORE_SHOW_TYPE) {
                            this.SCORE_SHOW_TYPE = SCORE_SHOW_TYPE;
                        }

                        public int getMUTEX_GROUP() {
                            return MUTEX_GROUP;
                        }

                        public void setMUTEX_GROUP(int MUTEX_GROUP) {
                            this.MUTEX_GROUP = MUTEX_GROUP;
                        }

                        public String getIsslect() {
                            return isslect;
                        }

                        public void setIsslect(String isslect) {
                            this.isslect = isslect;
                        }

                        public String getANALYSIS_SOURCE_STR() {
                            return ANALYSIS_SOURCE_STR;
                        }

                        public void setANALYSIS_SOURCE_STR(String ANALYSIS_SOURCE_STR) {
                            this.ANALYSIS_SOURCE_STR = ANALYSIS_SOURCE_STR;
                        }

                        public String getCURRENT_DESC() {
                            return CURRENT_DESC;
                        }

                        public void setCURRENT_DESC(String CURRENT_DESC) {
                            this.CURRENT_DESC = CURRENT_DESC;
                        }

                        public List<OptionListBean> getOptionList() {
                            return optionList;
                        }

                        public void setOptionList(List<OptionListBean> optionList) {
                            this.optionList = optionList;
                        }

                        public static class OptionListBean implements Serializable {


                            private int RISK_FACTOR_ID;
                            private int FACTOR_OPTION_ID;
                            private String FACTOR_OPTION;
                            private String OPTION_TYPE;
                            private Object VALUE_START;
                            private Object VALUE_END;
                            private Object SEX;
                            private int AGE_BEGIN;
                            private int AGE_END;
                            private int RISK_SCORE;
                            private int CHANGE_FLAG;
                            private Object RISK_SCORE_CHANGE;
                            private int RISK_LEVEL;
                            private Object DISEASE_CODE;
                            private Object BAD_HABITS;
                            private Object BAD_HABITS_DESC;
                            private Object BAD_HABITS_IMPROVE;
                            private boolean itemChecked;

                            public boolean isItemChecked() {
                                return itemChecked;
                            }

                            public void setItemChecked(boolean itemChecked) {
                                this.itemChecked = itemChecked;
                            }

                            public int getRISK_FACTOR_ID() {
                                return RISK_FACTOR_ID;
                            }

                            public void setRISK_FACTOR_ID(int RISK_FACTOR_ID) {
                                this.RISK_FACTOR_ID = RISK_FACTOR_ID;
                            }

                            public int getFACTOR_OPTION_ID() {
                                return FACTOR_OPTION_ID;
                            }

                            public void setFACTOR_OPTION_ID(int FACTOR_OPTION_ID) {
                                this.FACTOR_OPTION_ID = FACTOR_OPTION_ID;
                            }

                            public String getFACTOR_OPTION() {
                                return FACTOR_OPTION;
                            }

                            public void setFACTOR_OPTION(String FACTOR_OPTION) {
                                this.FACTOR_OPTION = FACTOR_OPTION;
                            }

                            public String getOPTION_TYPE() {
                                return OPTION_TYPE;
                            }

                            public void setOPTION_TYPE(String OPTION_TYPE) {
                                this.OPTION_TYPE = OPTION_TYPE;
                            }

                            public Object getVALUE_START() {
                                return VALUE_START;
                            }

                            public void setVALUE_START(Object VALUE_START) {
                                this.VALUE_START = VALUE_START;
                            }

                            public Object getVALUE_END() {
                                return VALUE_END;
                            }

                            public void setVALUE_END(Object VALUE_END) {
                                this.VALUE_END = VALUE_END;
                            }

                            public Object getSEX() {
                                return SEX;
                            }

                            public void setSEX(Object SEX) {
                                this.SEX = SEX;
                            }

                            public int getAGE_BEGIN() {
                                return AGE_BEGIN;
                            }

                            public void setAGE_BEGIN(int AGE_BEGIN) {
                                this.AGE_BEGIN = AGE_BEGIN;
                            }

                            public int getAGE_END() {
                                return AGE_END;
                            }

                            public void setAGE_END(int AGE_END) {
                                this.AGE_END = AGE_END;
                            }

                            public int getRISK_SCORE() {
                                return RISK_SCORE;
                            }

                            public void setRISK_SCORE(int RISK_SCORE) {
                                this.RISK_SCORE = RISK_SCORE;
                            }

                            public int getCHANGE_FLAG() {
                                return CHANGE_FLAG;
                            }

                            public void setCHANGE_FLAG(int CHANGE_FLAG) {
                                this.CHANGE_FLAG = CHANGE_FLAG;
                            }

                            public Object getRISK_SCORE_CHANGE() {
                                return RISK_SCORE_CHANGE;
                            }

                            public void setRISK_SCORE_CHANGE(Object RISK_SCORE_CHANGE) {
                                this.RISK_SCORE_CHANGE = RISK_SCORE_CHANGE;
                            }

                            public int getRISK_LEVEL() {
                                return RISK_LEVEL;
                            }

                            public void setRISK_LEVEL(int RISK_LEVEL) {
                                this.RISK_LEVEL = RISK_LEVEL;
                            }

                            public Object getDISEASE_CODE() {
                                return DISEASE_CODE;
                            }

                            public void setDISEASE_CODE(Object DISEASE_CODE) {
                                this.DISEASE_CODE = DISEASE_CODE;
                            }

                            public Object getBAD_HABITS() {
                                return BAD_HABITS;
                            }

                            public void setBAD_HABITS(Object BAD_HABITS) {
                                this.BAD_HABITS = BAD_HABITS;
                            }

                            public Object getBAD_HABITS_DESC() {
                                return BAD_HABITS_DESC;
                            }

                            public void setBAD_HABITS_DESC(Object BAD_HABITS_DESC) {
                                this.BAD_HABITS_DESC = BAD_HABITS_DESC;
                            }

                            public Object getBAD_HABITS_IMPROVE() {
                                return BAD_HABITS_IMPROVE;
                            }

                            public void setBAD_HABITS_IMPROVE(Object BAD_HABITS_IMPROVE) {
                                this.BAD_HABITS_IMPROVE = BAD_HABITS_IMPROVE;
                            }
                        }
                    }
                }
            }
        }
    }
}
