package com.example.tidus.ristrat.bean;

import java.util.List;

public class MessageBean {


    /**
     * code : 0
     * message : 成功
     * server_code :
     * server_params : {"count":9,"list":[{"USER_ID":222,"MESSAGE_ID":2242,"MESSAGE_TITLE":"系统消息","MESSAGE_CONTENT":"[{\"cont\":\"患者 9.30（TMP101） 已达到VTE风险评估标准，已延迟30分钟未处理，请及时安排患者进行\",\"type\":0},{\"cont\":\"评估\",\"type\":2,\"patient_id\":\"TMP101\",\"visit_sq_no\":\"122222222223wqew\"},{\"cont\":\"。\",\"type\":0}]","SEND_TIME":"20190709093739","MESSAGE_TYPE":20,"MESSAGE_STATUS":0,"OBJECT_PARA":null,"READ_TIME":null,"DELETE_TIME":null,"RN":1},{"USER_ID":222,"MESSAGE_ID":2240,"MESSAGE_TITLE":"系统消息","MESSAGE_CONTENT":"[{\"cont\":\"患者 9.30（TMP101） 目前处于VTE风险（\"极高危\"）情况，请及时安排患者进行\",\"type\":0},{\"cont\":\"评估\",\"type\":2,\"patient_id\":\"TMP101\",\"visit_sq_no\":\"122222222223wqew\"},{\"cont\":\"。\",\"type\":0}]","SEND_TIME":"20190709093634","MESSAGE_TYPE":20,"MESSAGE_STATUS":0,"OBJECT_PARA":null,"READ_TIME":null,"DELETE_TIME":null,"RN":2},{"USER_ID":222,"MESSAGE_ID":2238,"MESSAGE_TITLE":"系统消息","MESSAGE_CONTENT":"医生 系统管理员 已确认患者 9.30 评估。","SEND_TIME":"20190709093128","MESSAGE_TYPE":20,"MESSAGE_STATUS":0,"OBJECT_PARA":null,"READ_TIME":null,"DELETE_TIME":null,"RN":3},{"USER_ID":222,"MESSAGE_ID":2236,"MESSAGE_TITLE":"系统消息","MESSAGE_CONTENT":"[{\"cont\":\"患者 9.30（TMP101） 已达到VTE风险评估标准，已延迟30分钟未处理，请及时安排患者进行\",\"type\":0},{\"cont\":\"评估\",\"type\":2,\"patient_id\":\"TMP101\",\"visit_sq_no\":\"122222222223wqew\"},{\"cont\":\"。\",\"type\":0}]","SEND_TIME":"20190709093008","MESSAGE_TYPE":20,"MESSAGE_STATUS":0,"OBJECT_PARA":null,"READ_TIME":null,"DELETE_TIME":null,"RN":4},{"USER_ID":222,"MESSAGE_ID":2234,"MESSAGE_TITLE":"系统消息","MESSAGE_CONTENT":"[{\"cont\":\"患者 9.30（TMP101） 已达到VTE风险评估标准，请及时安排患者进行\",\"type\":0},{\"cont\":\"评估\",\"type\":2,\"patient_id\":\"TMP101\",\"visit_sq_no\":\"122222222223wqew\"},{\"cont\":\"。\",\"type\":0}]","SEND_TIME":"20190709092903","MESSAGE_TYPE":20,"MESSAGE_STATUS":0,"OBJECT_PARA":null,"READ_TIME":null,"DELETE_TIME":null,"RN":5},{"USER_ID":222,"MESSAGE_ID":2232,"MESSAGE_TITLE":"系统消息","MESSAGE_CONTENT":"医生 系统管理员 已确认患者 1232 评估。","SEND_TIME":"20190709092549","MESSAGE_TYPE":20,"MESSAGE_STATUS":0,"OBJECT_PARA":null,"READ_TIME":null,"DELETE_TIME":null,"RN":6},{"USER_ID":222,"MESSAGE_ID":2229,"MESSAGE_TITLE":"系统消息","MESSAGE_CONTENT":"医生 系统管理员 已确认患者 1232 评估。","SEND_TIME":"20190708180719","MESSAGE_TYPE":20,"MESSAGE_STATUS":0,"OBJECT_PARA":null,"READ_TIME":null,"DELETE_TIME":null,"RN":7},{"USER_ID":222,"MESSAGE_ID":2227,"MESSAGE_TITLE":"系统消息","MESSAGE_CONTENT":"[{\"cont\":\"患者 1232（TMP100） 已达到VTE风险评估标准，已延迟30分钟未处理，请及时安排患者进行\",\"type\":0},{\"cont\":\"评估\",\"type\":2,\"patient_id\":\"TMP100\",\"visit_sq_no\":\"2111111321321\"},{\"cont\":\"。\",\"type\":0}]","SEND_TIME":"20190708175948","MESSAGE_TYPE":20,"MESSAGE_STATUS":0,"OBJECT_PARA":null,"READ_TIME":null,"DELETE_TIME":null,"RN":8},{"USER_ID":222,"MESSAGE_ID":2225,"MESSAGE_TITLE":"系统消息","MESSAGE_CONTENT":"[{\"cont\":\"患者 1232（TMP100） 已达到VTE风险评估标准，请及时安排患者进行\",\"type\":0},{\"cont\":\"评估\",\"type\":2,\"patient_id\":\"TMP100\",\"visit_sq_no\":\"2111111321321\"},{\"cont\":\"。\",\"type\":0}]","SEND_TIME":"20190708175843","MESSAGE_TYPE":20,"MESSAGE_STATUS":0,"OBJECT_PARA":null,"READ_TIME":null,"DELETE_TIME":null,"RN":9}]}
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

    public static class ServerParamsBean {
        /**
         * count : 9
         * list : [{"USER_ID":222,"MESSAGE_ID":2242,"MESSAGE_TITLE":"系统消息","MESSAGE_CONTENT":"[{\"cont\":\"患者 9.30（TMP101） 已达到VTE风险评估标准，已延迟30分钟未处理，请及时安排患者进行\",\"type\":0},{\"cont\":\"评估\",\"type\":2,\"patient_id\":\"TMP101\",\"visit_sq_no\":\"122222222223wqew\"},{\"cont\":\"。\",\"type\":0}]","SEND_TIME":"20190709093739","MESSAGE_TYPE":20,"MESSAGE_STATUS":0,"OBJECT_PARA":null,"READ_TIME":null,"DELETE_TIME":null,"RN":1},{"USER_ID":222,"MESSAGE_ID":2240,"MESSAGE_TITLE":"系统消息","MESSAGE_CONTENT":"[{\"cont\":\"患者 9.30（TMP101） 目前处于VTE风险（\"极高危\"）情况，请及时安排患者进行\",\"type\":0},{\"cont\":\"评估\",\"type\":2,\"patient_id\":\"TMP101\",\"visit_sq_no\":\"122222222223wqew\"},{\"cont\":\"。\",\"type\":0}]","SEND_TIME":"20190709093634","MESSAGE_TYPE":20,"MESSAGE_STATUS":0,"OBJECT_PARA":null,"READ_TIME":null,"DELETE_TIME":null,"RN":2},{"USER_ID":222,"MESSAGE_ID":2238,"MESSAGE_TITLE":"系统消息","MESSAGE_CONTENT":"医生 系统管理员 已确认患者 9.30 评估。","SEND_TIME":"20190709093128","MESSAGE_TYPE":20,"MESSAGE_STATUS":0,"OBJECT_PARA":null,"READ_TIME":null,"DELETE_TIME":null,"RN":3},{"USER_ID":222,"MESSAGE_ID":2236,"MESSAGE_TITLE":"系统消息","MESSAGE_CONTENT":"[{\"cont\":\"患者 9.30（TMP101） 已达到VTE风险评估标准，已延迟30分钟未处理，请及时安排患者进行\",\"type\":0},{\"cont\":\"评估\",\"type\":2,\"patient_id\":\"TMP101\",\"visit_sq_no\":\"122222222223wqew\"},{\"cont\":\"。\",\"type\":0}]","SEND_TIME":"20190709093008","MESSAGE_TYPE":20,"MESSAGE_STATUS":0,"OBJECT_PARA":null,"READ_TIME":null,"DELETE_TIME":null,"RN":4},{"USER_ID":222,"MESSAGE_ID":2234,"MESSAGE_TITLE":"系统消息","MESSAGE_CONTENT":"[{\"cont\":\"患者 9.30（TMP101） 已达到VTE风险评估标准，请及时安排患者进行\",\"type\":0},{\"cont\":\"评估\",\"type\":2,\"patient_id\":\"TMP101\",\"visit_sq_no\":\"122222222223wqew\"},{\"cont\":\"。\",\"type\":0}]","SEND_TIME":"20190709092903","MESSAGE_TYPE":20,"MESSAGE_STATUS":0,"OBJECT_PARA":null,"READ_TIME":null,"DELETE_TIME":null,"RN":5},{"USER_ID":222,"MESSAGE_ID":2232,"MESSAGE_TITLE":"系统消息","MESSAGE_CONTENT":"医生 系统管理员 已确认患者 1232 评估。","SEND_TIME":"20190709092549","MESSAGE_TYPE":20,"MESSAGE_STATUS":0,"OBJECT_PARA":null,"READ_TIME":null,"DELETE_TIME":null,"RN":6},{"USER_ID":222,"MESSAGE_ID":2229,"MESSAGE_TITLE":"系统消息","MESSAGE_CONTENT":"医生 系统管理员 已确认患者 1232 评估。","SEND_TIME":"20190708180719","MESSAGE_TYPE":20,"MESSAGE_STATUS":0,"OBJECT_PARA":null,"READ_TIME":null,"DELETE_TIME":null,"RN":7},{"USER_ID":222,"MESSAGE_ID":2227,"MESSAGE_TITLE":"系统消息","MESSAGE_CONTENT":"[{\"cont\":\"患者 1232（TMP100） 已达到VTE风险评估标准，已延迟30分钟未处理，请及时安排患者进行\",\"type\":0},{\"cont\":\"评估\",\"type\":2,\"patient_id\":\"TMP100\",\"visit_sq_no\":\"2111111321321\"},{\"cont\":\"。\",\"type\":0}]","SEND_TIME":"20190708175948","MESSAGE_TYPE":20,"MESSAGE_STATUS":0,"OBJECT_PARA":null,"READ_TIME":null,"DELETE_TIME":null,"RN":8},{"USER_ID":222,"MESSAGE_ID":2225,"MESSAGE_TITLE":"系统消息","MESSAGE_CONTENT":"[{\"cont\":\"患者 1232（TMP100） 已达到VTE风险评估标准，请及时安排患者进行\",\"type\":0},{\"cont\":\"评估\",\"type\":2,\"patient_id\":\"TMP100\",\"visit_sq_no\":\"2111111321321\"},{\"cont\":\"。\",\"type\":0}]","SEND_TIME":"20190708175843","MESSAGE_TYPE":20,"MESSAGE_STATUS":0,"OBJECT_PARA":null,"READ_TIME":null,"DELETE_TIME":null,"RN":9}]
         */

        private int count;
        private List<ListBean> list;

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * USER_ID : 222
             * MESSAGE_ID : 2242
             * MESSAGE_TITLE : 系统消息
             * MESSAGE_CONTENT : [{"cont":"患者 9.30（TMP101） 已达到VTE风险评估标准，已延迟30分钟未处理，请及时安排患者进行","type":0},{"cont":"评估","type":2,"patient_id":"TMP101","visit_sq_no":"122222222223wqew"},{"cont":"。","type":0}]
             * SEND_TIME : 20190709093739
             * MESSAGE_TYPE : 20
             * MESSAGE_STATUS : 0
             * OBJECT_PARA : null
             * READ_TIME : null
             * DELETE_TIME : null
             * RN : 1
             */

            private int USER_ID;
            private int MESSAGE_ID;
            private String MESSAGE_TITLE;
            private String MESSAGE_CONTENT;
            private String SEND_TIME;
            private int MESSAGE_TYPE;
            private int MESSAGE_STATUS;
            private Object OBJECT_PARA;
            private Object READ_TIME;
            private Object DELETE_TIME;
            private int RN;

            public int getUSER_ID() {
                return USER_ID;
            }

            public void setUSER_ID(int USER_ID) {
                this.USER_ID = USER_ID;
            }

            public int getMESSAGE_ID() {
                return MESSAGE_ID;
            }

            public void setMESSAGE_ID(int MESSAGE_ID) {
                this.MESSAGE_ID = MESSAGE_ID;
            }

            public String getMESSAGE_TITLE() {
                return MESSAGE_TITLE;
            }

            public void setMESSAGE_TITLE(String MESSAGE_TITLE) {
                this.MESSAGE_TITLE = MESSAGE_TITLE;
            }

            public String getMESSAGE_CONTENT() {
                return MESSAGE_CONTENT;
            }

            public void setMESSAGE_CONTENT(String MESSAGE_CONTENT) {
                this.MESSAGE_CONTENT = MESSAGE_CONTENT;
            }

            public String getSEND_TIME() {
                return SEND_TIME;
            }

            public void setSEND_TIME(String SEND_TIME) {
                this.SEND_TIME = SEND_TIME;
            }

            public int getMESSAGE_TYPE() {
                return MESSAGE_TYPE;
            }

            public void setMESSAGE_TYPE(int MESSAGE_TYPE) {
                this.MESSAGE_TYPE = MESSAGE_TYPE;
            }

            public int getMESSAGE_STATUS() {
                return MESSAGE_STATUS;
            }

            public void setMESSAGE_STATUS(int MESSAGE_STATUS) {
                this.MESSAGE_STATUS = MESSAGE_STATUS;
            }

            public Object getOBJECT_PARA() {
                return OBJECT_PARA;
            }

            public void setOBJECT_PARA(Object OBJECT_PARA) {
                this.OBJECT_PARA = OBJECT_PARA;
            }

            public Object getREAD_TIME() {
                return READ_TIME;
            }

            public void setREAD_TIME(Object READ_TIME) {
                this.READ_TIME = READ_TIME;
            }

            public Object getDELETE_TIME() {
                return DELETE_TIME;
            }

            public void setDELETE_TIME(Object DELETE_TIME) {
                this.DELETE_TIME = DELETE_TIME;
            }

            public int getRN() {
                return RN;
            }

            public void setRN(int RN) {
                this.RN = RN;
            }
        }
    }
}
