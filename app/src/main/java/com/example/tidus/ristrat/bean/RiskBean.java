package com.example.tidus.ristrat.bean;

import android.os.Parcelable;

import java.io.Serializable;
import java.util.List;

public class RiskBean {

    /**
     * code : 0
     * message : 成功
     * server_params : [{"RISK_FACTOR_ID":1001,"RISK_FACTOR_NAME":"年龄为41-46岁","FACTOR_GROUP_ID":1,"FACTOR_GROUP_NAME":"以下每项风险因素记 1 分","FACTOR_GROUP_SEQ":1,"FACTOR_SEQ":1},{"RISK_FACTOR_ID":1002,"RISK_FACTOR_NAME":"急性心肌梗塞","FACTOR_GROUP_ID":1,"FACTOR_GROUP_NAME":"以下每项风险因素记 1 分","FACTOR_GROUP_SEQ":1,"FACTOR_SEQ":2},{"RISK_FACTOR_ID":1003,"RISK_FACTOR_NAME":"下肢水肿(现患)","FACTOR_GROUP_ID":1,"FACTOR_GROUP_NAME":"以下每项风险因素记 1 分","FACTOR_GROUP_SEQ":1,"FACTOR_SEQ":3},{"RISK_FACTOR_ID":1004,"RISK_FACTOR_NAME":"充血性心力衰竭(<1个月)","FACTOR_GROUP_ID":1,"FACTOR_GROUP_NAME":"以下每项风险因素记 1 分","FACTOR_GROUP_SEQ":1,"FACTOR_SEQ":4},{"RISK_FACTOR_ID":1005,"RISK_FACTOR_NAME":"静脉曲张□卧床内科患者","FACTOR_GROUP_ID":1,"FACTOR_GROUP_NAME":"以下每项风险因素记 1 分","FACTOR_GROUP_SEQ":1,"FACTOR_SEQ":5},{"RISK_FACTOR_ID":1006,"RISK_FACTOR_NAME":"肥胖(BMI≥25)","FACTOR_GROUP_ID":1,"FACTOR_GROUP_NAME":"以下每项风险因素记 1 分","FACTOR_GROUP_SEQ":1,"FACTOR_SEQ":6},{"RISK_FACTOR_ID":1007,"RISK_FACTOR_NAME":"炎症性肠病史","FACTOR_GROUP_ID":1,"FACTOR_GROUP_NAME":"以下每项风险因素记 1 分","FACTOR_GROUP_SEQ":1,"FACTOR_SEQ":7},{"RISK_FACTOR_ID":1008,"RISK_FACTOR_NAME":"计划小手术","FACTOR_GROUP_ID":1,"FACTOR_GROUP_NAME":"以下每项风险因素记 1 分","FACTOR_GROUP_SEQ":1,"FACTOR_SEQ":8},{"RISK_FACTOR_ID":1009,"RISK_FACTOR_NAME":"大手术史(<1个月)","FACTOR_GROUP_ID":1,"FACTOR_GROUP_NAME":"以下每项风险因素记 1 分","FACTOR_GROUP_SEQ":1,"FACTOR_SEQ":9},{"RISK_FACTOR_ID":1010,"RISK_FACTOR_NAME":"败血症","FACTOR_GROUP_ID":1,"FACTOR_GROUP_NAME":"以下每项风险因素记 1 分","FACTOR_GROUP_SEQ":1,"FACTOR_SEQ":10},{"RISK_FACTOR_ID":1011,"RISK_FACTOR_NAME":"肺功能异常(COPO)","FACTOR_GROUP_ID":1,"FACTOR_GROUP_NAME":"以下每项风险因素记 1 分","FACTOR_GROUP_SEQ":1,"FACTOR_SEQ":11},{"RISK_FACTOR_ID":1012,"RISK_FACTOR_NAME":"严重肺部疾病、含肺炎(<1月)","FACTOR_GROUP_ID":1,"FACTOR_GROUP_NAME":"以下每项风险因素记 1 分","FACTOR_GROUP_SEQ":1,"FACTOR_SEQ":12},{"RISK_FACTOR_ID":1013,"RISK_FACTOR_NAME":"口服避孕药或雌激素替代治疗","FACTOR_GROUP_ID":1,"FACTOR_GROUP_NAME":"以下每项风险因素记 1 分","FACTOR_GROUP_SEQ":1,"FACTOR_SEQ":13},{"RISK_FACTOR_ID":1014,"RISK_FACTOR_NAME":"妊娠期或产后(<1个月)","FACTOR_GROUP_ID":1,"FACTOR_GROUP_NAME":"以下每项风险因素记 1 分","FACTOR_GROUP_SEQ":1,"FACTOR_SEQ":14},{"RISK_FACTOR_ID":1015,"RISK_FACTOR_NAME":"不明原因死产，习惯性流产(≥3次)，早产伴有新生而","FACTOR_GROUP_ID":1,"FACTOR_GROUP_NAME":"以下每项风险因素记 1 分","FACTOR_GROUP_SEQ":1,"FACTOR_SEQ":15},{"RISK_FACTOR_ID":1016,"RISK_FACTOR_NAME":"儿毒血症或发育受限","FACTOR_GROUP_ID":1,"FACTOR_GROUP_NAME":"以下每项风险因素记 1 分","FACTOR_GROUP_SEQ":1,"FACTOR_SEQ":16},{"RISK_FACTOR_ID":1017,"RISK_FACTOR_NAME":"其他风险因素","FACTOR_GROUP_ID":1,"FACTOR_GROUP_NAME":"以下每项风险因素记 1 分","FACTOR_GROUP_SEQ":1,"FACTOR_SEQ":17},{"RISK_FACTOR_ID":1018,"RISK_FACTOR_NAME":"年龄60-64岁","FACTOR_GROUP_ID":2,"FACTOR_GROUP_NAME":"以下每项风险因素记 2 分","FACTOR_GROUP_SEQ":2,"FACTOR_SEQ":18},{"RISK_FACTOR_ID":1019,"RISK_FACTOR_NAME":"中心静脉置管","FACTOR_GROUP_ID":2,"FACTOR_GROUP_NAME":"以下每项风险因素记 2 分","FACTOR_GROUP_SEQ":2,"FACTOR_SEQ":19},{"RISK_FACTOR_ID":1020,"RISK_FACTOR_NAME":"关节镜手术","FACTOR_GROUP_ID":2,"FACTOR_GROUP_NAME":"以下每项风险因素记 2 分","FACTOR_GROUP_SEQ":2,"FACTOR_SEQ":20},{"RISK_FACTOR_ID":1021,"RISK_FACTOR_NAME":"大手术(45分)","FACTOR_GROUP_ID":2,"FACTOR_GROUP_NAME":"以下每项风险因素记 2 分","FACTOR_GROUP_SEQ":2,"FACTOR_SEQ":21},{"RISK_FACTOR_ID":1022,"RISK_FACTOR_NAME":"恶性肿瘤(既往或现患)","FACTOR_GROUP_ID":2,"FACTOR_GROUP_NAME":"以下每项风险因素记 2 分","FACTOR_GROUP_SEQ":2,"FACTOR_SEQ":22},{"RISK_FACTOR_ID":1023,"RISK_FACTOR_NAME":"腹腔镜手术数(>45分)","FACTOR_GROUP_ID":2,"FACTOR_GROUP_NAME":"以下每项风险因素记 2 分","FACTOR_GROUP_SEQ":2,"FACTOR_SEQ":23},{"RISK_FACTOR_ID":1024,"RISK_FACTOR_NAME":"患者需要卧床(>72小时)","FACTOR_GROUP_ID":2,"FACTOR_GROUP_NAME":"以下每项风险因素记 2 分","FACTOR_GROUP_SEQ":2,"FACTOR_SEQ":24},{"RISK_FACTOR_ID":1025,"RISK_FACTOR_NAME":"石膏固定(<1个月)","FACTOR_GROUP_ID":2,"FACTOR_GROUP_NAME":"以下每项风险因素记 2 分","FACTOR_GROUP_SEQ":2,"FACTOR_SEQ":25},{"RISK_FACTOR_ID":1026,"RISK_FACTOR_NAME":"年龄≥75岁","FACTOR_GROUP_ID":3,"FACTOR_GROUP_NAME":"以下每项风险因素记 3 分","FACTOR_GROUP_SEQ":3,"FACTOR_SEQ":26},{"RISK_FACTOR_ID":1027,"RISK_FACTOR_NAME":"血栓家庭病史","FACTOR_GROUP_ID":3,"FACTOR_GROUP_NAME":"以下每项风险因素记 3 分","FACTOR_GROUP_SEQ":3,"FACTOR_SEQ":27},{"RISK_FACTOR_ID":1028,"RISK_FACTOR_NAME":"DVT/PE患者史","FACTOR_GROUP_ID":3,"FACTOR_GROUP_NAME":"以下每项风险因素记 3 分","FACTOR_GROUP_SEQ":3,"FACTOR_SEQ":28},{"RISK_FACTOR_ID":1029,"RISK_FACTOR_NAME":"凝血酶原20120A阳性","FACTOR_GROUP_ID":3,"FACTOR_GROUP_NAME":"以下每项风险因素记 3 分","FACTOR_GROUP_SEQ":3,"FACTOR_SEQ":29},{"RISK_FACTOR_ID":1030,"RISK_FACTOR_NAME":"因子VLeiden阳性","FACTOR_GROUP_ID":3,"FACTOR_GROUP_NAME":"以下每项风险因素记 3 分","FACTOR_GROUP_SEQ":3,"FACTOR_SEQ":30},{"RISK_FACTOR_ID":1031,"RISK_FACTOR_NAME":"狼疮抗凝物阳性","FACTOR_GROUP_ID":3,"FACTOR_GROUP_NAME":"以下每项风险因素记 3 分","FACTOR_GROUP_SEQ":3,"FACTOR_SEQ":31},{"RISK_FACTOR_ID":1032,"RISK_FACTOR_NAME":"血清同型半胱氨酸升高","FACTOR_GROUP_ID":3,"FACTOR_GROUP_NAME":"以下每项风险因素记 3 分","FACTOR_GROUP_SEQ":3,"FACTOR_SEQ":32},{"RISK_FACTOR_ID":1033,"RISK_FACTOR_NAME":"肝素引起的血小板减少(HIT)","FACTOR_GROUP_ID":3,"FACTOR_GROUP_NAME":"以下每项风险因素记 3 分","FACTOR_GROUP_SEQ":3,"FACTOR_SEQ":33},{"RISK_FACTOR_ID":1034,"RISK_FACTOR_NAME":"抗性磷脂抗体升高","FACTOR_GROUP_ID":3,"FACTOR_GROUP_NAME":"以下每项风险因素记 3 分","FACTOR_GROUP_SEQ":3,"FACTOR_SEQ":34},{"RISK_FACTOR_ID":1035,"RISK_FACTOR_NAME":"其他先天或后天血栓形成","FACTOR_GROUP_ID":3,"FACTOR_GROUP_NAME":"以下每项风险因素记 3 分","FACTOR_GROUP_SEQ":3,"FACTOR_SEQ":35},{"RISK_FACTOR_ID":1036,"RISK_FACTOR_NAME":"脑卒中(<1个月)","FACTOR_GROUP_ID":4,"FACTOR_GROUP_NAME":"以下每项风险因素记 5 分","FACTOR_GROUP_SEQ":4,"FACTOR_SEQ":36},{"RISK_FACTOR_ID":1037,"RISK_FACTOR_NAME":"多发性创伤(<1个月)","FACTOR_GROUP_ID":4,"FACTOR_GROUP_NAME":"以下每项风险因素记 5 分","FACTOR_GROUP_SEQ":4,"FACTOR_SEQ":37},{"RISK_FACTOR_ID":1038,"RISK_FACTOR_NAME":"选择性下肢关节置换术","FACTOR_GROUP_ID":4,"FACTOR_GROUP_NAME":"以下每项风险因素记 5 分","FACTOR_GROUP_SEQ":4,"FACTOR_SEQ":38},{"RISK_FACTOR_ID":1039,"RISK_FACTOR_NAME":"髋关节、骨盆或下肢骨折","FACTOR_GROUP_ID":4,"FACTOR_GROUP_NAME":"以下每项风险因素记 5 分","FACTOR_GROUP_SEQ":4,"FACTOR_SEQ":39},{"RISK_FACTOR_ID":1040,"RISK_FACTOR_NAME":"急性骨髓损伤(瘫痪)(<1个月)","FACTOR_GROUP_ID":4,"FACTOR_GROUP_NAME":"以下每项风险因素记 5 分","FACTOR_GROUP_SEQ":4,"FACTOR_SEQ":40}]
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

    public static class ServerParamsBean implements Serializable {
        /**
         * RISK_FACTOR_ID : 1001
         * RISK_FACTOR_NAME : 年龄为41-46岁
         * FACTOR_GROUP_ID : 1
         * FACTOR_GROUP_NAME : 以下每项风险因素记 1 分
         * FACTOR_GROUP_SEQ : 1
         * FACTOR_SEQ : 1
         */

        private int RISK_FACTOR_ID;
        private String RISK_FACTOR_NAME;
        private int FACTOR_GROUP_ID;
        private String FACTOR_GROUP_NAME;
        private int FACTOR_GROUP_SEQ;
        private int FACTOR_SEQ;
        private boolean Checked;

        public boolean isChecked() {
            return Checked;
        }

        public void setChecked(boolean checked) {
            Checked = checked;
        }

        public int getRISK_FACTOR_ID() { return RISK_FACTOR_ID;}

        public void setRISK_FACTOR_ID(int RISK_FACTOR_ID) { this.RISK_FACTOR_ID = RISK_FACTOR_ID;}

        public String getRISK_FACTOR_NAME() { return RISK_FACTOR_NAME;}

        public void setRISK_FACTOR_NAME(String RISK_FACTOR_NAME) { this.RISK_FACTOR_NAME = RISK_FACTOR_NAME;}

        public int getFACTOR_GROUP_ID() { return FACTOR_GROUP_ID;}

        public void setFACTOR_GROUP_ID(int FACTOR_GROUP_ID) { this.FACTOR_GROUP_ID = FACTOR_GROUP_ID;}

        public String getFACTOR_GROUP_NAME() { return FACTOR_GROUP_NAME;}

        public void setFACTOR_GROUP_NAME(String FACTOR_GROUP_NAME) { this.FACTOR_GROUP_NAME = FACTOR_GROUP_NAME;}

        public int getFACTOR_GROUP_SEQ() { return FACTOR_GROUP_SEQ;}

        public void setFACTOR_GROUP_SEQ(int FACTOR_GROUP_SEQ) { this.FACTOR_GROUP_SEQ = FACTOR_GROUP_SEQ;}

        public int getFACTOR_SEQ() { return FACTOR_SEQ;}

        public void setFACTOR_SEQ(int FACTOR_SEQ) { this.FACTOR_SEQ = FACTOR_SEQ;}
    }
}
