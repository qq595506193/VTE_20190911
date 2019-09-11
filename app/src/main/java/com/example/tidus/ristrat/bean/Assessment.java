package com.example.tidus.ristrat.bean;

import java.util.List;

public class Assessment {

    /**
     * code : 0
     * message : 成功
     * server_params : [{"TOPIC_ID":8001,"TOPIC_NAME":"VTE风险评估问卷","GATHER_TYPE":"30"},{"TOPIC_ID":8000,"TOPIC_NAME":"疾病风险评估问卷","GATHER_TYPE":"20"}]
     * server_code :
     */

    private String code;
    private String message;
    private String server_code;
    private List<ServerParamsBean> server_params;

    public String getCode() { return code;}

    public void setCode(String code) { this.code = code;}

    public String getMessage() { return message;}

    public void setMessage(String message) { this.message = message;}

    public String getServer_code() { return server_code;}

    public void setServer_code(String server_code) { this.server_code = server_code;}

    public List<ServerParamsBean> getServer_params() { return server_params;}

    public void setServer_params(List<ServerParamsBean> server_params) { this.server_params = server_params;}

    public static class ServerParamsBean {
        /**
         * TOPIC_ID : 8001
         * TOPIC_NAME : VTE风险评估问卷
         * GATHER_TYPE : 30
         */

        private int TOPIC_ID;
        private String TOPIC_NAME;
        private String GATHER_TYPE;

        public int getTOPIC_ID() { return TOPIC_ID;}

        public void setTOPIC_ID(int TOPIC_ID) { this.TOPIC_ID = TOPIC_ID;}

        public String getTOPIC_NAME() { return TOPIC_NAME;}

        public void setTOPIC_NAME(String TOPIC_NAME) { this.TOPIC_NAME = TOPIC_NAME;}

        public String getGATHER_TYPE() { return GATHER_TYPE;}

        public void setGATHER_TYPE(String GATHER_TYPE) { this.GATHER_TYPE = GATHER_TYPE;}
    }
}
