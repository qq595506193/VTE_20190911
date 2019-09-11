package com.example.tidus.ristrat.bean;

import java.util.List;

public class ReportBean {


    /**
     * code : 0
     * message : 成功
     * server_params : [{"TOPIC_ID":8001,"CURRENT_RISK_LEVEL":"7","RISK_NAME":"高危","INTEGRAL_BEGIN":2,"INTEGRAL_END":4,"LEVEL_COLOR":"#fed700","RISK_ABBR":"高危","RISK_DETAIL_DESC":"DVT发生率：20～40%。 ","PATIENT_ADVICE":"注意抬高患者，早期进行功能锻炼。注意平衡膳食，预防各种感染。注意观察病情，协助医生和护士完成积极的治疗措施。","DOCTOR_ADVICE":"预防处置建议：低分子肝素或低剂量普通肝素，联用机械性血栓预防措施，弹力袜或间歇充气压缩泵。 ","NURSE_ADVICE":"预防护理建议：在各种治疗操作中，注意保护血管。熟练使用各种物理预防措施：足底静脉泵。间歇充气加压装置。分级弹力袜。做好治疗措施，每三天评估一次。 "},{"TOPIC_ID":8001,"CURRENT_RISK_LEVEL":"8","RISK_NAME":"极高危","INTEGRAL_BEGIN":5,"INTEGRAL_END":200,"LEVEL_COLOR":"#ff7e00","RISK_ABBR":"极高","RISK_DETAIL_DESC":"DVT发生率：40～80%，死亡率1～5%。 ","PATIENT_ADVICE":"注意观察病情，协助医生和护士完成积极的治疗措施。做好患者的生活照顾，调节患者的心理。","DOCTOR_ADVICE":"预防处置建议：低分子肝素或低剂量普通肝素，联用机械性血栓预防措施弹力袜或间歇充气压缩泵，且延长低分子肝素出院后的使用时间 ","NURSE_ADVICE":"预防护理建议：在各种治疗操作中，注意保护血管。熟练使用各种物理预防措施：足底静脉泵。间歇充气加压装置。分级弹力袜。做好治疗措施，每三天评估一次。"},{"TOPIC_ID":8001,"CURRENT_RISK_LEVEL":"9","RISK_NAME":"确诊","INTEGRAL_BEGIN":200,"INTEGRAL_END":500,"LEVEL_COLOR":"#ff4e6b","RISK_ABBR":"确诊","RISK_DETAIL_DESC":"DVT发生率：40～80%，死亡率1～5%。 ","PATIENT_ADVICE":"注意观察病情，协助医生和护士完成积极的治疗措施。做好患者的生活照顾，调节患者的心理。","DOCTOR_ADVICE":"预防处置建议：低分子肝素或低剂量普通肝素，联用机械性血栓预防措施弹力袜或间歇充气压缩泵，且延长低分子肝素出院后的使用时间 ","NURSE_ADVICE":"预防护理建议：在各种治疗操作中，注意保护血管。熟练使用各种物理预防措施：足底静脉泵。间歇充气加压装置。分级弹力袜。做好治疗措施，每三天评估一次。"}]
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
         * CURRENT_RISK_LEVEL : 7
         * RISK_NAME : 高危
         * INTEGRAL_BEGIN : 2
         * INTEGRAL_END : 4
         * LEVEL_COLOR : #fed700
         * RISK_ABBR : 高危
         * RISK_DETAIL_DESC : DVT发生率：20～40%。
         * PATIENT_ADVICE : 注意抬高患者，早期进行功能锻炼。注意平衡膳食，预防各种感染。注意观察病情，协助医生和护士完成积极的治疗措施。
         * DOCTOR_ADVICE : 预防处置建议：低分子肝素或低剂量普通肝素，联用机械性血栓预防措施，弹力袜或间歇充气压缩泵。
         * NURSE_ADVICE : 预防护理建议：在各种治疗操作中，注意保护血管。熟练使用各种物理预防措施：足底静脉泵。间歇充气加压装置。分级弹力袜。做好治疗措施，每三天评估一次。
         */

        private int TOPIC_ID;
        private String CURRENT_RISK_LEVEL;
        private String RISK_NAME;
        private int INTEGRAL_BEGIN;
        private int INTEGRAL_END;
        private String LEVEL_COLOR;
        private String RISK_ABBR;
        private String RISK_DETAIL_DESC;
        private String PATIENT_ADVICE;
        private String DOCTOR_ADVICE;
        private String NURSE_ADVICE;

        public int getTOPIC_ID() { return TOPIC_ID;}

        public void setTOPIC_ID(int TOPIC_ID) { this.TOPIC_ID = TOPIC_ID;}

        public String getCURRENT_RISK_LEVEL() { return CURRENT_RISK_LEVEL;}

        public void setCURRENT_RISK_LEVEL(String CURRENT_RISK_LEVEL) { this.CURRENT_RISK_LEVEL = CURRENT_RISK_LEVEL;}

        public String getRISK_NAME() { return RISK_NAME;}

        public void setRISK_NAME(String RISK_NAME) { this.RISK_NAME = RISK_NAME;}

        public int getINTEGRAL_BEGIN() { return INTEGRAL_BEGIN;}

        public void setINTEGRAL_BEGIN(int INTEGRAL_BEGIN) { this.INTEGRAL_BEGIN = INTEGRAL_BEGIN;}

        public int getINTEGRAL_END() { return INTEGRAL_END;}

        public void setINTEGRAL_END(int INTEGRAL_END) { this.INTEGRAL_END = INTEGRAL_END;}

        public String getLEVEL_COLOR() { return LEVEL_COLOR;}

        public void setLEVEL_COLOR(String LEVEL_COLOR) { this.LEVEL_COLOR = LEVEL_COLOR;}

        public String getRISK_ABBR() { return RISK_ABBR;}

        public void setRISK_ABBR(String RISK_ABBR) { this.RISK_ABBR = RISK_ABBR;}

        public String getRISK_DETAIL_DESC() { return RISK_DETAIL_DESC;}

        public void setRISK_DETAIL_DESC(String RISK_DETAIL_DESC) { this.RISK_DETAIL_DESC = RISK_DETAIL_DESC;}

        public String getPATIENT_ADVICE() { return PATIENT_ADVICE;}

        public void setPATIENT_ADVICE(String PATIENT_ADVICE) { this.PATIENT_ADVICE = PATIENT_ADVICE;}

        public String getDOCTOR_ADVICE() { return DOCTOR_ADVICE;}

        public void setDOCTOR_ADVICE(String DOCTOR_ADVICE) { this.DOCTOR_ADVICE = DOCTOR_ADVICE;}

        public String getNURSE_ADVICE() { return NURSE_ADVICE;}

        public void setNURSE_ADVICE(String NURSE_ADVICE) { this.NURSE_ADVICE = NURSE_ADVICE;}
    }
}
