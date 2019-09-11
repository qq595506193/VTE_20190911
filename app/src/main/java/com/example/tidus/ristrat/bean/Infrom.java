package com.example.tidus.ristrat.bean;

import java.util.List;

public class Infrom {


    /**
     * code : 0
     * message : 成功
     * server_params : {"PATIENT_ID":"1616235","DOCTOR_NAME":"1","REPORT_CODE":"HRA2019042700004","REPORT_ID":19,"PATIENT_NAME":"王宁宁","BIRTHDAY":"44","PATIENT_SEX":"女性","sublist":[{"REPORT_ID":19,"RISK_ID":181,"DISEASE_CODE":null,"RISK_NAME":"高危","CURRENT_RISK_LEVEL":"7","CURRENT_RISK_VALUE":3,"TARGET_RISK_LEVEL":null,"TARGET_RISK_VALUE":null,"RISK_DETAIL_DESC":null,"REPORT_CODE":"HRA2019042700004","REPORT_TIME":"20190415144000","PATIENT_ADVICE":"注意抬高患者，早期进行功能锻炼。注意平衡膳食，预防各种感染。注意观察病情，协助医生和护士完成积极的治疗措施。","DOCTOR_ADVICE":"预防处置建议：低分子肝素或低剂量普通肝素，联用机械性血栓预防措施，弹力袜或间歇充气压缩泵。 ","NURSE_ADVICE":"预防护理建议：在各种治疗操作中，注意保护血管。熟练使用各种物理预防措施：足底静脉泵。间歇充气加压装置。分级弹力袜。做好治疗措施，每三天评估一次。"}],"wxys":[{"FACTOR_GROUP_ID":1,"FACTOR_GROUP_NAME":"以下每项风险因素记 1 分","FACTOR_GROUP_SEQ":1,"REPORT_ID":19,"RISK_FACTOR_ID":1002,"RISK_FACTOR_NAME":"急性心肌梗塞","CURRENT_VALUE":"无","LAST_TIME_VALUE":"有","REFERENCE_RANGES_DESC":null,"FACTOR_SEQ":0},{"FACTOR_GROUP_ID":1,"FACTOR_GROUP_NAME":"以下每项风险因素记 1 分","FACTOR_GROUP_SEQ":1,"REPORT_ID":19,"RISK_FACTOR_ID":1001,"RISK_FACTOR_NAME":"年龄为41-59岁","CURRENT_VALUE":"有","LAST_TIME_VALUE":"无","REFERENCE_RANGES_DESC":null,"FACTOR_SEQ":0}]}
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
         * PATIENT_ID : 1616235
         * DOCTOR_NAME : 1
         * REPORT_CODE : HRA2019042700004
         * REPORT_ID : 19
         * PATIENT_NAME : 王宁宁
         * BIRTHDAY : 44
         * PATIENT_SEX : 女性
         * sublist : [{"REPORT_ID":19,"RISK_ID":181,"DISEASE_CODE":null,"RISK_NAME":"高危","CURRENT_RISK_LEVEL":"7","CURRENT_RISK_VALUE":3,"TARGET_RISK_LEVEL":null,"TARGET_RISK_VALUE":null,"RISK_DETAIL_DESC":null,"REPORT_CODE":"HRA2019042700004","REPORT_TIME":"20190415144000","PATIENT_ADVICE":"注意抬高患者，早期进行功能锻炼。注意平衡膳食，预防各种感染。注意观察病情，协助医生和护士完成积极的治疗措施。","DOCTOR_ADVICE":"预防处置建议：低分子肝素或低剂量普通肝素，联用机械性血栓预防措施，弹力袜或间歇充气压缩泵。 ","NURSE_ADVICE":"预防护理建议：在各种治疗操作中，注意保护血管。熟练使用各种物理预防措施：足底静脉泵。间歇充气加压装置。分级弹力袜。做好治疗措施，每三天评估一次。"}]
         * wxys : [{"FACTOR_GROUP_ID":1,"FACTOR_GROUP_NAME":"以下每项风险因素记 1 分","FACTOR_GROUP_SEQ":1,"REPORT_ID":19,"RISK_FACTOR_ID":1002,"RISK_FACTOR_NAME":"急性心肌梗塞","CURRENT_VALUE":"无","LAST_TIME_VALUE":"有","REFERENCE_RANGES_DESC":null,"FACTOR_SEQ":0},{"FACTOR_GROUP_ID":1,"FACTOR_GROUP_NAME":"以下每项风险因素记 1 分","FACTOR_GROUP_SEQ":1,"REPORT_ID":19,"RISK_FACTOR_ID":1001,"RISK_FACTOR_NAME":"年龄为41-59岁","CURRENT_VALUE":"有","LAST_TIME_VALUE":"无","REFERENCE_RANGES_DESC":null,"FACTOR_SEQ":0}]
         */

        private String PATIENT_ID;
        private String DOCTOR_NAME;
        private String REPORT_CODE;
        private int REPORT_ID;
        private String PATIENT_NAME;
        private String BIRTHDAY;
        private String PATIENT_SEX;
        private List<SublistBean> sublist;
        private List<WxysBean> wxys;

        public String getPATIENT_ID() { return PATIENT_ID;}

        public void setPATIENT_ID(String PATIENT_ID) { this.PATIENT_ID = PATIENT_ID;}

        public String getDOCTOR_NAME() { return DOCTOR_NAME;}

        public void setDOCTOR_NAME(String DOCTOR_NAME) { this.DOCTOR_NAME = DOCTOR_NAME;}

        public String getREPORT_CODE() { return REPORT_CODE;}

        public void setREPORT_CODE(String REPORT_CODE) { this.REPORT_CODE = REPORT_CODE;}

        public int getREPORT_ID() { return REPORT_ID;}

        public void setREPORT_ID(int REPORT_ID) { this.REPORT_ID = REPORT_ID;}

        public String getPATIENT_NAME() { return PATIENT_NAME;}

        public void setPATIENT_NAME(String PATIENT_NAME) { this.PATIENT_NAME = PATIENT_NAME;}

        public String getBIRTHDAY() { return BIRTHDAY;}

        public void setBIRTHDAY(String BIRTHDAY) { this.BIRTHDAY = BIRTHDAY;}

        public String getPATIENT_SEX() { return PATIENT_SEX;}

        public void setPATIENT_SEX(String PATIENT_SEX) { this.PATIENT_SEX = PATIENT_SEX;}

        public List<SublistBean> getSublist() { return sublist;}

        public void setSublist(List<SublistBean> sublist) { this.sublist = sublist;}

        public List<WxysBean> getWxys() { return wxys;}

        public void setWxys(List<WxysBean> wxys) { this.wxys = wxys;}

        public static class SublistBean {
            /**
             * REPORT_ID : 19
             * RISK_ID : 181
             * DISEASE_CODE : null
             * RISK_NAME : 高危
             * CURRENT_RISK_LEVEL : 7
             * CURRENT_RISK_VALUE : 3
             * TARGET_RISK_LEVEL : null
             * TARGET_RISK_VALUE : null
             * RISK_DETAIL_DESC : null
             * REPORT_CODE : HRA2019042700004
             * REPORT_TIME : 20190415144000
             * PATIENT_ADVICE : 注意抬高患者，早期进行功能锻炼。注意平衡膳食，预防各种感染。注意观察病情，协助医生和护士完成积极的治疗措施。
             * DOCTOR_ADVICE : 预防处置建议：低分子肝素或低剂量普通肝素，联用机械性血栓预防措施，弹力袜或间歇充气压缩泵。
             * NURSE_ADVICE : 预防护理建议：在各种治疗操作中，注意保护血管。熟练使用各种物理预防措施：足底静脉泵。间歇充气加压装置。分级弹力袜。做好治疗措施，每三天评估一次。
             */

            private int REPORT_ID;
            private int RISK_ID;
            private Object DISEASE_CODE;
            private String RISK_NAME;
            private String CURRENT_RISK_LEVEL;
            private int CURRENT_RISK_VALUE;
            private Object TARGET_RISK_LEVEL;
            private Object TARGET_RISK_VALUE;
            private Object RISK_DETAIL_DESC;
            private String REPORT_CODE;
            private String REPORT_TIME;
            private String PATIENT_ADVICE;
            private String DOCTOR_ADVICE;
            private String NURSE_ADVICE;

            public int getREPORT_ID() { return REPORT_ID;}

            public void setREPORT_ID(int REPORT_ID) { this.REPORT_ID = REPORT_ID;}

            public int getRISK_ID() { return RISK_ID;}

            public void setRISK_ID(int RISK_ID) { this.RISK_ID = RISK_ID;}

            public Object getDISEASE_CODE() { return DISEASE_CODE;}

            public void setDISEASE_CODE(Object DISEASE_CODE) { this.DISEASE_CODE = DISEASE_CODE;}

            public String getRISK_NAME() { return RISK_NAME;}

            public void setRISK_NAME(String RISK_NAME) { this.RISK_NAME = RISK_NAME;}

            public String getCURRENT_RISK_LEVEL() { return CURRENT_RISK_LEVEL;}

            public void setCURRENT_RISK_LEVEL(String CURRENT_RISK_LEVEL) { this.CURRENT_RISK_LEVEL = CURRENT_RISK_LEVEL;}

            public int getCURRENT_RISK_VALUE() { return CURRENT_RISK_VALUE;}

            public void setCURRENT_RISK_VALUE(int CURRENT_RISK_VALUE) { this.CURRENT_RISK_VALUE = CURRENT_RISK_VALUE;}

            public Object getTARGET_RISK_LEVEL() { return TARGET_RISK_LEVEL;}

            public void setTARGET_RISK_LEVEL(Object TARGET_RISK_LEVEL) { this.TARGET_RISK_LEVEL = TARGET_RISK_LEVEL;}

            public Object getTARGET_RISK_VALUE() { return TARGET_RISK_VALUE;}

            public void setTARGET_RISK_VALUE(Object TARGET_RISK_VALUE) { this.TARGET_RISK_VALUE = TARGET_RISK_VALUE;}

            public Object getRISK_DETAIL_DESC() { return RISK_DETAIL_DESC;}

            public void setRISK_DETAIL_DESC(Object RISK_DETAIL_DESC) { this.RISK_DETAIL_DESC = RISK_DETAIL_DESC;}

            public String getREPORT_CODE() { return REPORT_CODE;}

            public void setREPORT_CODE(String REPORT_CODE) { this.REPORT_CODE = REPORT_CODE;}

            public String getREPORT_TIME() { return REPORT_TIME;}

            public void setREPORT_TIME(String REPORT_TIME) { this.REPORT_TIME = REPORT_TIME;}

            public String getPATIENT_ADVICE() { return PATIENT_ADVICE;}

            public void setPATIENT_ADVICE(String PATIENT_ADVICE) { this.PATIENT_ADVICE = PATIENT_ADVICE;}

            public String getDOCTOR_ADVICE() { return DOCTOR_ADVICE;}

            public void setDOCTOR_ADVICE(String DOCTOR_ADVICE) { this.DOCTOR_ADVICE = DOCTOR_ADVICE;}

            public String getNURSE_ADVICE() { return NURSE_ADVICE;}

            public void setNURSE_ADVICE(String NURSE_ADVICE) { this.NURSE_ADVICE = NURSE_ADVICE;}
        }

        public static class WxysBean {
            /**
             * FACTOR_GROUP_ID : 1
             * FACTOR_GROUP_NAME : 以下每项风险因素记 1 分
             * FACTOR_GROUP_SEQ : 1
             * REPORT_ID : 19
             * RISK_FACTOR_ID : 1002
             * RISK_FACTOR_NAME : 急性心肌梗塞
             * CURRENT_VALUE : 无
             * LAST_TIME_VALUE : 有
             * REFERENCE_RANGES_DESC : null
             * FACTOR_SEQ : 0
             */

            private int FACTOR_GROUP_ID;
            private String FACTOR_GROUP_NAME;
            private int FACTOR_GROUP_SEQ;
            private int REPORT_ID;
            private int RISK_FACTOR_ID;
            private String RISK_FACTOR_NAME;
            private String CURRENT_VALUE;
            private String LAST_TIME_VALUE;
            private Object REFERENCE_RANGES_DESC;
            private int FACTOR_SEQ;

            public int getFACTOR_GROUP_ID() { return FACTOR_GROUP_ID;}

            public void setFACTOR_GROUP_ID(int FACTOR_GROUP_ID) { this.FACTOR_GROUP_ID = FACTOR_GROUP_ID;}

            public String getFACTOR_GROUP_NAME() { return FACTOR_GROUP_NAME;}

            public void setFACTOR_GROUP_NAME(String FACTOR_GROUP_NAME) { this.FACTOR_GROUP_NAME = FACTOR_GROUP_NAME;}

            public int getFACTOR_GROUP_SEQ() { return FACTOR_GROUP_SEQ;}

            public void setFACTOR_GROUP_SEQ(int FACTOR_GROUP_SEQ) { this.FACTOR_GROUP_SEQ = FACTOR_GROUP_SEQ;}

            public int getREPORT_ID() { return REPORT_ID;}

            public void setREPORT_ID(int REPORT_ID) { this.REPORT_ID = REPORT_ID;}

            public int getRISK_FACTOR_ID() { return RISK_FACTOR_ID;}

            public void setRISK_FACTOR_ID(int RISK_FACTOR_ID) { this.RISK_FACTOR_ID = RISK_FACTOR_ID;}

            public String getRISK_FACTOR_NAME() { return RISK_FACTOR_NAME;}

            public void setRISK_FACTOR_NAME(String RISK_FACTOR_NAME) { this.RISK_FACTOR_NAME = RISK_FACTOR_NAME;}

            public String getCURRENT_VALUE() { return CURRENT_VALUE;}

            public void setCURRENT_VALUE(String CURRENT_VALUE) { this.CURRENT_VALUE = CURRENT_VALUE;}

            public String getLAST_TIME_VALUE() { return LAST_TIME_VALUE;}

            public void setLAST_TIME_VALUE(String LAST_TIME_VALUE) { this.LAST_TIME_VALUE = LAST_TIME_VALUE;}

            public Object getREFERENCE_RANGES_DESC() { return REFERENCE_RANGES_DESC;}

            public void setREFERENCE_RANGES_DESC(Object REFERENCE_RANGES_DESC) { this.REFERENCE_RANGES_DESC = REFERENCE_RANGES_DESC;}

            public int getFACTOR_SEQ() { return FACTOR_SEQ;}

            public void setFACTOR_SEQ(int FACTOR_SEQ) { this.FACTOR_SEQ = FACTOR_SEQ;}
        }
    }
}
