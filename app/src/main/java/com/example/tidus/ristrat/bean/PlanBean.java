package com.example.tidus.ristrat.bean;

import java.util.List;

public class PlanBean {

    /**
     * code : 0
     * message : 成功
     * server_params : {"count":1,"list":[{"MERCHANT_ID":5,"SERVICE_PLAN_ID":1002529,"SERVICE_PLAN":"898989","SERVICE_PLAN_DESC":null,"VALID_START_TIME":"20190422000000","VALID_END_TIME":"20190428235959","USED_FLAG":10,"OFFICE_ID":null,"CUSTOMER_RANGE":10,"CLIENT_TYPE":null,"SERVICE_TYPE":"Users","CREATE_TIME":"20190422174350","FLAG_UPDATE_TIME":null,"START_TIME":"20190425174346","USER_ID":8,"AVERAGE":0,"PLAN_START_PROMPT":"尊敬的患者您好，我们是中山大学肿瘤防治中心，为了更好的为您服务，希望您能配合完成本次医疗随访。","PLAN_END_PROMPT":"您好，本次医疗随访已完成，感谢您的配合，祝您身体健康！","PLAN_OBJECT":"Patient","CREATE_STEP":null,"USER_NAME":"医疗助理","OFFICE_NAME":null,"RN":1}]}
     * server_code :
     */

    private String code;
    private String message;
    private ServerParamsBean server_params;
    private String server_code;

    public String getCode() { return code;}

    public void setCode(String code) { this.code = code;}

    public String getMessage() { return message;}

    public void setMessage(String message) { this.message = message;}

    public ServerParamsBean getServer_params() { return server_params;}

    public void setServer_params(ServerParamsBean server_params) { this.server_params = server_params;}

    public String getServer_code() { return server_code;}

    public void setServer_code(String server_code) { this.server_code = server_code;}

    public static class ServerParamsBean {
        /**
         * count : 1
         * list : [{"MERCHANT_ID":5,"SERVICE_PLAN_ID":1002529,"SERVICE_PLAN":"898989","SERVICE_PLAN_DESC":null,"VALID_START_TIME":"20190422000000","VALID_END_TIME":"20190428235959","USED_FLAG":10,"OFFICE_ID":null,"CUSTOMER_RANGE":10,"CLIENT_TYPE":null,"SERVICE_TYPE":"Users","CREATE_TIME":"20190422174350","FLAG_UPDATE_TIME":null,"START_TIME":"20190425174346","USER_ID":8,"AVERAGE":0,"PLAN_START_PROMPT":"尊敬的患者您好，我们是中山大学肿瘤防治中心，为了更好的为您服务，希望您能配合完成本次医疗随访。","PLAN_END_PROMPT":"您好，本次医疗随访已完成，感谢您的配合，祝您身体健康！","PLAN_OBJECT":"Patient","CREATE_STEP":null,"USER_NAME":"医疗助理","OFFICE_NAME":null,"RN":1}]
         */

        private int count;
        private List<ListBean> list;

        public int getCount() { return count;}

        public void setCount(int count) { this.count = count;}

        public List<ListBean> getList() { return list;}

        public void setList(List<ListBean> list) { this.list = list;}

        public static class ListBean {
            /**
             * MERCHANT_ID : 5
             * SERVICE_PLAN_ID : 1002529
             * SERVICE_PLAN : 898989
             * SERVICE_PLAN_DESC : null
             * VALID_START_TIME : 20190422000000
             * VALID_END_TIME : 20190428235959
             * USED_FLAG : 10
             * OFFICE_ID : null
             * CUSTOMER_RANGE : 10
             * CLIENT_TYPE : null
             * SERVICE_TYPE : Users
             * CREATE_TIME : 20190422174350
             * FLAG_UPDATE_TIME : null
             * START_TIME : 20190425174346
             * USER_ID : 8
             * AVERAGE : 0
             * PLAN_START_PROMPT : 尊敬的患者您好，我们是中山大学肿瘤防治中心，为了更好的为您服务，希望您能配合完成本次医疗随访。
             * PLAN_END_PROMPT : 您好，本次医疗随访已完成，感谢您的配合，祝您身体健康！
             * PLAN_OBJECT : Patient
             * CREATE_STEP : null
             * USER_NAME : 医疗助理
             * OFFICE_NAME : null
             * RN : 1
             */

            private int MERCHANT_ID;
            private int SERVICE_PLAN_ID;
            private String SERVICE_PLAN;
            private Object SERVICE_PLAN_DESC;
            private String VALID_START_TIME;
            private String VALID_END_TIME;
            private int USED_FLAG;
            private Object OFFICE_ID;
            private int CUSTOMER_RANGE;
            private Object CLIENT_TYPE;
            private String SERVICE_TYPE;
            private String CREATE_TIME;
            private Object FLAG_UPDATE_TIME;
            private String START_TIME;
            private int USER_ID;
            private int AVERAGE;
            private String PLAN_START_PROMPT;
            private String PLAN_END_PROMPT;
            private String PLAN_OBJECT;
            private Object CREATE_STEP;
            private String USER_NAME;
            private Object OFFICE_NAME;
            private int RN;

            public int getMERCHANT_ID() { return MERCHANT_ID;}

            public void setMERCHANT_ID(int MERCHANT_ID) { this.MERCHANT_ID = MERCHANT_ID;}

            public int getSERVICE_PLAN_ID() { return SERVICE_PLAN_ID;}

            public void setSERVICE_PLAN_ID(int SERVICE_PLAN_ID) { this.SERVICE_PLAN_ID = SERVICE_PLAN_ID;}

            public String getSERVICE_PLAN() { return SERVICE_PLAN;}

            public void setSERVICE_PLAN(String SERVICE_PLAN) { this.SERVICE_PLAN = SERVICE_PLAN;}

            public Object getSERVICE_PLAN_DESC() { return SERVICE_PLAN_DESC;}

            public void setSERVICE_PLAN_DESC(Object SERVICE_PLAN_DESC) { this.SERVICE_PLAN_DESC = SERVICE_PLAN_DESC;}

            public String getVALID_START_TIME() { return VALID_START_TIME;}

            public void setVALID_START_TIME(String VALID_START_TIME) { this.VALID_START_TIME = VALID_START_TIME;}

            public String getVALID_END_TIME() { return VALID_END_TIME;}

            public void setVALID_END_TIME(String VALID_END_TIME) { this.VALID_END_TIME = VALID_END_TIME;}

            public int getUSED_FLAG() { return USED_FLAG;}

            public void setUSED_FLAG(int USED_FLAG) { this.USED_FLAG = USED_FLAG;}

            public Object getOFFICE_ID() { return OFFICE_ID;}

            public void setOFFICE_ID(Object OFFICE_ID) { this.OFFICE_ID = OFFICE_ID;}

            public int getCUSTOMER_RANGE() { return CUSTOMER_RANGE;}

            public void setCUSTOMER_RANGE(int CUSTOMER_RANGE) { this.CUSTOMER_RANGE = CUSTOMER_RANGE;}

            public Object getCLIENT_TYPE() { return CLIENT_TYPE;}

            public void setCLIENT_TYPE(Object CLIENT_TYPE) { this.CLIENT_TYPE = CLIENT_TYPE;}

            public String getSERVICE_TYPE() { return SERVICE_TYPE;}

            public void setSERVICE_TYPE(String SERVICE_TYPE) { this.SERVICE_TYPE = SERVICE_TYPE;}

            public String getCREATE_TIME() { return CREATE_TIME;}

            public void setCREATE_TIME(String CREATE_TIME) { this.CREATE_TIME = CREATE_TIME;}

            public Object getFLAG_UPDATE_TIME() { return FLAG_UPDATE_TIME;}

            public void setFLAG_UPDATE_TIME(Object FLAG_UPDATE_TIME) { this.FLAG_UPDATE_TIME = FLAG_UPDATE_TIME;}

            public String getSTART_TIME() { return START_TIME;}

            public void setSTART_TIME(String START_TIME) { this.START_TIME = START_TIME;}

            public int getUSER_ID() { return USER_ID;}

            public void setUSER_ID(int USER_ID) { this.USER_ID = USER_ID;}

            public int getAVERAGE() { return AVERAGE;}

            public void setAVERAGE(int AVERAGE) { this.AVERAGE = AVERAGE;}

            public String getPLAN_START_PROMPT() { return PLAN_START_PROMPT;}

            public void setPLAN_START_PROMPT(String PLAN_START_PROMPT) { this.PLAN_START_PROMPT = PLAN_START_PROMPT;}

            public String getPLAN_END_PROMPT() { return PLAN_END_PROMPT;}

            public void setPLAN_END_PROMPT(String PLAN_END_PROMPT) { this.PLAN_END_PROMPT = PLAN_END_PROMPT;}

            public String getPLAN_OBJECT() { return PLAN_OBJECT;}

            public void setPLAN_OBJECT(String PLAN_OBJECT) { this.PLAN_OBJECT = PLAN_OBJECT;}

            public Object getCREATE_STEP() { return CREATE_STEP;}

            public void setCREATE_STEP(Object CREATE_STEP) { this.CREATE_STEP = CREATE_STEP;}

            public String getUSER_NAME() { return USER_NAME;}

            public void setUSER_NAME(String USER_NAME) { this.USER_NAME = USER_NAME;}

            public Object getOFFICE_NAME() { return OFFICE_NAME;}

            public void setOFFICE_NAME(Object OFFICE_NAME) { this.OFFICE_NAME = OFFICE_NAME;}

            public int getRN() { return RN;}

            public void setRN(int RN) { this.RN = RN;}
        }
    }
}
