package com.example.tidus.ristrat.bean;

import java.io.Serializable;
import java.util.List;

public class HistoryAssessBean implements Serializable {


    /**
     * code : 0
     * message : 成功
     * server_code :
     * server_params : {"PATIENT_ID":"TMP83","DOCTOR_NAME":null,"REPORT_CODE":null,"REPORT_ID":null,"IN_DEPT_CODE":"100","IN_DEPT_NAME":"医院","PATIENT_NAME":"张三","BIRTHDAY":"37","PATIENT_SEX":"M","MEDICAL_REC_NUMBER":null,"VISIT_SQ_NO":"HX2019070123","jibinlist":[{"DIAGNOSIS_DISEASE_NAME":"左下肢肿胀，有伤口","DIAGNOSIS_DATE":"20190705103123"}],"reportList":[{"MERCHANT_ID":1400,"SITE_ID":1400,"DEPARTMENT":100,"FORM_ID":1,"FORM_NAME":"Caprini风险评估量表","FORM_TYPE":10,"FORM_SEQ":1,"BUSINESS_CLASS":"Assess","WENJUAN":[{"REPORT_ID":860,"REPORT_TIME":"20190705103238","REPORT_CODE":"HRA2019070500001","PATIENT_ID":"TMP83","PATIENT_TYPE":"Patient","DOCTOR_NAME":"血管外科医生","OBJECT_ID":null,"SERVICE_PLAN_ID":null,"SERVICE_PLAN_BATCH":null,"GATHER_TYPE":"30","PATIENT_ADVICE":[{"REPORT_ID":860,"ADVICE_TYPE":"Patient","ADVICE_CODE":1109,"ADVICE_CONTENT":"注意观察病情，协助医生和护士完成积极的治疗措施。","VALID_SEQ":0}],"DOCTOR_ADVICE":[{"REPORT_ID":860,"ADVICE_TYPE":"Doctor","ADVICE_CODE":1110,"ADVICE_CONTENT":"低分子肝素或低剂量普通肝素。  ","VALID_SEQ":0}],"NURSE_ADVICE":[{"REPORT_ID":860,"ADVICE_TYPE":"Nurse","ADVICE_CODE":1111,"ADVICE_CONTENT":"在各种治疗操作中，注意保护血管。","VALID_SEQ":0},{"REPORT_ID":860,"ADVICE_TYPE":"Nurse","ADVICE_CODE":1112,"ADVICE_CONTENT":"做好治疗措施，每三天评估一次。","VALID_SEQ":1}],"CONFIRM_FLAG":20,"CONFIRM_TIME":"20190705103522","SEND_FLAG":10,"SEND_TIME":null,"VISIT_SQ_NO":"HX2019070123","USER_ID":205,"OPERATE_TIME":"20190705103410","FORM_ID":1,"REMINDE_ID":null,"ELSE_ADVICE":[{"REPORT_ID":860,"ADVICE_TYPE":"Else","ADVICE_CODE":1108,"ADVICE_CONTENT":null,"VALID_SEQ":0}],"sublist":[{"REPORT_ID":860,"RISK_ID":1393,"DISEASE_CODE":null,"RISK_NAME":"极高危","CURRENT_RISK_LEVEL":"8","CURRENT_RISK_VALUE":6,"TARGET_RISK_LEVEL":null,"TARGET_RISK_VALUE":null,"RISK_DETAIL_DESC":"DVT发生率：40～80%，死亡率1～5%。\n","IDEAL_RISK":null,"REPORT_CODE":"HRA2019070500001","REPORT_TIME":"20190705103238","PATIENT_ADVICE":null,"DOCTOR_ADVICE":null,"NURSE_ADVICE":null}],"wxys":[{"RISK_FACTOR_ID":1003,"RISK_FACTOR_NAME":"下肢水肿(现患)","RISK_FACTOR_DESC":null,"REFERENCE_RANGES_DESC":null,"FACTOR_GROUP_ID":1,"FACTOR_SEQ":0,"CAN_CHANGE":0,"SCORE_SHOW_TYPE":20},{"RISK_FACTOR_ID":1017,"RISK_FACTOR_NAME":"其他风险因素","RISK_FACTOR_DESC":null,"REFERENCE_RANGES_DESC":null,"FACTOR_GROUP_ID":1,"FACTOR_SEQ":0,"CAN_CHANGE":0,"SCORE_SHOW_TYPE":30},{"RISK_FACTOR_ID":1031,"RISK_FACTOR_NAME":"狼疮抗凝物阳性","RISK_FACTOR_DESC":null,"REFERENCE_RANGES_DESC":null,"FACTOR_GROUP_ID":3,"FACTOR_SEQ":0,"CAN_CHANGE":0,"SCORE_SHOW_TYPE":20},{"RISK_FACTOR_ID":1041,"RISK_FACTOR_NAME":"卧床内科患者","RISK_FACTOR_DESC":null,"REFERENCE_RANGES_DESC":null,"FACTOR_GROUP_ID":1,"FACTOR_SEQ":0,"CAN_CHANGE":0,"SCORE_SHOW_TYPE":20},{"RISK_FACTOR_ID":1104,"RISK_FACTOR_NAME":"频繁跌倒","RISK_FACTOR_DESC":null,"REFERENCE_RANGES_DESC":null,"FACTOR_GROUP_ID":20,"FACTOR_SEQ":5,"CAN_CHANGE":0,"SCORE_SHOW_TYPE":20},{"RISK_FACTOR_ID":1114,"RISK_FACTOR_NAME":"抗凝药物控制不佳","RISK_FACTOR_DESC":null,"REFERENCE_RANGES_DESC":null,"FACTOR_GROUP_ID":22,"FACTOR_SEQ":15,"CAN_CHANGE":0,"SCORE_SHOW_TYPE":20}]}]},{"MERCHANT_ID":1400,"SITE_ID":1400,"DEPARTMENT":100,"FORM_ID":2,"FORM_NAME":"出血风险评估量表","FORM_TYPE":20,"FORM_SEQ":2,"BUSINESS_CLASS":"Assess","WENJUAN":[{"REPORT_ID":861,"REPORT_TIME":"20190705103359","REPORT_CODE":"HRA2019070500002","PATIENT_ID":"TMP83","PATIENT_TYPE":"Patient","DOCTOR_NAME":"血管外科医生","OBJECT_ID":null,"SERVICE_PLAN_ID":null,"SERVICE_PLAN_BATCH":null,"GATHER_TYPE":"30","PATIENT_ADVICE":[],"DOCTOR_ADVICE":[{"REPORT_ID":861,"ADVICE_TYPE":"Doctor","ADVICE_CODE":1105,"ADVICE_CONTENT":"术毕应用盐水冲洗创面，清除凝血块","VALID_SEQ":0},{"REPORT_ID":861,"ADVICE_TYPE":"Doctor","ADVICE_CODE":1106,"ADVICE_CONTENT":"术后积极预防感染，减少继发性出血的发生","VALID_SEQ":1}],"NURSE_ADVICE":[{"REPORT_ID":861,"ADVICE_TYPE":"Nurse","ADVICE_CODE":1107,"ADVICE_CONTENT":"注意平衡膳食，预防各种感染。","VALID_SEQ":0}],"CONFIRM_FLAG":20,"CONFIRM_TIME":"20190705103446","SEND_FLAG":null,"SEND_TIME":null,"VISIT_SQ_NO":"HX2019070123","USER_ID":205,"OPERATE_TIME":"20190705103359","FORM_ID":2,"REMINDE_ID":null,"ELSE_ADVICE":[{"REPORT_ID":861,"ADVICE_TYPE":"Else","ADVICE_CODE":1104,"ADVICE_CONTENT":null,"VALID_SEQ":0}],"sublist":[{"REPORT_ID":861,"RISK_ID":1392,"DISEASE_CODE":null,"RISK_NAME":"高危","CURRENT_RISK_LEVEL":"22","CURRENT_RISK_VALUE":2,"TARGET_RISK_LEVEL":null,"TARGET_RISK_VALUE":null,"RISK_DETAIL_DESC":null,"IDEAL_RISK":null,"REPORT_CODE":"HRA2019070500002","REPORT_TIME":"20190705103359","PATIENT_ADVICE":null,"DOCTOR_ADVICE":null,"NURSE_ADVICE":null}],"wxys":[{"RISK_FACTOR_ID":1003,"RISK_FACTOR_NAME":"下肢水肿(现患)","RISK_FACTOR_DESC":null,"REFERENCE_RANGES_DESC":null,"FACTOR_GROUP_ID":1,"FACTOR_SEQ":0,"CAN_CHANGE":0,"SCORE_SHOW_TYPE":20},{"RISK_FACTOR_ID":1017,"RISK_FACTOR_NAME":"其他风险因素","RISK_FACTOR_DESC":null,"REFERENCE_RANGES_DESC":null,"FACTOR_GROUP_ID":1,"FACTOR_SEQ":0,"CAN_CHANGE":0,"SCORE_SHOW_TYPE":30},{"RISK_FACTOR_ID":1031,"RISK_FACTOR_NAME":"狼疮抗凝物阳性","RISK_FACTOR_DESC":null,"REFERENCE_RANGES_DESC":null,"FACTOR_GROUP_ID":3,"FACTOR_SEQ":0,"CAN_CHANGE":0,"SCORE_SHOW_TYPE":20},{"RISK_FACTOR_ID":1041,"RISK_FACTOR_NAME":"卧床内科患者","RISK_FACTOR_DESC":null,"REFERENCE_RANGES_DESC":null,"FACTOR_GROUP_ID":1,"FACTOR_SEQ":0,"CAN_CHANGE":0,"SCORE_SHOW_TYPE":20},{"RISK_FACTOR_ID":1104,"RISK_FACTOR_NAME":"频繁跌倒","RISK_FACTOR_DESC":null,"REFERENCE_RANGES_DESC":null,"FACTOR_GROUP_ID":20,"FACTOR_SEQ":5,"CAN_CHANGE":0,"SCORE_SHOW_TYPE":20},{"RISK_FACTOR_ID":1114,"RISK_FACTOR_NAME":"抗凝药物控制不佳","RISK_FACTOR_DESC":null,"REFERENCE_RANGES_DESC":null,"FACTOR_GROUP_ID":22,"FACTOR_SEQ":15,"CAN_CHANGE":0,"SCORE_SHOW_TYPE":20}]},{"REPORT_ID":962,"REPORT_TIME":"20190705112059","REPORT_CODE":"HRA2019070500101","PATIENT_ID":"TMP83","PATIENT_TYPE":"Patient","DOCTOR_NAME":"血管外科医生","OBJECT_ID":null,"SERVICE_PLAN_ID":null,"SERVICE_PLAN_BATCH":null,"GATHER_TYPE":"30","PATIENT_ADVICE":[],"DOCTOR_ADVICE":[{"REPORT_ID":962,"ADVICE_TYPE":"Doctor","ADVICE_CODE":1132,"ADVICE_CONTENT":"术毕应用盐水冲洗创面，清除凝血块","VALID_SEQ":0},{"REPORT_ID":962,"ADVICE_TYPE":"Doctor","ADVICE_CODE":1133,"ADVICE_CONTENT":"术后积极预防感染，减少继发性出血的发生","VALID_SEQ":1}],"NURSE_ADVICE":[{"REPORT_ID":962,"ADVICE_TYPE":"Nurse","ADVICE_CODE":1134,"ADVICE_CONTENT":"注意观察患者体征。","VALID_SEQ":0},{"REPORT_ID":962,"ADVICE_TYPE":"Nurse","ADVICE_CODE":1135,"ADVICE_CONTENT":"注意平衡膳食，预防各种感染。","VALID_SEQ":1}],"CONFIRM_FLAG":20,"CONFIRM_TIME":"20190705132418","SEND_FLAG":null,"SEND_TIME":null,"VISIT_SQ_NO":"HX2019070123","USER_ID":202,"OPERATE_TIME":"20190705112059","FORM_ID":2,"REMINDE_ID":null,"ELSE_ADVICE":[{"REPORT_ID":962,"ADVICE_TYPE":"Else","ADVICE_CODE":1131,"ADVICE_CONTENT":null,"VALID_SEQ":0}],"sublist":[{"REPORT_ID":962,"RISK_ID":1494,"DISEASE_CODE":null,"RISK_NAME":"高危","CURRENT_RISK_LEVEL":"22","CURRENT_RISK_VALUE":5,"TARGET_RISK_LEVEL":null,"TARGET_RISK_VALUE":null,"RISK_DETAIL_DESC":null,"IDEAL_RISK":null,"REPORT_CODE":"HRA2019070500101","REPORT_TIME":"20190705112059","PATIENT_ADVICE":null,"DOCTOR_ADVICE":null,"NURSE_ADVICE":null}],"wxys":[{"RISK_FACTOR_ID":1101,"RISK_FACTOR_NAME":"既往出血史","RISK_FACTOR_DESC":null,"REFERENCE_RANGES_DESC":null,"FACTOR_GROUP_ID":20,"FACTOR_SEQ":2,"CAN_CHANGE":0,"SCORE_SHOW_TYPE":20},{"RISK_FACTOR_ID":1105,"RISK_FACTOR_NAME":"嗜酒","RISK_FACTOR_DESC":null,"REFERENCE_RANGES_DESC":null,"FACTOR_GROUP_ID":20,"FACTOR_SEQ":6,"CAN_CHANGE":0,"SCORE_SHOW_TYPE":20},{"RISK_FACTOR_ID":1107,"RISK_FACTOR_NAME":"转移性肿瘤","RISK_FACTOR_DESC":null,"REFERENCE_RANGES_DESC":null,"FACTOR_GROUP_ID":21,"FACTOR_SEQ":8,"CAN_CHANGE":0,"SCORE_SHOW_TYPE":20},{"RISK_FACTOR_ID":1111,"RISK_FACTOR_NAME":"糖尿病","RISK_FACTOR_DESC":null,"REFERENCE_RANGES_DESC":null,"FACTOR_GROUP_ID":21,"FACTOR_SEQ":12,"CAN_CHANGE":0,"SCORE_SHOW_TYPE":20},{"RISK_FACTOR_ID":1114,"RISK_FACTOR_NAME":"抗凝药物控制不佳","RISK_FACTOR_DESC":null,"REFERENCE_RANGES_DESC":null,"FACTOR_GROUP_ID":22,"FACTOR_SEQ":15,"CAN_CHANGE":0,"SCORE_SHOW_TYPE":20}]},{"REPORT_ID":995,"REPORT_TIME":"20190705113417","REPORT_CODE":"HRA2019070500134","PATIENT_ID":"TMP83","PATIENT_TYPE":"Patient","DOCTOR_NAME":"血管外科医生","OBJECT_ID":null,"SERVICE_PLAN_ID":null,"SERVICE_PLAN_BATCH":null,"GATHER_TYPE":"30","PATIENT_ADVICE":[],"DOCTOR_ADVICE":[{"REPORT_ID":995,"ADVICE_TYPE":"Doctor","ADVICE_CODE":1137,"ADVICE_CONTENT":"术毕应用盐水冲洗创面，清除凝血块","VALID_SEQ":0}],"NURSE_ADVICE":[{"REPORT_ID":995,"ADVICE_TYPE":"Nurse","ADVICE_CODE":1138,"ADVICE_CONTENT":"注意平衡膳食，预防各种感染。","VALID_SEQ":0}],"CONFIRM_FLAG":20,"CONFIRM_TIME":"20190705132428","SEND_FLAG":null,"SEND_TIME":null,"VISIT_SQ_NO":"HX2019070123","USER_ID":202,"OPERATE_TIME":"20190705113417","FORM_ID":2,"REMINDE_ID":null,"ELSE_ADVICE":[{"REPORT_ID":995,"ADVICE_TYPE":"Else","ADVICE_CODE":1136,"ADVICE_CONTENT":null,"VALID_SEQ":0}],"sublist":[{"REPORT_ID":995,"RISK_ID":1530,"DISEASE_CODE":null,"RISK_NAME":"高危","CURRENT_RISK_LEVEL":"22","CURRENT_RISK_VALUE":35,"TARGET_RISK_LEVEL":null,"TARGET_RISK_VALUE":null,"RISK_DETAIL_DESC":null,"IDEAL_RISK":null,"REPORT_CODE":"HRA2019070500134","REPORT_TIME":"20190705113417","PATIENT_ADVICE":null,"DOCTOR_ADVICE":null,"NURSE_ADVICE":null}],"wxys":[{"RISK_FACTOR_ID":1101,"RISK_FACTOR_NAME":"既往出血史","RISK_FACTOR_DESC":null,"REFERENCE_RANGES_DESC":null,"FACTOR_GROUP_ID":20,"FACTOR_SEQ":2,"CAN_CHANGE":0,"SCORE_SHOW_TYPE":20},{"RISK_FACTOR_ID":1105,"RISK_FACTOR_NAME":"嗜酒","RISK_FACTOR_DESC":null,"REFERENCE_RANGES_DESC":null,"FACTOR_GROUP_ID":20,"FACTOR_SEQ":6,"CAN_CHANGE":0,"SCORE_SHOW_TYPE":20},{"RISK_FACTOR_ID":1107,"RISK_FACTOR_NAME":"转移性肿瘤","RISK_FACTOR_DESC":null,"REFERENCE_RANGES_DESC":null,"FACTOR_GROUP_ID":21,"FACTOR_SEQ":8,"CAN_CHANGE":0,"SCORE_SHOW_TYPE":20}]},{"REPORT_ID":1382,"REPORT_TIME":"20190705132345","REPORT_CODE":"HRA2019070500505","PATIENT_ID":"TMP83","PATIENT_TYPE":"Patient","DOCTOR_NAME":"血管外科医生","OBJECT_ID":null,"SERVICE_PLAN_ID":null,"SERVICE_PLAN_BATCH":null,"GATHER_TYPE":"30","PATIENT_ADVICE":[],"DOCTOR_ADVICE":[],"NURSE_ADVICE":[{"REPORT_ID":1382,"ADVICE_TYPE":"Nurse","ADVICE_CODE":1140,"ADVICE_CONTENT":"注意平衡膳食，预防各种感染。","VALID_SEQ":0}],"CONFIRM_FLAG":20,"CONFIRM_TIME":"20190705132437","SEND_FLAG":null,"SEND_TIME":null,"VISIT_SQ_NO":"HX2019070123","USER_ID":205,"OPERATE_TIME":"20190705132345","FORM_ID":2,"REMINDE_ID":null,"ELSE_ADVICE":[{"REPORT_ID":1382,"ADVICE_TYPE":"Else","ADVICE_CODE":1139,"ADVICE_CONTENT":null,"VALID_SEQ":0}],"sublist":[{"REPORT_ID":1382,"RISK_ID":1918,"DISEASE_CODE":null,"RISK_NAME":"高危","CURRENT_RISK_LEVEL":"22","CURRENT_RISK_VALUE":2,"TARGET_RISK_LEVEL":null,"TARGET_RISK_VALUE":null,"RISK_DETAIL_DESC":null,"IDEAL_RISK":null,"REPORT_CODE":"HRA2019070500505","REPORT_TIME":"20190705132345","PATIENT_ADVICE":null,"DOCTOR_ADVICE":null,"NURSE_ADVICE":null}],"wxys":[{"RISK_FACTOR_ID":1100,"RISK_FACTOR_NAME":"年龄>75岁","RISK_FACTOR_DESC":null,"REFERENCE_RANGES_DESC":null,"FACTOR_GROUP_ID":20,"FACTOR_SEQ":1,"CAN_CHANGE":0,"SCORE_SHOW_TYPE":20},{"RISK_FACTOR_ID":1110,"RISK_FACTOR_NAME":"血小板减少","RISK_FACTOR_DESC":null,"REFERENCE_RANGES_DESC":null,"FACTOR_GROUP_ID":21,"FACTOR_SEQ":11,"CAN_CHANGE":0,"SCORE_SHOW_TYPE":20}]}]}]}
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

    public static class ServerParamsBean implements Serializable  {
        /**
         * PATIENT_ID : TMP83
         * DOCTOR_NAME : null
         * REPORT_CODE : null
         * REPORT_ID : null
         * IN_DEPT_CODE : 100
         * IN_DEPT_NAME : 医院
         * PATIENT_NAME : 张三
         * BIRTHDAY : 37
         * PATIENT_SEX : M
         * MEDICAL_REC_NUMBER : null
         * VISIT_SQ_NO : HX2019070123
         * jibinlist : [{"DIAGNOSIS_DISEASE_NAME":"左下肢肿胀，有伤口","DIAGNOSIS_DATE":"20190705103123"}]
         * reportList : [{"MERCHANT_ID":1400,"SITE_ID":1400,"DEPARTMENT":100,"FORM_ID":1,"FORM_NAME":"Caprini风险评估量表","FORM_TYPE":10,"FORM_SEQ":1,"BUSINESS_CLASS":"Assess","WENJUAN":[{"REPORT_ID":860,"REPORT_TIME":"20190705103238","REPORT_CODE":"HRA2019070500001","PATIENT_ID":"TMP83","PATIENT_TYPE":"Patient","DOCTOR_NAME":"血管外科医生","OBJECT_ID":null,"SERVICE_PLAN_ID":null,"SERVICE_PLAN_BATCH":null,"GATHER_TYPE":"30","PATIENT_ADVICE":[{"REPORT_ID":860,"ADVICE_TYPE":"Patient","ADVICE_CODE":1109,"ADVICE_CONTENT":"注意观察病情，协助医生和护士完成积极的治疗措施。","VALID_SEQ":0}],"DOCTOR_ADVICE":[{"REPORT_ID":860,"ADVICE_TYPE":"Doctor","ADVICE_CODE":1110,"ADVICE_CONTENT":"低分子肝素或低剂量普通肝素。  ","VALID_SEQ":0}],"NURSE_ADVICE":[{"REPORT_ID":860,"ADVICE_TYPE":"Nurse","ADVICE_CODE":1111,"ADVICE_CONTENT":"在各种治疗操作中，注意保护血管。","VALID_SEQ":0},{"REPORT_ID":860,"ADVICE_TYPE":"Nurse","ADVICE_CODE":1112,"ADVICE_CONTENT":"做好治疗措施，每三天评估一次。","VALID_SEQ":1}],"CONFIRM_FLAG":20,"CONFIRM_TIME":"20190705103522","SEND_FLAG":10,"SEND_TIME":null,"VISIT_SQ_NO":"HX2019070123","USER_ID":205,"OPERATE_TIME":"20190705103410","FORM_ID":1,"REMINDE_ID":null,"ELSE_ADVICE":[{"REPORT_ID":860,"ADVICE_TYPE":"Else","ADVICE_CODE":1108,"ADVICE_CONTENT":null,"VALID_SEQ":0}],"sublist":[{"REPORT_ID":860,"RISK_ID":1393,"DISEASE_CODE":null,"RISK_NAME":"极高危","CURRENT_RISK_LEVEL":"8","CURRENT_RISK_VALUE":6,"TARGET_RISK_LEVEL":null,"TARGET_RISK_VALUE":null,"RISK_DETAIL_DESC":"DVT发生率：40～80%，死亡率1～5%。\n","IDEAL_RISK":null,"REPORT_CODE":"HRA2019070500001","REPORT_TIME":"20190705103238","PATIENT_ADVICE":null,"DOCTOR_ADVICE":null,"NURSE_ADVICE":null}],"wxys":[{"RISK_FACTOR_ID":1003,"RISK_FACTOR_NAME":"下肢水肿(现患)","RISK_FACTOR_DESC":null,"REFERENCE_RANGES_DESC":null,"FACTOR_GROUP_ID":1,"FACTOR_SEQ":0,"CAN_CHANGE":0,"SCORE_SHOW_TYPE":20},{"RISK_FACTOR_ID":1017,"RISK_FACTOR_NAME":"其他风险因素","RISK_FACTOR_DESC":null,"REFERENCE_RANGES_DESC":null,"FACTOR_GROUP_ID":1,"FACTOR_SEQ":0,"CAN_CHANGE":0,"SCORE_SHOW_TYPE":30},{"RISK_FACTOR_ID":1031,"RISK_FACTOR_NAME":"狼疮抗凝物阳性","RISK_FACTOR_DESC":null,"REFERENCE_RANGES_DESC":null,"FACTOR_GROUP_ID":3,"FACTOR_SEQ":0,"CAN_CHANGE":0,"SCORE_SHOW_TYPE":20},{"RISK_FACTOR_ID":1041,"RISK_FACTOR_NAME":"卧床内科患者","RISK_FACTOR_DESC":null,"REFERENCE_RANGES_DESC":null,"FACTOR_GROUP_ID":1,"FACTOR_SEQ":0,"CAN_CHANGE":0,"SCORE_SHOW_TYPE":20},{"RISK_FACTOR_ID":1104,"RISK_FACTOR_NAME":"频繁跌倒","RISK_FACTOR_DESC":null,"REFERENCE_RANGES_DESC":null,"FACTOR_GROUP_ID":20,"FACTOR_SEQ":5,"CAN_CHANGE":0,"SCORE_SHOW_TYPE":20},{"RISK_FACTOR_ID":1114,"RISK_FACTOR_NAME":"抗凝药物控制不佳","RISK_FACTOR_DESC":null,"REFERENCE_RANGES_DESC":null,"FACTOR_GROUP_ID":22,"FACTOR_SEQ":15,"CAN_CHANGE":0,"SCORE_SHOW_TYPE":20}]}]},{"MERCHANT_ID":1400,"SITE_ID":1400,"DEPARTMENT":100,"FORM_ID":2,"FORM_NAME":"出血风险评估量表","FORM_TYPE":20,"FORM_SEQ":2,"BUSINESS_CLASS":"Assess","WENJUAN":[{"REPORT_ID":861,"REPORT_TIME":"20190705103359","REPORT_CODE":"HRA2019070500002","PATIENT_ID":"TMP83","PATIENT_TYPE":"Patient","DOCTOR_NAME":"血管外科医生","OBJECT_ID":null,"SERVICE_PLAN_ID":null,"SERVICE_PLAN_BATCH":null,"GATHER_TYPE":"30","PATIENT_ADVICE":[],"DOCTOR_ADVICE":[{"REPORT_ID":861,"ADVICE_TYPE":"Doctor","ADVICE_CODE":1105,"ADVICE_CONTENT":"术毕应用盐水冲洗创面，清除凝血块","VALID_SEQ":0},{"REPORT_ID":861,"ADVICE_TYPE":"Doctor","ADVICE_CODE":1106,"ADVICE_CONTENT":"术后积极预防感染，减少继发性出血的发生","VALID_SEQ":1}],"NURSE_ADVICE":[{"REPORT_ID":861,"ADVICE_TYPE":"Nurse","ADVICE_CODE":1107,"ADVICE_CONTENT":"注意平衡膳食，预防各种感染。","VALID_SEQ":0}],"CONFIRM_FLAG":20,"CONFIRM_TIME":"20190705103446","SEND_FLAG":null,"SEND_TIME":null,"VISIT_SQ_NO":"HX2019070123","USER_ID":205,"OPERATE_TIME":"20190705103359","FORM_ID":2,"REMINDE_ID":null,"ELSE_ADVICE":[{"REPORT_ID":861,"ADVICE_TYPE":"Else","ADVICE_CODE":1104,"ADVICE_CONTENT":null,"VALID_SEQ":0}],"sublist":[{"REPORT_ID":861,"RISK_ID":1392,"DISEASE_CODE":null,"RISK_NAME":"高危","CURRENT_RISK_LEVEL":"22","CURRENT_RISK_VALUE":2,"TARGET_RISK_LEVEL":null,"TARGET_RISK_VALUE":null,"RISK_DETAIL_DESC":null,"IDEAL_RISK":null,"REPORT_CODE":"HRA2019070500002","REPORT_TIME":"20190705103359","PATIENT_ADVICE":null,"DOCTOR_ADVICE":null,"NURSE_ADVICE":null}],"wxys":[{"RISK_FACTOR_ID":1003,"RISK_FACTOR_NAME":"下肢水肿(现患)","RISK_FACTOR_DESC":null,"REFERENCE_RANGES_DESC":null,"FACTOR_GROUP_ID":1,"FACTOR_SEQ":0,"CAN_CHANGE":0,"SCORE_SHOW_TYPE":20},{"RISK_FACTOR_ID":1017,"RISK_FACTOR_NAME":"其他风险因素","RISK_FACTOR_DESC":null,"REFERENCE_RANGES_DESC":null,"FACTOR_GROUP_ID":1,"FACTOR_SEQ":0,"CAN_CHANGE":0,"SCORE_SHOW_TYPE":30},{"RISK_FACTOR_ID":1031,"RISK_FACTOR_NAME":"狼疮抗凝物阳性","RISK_FACTOR_DESC":null,"REFERENCE_RANGES_DESC":null,"FACTOR_GROUP_ID":3,"FACTOR_SEQ":0,"CAN_CHANGE":0,"SCORE_SHOW_TYPE":20},{"RISK_FACTOR_ID":1041,"RISK_FACTOR_NAME":"卧床内科患者","RISK_FACTOR_DESC":null,"REFERENCE_RANGES_DESC":null,"FACTOR_GROUP_ID":1,"FACTOR_SEQ":0,"CAN_CHANGE":0,"SCORE_SHOW_TYPE":20},{"RISK_FACTOR_ID":1104,"RISK_FACTOR_NAME":"频繁跌倒","RISK_FACTOR_DESC":null,"REFERENCE_RANGES_DESC":null,"FACTOR_GROUP_ID":20,"FACTOR_SEQ":5,"CAN_CHANGE":0,"SCORE_SHOW_TYPE":20},{"RISK_FACTOR_ID":1114,"RISK_FACTOR_NAME":"抗凝药物控制不佳","RISK_FACTOR_DESC":null,"REFERENCE_RANGES_DESC":null,"FACTOR_GROUP_ID":22,"FACTOR_SEQ":15,"CAN_CHANGE":0,"SCORE_SHOW_TYPE":20}]},{"REPORT_ID":962,"REPORT_TIME":"20190705112059","REPORT_CODE":"HRA2019070500101","PATIENT_ID":"TMP83","PATIENT_TYPE":"Patient","DOCTOR_NAME":"血管外科医生","OBJECT_ID":null,"SERVICE_PLAN_ID":null,"SERVICE_PLAN_BATCH":null,"GATHER_TYPE":"30","PATIENT_ADVICE":[],"DOCTOR_ADVICE":[{"REPORT_ID":962,"ADVICE_TYPE":"Doctor","ADVICE_CODE":1132,"ADVICE_CONTENT":"术毕应用盐水冲洗创面，清除凝血块","VALID_SEQ":0},{"REPORT_ID":962,"ADVICE_TYPE":"Doctor","ADVICE_CODE":1133,"ADVICE_CONTENT":"术后积极预防感染，减少继发性出血的发生","VALID_SEQ":1}],"NURSE_ADVICE":[{"REPORT_ID":962,"ADVICE_TYPE":"Nurse","ADVICE_CODE":1134,"ADVICE_CONTENT":"注意观察患者体征。","VALID_SEQ":0},{"REPORT_ID":962,"ADVICE_TYPE":"Nurse","ADVICE_CODE":1135,"ADVICE_CONTENT":"注意平衡膳食，预防各种感染。","VALID_SEQ":1}],"CONFIRM_FLAG":20,"CONFIRM_TIME":"20190705132418","SEND_FLAG":null,"SEND_TIME":null,"VISIT_SQ_NO":"HX2019070123","USER_ID":202,"OPERATE_TIME":"20190705112059","FORM_ID":2,"REMINDE_ID":null,"ELSE_ADVICE":[{"REPORT_ID":962,"ADVICE_TYPE":"Else","ADVICE_CODE":1131,"ADVICE_CONTENT":null,"VALID_SEQ":0}],"sublist":[{"REPORT_ID":962,"RISK_ID":1494,"DISEASE_CODE":null,"RISK_NAME":"高危","CURRENT_RISK_LEVEL":"22","CURRENT_RISK_VALUE":5,"TARGET_RISK_LEVEL":null,"TARGET_RISK_VALUE":null,"RISK_DETAIL_DESC":null,"IDEAL_RISK":null,"REPORT_CODE":"HRA2019070500101","REPORT_TIME":"20190705112059","PATIENT_ADVICE":null,"DOCTOR_ADVICE":null,"NURSE_ADVICE":null}],"wxys":[{"RISK_FACTOR_ID":1101,"RISK_FACTOR_NAME":"既往出血史","RISK_FACTOR_DESC":null,"REFERENCE_RANGES_DESC":null,"FACTOR_GROUP_ID":20,"FACTOR_SEQ":2,"CAN_CHANGE":0,"SCORE_SHOW_TYPE":20},{"RISK_FACTOR_ID":1105,"RISK_FACTOR_NAME":"嗜酒","RISK_FACTOR_DESC":null,"REFERENCE_RANGES_DESC":null,"FACTOR_GROUP_ID":20,"FACTOR_SEQ":6,"CAN_CHANGE":0,"SCORE_SHOW_TYPE":20},{"RISK_FACTOR_ID":1107,"RISK_FACTOR_NAME":"转移性肿瘤","RISK_FACTOR_DESC":null,"REFERENCE_RANGES_DESC":null,"FACTOR_GROUP_ID":21,"FACTOR_SEQ":8,"CAN_CHANGE":0,"SCORE_SHOW_TYPE":20},{"RISK_FACTOR_ID":1111,"RISK_FACTOR_NAME":"糖尿病","RISK_FACTOR_DESC":null,"REFERENCE_RANGES_DESC":null,"FACTOR_GROUP_ID":21,"FACTOR_SEQ":12,"CAN_CHANGE":0,"SCORE_SHOW_TYPE":20},{"RISK_FACTOR_ID":1114,"RISK_FACTOR_NAME":"抗凝药物控制不佳","RISK_FACTOR_DESC":null,"REFERENCE_RANGES_DESC":null,"FACTOR_GROUP_ID":22,"FACTOR_SEQ":15,"CAN_CHANGE":0,"SCORE_SHOW_TYPE":20}]},{"REPORT_ID":995,"REPORT_TIME":"20190705113417","REPORT_CODE":"HRA2019070500134","PATIENT_ID":"TMP83","PATIENT_TYPE":"Patient","DOCTOR_NAME":"血管外科医生","OBJECT_ID":null,"SERVICE_PLAN_ID":null,"SERVICE_PLAN_BATCH":null,"GATHER_TYPE":"30","PATIENT_ADVICE":[],"DOCTOR_ADVICE":[{"REPORT_ID":995,"ADVICE_TYPE":"Doctor","ADVICE_CODE":1137,"ADVICE_CONTENT":"术毕应用盐水冲洗创面，清除凝血块","VALID_SEQ":0}],"NURSE_ADVICE":[{"REPORT_ID":995,"ADVICE_TYPE":"Nurse","ADVICE_CODE":1138,"ADVICE_CONTENT":"注意平衡膳食，预防各种感染。","VALID_SEQ":0}],"CONFIRM_FLAG":20,"CONFIRM_TIME":"20190705132428","SEND_FLAG":null,"SEND_TIME":null,"VISIT_SQ_NO":"HX2019070123","USER_ID":202,"OPERATE_TIME":"20190705113417","FORM_ID":2,"REMINDE_ID":null,"ELSE_ADVICE":[{"REPORT_ID":995,"ADVICE_TYPE":"Else","ADVICE_CODE":1136,"ADVICE_CONTENT":null,"VALID_SEQ":0}],"sublist":[{"REPORT_ID":995,"RISK_ID":1530,"DISEASE_CODE":null,"RISK_NAME":"高危","CURRENT_RISK_LEVEL":"22","CURRENT_RISK_VALUE":35,"TARGET_RISK_LEVEL":null,"TARGET_RISK_VALUE":null,"RISK_DETAIL_DESC":null,"IDEAL_RISK":null,"REPORT_CODE":"HRA2019070500134","REPORT_TIME":"20190705113417","PATIENT_ADVICE":null,"DOCTOR_ADVICE":null,"NURSE_ADVICE":null}],"wxys":[{"RISK_FACTOR_ID":1101,"RISK_FACTOR_NAME":"既往出血史","RISK_FACTOR_DESC":null,"REFERENCE_RANGES_DESC":null,"FACTOR_GROUP_ID":20,"FACTOR_SEQ":2,"CAN_CHANGE":0,"SCORE_SHOW_TYPE":20},{"RISK_FACTOR_ID":1105,"RISK_FACTOR_NAME":"嗜酒","RISK_FACTOR_DESC":null,"REFERENCE_RANGES_DESC":null,"FACTOR_GROUP_ID":20,"FACTOR_SEQ":6,"CAN_CHANGE":0,"SCORE_SHOW_TYPE":20},{"RISK_FACTOR_ID":1107,"RISK_FACTOR_NAME":"转移性肿瘤","RISK_FACTOR_DESC":null,"REFERENCE_RANGES_DESC":null,"FACTOR_GROUP_ID":21,"FACTOR_SEQ":8,"CAN_CHANGE":0,"SCORE_SHOW_TYPE":20}]},{"REPORT_ID":1382,"REPORT_TIME":"20190705132345","REPORT_CODE":"HRA2019070500505","PATIENT_ID":"TMP83","PATIENT_TYPE":"Patient","DOCTOR_NAME":"血管外科医生","OBJECT_ID":null,"SERVICE_PLAN_ID":null,"SERVICE_PLAN_BATCH":null,"GATHER_TYPE":"30","PATIENT_ADVICE":[],"DOCTOR_ADVICE":[],"NURSE_ADVICE":[{"REPORT_ID":1382,"ADVICE_TYPE":"Nurse","ADVICE_CODE":1140,"ADVICE_CONTENT":"注意平衡膳食，预防各种感染。","VALID_SEQ":0}],"CONFIRM_FLAG":20,"CONFIRM_TIME":"20190705132437","SEND_FLAG":null,"SEND_TIME":null,"VISIT_SQ_NO":"HX2019070123","USER_ID":205,"OPERATE_TIME":"20190705132345","FORM_ID":2,"REMINDE_ID":null,"ELSE_ADVICE":[{"REPORT_ID":1382,"ADVICE_TYPE":"Else","ADVICE_CODE":1139,"ADVICE_CONTENT":null,"VALID_SEQ":0}],"sublist":[{"REPORT_ID":1382,"RISK_ID":1918,"DISEASE_CODE":null,"RISK_NAME":"高危","CURRENT_RISK_LEVEL":"22","CURRENT_RISK_VALUE":2,"TARGET_RISK_LEVEL":null,"TARGET_RISK_VALUE":null,"RISK_DETAIL_DESC":null,"IDEAL_RISK":null,"REPORT_CODE":"HRA2019070500505","REPORT_TIME":"20190705132345","PATIENT_ADVICE":null,"DOCTOR_ADVICE":null,"NURSE_ADVICE":null}],"wxys":[{"RISK_FACTOR_ID":1100,"RISK_FACTOR_NAME":"年龄>75岁","RISK_FACTOR_DESC":null,"REFERENCE_RANGES_DESC":null,"FACTOR_GROUP_ID":20,"FACTOR_SEQ":1,"CAN_CHANGE":0,"SCORE_SHOW_TYPE":20},{"RISK_FACTOR_ID":1110,"RISK_FACTOR_NAME":"血小板减少","RISK_FACTOR_DESC":null,"REFERENCE_RANGES_DESC":null,"FACTOR_GROUP_ID":21,"FACTOR_SEQ":11,"CAN_CHANGE":0,"SCORE_SHOW_TYPE":20}]}]}]
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
        private List<JibinlistBean> jibinlist;
        private List<ReportListBean> reportList;

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

        public List<JibinlistBean> getJibinlist() {
            return jibinlist;
        }

        public void setJibinlist(List<JibinlistBean> jibinlist) {
            this.jibinlist = jibinlist;
        }

        public List<ReportListBean> getReportList() {
            return reportList;
        }

        public void setReportList(List<ReportListBean> reportList) {
            this.reportList = reportList;
        }

        public static class JibinlistBean implements Serializable  {
            /**
             * DIAGNOSIS_DISEASE_NAME : 左下肢肿胀，有伤口
             * DIAGNOSIS_DATE : 20190705103123
             */

            private String DIAGNOSIS_DISEASE_NAME;
            private String DIAGNOSIS_DATE;

            public String getDIAGNOSIS_DISEASE_NAME() {
                return DIAGNOSIS_DISEASE_NAME;
            }

            public void setDIAGNOSIS_DISEASE_NAME(String DIAGNOSIS_DISEASE_NAME) {
                this.DIAGNOSIS_DISEASE_NAME = DIAGNOSIS_DISEASE_NAME;
            }

            public String getDIAGNOSIS_DATE() {
                return DIAGNOSIS_DATE;
            }

            public void setDIAGNOSIS_DATE(String DIAGNOSIS_DATE) {
                this.DIAGNOSIS_DATE = DIAGNOSIS_DATE;
            }
        }

        public static class ReportListBean implements Serializable  {
            /**
             * MERCHANT_ID : 1400
             * SITE_ID : 1400
             * DEPARTMENT : 100
             * FORM_ID : 1
             * FORM_NAME : Caprini风险评估量表
             * FORM_TYPE : 10
             * FORM_SEQ : 1
             * BUSINESS_CLASS : Assess
             * WENJUAN : [{"REPORT_ID":860,"REPORT_TIME":"20190705103238","REPORT_CODE":"HRA2019070500001","PATIENT_ID":"TMP83","PATIENT_TYPE":"Patient","DOCTOR_NAME":"血管外科医生","OBJECT_ID":null,"SERVICE_PLAN_ID":null,"SERVICE_PLAN_BATCH":null,"GATHER_TYPE":"30","PATIENT_ADVICE":[{"REPORT_ID":860,"ADVICE_TYPE":"Patient","ADVICE_CODE":1109,"ADVICE_CONTENT":"注意观察病情，协助医生和护士完成积极的治疗措施。","VALID_SEQ":0}],"DOCTOR_ADVICE":[{"REPORT_ID":860,"ADVICE_TYPE":"Doctor","ADVICE_CODE":1110,"ADVICE_CONTENT":"低分子肝素或低剂量普通肝素。  ","VALID_SEQ":0}],"NURSE_ADVICE":[{"REPORT_ID":860,"ADVICE_TYPE":"Nurse","ADVICE_CODE":1111,"ADVICE_CONTENT":"在各种治疗操作中，注意保护血管。","VALID_SEQ":0},{"REPORT_ID":860,"ADVICE_TYPE":"Nurse","ADVICE_CODE":1112,"ADVICE_CONTENT":"做好治疗措施，每三天评估一次。","VALID_SEQ":1}],"CONFIRM_FLAG":20,"CONFIRM_TIME":"20190705103522","SEND_FLAG":10,"SEND_TIME":null,"VISIT_SQ_NO":"HX2019070123","USER_ID":205,"OPERATE_TIME":"20190705103410","FORM_ID":1,"REMINDE_ID":null,"ELSE_ADVICE":[{"REPORT_ID":860,"ADVICE_TYPE":"Else","ADVICE_CODE":1108,"ADVICE_CONTENT":null,"VALID_SEQ":0}],"sublist":[{"REPORT_ID":860,"RISK_ID":1393,"DISEASE_CODE":null,"RISK_NAME":"极高危","CURRENT_RISK_LEVEL":"8","CURRENT_RISK_VALUE":6,"TARGET_RISK_LEVEL":null,"TARGET_RISK_VALUE":null,"RISK_DETAIL_DESC":"DVT发生率：40～80%，死亡率1～5%。\n","IDEAL_RISK":null,"REPORT_CODE":"HRA2019070500001","REPORT_TIME":"20190705103238","PATIENT_ADVICE":null,"DOCTOR_ADVICE":null,"NURSE_ADVICE":null}],"wxys":[{"RISK_FACTOR_ID":1003,"RISK_FACTOR_NAME":"下肢水肿(现患)","RISK_FACTOR_DESC":null,"REFERENCE_RANGES_DESC":null,"FACTOR_GROUP_ID":1,"FACTOR_SEQ":0,"CAN_CHANGE":0,"SCORE_SHOW_TYPE":20},{"RISK_FACTOR_ID":1017,"RISK_FACTOR_NAME":"其他风险因素","RISK_FACTOR_DESC":null,"REFERENCE_RANGES_DESC":null,"FACTOR_GROUP_ID":1,"FACTOR_SEQ":0,"CAN_CHANGE":0,"SCORE_SHOW_TYPE":30},{"RISK_FACTOR_ID":1031,"RISK_FACTOR_NAME":"狼疮抗凝物阳性","RISK_FACTOR_DESC":null,"REFERENCE_RANGES_DESC":null,"FACTOR_GROUP_ID":3,"FACTOR_SEQ":0,"CAN_CHANGE":0,"SCORE_SHOW_TYPE":20},{"RISK_FACTOR_ID":1041,"RISK_FACTOR_NAME":"卧床内科患者","RISK_FACTOR_DESC":null,"REFERENCE_RANGES_DESC":null,"FACTOR_GROUP_ID":1,"FACTOR_SEQ":0,"CAN_CHANGE":0,"SCORE_SHOW_TYPE":20},{"RISK_FACTOR_ID":1104,"RISK_FACTOR_NAME":"频繁跌倒","RISK_FACTOR_DESC":null,"REFERENCE_RANGES_DESC":null,"FACTOR_GROUP_ID":20,"FACTOR_SEQ":5,"CAN_CHANGE":0,"SCORE_SHOW_TYPE":20},{"RISK_FACTOR_ID":1114,"RISK_FACTOR_NAME":"抗凝药物控制不佳","RISK_FACTOR_DESC":null,"REFERENCE_RANGES_DESC":null,"FACTOR_GROUP_ID":22,"FACTOR_SEQ":15,"CAN_CHANGE":0,"SCORE_SHOW_TYPE":20}]}]
             */

            private int MERCHANT_ID;
            private int SITE_ID;
            private int DEPARTMENT;
            private int FORM_ID;
            private String FORM_NAME;
            private int FORM_TYPE;
            private int FORM_SEQ;
            private String BUSINESS_CLASS;
            private List<WENJUANBean> WENJUAN;
            public boolean che_color = false;
            public int form_id = 1;

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

            public List<WENJUANBean> getWENJUAN() {
                return WENJUAN;
            }

            public void setWENJUAN(List<WENJUANBean> WENJUAN) {
                this.WENJUAN = WENJUAN;
            }

            public static class WENJUANBean implements Serializable  {
                /**
                 * REPORT_ID : 860
                 * REPORT_TIME : 20190705103238
                 * REPORT_CODE : HRA2019070500001
                 * PATIENT_ID : TMP83
                 * PATIENT_TYPE : Patient
                 * DOCTOR_NAME : 血管外科医生
                 * OBJECT_ID : null
                 * SERVICE_PLAN_ID : null
                 * SERVICE_PLAN_BATCH : null
                 * GATHER_TYPE : 30
                 * PATIENT_ADVICE : [{"REPORT_ID":860,"ADVICE_TYPE":"Patient","ADVICE_CODE":1109,"ADVICE_CONTENT":"注意观察病情，协助医生和护士完成积极的治疗措施。","VALID_SEQ":0}]
                 * DOCTOR_ADVICE : [{"REPORT_ID":860,"ADVICE_TYPE":"Doctor","ADVICE_CODE":1110,"ADVICE_CONTENT":"低分子肝素或低剂量普通肝素。  ","VALID_SEQ":0}]
                 * NURSE_ADVICE : [{"REPORT_ID":860,"ADVICE_TYPE":"Nurse","ADVICE_CODE":1111,"ADVICE_CONTENT":"在各种治疗操作中，注意保护血管。","VALID_SEQ":0},{"REPORT_ID":860,"ADVICE_TYPE":"Nurse","ADVICE_CODE":1112,"ADVICE_CONTENT":"做好治疗措施，每三天评估一次。","VALID_SEQ":1}]
                 * CONFIRM_FLAG : 20
                 * CONFIRM_TIME : 20190705103522
                 * SEND_FLAG : 10
                 * SEND_TIME : null
                 * VISIT_SQ_NO : HX2019070123
                 * USER_ID : 205
                 * OPERATE_TIME : 20190705103410
                 * FORM_ID : 1
                 * REMINDE_ID : null
                 * ELSE_ADVICE : [{"REPORT_ID":860,"ADVICE_TYPE":"Else","ADVICE_CODE":1108,"ADVICE_CONTENT":null,"VALID_SEQ":0}]
                 * sublist : [{"REPORT_ID":860,"RISK_ID":1393,"DISEASE_CODE":null,"RISK_NAME":"极高危","CURRENT_RISK_LEVEL":"8","CURRENT_RISK_VALUE":6,"TARGET_RISK_LEVEL":null,"TARGET_RISK_VALUE":null,"RISK_DETAIL_DESC":"DVT发生率：40～80%，死亡率1～5%。\n","IDEAL_RISK":null,"REPORT_CODE":"HRA2019070500001","REPORT_TIME":"20190705103238","PATIENT_ADVICE":null,"DOCTOR_ADVICE":null,"NURSE_ADVICE":null}]
                 * wxys : [{"RISK_FACTOR_ID":1003,"RISK_FACTOR_NAME":"下肢水肿(现患)","RISK_FACTOR_DESC":null,"REFERENCE_RANGES_DESC":null,"FACTOR_GROUP_ID":1,"FACTOR_SEQ":0,"CAN_CHANGE":0,"SCORE_SHOW_TYPE":20},{"RISK_FACTOR_ID":1017,"RISK_FACTOR_NAME":"其他风险因素","RISK_FACTOR_DESC":null,"REFERENCE_RANGES_DESC":null,"FACTOR_GROUP_ID":1,"FACTOR_SEQ":0,"CAN_CHANGE":0,"SCORE_SHOW_TYPE":30},{"RISK_FACTOR_ID":1031,"RISK_FACTOR_NAME":"狼疮抗凝物阳性","RISK_FACTOR_DESC":null,"REFERENCE_RANGES_DESC":null,"FACTOR_GROUP_ID":3,"FACTOR_SEQ":0,"CAN_CHANGE":0,"SCORE_SHOW_TYPE":20},{"RISK_FACTOR_ID":1041,"RISK_FACTOR_NAME":"卧床内科患者","RISK_FACTOR_DESC":null,"REFERENCE_RANGES_DESC":null,"FACTOR_GROUP_ID":1,"FACTOR_SEQ":0,"CAN_CHANGE":0,"SCORE_SHOW_TYPE":20},{"RISK_FACTOR_ID":1104,"RISK_FACTOR_NAME":"频繁跌倒","RISK_FACTOR_DESC":null,"REFERENCE_RANGES_DESC":null,"FACTOR_GROUP_ID":20,"FACTOR_SEQ":5,"CAN_CHANGE":0,"SCORE_SHOW_TYPE":20},{"RISK_FACTOR_ID":1114,"RISK_FACTOR_NAME":"抗凝药物控制不佳","RISK_FACTOR_DESC":null,"REFERENCE_RANGES_DESC":null,"FACTOR_GROUP_ID":22,"FACTOR_SEQ":15,"CAN_CHANGE":0,"SCORE_SHOW_TYPE":20}]
                 */

                private int REPORT_ID;
                private String REPORT_TIME;
                private String REPORT_CODE;
                private String PATIENT_ID;
                private String PATIENT_TYPE;
                private String DOCTOR_NAME;
                private Object OBJECT_ID;
                private Object SERVICE_PLAN_ID;
                private Object SERVICE_PLAN_BATCH;
                private String GATHER_TYPE;
                private int CONFIRM_FLAG;
                private String CONFIRM_TIME;
                private int SEND_FLAG;
                private Object SEND_TIME;
                private String VISIT_SQ_NO;
                private int USER_ID;
                private String OPERATE_TIME;
                private int FORM_ID;
                private Object REMINDE_ID;
                private List<PATIENTADVICEBean> PATIENT_ADVICE;
                private List<DOCTORADVICEBean> DOCTOR_ADVICE;
                private List<NURSEADVICEBean> NURSE_ADVICE;
                private List<ELSEADVICEBean> ELSE_ADVICE;
                private List<SublistBean> sublist;
                private List<WxysBean> wxys;

                public int getREPORT_ID() {
                    return REPORT_ID;
                }

                public void setREPORT_ID(int REPORT_ID) {
                    this.REPORT_ID = REPORT_ID;
                }

                public String getREPORT_TIME() {
                    return REPORT_TIME;
                }

                public void setREPORT_TIME(String REPORT_TIME) {
                    this.REPORT_TIME = REPORT_TIME;
                }

                public String getREPORT_CODE() {
                    return REPORT_CODE;
                }

                public void setREPORT_CODE(String REPORT_CODE) {
                    this.REPORT_CODE = REPORT_CODE;
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

                public String getDOCTOR_NAME() {
                    return DOCTOR_NAME;
                }

                public void setDOCTOR_NAME(String DOCTOR_NAME) {
                    this.DOCTOR_NAME = DOCTOR_NAME;
                }

                public Object getOBJECT_ID() {
                    return OBJECT_ID;
                }

                public void setOBJECT_ID(Object OBJECT_ID) {
                    this.OBJECT_ID = OBJECT_ID;
                }

                public Object getSERVICE_PLAN_ID() {
                    return SERVICE_PLAN_ID;
                }

                public void setSERVICE_PLAN_ID(Object SERVICE_PLAN_ID) {
                    this.SERVICE_PLAN_ID = SERVICE_PLAN_ID;
                }

                public Object getSERVICE_PLAN_BATCH() {
                    return SERVICE_PLAN_BATCH;
                }

                public void setSERVICE_PLAN_BATCH(Object SERVICE_PLAN_BATCH) {
                    this.SERVICE_PLAN_BATCH = SERVICE_PLAN_BATCH;
                }

                public String getGATHER_TYPE() {
                    return GATHER_TYPE;
                }

                public void setGATHER_TYPE(String GATHER_TYPE) {
                    this.GATHER_TYPE = GATHER_TYPE;
                }

                public int getCONFIRM_FLAG() {
                    return CONFIRM_FLAG;
                }

                public void setCONFIRM_FLAG(int CONFIRM_FLAG) {
                    this.CONFIRM_FLAG = CONFIRM_FLAG;
                }

                public String getCONFIRM_TIME() {
                    return CONFIRM_TIME;
                }

                public void setCONFIRM_TIME(String CONFIRM_TIME) {
                    this.CONFIRM_TIME = CONFIRM_TIME;
                }

                public int getSEND_FLAG() {
                    return SEND_FLAG;
                }

                public void setSEND_FLAG(int SEND_FLAG) {
                    this.SEND_FLAG = SEND_FLAG;
                }

                public Object getSEND_TIME() {
                    return SEND_TIME;
                }

                public void setSEND_TIME(Object SEND_TIME) {
                    this.SEND_TIME = SEND_TIME;
                }

                public String getVISIT_SQ_NO() {
                    return VISIT_SQ_NO;
                }

                public void setVISIT_SQ_NO(String VISIT_SQ_NO) {
                    this.VISIT_SQ_NO = VISIT_SQ_NO;
                }

                public int getUSER_ID() {
                    return USER_ID;
                }

                public void setUSER_ID(int USER_ID) {
                    this.USER_ID = USER_ID;
                }

                public String getOPERATE_TIME() {
                    return OPERATE_TIME;
                }

                public void setOPERATE_TIME(String OPERATE_TIME) {
                    this.OPERATE_TIME = OPERATE_TIME;
                }

                public int getFORM_ID() {
                    return FORM_ID;
                }

                public void setFORM_ID(int FORM_ID) {
                    this.FORM_ID = FORM_ID;
                }

                public Object getREMINDE_ID() {
                    return REMINDE_ID;
                }

                public void setREMINDE_ID(Object REMINDE_ID) {
                    this.REMINDE_ID = REMINDE_ID;
                }

                public List<PATIENTADVICEBean> getPATIENT_ADVICE() {
                    return PATIENT_ADVICE;
                }

                public void setPATIENT_ADVICE(List<PATIENTADVICEBean> PATIENT_ADVICE) {
                    this.PATIENT_ADVICE = PATIENT_ADVICE;
                }

                public List<DOCTORADVICEBean> getDOCTOR_ADVICE() {
                    return DOCTOR_ADVICE;
                }

                public void setDOCTOR_ADVICE(List<DOCTORADVICEBean> DOCTOR_ADVICE) {
                    this.DOCTOR_ADVICE = DOCTOR_ADVICE;
                }

                public List<NURSEADVICEBean> getNURSE_ADVICE() {
                    return NURSE_ADVICE;
                }

                public void setNURSE_ADVICE(List<NURSEADVICEBean> NURSE_ADVICE) {
                    this.NURSE_ADVICE = NURSE_ADVICE;
                }

                public List<ELSEADVICEBean> getELSE_ADVICE() {
                    return ELSE_ADVICE;
                }

                public void setELSE_ADVICE(List<ELSEADVICEBean> ELSE_ADVICE) {
                    this.ELSE_ADVICE = ELSE_ADVICE;
                }

                public List<SublistBean> getSublist() {
                    return sublist;
                }

                public void setSublist(List<SublistBean> sublist) {
                    this.sublist = sublist;
                }

                public List<WxysBean> getWxys() {
                    return wxys;
                }

                public void setWxys(List<WxysBean> wxys) {
                    this.wxys = wxys;
                }

                public static class PATIENTADVICEBean implements Serializable  {
                    /**
                     * REPORT_ID : 860
                     * ADVICE_TYPE : Patient
                     * ADVICE_CODE : 1109
                     * ADVICE_CONTENT : 注意观察病情，协助医生和护士完成积极的治疗措施。
                     * VALID_SEQ : 0
                     */

                    private int REPORT_ID;
                    private String ADVICE_TYPE;
                    private int ADVICE_CODE;
                    private String ADVICE_CONTENT;
                    private int VALID_SEQ;

                    public int getREPORT_ID() {
                        return REPORT_ID;
                    }

                    public void setREPORT_ID(int REPORT_ID) {
                        this.REPORT_ID = REPORT_ID;
                    }

                    public String getADVICE_TYPE() {
                        return ADVICE_TYPE;
                    }

                    public void setADVICE_TYPE(String ADVICE_TYPE) {
                        this.ADVICE_TYPE = ADVICE_TYPE;
                    }

                    public int getADVICE_CODE() {
                        return ADVICE_CODE;
                    }

                    public void setADVICE_CODE(int ADVICE_CODE) {
                        this.ADVICE_CODE = ADVICE_CODE;
                    }

                    public String getADVICE_CONTENT() {
                        return ADVICE_CONTENT;
                    }

                    public void setADVICE_CONTENT(String ADVICE_CONTENT) {
                        this.ADVICE_CONTENT = ADVICE_CONTENT;
                    }

                    public int getVALID_SEQ() {
                        return VALID_SEQ;
                    }

                    public void setVALID_SEQ(int VALID_SEQ) {
                        this.VALID_SEQ = VALID_SEQ;
                    }
                }

                public static class DOCTORADVICEBean implements Serializable  {
                    /**
                     * REPORT_ID : 860
                     * ADVICE_TYPE : Doctor
                     * ADVICE_CODE : 1110
                     * ADVICE_CONTENT : 低分子肝素或低剂量普通肝素。
                     * VALID_SEQ : 0
                     */

                    private int REPORT_ID;
                    private String ADVICE_TYPE;
                    private int ADVICE_CODE;
                    private String ADVICE_CONTENT;
                    private int VALID_SEQ;

                    public int getREPORT_ID() {
                        return REPORT_ID;
                    }

                    public void setREPORT_ID(int REPORT_ID) {
                        this.REPORT_ID = REPORT_ID;
                    }

                    public String getADVICE_TYPE() {
                        return ADVICE_TYPE;
                    }

                    public void setADVICE_TYPE(String ADVICE_TYPE) {
                        this.ADVICE_TYPE = ADVICE_TYPE;
                    }

                    public int getADVICE_CODE() {
                        return ADVICE_CODE;
                    }

                    public void setADVICE_CODE(int ADVICE_CODE) {
                        this.ADVICE_CODE = ADVICE_CODE;
                    }

                    public String getADVICE_CONTENT() {
                        return ADVICE_CONTENT;
                    }

                    public void setADVICE_CONTENT(String ADVICE_CONTENT) {
                        this.ADVICE_CONTENT = ADVICE_CONTENT;
                    }

                    public int getVALID_SEQ() {
                        return VALID_SEQ;
                    }

                    public void setVALID_SEQ(int VALID_SEQ) {
                        this.VALID_SEQ = VALID_SEQ;
                    }
                }

                public static class NURSEADVICEBean implements Serializable  {
                    /**
                     * REPORT_ID : 860
                     * ADVICE_TYPE : Nurse
                     * ADVICE_CODE : 1111
                     * ADVICE_CONTENT : 在各种治疗操作中，注意保护血管。
                     * VALID_SEQ : 0
                     */

                    private int REPORT_ID;
                    private String ADVICE_TYPE;
                    private int ADVICE_CODE;
                    private String ADVICE_CONTENT;
                    private int VALID_SEQ;

                    public int getREPORT_ID() {
                        return REPORT_ID;
                    }

                    public void setREPORT_ID(int REPORT_ID) {
                        this.REPORT_ID = REPORT_ID;
                    }

                    public String getADVICE_TYPE() {
                        return ADVICE_TYPE;
                    }

                    public void setADVICE_TYPE(String ADVICE_TYPE) {
                        this.ADVICE_TYPE = ADVICE_TYPE;
                    }

                    public int getADVICE_CODE() {
                        return ADVICE_CODE;
                    }

                    public void setADVICE_CODE(int ADVICE_CODE) {
                        this.ADVICE_CODE = ADVICE_CODE;
                    }

                    public String getADVICE_CONTENT() {
                        return ADVICE_CONTENT;
                    }

                    public void setADVICE_CONTENT(String ADVICE_CONTENT) {
                        this.ADVICE_CONTENT = ADVICE_CONTENT;
                    }

                    public int getVALID_SEQ() {
                        return VALID_SEQ;
                    }

                    public void setVALID_SEQ(int VALID_SEQ) {
                        this.VALID_SEQ = VALID_SEQ;
                    }
                }

                public static class ELSEADVICEBean implements Serializable  {
                    /**
                     * REPORT_ID : 860
                     * ADVICE_TYPE : Else
                     * ADVICE_CODE : 1108
                     * ADVICE_CONTENT : null
                     * VALID_SEQ : 0
                     */

                    private int REPORT_ID;
                    private String ADVICE_TYPE;
                    private int ADVICE_CODE;
                    private Object ADVICE_CONTENT;
                    private int VALID_SEQ;

                    public int getREPORT_ID() {
                        return REPORT_ID;
                    }

                    public void setREPORT_ID(int REPORT_ID) {
                        this.REPORT_ID = REPORT_ID;
                    }

                    public String getADVICE_TYPE() {
                        return ADVICE_TYPE;
                    }

                    public void setADVICE_TYPE(String ADVICE_TYPE) {
                        this.ADVICE_TYPE = ADVICE_TYPE;
                    }

                    public int getADVICE_CODE() {
                        return ADVICE_CODE;
                    }

                    public void setADVICE_CODE(int ADVICE_CODE) {
                        this.ADVICE_CODE = ADVICE_CODE;
                    }

                    public Object getADVICE_CONTENT() {
                        return ADVICE_CONTENT;
                    }

                    public void setADVICE_CONTENT(Object ADVICE_CONTENT) {
                        this.ADVICE_CONTENT = ADVICE_CONTENT;
                    }

                    public int getVALID_SEQ() {
                        return VALID_SEQ;
                    }

                    public void setVALID_SEQ(int VALID_SEQ) {
                        this.VALID_SEQ = VALID_SEQ;
                    }
                }

                public static class SublistBean implements Serializable  {
                    /**
                     * REPORT_ID : 860
                     * RISK_ID : 1393
                     * DISEASE_CODE : null
                     * RISK_NAME : 极高危
                     * CURRENT_RISK_LEVEL : 8
                     * CURRENT_RISK_VALUE : 6
                     * TARGET_RISK_LEVEL : null
                     * TARGET_RISK_VALUE : null
                     * RISK_DETAIL_DESC : DVT发生率：40～80%，死亡率1～5%。
                     * IDEAL_RISK : null
                     * REPORT_CODE : HRA2019070500001
                     * REPORT_TIME : 20190705103238
                     * PATIENT_ADVICE : null
                     * DOCTOR_ADVICE : null
                     * NURSE_ADVICE : null
                     */

                    private int REPORT_ID;
                    private int RISK_ID;
                    private Object DISEASE_CODE;
                    private String RISK_NAME;
                    private String CURRENT_RISK_LEVEL;
                    private int CURRENT_RISK_VALUE;
                    private Object TARGET_RISK_LEVEL;
                    private Object TARGET_RISK_VALUE;
                    private String RISK_DETAIL_DESC;
                    private Object IDEAL_RISK;
                    private String REPORT_CODE;
                    private String REPORT_TIME;
                    private Object PATIENT_ADVICE;
                    private Object DOCTOR_ADVICE;
                    private Object NURSE_ADVICE;

                    public int getREPORT_ID() {
                        return REPORT_ID;
                    }

                    public void setREPORT_ID(int REPORT_ID) {
                        this.REPORT_ID = REPORT_ID;
                    }

                    public int getRISK_ID() {
                        return RISK_ID;
                    }

                    public void setRISK_ID(int RISK_ID) {
                        this.RISK_ID = RISK_ID;
                    }

                    public Object getDISEASE_CODE() {
                        return DISEASE_CODE;
                    }

                    public void setDISEASE_CODE(Object DISEASE_CODE) {
                        this.DISEASE_CODE = DISEASE_CODE;
                    }

                    public String getRISK_NAME() {
                        return RISK_NAME;
                    }

                    public void setRISK_NAME(String RISK_NAME) {
                        this.RISK_NAME = RISK_NAME;
                    }

                    public String getCURRENT_RISK_LEVEL() {
                        return CURRENT_RISK_LEVEL;
                    }

                    public void setCURRENT_RISK_LEVEL(String CURRENT_RISK_LEVEL) {
                        this.CURRENT_RISK_LEVEL = CURRENT_RISK_LEVEL;
                    }

                    public int getCURRENT_RISK_VALUE() {
                        return CURRENT_RISK_VALUE;
                    }

                    public void setCURRENT_RISK_VALUE(int CURRENT_RISK_VALUE) {
                        this.CURRENT_RISK_VALUE = CURRENT_RISK_VALUE;
                    }

                    public Object getTARGET_RISK_LEVEL() {
                        return TARGET_RISK_LEVEL;
                    }

                    public void setTARGET_RISK_LEVEL(Object TARGET_RISK_LEVEL) {
                        this.TARGET_RISK_LEVEL = TARGET_RISK_LEVEL;
                    }

                    public Object getTARGET_RISK_VALUE() {
                        return TARGET_RISK_VALUE;
                    }

                    public void setTARGET_RISK_VALUE(Object TARGET_RISK_VALUE) {
                        this.TARGET_RISK_VALUE = TARGET_RISK_VALUE;
                    }

                    public String getRISK_DETAIL_DESC() {
                        return RISK_DETAIL_DESC;
                    }

                    public void setRISK_DETAIL_DESC(String RISK_DETAIL_DESC) {
                        this.RISK_DETAIL_DESC = RISK_DETAIL_DESC;
                    }

                    public Object getIDEAL_RISK() {
                        return IDEAL_RISK;
                    }

                    public void setIDEAL_RISK(Object IDEAL_RISK) {
                        this.IDEAL_RISK = IDEAL_RISK;
                    }

                    public String getREPORT_CODE() {
                        return REPORT_CODE;
                    }

                    public void setREPORT_CODE(String REPORT_CODE) {
                        this.REPORT_CODE = REPORT_CODE;
                    }

                    public String getREPORT_TIME() {
                        return REPORT_TIME;
                    }

                    public void setREPORT_TIME(String REPORT_TIME) {
                        this.REPORT_TIME = REPORT_TIME;
                    }

                    public Object getPATIENT_ADVICE() {
                        return PATIENT_ADVICE;
                    }

                    public void setPATIENT_ADVICE(Object PATIENT_ADVICE) {
                        this.PATIENT_ADVICE = PATIENT_ADVICE;
                    }

                    public Object getDOCTOR_ADVICE() {
                        return DOCTOR_ADVICE;
                    }

                    public void setDOCTOR_ADVICE(Object DOCTOR_ADVICE) {
                        this.DOCTOR_ADVICE = DOCTOR_ADVICE;
                    }

                    public Object getNURSE_ADVICE() {
                        return NURSE_ADVICE;
                    }

                    public void setNURSE_ADVICE(Object NURSE_ADVICE) {
                        this.NURSE_ADVICE = NURSE_ADVICE;
                    }
                }

                public static class WxysBean implements Serializable  {

                    /**
                     * RISK_FACTOR_ID : 1003
                     * RISK_FACTOR_NAME : 下肢水肿(现患)
                     * RISK_FACTOR_DESC : null
                     * REFERENCE_RANGES_DESC : null
                     * FACTOR_GROUP_ID : 1
                     * FACTOR_SEQ : 0
                     * CAN_CHANGE : 0
                     * SCORE_SHOW_TYPE : 20
                     * EFFECTIVE_TYPE : Once
                     * EFFECTIVE_TIME : 0
                     * ANALYSIS_SOURCE_STR : 于2019-07-18 23:23:43智能采集，来源于入院情况：“双下肢轻度水肿”；李护士2019-07-19 06:42:08确认
                     */

                    private int RISK_FACTOR_ID;
                    private String RISK_FACTOR_NAME;
                    private Object RISK_FACTOR_DESC;
                    private Object REFERENCE_RANGES_DESC;
                    private int FACTOR_GROUP_ID;
                    private int FACTOR_SEQ;
                    private int CAN_CHANGE;
                    private int SCORE_SHOW_TYPE;
                    private String EFFECTIVE_TYPE;
                    private int EFFECTIVE_TIME;
                    private String ANALYSIS_SOURCE_STR;
                    private String CURRENT_DESC;


                    public String getCURRENT_DESC() {
                        return CURRENT_DESC;
                    }

                    public void setCURRENT_DESC(String CURRENT_DESC) {
                        this.CURRENT_DESC = CURRENT_DESC;
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

                    public Object getRISK_FACTOR_DESC() {
                        return RISK_FACTOR_DESC;
                    }

                    public void setRISK_FACTOR_DESC(Object RISK_FACTOR_DESC) {
                        this.RISK_FACTOR_DESC = RISK_FACTOR_DESC;
                    }

                    public Object getREFERENCE_RANGES_DESC() {
                        return REFERENCE_RANGES_DESC;
                    }

                    public void setREFERENCE_RANGES_DESC(Object REFERENCE_RANGES_DESC) {
                        this.REFERENCE_RANGES_DESC = REFERENCE_RANGES_DESC;
                    }

                    public int getFACTOR_GROUP_ID() {
                        return FACTOR_GROUP_ID;
                    }

                    public void setFACTOR_GROUP_ID(int FACTOR_GROUP_ID) {
                        this.FACTOR_GROUP_ID = FACTOR_GROUP_ID;
                    }

                    public int getFACTOR_SEQ() {
                        return FACTOR_SEQ;
                    }

                    public void setFACTOR_SEQ(int FACTOR_SEQ) {
                        this.FACTOR_SEQ = FACTOR_SEQ;
                    }

                    public int getCAN_CHANGE() {
                        return CAN_CHANGE;
                    }

                    public void setCAN_CHANGE(int CAN_CHANGE) {
                        this.CAN_CHANGE = CAN_CHANGE;
                    }

                    public int getSCORE_SHOW_TYPE() {
                        return SCORE_SHOW_TYPE;
                    }

                    public void setSCORE_SHOW_TYPE(int SCORE_SHOW_TYPE) {
                        this.SCORE_SHOW_TYPE = SCORE_SHOW_TYPE;
                    }

                    public String getEFFECTIVE_TYPE() {
                        return EFFECTIVE_TYPE;
                    }

                    public void setEFFECTIVE_TYPE(String EFFECTIVE_TYPE) {
                        this.EFFECTIVE_TYPE = EFFECTIVE_TYPE;
                    }

                    public int getEFFECTIVE_TIME() {
                        return EFFECTIVE_TIME;
                    }

                    public void setEFFECTIVE_TIME(int EFFECTIVE_TIME) {
                        this.EFFECTIVE_TIME = EFFECTIVE_TIME;
                    }

                    public String getANALYSIS_SOURCE_STR() {
                        return ANALYSIS_SOURCE_STR;
                    }

                    public void setANALYSIS_SOURCE_STR(String ANALYSIS_SOURCE_STR) {
                        this.ANALYSIS_SOURCE_STR = ANALYSIS_SOURCE_STR;
                    }
                }
            }
        }
    }
}
