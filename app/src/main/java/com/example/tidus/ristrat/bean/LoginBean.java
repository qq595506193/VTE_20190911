package com.example.tidus.ristrat.bean;

import java.io.Serializable;

public class LoginBean implements Serializable {


    /**
     * code : 0
     * message : 登录成功
     * server_params : {"MERCHANT_ID":1400,"SITE_ID":1400,"USER_ID":202,"CREATE_TIME":"20180727110910","ACCOUNT":"admin","USER_NAME":"系统管理员","PASS_WORD":"123123","ROLE_ID":1,"TELPHONE":"18600391315","EMAIL":null,"DEPARTMENT":100,"VALID_FLAG":1,"USER_TITLE":null,"USER_SEX":null,"STREET_RANGE":null,"UNIT_NAME":null,"FAMILY_DOCTOR_FLAG":0,"EXAMINE_COUNT":0,"EXAMINE_AVERAGE":0,"EXAMINE_LAST_TIME":null,"WORKOR_NO":"1400001","CARE_UNIT":"1","OFFICE_CODE":null,"OFFICE_NAME":null,"merchantMesg":{"MERCHANT_ID":1400,"SITE_ID":1400,"SITE_NAME":"SCDXHXYY","SITE_EXPLAIN":"四川大学华西医院","VERSION_TYPE_ID":1,"CURRENT_VERSION":"1.0.0","SERIAL_DATE_BEGIN":"20171115000000","SERIAL_DATE_END":"20171115000000","DYNAMIC_PASSWORD_FLAG":0,"PREPAY_BALANCE":0,"ROBOT_SERVICE":1,"GET_PAGE_TITLE":0,"MAX_ONLINE":50,"ROBOT_NAME":"小壹","ROBOT_ICON":null,"ROBOT_ICON2X":null,"CS_FIRST_SERVICE":0,"ENGINES_KEY_TO_CS":0,"MESSAGE_UNIT_PRICE":0,"PHONE_UNIT_PRICE":0,"SHOW_SITE_NAME":"四川大学华西医院","SHOW_SITE_ICON":null,"SINGLE_FILE_SIZE":4096,"ALL_FILE_SIZE":1024000,"FILE_SAVE_TIME":1440,"HISTORY_SAVE_DAY":365,"HISTORY_SAVE_SIZE":1024000,"CURRENT_SIZE":0,"USED_SCENE":"Client","STARTING_POINT":0,"ROBOT_VISIBLE":0,"OTHER_SITE_QUESTION":0,"DEPUTY_OFFICE":null,"SITE_MAP_VERSION":null,"SITE_MAP_NUM":null,"SITE_MAP_URL":"http://220.194.46.211/DuoMeiHealth/HeadDownLoadServlet.do?path=/xinxizhongxin/site_map/1400_1400/map.zip","SHOW_SITE_BACKGROUND":null,"ASKING_PROCESS":"10","SHOW_SITE_BACKGROUND2":null}}
     * server_code :
     */

    private String code;
    private String message;
    private ServerParamsBean server_params;
    private String server_code;

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

    public ServerParamsBean getServer_params() {
        return server_params;
    }

    public void setServer_params(ServerParamsBean server_params) {
        this.server_params = server_params;
    }

    public String getServer_code() {
        return server_code;
    }

    public void setServer_code(String server_code) {
        this.server_code = server_code;
    }

    public static class ServerParamsBean implements Serializable{
        /**
         * MERCHANT_ID : 1400
         * SITE_ID : 1400
         * USER_ID : 202
         * CREATE_TIME : 20180727110910
         * ACCOUNT : admin
         * USER_NAME : 系统管理员
         * PASS_WORD : 123123
         * ROLE_ID : 1
         * TELPHONE : 18600391315
         * EMAIL : null
         * DEPARTMENT : 100
         * VALID_FLAG : 1
         * USER_TITLE : null
         * USER_SEX : null
         * STREET_RANGE : null
         * UNIT_NAME : null
         * FAMILY_DOCTOR_FLAG : 0
         * EXAMINE_COUNT : 0
         * EXAMINE_AVERAGE : 0
         * EXAMINE_LAST_TIME : null
         * WORKOR_NO : 1400001
         * CARE_UNIT : 1
         * OFFICE_CODE : null
         * OFFICE_NAME : null
         * merchantMesg : {"MERCHANT_ID":1400,"SITE_ID":1400,"SITE_NAME":"SCDXHXYY","SITE_EXPLAIN":"四川大学华西医院","VERSION_TYPE_ID":1,"CURRENT_VERSION":"1.0.0","SERIAL_DATE_BEGIN":"20171115000000","SERIAL_DATE_END":"20171115000000","DYNAMIC_PASSWORD_FLAG":0,"PREPAY_BALANCE":0,"ROBOT_SERVICE":1,"GET_PAGE_TITLE":0,"MAX_ONLINE":50,"ROBOT_NAME":"小壹","ROBOT_ICON":null,"ROBOT_ICON2X":null,"CS_FIRST_SERVICE":0,"ENGINES_KEY_TO_CS":0,"MESSAGE_UNIT_PRICE":0,"PHONE_UNIT_PRICE":0,"SHOW_SITE_NAME":"四川大学华西医院","SHOW_SITE_ICON":null,"SINGLE_FILE_SIZE":4096,"ALL_FILE_SIZE":1024000,"FILE_SAVE_TIME":1440,"HISTORY_SAVE_DAY":365,"HISTORY_SAVE_SIZE":1024000,"CURRENT_SIZE":0,"USED_SCENE":"Client","STARTING_POINT":0,"ROBOT_VISIBLE":0,"OTHER_SITE_QUESTION":0,"DEPUTY_OFFICE":null,"SITE_MAP_VERSION":null,"SITE_MAP_NUM":null,"SITE_MAP_URL":"http://220.194.46.211/DuoMeiHealth/HeadDownLoadServlet.do?path=/xinxizhongxin/site_map/1400_1400/map.zip","SHOW_SITE_BACKGROUND":null,"ASKING_PROCESS":"10","SHOW_SITE_BACKGROUND2":null}
         */

        private int MERCHANT_ID;
        private int SITE_ID;
        private int USER_ID;
        private String CREATE_TIME;
        private String ACCOUNT;
        private String USER_NAME;
        private String PASS_WORD;
        private int ROLE_ID;
        private String TELPHONE;
        private Object EMAIL;
        private int DEPARTMENT;
        private int VALID_FLAG;
        private Object USER_TITLE;
        private Object USER_SEX;
        private Object STREET_RANGE;
        private Object UNIT_NAME;
        private int FAMILY_DOCTOR_FLAG;
        private int EXAMINE_COUNT;
        private int EXAMINE_AVERAGE;
        private Object EXAMINE_LAST_TIME;
        private String WORKOR_NO;
        private String CARE_UNIT;
        private Object OFFICE_CODE;
        private Object OFFICE_NAME;
        private MerchantMesgBean merchantMesg;

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

        public int getUSER_ID() {
            return USER_ID;
        }

        public void setUSER_ID(int USER_ID) {
            this.USER_ID = USER_ID;
        }

        public String getCREATE_TIME() {
            return CREATE_TIME;
        }

        public void setCREATE_TIME(String CREATE_TIME) {
            this.CREATE_TIME = CREATE_TIME;
        }

        public String getACCOUNT() {
            return ACCOUNT;
        }

        public void setACCOUNT(String ACCOUNT) {
            this.ACCOUNT = ACCOUNT;
        }

        public String getUSER_NAME() {
            return USER_NAME;
        }

        public void setUSER_NAME(String USER_NAME) {
            this.USER_NAME = USER_NAME;
        }

        public String getPASS_WORD() {
            return PASS_WORD;
        }

        public void setPASS_WORD(String PASS_WORD) {
            this.PASS_WORD = PASS_WORD;
        }

        public int getROLE_ID() {
            return ROLE_ID;
        }

        public void setROLE_ID(int ROLE_ID) {
            this.ROLE_ID = ROLE_ID;
        }

        public String getTELPHONE() {
            return TELPHONE;
        }

        public void setTELPHONE(String TELPHONE) {
            this.TELPHONE = TELPHONE;
        }

        public Object getEMAIL() {
            return EMAIL;
        }

        public void setEMAIL(Object EMAIL) {
            this.EMAIL = EMAIL;
        }

        public int getDEPARTMENT() {
            return DEPARTMENT;
        }

        public void setDEPARTMENT(int DEPARTMENT) {
            this.DEPARTMENT = DEPARTMENT;
        }

        public int getVALID_FLAG() {
            return VALID_FLAG;
        }

        public void setVALID_FLAG(int VALID_FLAG) {
            this.VALID_FLAG = VALID_FLAG;
        }

        public Object getUSER_TITLE() {
            return USER_TITLE;
        }

        public void setUSER_TITLE(Object USER_TITLE) {
            this.USER_TITLE = USER_TITLE;
        }

        public Object getUSER_SEX() {
            return USER_SEX;
        }

        public void setUSER_SEX(Object USER_SEX) {
            this.USER_SEX = USER_SEX;
        }

        public Object getSTREET_RANGE() {
            return STREET_RANGE;
        }

        public void setSTREET_RANGE(Object STREET_RANGE) {
            this.STREET_RANGE = STREET_RANGE;
        }

        public Object getUNIT_NAME() {
            return UNIT_NAME;
        }

        public void setUNIT_NAME(Object UNIT_NAME) {
            this.UNIT_NAME = UNIT_NAME;
        }

        public int getFAMILY_DOCTOR_FLAG() {
            return FAMILY_DOCTOR_FLAG;
        }

        public void setFAMILY_DOCTOR_FLAG(int FAMILY_DOCTOR_FLAG) {
            this.FAMILY_DOCTOR_FLAG = FAMILY_DOCTOR_FLAG;
        }

        public int getEXAMINE_COUNT() {
            return EXAMINE_COUNT;
        }

        public void setEXAMINE_COUNT(int EXAMINE_COUNT) {
            this.EXAMINE_COUNT = EXAMINE_COUNT;
        }

        public int getEXAMINE_AVERAGE() {
            return EXAMINE_AVERAGE;
        }

        public void setEXAMINE_AVERAGE(int EXAMINE_AVERAGE) {
            this.EXAMINE_AVERAGE = EXAMINE_AVERAGE;
        }

        public Object getEXAMINE_LAST_TIME() {
            return EXAMINE_LAST_TIME;
        }

        public void setEXAMINE_LAST_TIME(Object EXAMINE_LAST_TIME) {
            this.EXAMINE_LAST_TIME = EXAMINE_LAST_TIME;
        }

        public String getWORKOR_NO() {
            return WORKOR_NO;
        }

        public void setWORKOR_NO(String WORKOR_NO) {
            this.WORKOR_NO = WORKOR_NO;
        }

        public String getCARE_UNIT() {
            return CARE_UNIT;
        }

        public void setCARE_UNIT(String CARE_UNIT) {
            this.CARE_UNIT = CARE_UNIT;
        }

        public Object getOFFICE_CODE() {
            return OFFICE_CODE;
        }

        public void setOFFICE_CODE(Object OFFICE_CODE) {
            this.OFFICE_CODE = OFFICE_CODE;
        }

        public Object getOFFICE_NAME() {
            return OFFICE_NAME;
        }

        public void setOFFICE_NAME(Object OFFICE_NAME) {
            this.OFFICE_NAME = OFFICE_NAME;
        }

        public MerchantMesgBean getMerchantMesg() {
            return merchantMesg;
        }

        public void setMerchantMesg(MerchantMesgBean merchantMesg) {
            this.merchantMesg = merchantMesg;
        }

        public static class MerchantMesgBean implements Serializable{
            /**
             * MERCHANT_ID : 1400
             * SITE_ID : 1400
             * SITE_NAME : SCDXHXYY
             * SITE_EXPLAIN : 四川大学华西医院
             * VERSION_TYPE_ID : 1
             * CURRENT_VERSION : 1.0.0
             * SERIAL_DATE_BEGIN : 20171115000000
             * SERIAL_DATE_END : 20171115000000
             * DYNAMIC_PASSWORD_FLAG : 0
             * PREPAY_BALANCE : 0
             * ROBOT_SERVICE : 1
             * GET_PAGE_TITLE : 0
             * MAX_ONLINE : 50
             * ROBOT_NAME : 小壹
             * ROBOT_ICON : null
             * ROBOT_ICON2X : null
             * CS_FIRST_SERVICE : 0
             * ENGINES_KEY_TO_CS : 0
             * MESSAGE_UNIT_PRICE : 0
             * PHONE_UNIT_PRICE : 0
             * SHOW_SITE_NAME : 四川大学华西医院
             * SHOW_SITE_ICON : null
             * SINGLE_FILE_SIZE : 4096
             * ALL_FILE_SIZE : 1024000
             * FILE_SAVE_TIME : 1440
             * HISTORY_SAVE_DAY : 365
             * HISTORY_SAVE_SIZE : 1024000
             * CURRENT_SIZE : 0
             * USED_SCENE : Client
             * STARTING_POINT : 0
             * ROBOT_VISIBLE : 0
             * OTHER_SITE_QUESTION : 0
             * DEPUTY_OFFICE : null
             * SITE_MAP_VERSION : null
             * SITE_MAP_NUM : null
             * SITE_MAP_URL : http://220.194.46.211/DuoMeiHealth/HeadDownLoadServlet.do?path=/xinxizhongxin/site_map/1400_1400/map.zip
             * SHOW_SITE_BACKGROUND : null
             * ASKING_PROCESS : 10
             * SHOW_SITE_BACKGROUND2 : null
             */

            private int MERCHANT_ID;
            private int SITE_ID;
            private String SITE_NAME;
            private String SITE_EXPLAIN;
            private int VERSION_TYPE_ID;
            private String CURRENT_VERSION;
            private String SERIAL_DATE_BEGIN;
            private String SERIAL_DATE_END;
            private int DYNAMIC_PASSWORD_FLAG;
            private int PREPAY_BALANCE;
            private int ROBOT_SERVICE;
            private int GET_PAGE_TITLE;
            private int MAX_ONLINE;
            private String ROBOT_NAME;
            private Object ROBOT_ICON;
            private Object ROBOT_ICON2X;
            private int CS_FIRST_SERVICE;
            private int ENGINES_KEY_TO_CS;
            private int MESSAGE_UNIT_PRICE;
            private int PHONE_UNIT_PRICE;
            private String SHOW_SITE_NAME;
            private Object SHOW_SITE_ICON;
            private int SINGLE_FILE_SIZE;
            private int ALL_FILE_SIZE;
            private int FILE_SAVE_TIME;
            private int HISTORY_SAVE_DAY;
            private int HISTORY_SAVE_SIZE;
            private int CURRENT_SIZE;
            private String USED_SCENE;
            private int STARTING_POINT;
            private int ROBOT_VISIBLE;
            private int OTHER_SITE_QUESTION;
            private Object DEPUTY_OFFICE;
            private Object SITE_MAP_VERSION;
            private Object SITE_MAP_NUM;
            private String SITE_MAP_URL;
            private Object SHOW_SITE_BACKGROUND;
            private String ASKING_PROCESS;
            private Object SHOW_SITE_BACKGROUND2;

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

            public String getSITE_NAME() {
                return SITE_NAME;
            }

            public void setSITE_NAME(String SITE_NAME) {
                this.SITE_NAME = SITE_NAME;
            }

            public String getSITE_EXPLAIN() {
                return SITE_EXPLAIN;
            }

            public void setSITE_EXPLAIN(String SITE_EXPLAIN) {
                this.SITE_EXPLAIN = SITE_EXPLAIN;
            }

            public int getVERSION_TYPE_ID() {
                return VERSION_TYPE_ID;
            }

            public void setVERSION_TYPE_ID(int VERSION_TYPE_ID) {
                this.VERSION_TYPE_ID = VERSION_TYPE_ID;
            }

            public String getCURRENT_VERSION() {
                return CURRENT_VERSION;
            }

            public void setCURRENT_VERSION(String CURRENT_VERSION) {
                this.CURRENT_VERSION = CURRENT_VERSION;
            }

            public String getSERIAL_DATE_BEGIN() {
                return SERIAL_DATE_BEGIN;
            }

            public void setSERIAL_DATE_BEGIN(String SERIAL_DATE_BEGIN) {
                this.SERIAL_DATE_BEGIN = SERIAL_DATE_BEGIN;
            }

            public String getSERIAL_DATE_END() {
                return SERIAL_DATE_END;
            }

            public void setSERIAL_DATE_END(String SERIAL_DATE_END) {
                this.SERIAL_DATE_END = SERIAL_DATE_END;
            }

            public int getDYNAMIC_PASSWORD_FLAG() {
                return DYNAMIC_PASSWORD_FLAG;
            }

            public void setDYNAMIC_PASSWORD_FLAG(int DYNAMIC_PASSWORD_FLAG) {
                this.DYNAMIC_PASSWORD_FLAG = DYNAMIC_PASSWORD_FLAG;
            }

            public int getPREPAY_BALANCE() {
                return PREPAY_BALANCE;
            }

            public void setPREPAY_BALANCE(int PREPAY_BALANCE) {
                this.PREPAY_BALANCE = PREPAY_BALANCE;
            }

            public int getROBOT_SERVICE() {
                return ROBOT_SERVICE;
            }

            public void setROBOT_SERVICE(int ROBOT_SERVICE) {
                this.ROBOT_SERVICE = ROBOT_SERVICE;
            }

            public int getGET_PAGE_TITLE() {
                return GET_PAGE_TITLE;
            }

            public void setGET_PAGE_TITLE(int GET_PAGE_TITLE) {
                this.GET_PAGE_TITLE = GET_PAGE_TITLE;
            }

            public int getMAX_ONLINE() {
                return MAX_ONLINE;
            }

            public void setMAX_ONLINE(int MAX_ONLINE) {
                this.MAX_ONLINE = MAX_ONLINE;
            }

            public String getROBOT_NAME() {
                return ROBOT_NAME;
            }

            public void setROBOT_NAME(String ROBOT_NAME) {
                this.ROBOT_NAME = ROBOT_NAME;
            }

            public Object getROBOT_ICON() {
                return ROBOT_ICON;
            }

            public void setROBOT_ICON(Object ROBOT_ICON) {
                this.ROBOT_ICON = ROBOT_ICON;
            }

            public Object getROBOT_ICON2X() {
                return ROBOT_ICON2X;
            }

            public void setROBOT_ICON2X(Object ROBOT_ICON2X) {
                this.ROBOT_ICON2X = ROBOT_ICON2X;
            }

            public int getCS_FIRST_SERVICE() {
                return CS_FIRST_SERVICE;
            }

            public void setCS_FIRST_SERVICE(int CS_FIRST_SERVICE) {
                this.CS_FIRST_SERVICE = CS_FIRST_SERVICE;
            }

            public int getENGINES_KEY_TO_CS() {
                return ENGINES_KEY_TO_CS;
            }

            public void setENGINES_KEY_TO_CS(int ENGINES_KEY_TO_CS) {
                this.ENGINES_KEY_TO_CS = ENGINES_KEY_TO_CS;
            }

            public int getMESSAGE_UNIT_PRICE() {
                return MESSAGE_UNIT_PRICE;
            }

            public void setMESSAGE_UNIT_PRICE(int MESSAGE_UNIT_PRICE) {
                this.MESSAGE_UNIT_PRICE = MESSAGE_UNIT_PRICE;
            }

            public int getPHONE_UNIT_PRICE() {
                return PHONE_UNIT_PRICE;
            }

            public void setPHONE_UNIT_PRICE(int PHONE_UNIT_PRICE) {
                this.PHONE_UNIT_PRICE = PHONE_UNIT_PRICE;
            }

            public String getSHOW_SITE_NAME() {
                return SHOW_SITE_NAME;
            }

            public void setSHOW_SITE_NAME(String SHOW_SITE_NAME) {
                this.SHOW_SITE_NAME = SHOW_SITE_NAME;
            }

            public Object getSHOW_SITE_ICON() {
                return SHOW_SITE_ICON;
            }

            public void setSHOW_SITE_ICON(Object SHOW_SITE_ICON) {
                this.SHOW_SITE_ICON = SHOW_SITE_ICON;
            }

            public int getSINGLE_FILE_SIZE() {
                return SINGLE_FILE_SIZE;
            }

            public void setSINGLE_FILE_SIZE(int SINGLE_FILE_SIZE) {
                this.SINGLE_FILE_SIZE = SINGLE_FILE_SIZE;
            }

            public int getALL_FILE_SIZE() {
                return ALL_FILE_SIZE;
            }

            public void setALL_FILE_SIZE(int ALL_FILE_SIZE) {
                this.ALL_FILE_SIZE = ALL_FILE_SIZE;
            }

            public int getFILE_SAVE_TIME() {
                return FILE_SAVE_TIME;
            }

            public void setFILE_SAVE_TIME(int FILE_SAVE_TIME) {
                this.FILE_SAVE_TIME = FILE_SAVE_TIME;
            }

            public int getHISTORY_SAVE_DAY() {
                return HISTORY_SAVE_DAY;
            }

            public void setHISTORY_SAVE_DAY(int HISTORY_SAVE_DAY) {
                this.HISTORY_SAVE_DAY = HISTORY_SAVE_DAY;
            }

            public int getHISTORY_SAVE_SIZE() {
                return HISTORY_SAVE_SIZE;
            }

            public void setHISTORY_SAVE_SIZE(int HISTORY_SAVE_SIZE) {
                this.HISTORY_SAVE_SIZE = HISTORY_SAVE_SIZE;
            }

            public int getCURRENT_SIZE() {
                return CURRENT_SIZE;
            }

            public void setCURRENT_SIZE(int CURRENT_SIZE) {
                this.CURRENT_SIZE = CURRENT_SIZE;
            }

            public String getUSED_SCENE() {
                return USED_SCENE;
            }

            public void setUSED_SCENE(String USED_SCENE) {
                this.USED_SCENE = USED_SCENE;
            }

            public int getSTARTING_POINT() {
                return STARTING_POINT;
            }

            public void setSTARTING_POINT(int STARTING_POINT) {
                this.STARTING_POINT = STARTING_POINT;
            }

            public int getROBOT_VISIBLE() {
                return ROBOT_VISIBLE;
            }

            public void setROBOT_VISIBLE(int ROBOT_VISIBLE) {
                this.ROBOT_VISIBLE = ROBOT_VISIBLE;
            }

            public int getOTHER_SITE_QUESTION() {
                return OTHER_SITE_QUESTION;
            }

            public void setOTHER_SITE_QUESTION(int OTHER_SITE_QUESTION) {
                this.OTHER_SITE_QUESTION = OTHER_SITE_QUESTION;
            }

            public Object getDEPUTY_OFFICE() {
                return DEPUTY_OFFICE;
            }

            public void setDEPUTY_OFFICE(Object DEPUTY_OFFICE) {
                this.DEPUTY_OFFICE = DEPUTY_OFFICE;
            }

            public Object getSITE_MAP_VERSION() {
                return SITE_MAP_VERSION;
            }

            public void setSITE_MAP_VERSION(Object SITE_MAP_VERSION) {
                this.SITE_MAP_VERSION = SITE_MAP_VERSION;
            }

            public Object getSITE_MAP_NUM() {
                return SITE_MAP_NUM;
            }

            public void setSITE_MAP_NUM(Object SITE_MAP_NUM) {
                this.SITE_MAP_NUM = SITE_MAP_NUM;
            }

            public String getSITE_MAP_URL() {
                return SITE_MAP_URL;
            }

            public void setSITE_MAP_URL(String SITE_MAP_URL) {
                this.SITE_MAP_URL = SITE_MAP_URL;
            }

            public Object getSHOW_SITE_BACKGROUND() {
                return SHOW_SITE_BACKGROUND;
            }

            public void setSHOW_SITE_BACKGROUND(Object SHOW_SITE_BACKGROUND) {
                this.SHOW_SITE_BACKGROUND = SHOW_SITE_BACKGROUND;
            }

            public String getASKING_PROCESS() {
                return ASKING_PROCESS;
            }

            public void setASKING_PROCESS(String ASKING_PROCESS) {
                this.ASKING_PROCESS = ASKING_PROCESS;
            }

            public Object getSHOW_SITE_BACKGROUND2() {
                return SHOW_SITE_BACKGROUND2;
            }

            public void setSHOW_SITE_BACKGROUND2(Object SHOW_SITE_BACKGROUND2) {
                this.SHOW_SITE_BACKGROUND2 = SHOW_SITE_BACKGROUND2;
            }
        }
    }
}
