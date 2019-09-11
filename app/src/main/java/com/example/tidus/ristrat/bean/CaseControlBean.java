package com.example.tidus.ristrat.bean;

import com.chad.library.adapter.base.entity.MultiItemEntity;

import java.io.Serializable;
import java.util.List;

public class CaseControlBean implements Serializable, MultiItemEntity {

    /**
     * code : 0
     * message : 成功
     * server_code :
     * server_params : [{"MERCHANT_ID":1400,"SITE_ID":1400,"DEPARTMENT":134,"CARE_UNIT":"1","BED_NUMBER":"01","BED_SEQ":1,"USED_FLAG":1,"CARE_UNIT_NAME":"血管外科单元","PATIENT_ID":"TMP110","PATIENT_NAME":"张林峰","BIRTHDAY":"46","PATIENT_SEX":"M","IN_DEPT_TIME":"20190712094122","IN_DEPT_CODE":"134","IN_DEPT_NAME":"血管外科","VISIT_SQ_NO":"ZY001","DOCTOR_NAME":"王医生","CURRENT_RISK_LEVEL":"8","levlist":[{"CURRENT_RISK_LEVEL":"8","CURRENT_RISK_VALUE":10,"RISK_NAME":"极高危"},{"CURRENT_RISK_LEVEL":"22","CURRENT_RISK_VALUE":1,"RISK_NAME":"高危"}],"jibinlist":[{"DIAGNOSIS_DISEASE_NAME":"双下肢骨折","DIAGNOSIS_DATE":"20190712094226"}],"remindelist":[{"MERCHANT_ID":1400,"SITE_ID":1400,"VISIT_SQ_NO":"ZY001","REMINDE_ID":1,"PATIENT_ID":"TMP110","PATIENT_TYPE":"Patient","REMINDE_TIME":"20190715135803","OPERATE_RESULT":10,"USER_ID":null,"OPERATE_TIME":null,"REMINDE_TYPE":"病程","REMINDE_LEVEL":"20","REMINDE_COLOR":"#ff4e6b","BUSINESS_ID":"1","POINT_ID":"6","FORM_ID":1,"TASK_BEGIN":"20190715135803","TASK_END":"20190715155803","TASK_END_DELAY":"20190715195803"}]},{"MERCHANT_ID":1400,"SITE_ID":1400,"DEPARTMENT":134,"CARE_UNIT":"1","BED_NUMBER":"02","BED_SEQ":2,"USED_FLAG":1,"CARE_UNIT_NAME":"血管外科单元","PATIENT_ID":"TMP111","PATIENT_NAME":"李晓梅","BIRTHDAY":"64","PATIENT_SEX":"W","IN_DEPT_TIME":"20190712095442","IN_DEPT_CODE":"134","IN_DEPT_NAME":"血管外科","VISIT_SQ_NO":"ZY002","DOCTOR_NAME":"王医生","CURRENT_RISK_LEVEL":"8","levlist":[{"CURRENT_RISK_LEVEL":"22","CURRENT_RISK_VALUE":1,"RISK_NAME":"高危"},{"CURRENT_RISK_LEVEL":"8","CURRENT_RISK_VALUE":9,"RISK_NAME":"极高危"}],"jibinlist":[{"DIAGNOSIS_DISEASE_NAME":"静脉曲张引发下肢疼痛","DIAGNOSIS_DATE":"20190712095517"}],"remindelist":[]},{"MERCHANT_ID":1400,"SITE_ID":1400,"DEPARTMENT":134,"CARE_UNIT":"1","BED_NUMBER":"03","BED_SEQ":3,"USED_FLAG":1,"CARE_UNIT_NAME":"血管外科单元","PATIENT_ID":"TMP112","PATIENT_NAME":"王德全","BIRTHDAY":"40","PATIENT_SEX":"M","IN_DEPT_TIME":"20190712100758","IN_DEPT_CODE":"134","IN_DEPT_NAME":"血管外科","VISIT_SQ_NO":"ZY003","DOCTOR_NAME":"王医生","CURRENT_RISK_LEVEL":"7","levlist":[{"CURRENT_RISK_LEVEL":"7","CURRENT_RISK_VALUE":3,"RISK_NAME":"高危"}],"jibinlist":[{"DIAGNOSIS_DISEASE_NAME":"右下肢外伤","DIAGNOSIS_DATE":"20190712100911"}],"remindelist":[]},{"MERCHANT_ID":1400,"SITE_ID":1400,"DEPARTMENT":134,"CARE_UNIT":"1","BED_NUMBER":"04","BED_SEQ":4,"USED_FLAG":1,"CARE_UNIT_NAME":"血管外科单元","PATIENT_ID":null,"PATIENT_NAME":null,"BIRTHDAY":null,"PATIENT_SEX":null,"IN_DEPT_TIME":null,"IN_DEPT_CODE":null,"IN_DEPT_NAME":null,"VISIT_SQ_NO":null,"DOCTOR_NAME":null,"CURRENT_RISK_LEVEL":null,"levlist":[],"jibinlist":[],"remindelist":[{"MERCHANT_ID":1400,"SITE_ID":1400,"VISIT_SQ_NO":"ZY001","REMINDE_ID":1,"PATIENT_ID":"TMP110","PATIENT_TYPE":"Patient","REMINDE_TIME":"20190715135803","OPERATE_RESULT":10,"USER_ID":null,"OPERATE_TIME":null,"REMINDE_TYPE":"病程","REMINDE_LEVEL":"20","REMINDE_COLOR":"#ff4e6b","BUSINESS_ID":"1","POINT_ID":"6","FORM_ID":1,"TASK_BEGIN":"20190715135803","TASK_END":"20190715155803","TASK_END_DELAY":"20190715195803"}]},{"MERCHANT_ID":1400,"SITE_ID":1400,"DEPARTMENT":134,"CARE_UNIT":"1","BED_NUMBER":"05","BED_SEQ":5,"USED_FLAG":1,"CARE_UNIT_NAME":"血管外科单元","PATIENT_ID":"TMP116","PATIENT_NAME":"awqsed","BIRTHDAY":"0","PATIENT_SEX":"M","IN_DEPT_TIME":"20190701000000","IN_DEPT_CODE":"134","IN_DEPT_NAME":"血管外科","VISIT_SQ_NO":"ZY00065","DOCTOR_NAME":"王医生","CURRENT_RISK_LEVEL":null,"levlist":[],"jibinlist":[{"DIAGNOSIS_DISEASE_NAME":"qwqwe","DIAGNOSIS_DATE":"20190715134333"}],"remindelist":[]},{"MERCHANT_ID":1400,"SITE_ID":1400,"DEPARTMENT":134,"CARE_UNIT":"1","BED_NUMBER":"06","BED_SEQ":6,"USED_FLAG":1,"CARE_UNIT_NAME":"血管外科单元","PATIENT_ID":null,"PATIENT_NAME":null,"BIRTHDAY":null,"PATIENT_SEX":null,"IN_DEPT_TIME":null,"IN_DEPT_CODE":null,"IN_DEPT_NAME":null,"VISIT_SQ_NO":null,"DOCTOR_NAME":null,"CURRENT_RISK_LEVEL":null,"levlist":[],"jibinlist":[],"remindelist":[{"MERCHANT_ID":1400,"SITE_ID":1400,"VISIT_SQ_NO":"ZY001","REMINDE_ID":1,"PATIENT_ID":"TMP110","PATIENT_TYPE":"Patient","REMINDE_TIME":"20190715135803","OPERATE_RESULT":10,"USER_ID":null,"OPERATE_TIME":null,"REMINDE_TYPE":"病程","REMINDE_LEVEL":"20","REMINDE_COLOR":"#ff4e6b","BUSINESS_ID":"1","POINT_ID":"6","FORM_ID":1,"TASK_BEGIN":"20190715135803","TASK_END":"20190715155803","TASK_END_DELAY":"20190715195803"}]},{"MERCHANT_ID":1400,"SITE_ID":1400,"DEPARTMENT":134,"CARE_UNIT":"1","BED_NUMBER":"07","BED_SEQ":7,"USED_FLAG":1,"CARE_UNIT_NAME":"血管外科单元","PATIENT_ID":null,"PATIENT_NAME":null,"BIRTHDAY":null,"PATIENT_SEX":null,"IN_DEPT_TIME":null,"IN_DEPT_CODE":null,"IN_DEPT_NAME":null,"VISIT_SQ_NO":null,"DOCTOR_NAME":null,"CURRENT_RISK_LEVEL":null,"levlist":[],"jibinlist":[],"remindelist":[{"MERCHANT_ID":1400,"SITE_ID":1400,"VISIT_SQ_NO":"ZY001","REMINDE_ID":1,"PATIENT_ID":"TMP110","PATIENT_TYPE":"Patient","REMINDE_TIME":"20190715135803","OPERATE_RESULT":10,"USER_ID":null,"OPERATE_TIME":null,"REMINDE_TYPE":"病程","REMINDE_LEVEL":"20","REMINDE_COLOR":"#ff4e6b","BUSINESS_ID":"1","POINT_ID":"6","FORM_ID":1,"TASK_BEGIN":"20190715135803","TASK_END":"20190715155803","TASK_END_DELAY":"20190715195803"}]},{"MERCHANT_ID":1400,"SITE_ID":1400,"DEPARTMENT":134,"CARE_UNIT":"1","BED_NUMBER":"08","BED_SEQ":8,"USED_FLAG":1,"CARE_UNIT_NAME":"血管外科单元","PATIENT_ID":null,"PATIENT_NAME":null,"BIRTHDAY":null,"PATIENT_SEX":null,"IN_DEPT_TIME":null,"IN_DEPT_CODE":null,"IN_DEPT_NAME":null,"VISIT_SQ_NO":null,"DOCTOR_NAME":null,"CURRENT_RISK_LEVEL":null,"levlist":[],"jibinlist":[],"remindelist":[{"MERCHANT_ID":1400,"SITE_ID":1400,"VISIT_SQ_NO":"ZY001","REMINDE_ID":1,"PATIENT_ID":"TMP110","PATIENT_TYPE":"Patient","REMINDE_TIME":"20190715135803","OPERATE_RESULT":10,"USER_ID":null,"OPERATE_TIME":null,"REMINDE_TYPE":"病程","REMINDE_LEVEL":"20","REMINDE_COLOR":"#ff4e6b","BUSINESS_ID":"1","POINT_ID":"6","FORM_ID":1,"TASK_BEGIN":"20190715135803","TASK_END":"20190715155803","TASK_END_DELAY":"20190715195803"}]},{"MERCHANT_ID":1400,"SITE_ID":1400,"DEPARTMENT":134,"CARE_UNIT":"1","BED_NUMBER":"09","BED_SEQ":9,"USED_FLAG":1,"CARE_UNIT_NAME":"血管外科单元","PATIENT_ID":null,"PATIENT_NAME":null,"BIRTHDAY":null,"PATIENT_SEX":null,"IN_DEPT_TIME":null,"IN_DEPT_CODE":null,"IN_DEPT_NAME":null,"VISIT_SQ_NO":null,"DOCTOR_NAME":null,"CURRENT_RISK_LEVEL":null,"levlist":[],"jibinlist":[],"remindelist":[{"MERCHANT_ID":1400,"SITE_ID":1400,"VISIT_SQ_NO":"ZY001","REMINDE_ID":1,"PATIENT_ID":"TMP110","PATIENT_TYPE":"Patient","REMINDE_TIME":"20190715135803","OPERATE_RESULT":10,"USER_ID":null,"OPERATE_TIME":null,"REMINDE_TYPE":"病程","REMINDE_LEVEL":"20","REMINDE_COLOR":"#ff4e6b","BUSINESS_ID":"1","POINT_ID":"6","FORM_ID":1,"TASK_BEGIN":"20190715135803","TASK_END":"20190715155803","TASK_END_DELAY":"20190715195803"}]},{"MERCHANT_ID":1400,"SITE_ID":1400,"DEPARTMENT":134,"CARE_UNIT":"1","BED_NUMBER":"10","BED_SEQ":10,"USED_FLAG":1,"CARE_UNIT_NAME":"血管外科单元","PATIENT_ID":null,"PATIENT_NAME":null,"BIRTHDAY":null,"PATIENT_SEX":null,"IN_DEPT_TIME":null,"IN_DEPT_CODE":null,"IN_DEPT_NAME":null,"VISIT_SQ_NO":null,"DOCTOR_NAME":null,"CURRENT_RISK_LEVEL":null,"levlist":[],"jibinlist":[],"remindelist":[{"MERCHANT_ID":1400,"SITE_ID":1400,"VISIT_SQ_NO":"ZY001","REMINDE_ID":1,"PATIENT_ID":"TMP110","PATIENT_TYPE":"Patient","REMINDE_TIME":"20190715135803","OPERATE_RESULT":10,"USER_ID":null,"OPERATE_TIME":null,"REMINDE_TYPE":"病程","REMINDE_LEVEL":"20","REMINDE_COLOR":"#ff4e6b","BUSINESS_ID":"1","POINT_ID":"6","FORM_ID":1,"TASK_BEGIN":"20190715135803","TASK_END":"20190715155803","TASK_END_DELAY":"20190715195803"}]},{"MERCHANT_ID":1400,"SITE_ID":1400,"DEPARTMENT":134,"CARE_UNIT":"1","BED_NUMBER":"11","BED_SEQ":11,"USED_FLAG":1,"CARE_UNIT_NAME":"血管外科单元","PATIENT_ID":null,"PATIENT_NAME":null,"BIRTHDAY":null,"PATIENT_SEX":null,"IN_DEPT_TIME":null,"IN_DEPT_CODE":null,"IN_DEPT_NAME":null,"VISIT_SQ_NO":null,"DOCTOR_NAME":null,"CURRENT_RISK_LEVEL":null,"levlist":[],"jibinlist":[],"remindelist":[{"MERCHANT_ID":1400,"SITE_ID":1400,"VISIT_SQ_NO":"ZY001","REMINDE_ID":1,"PATIENT_ID":"TMP110","PATIENT_TYPE":"Patient","REMINDE_TIME":"20190715135803","OPERATE_RESULT":10,"USER_ID":null,"OPERATE_TIME":null,"REMINDE_TYPE":"病程","REMINDE_LEVEL":"20","REMINDE_COLOR":"#ff4e6b","BUSINESS_ID":"1","POINT_ID":"6","FORM_ID":1,"TASK_BEGIN":"20190715135803","TASK_END":"20190715155803","TASK_END_DELAY":"20190715195803"}]},{"MERCHANT_ID":1400,"SITE_ID":1400,"DEPARTMENT":134,"CARE_UNIT":"1","BED_NUMBER":"12","BED_SEQ":12,"USED_FLAG":1,"CARE_UNIT_NAME":"血管外科单元","PATIENT_ID":null,"PATIENT_NAME":null,"BIRTHDAY":null,"PATIENT_SEX":null,"IN_DEPT_TIME":null,"IN_DEPT_CODE":null,"IN_DEPT_NAME":null,"VISIT_SQ_NO":null,"DOCTOR_NAME":null,"CURRENT_RISK_LEVEL":null,"levlist":[],"jibinlist":[],"remindelist":[{"MERCHANT_ID":1400,"SITE_ID":1400,"VISIT_SQ_NO":"ZY001","REMINDE_ID":1,"PATIENT_ID":"TMP110","PATIENT_TYPE":"Patient","REMINDE_TIME":"20190715135803","OPERATE_RESULT":10,"USER_ID":null,"OPERATE_TIME":null,"REMINDE_TYPE":"病程","REMINDE_LEVEL":"20","REMINDE_COLOR":"#ff4e6b","BUSINESS_ID":"1","POINT_ID":"6","FORM_ID":1,"TASK_BEGIN":"20190715135803","TASK_END":"20190715155803","TASK_END_DELAY":"20190715195803"}]},{"MERCHANT_ID":1400,"SITE_ID":1400,"DEPARTMENT":134,"CARE_UNIT":"1","BED_NUMBER":"13","BED_SEQ":13,"USED_FLAG":1,"CARE_UNIT_NAME":"血管外科单元","PATIENT_ID":null,"PATIENT_NAME":null,"BIRTHDAY":null,"PATIENT_SEX":null,"IN_DEPT_TIME":null,"IN_DEPT_CODE":null,"IN_DEPT_NAME":null,"VISIT_SQ_NO":null,"DOCTOR_NAME":null,"CURRENT_RISK_LEVEL":null,"levlist":[],"jibinlist":[],"remindelist":[{"MERCHANT_ID":1400,"SITE_ID":1400,"VISIT_SQ_NO":"ZY001","REMINDE_ID":1,"PATIENT_ID":"TMP110","PATIENT_TYPE":"Patient","REMINDE_TIME":"20190715135803","OPERATE_RESULT":10,"USER_ID":null,"OPERATE_TIME":null,"REMINDE_TYPE":"病程","REMINDE_LEVEL":"20","REMINDE_COLOR":"#ff4e6b","BUSINESS_ID":"1","POINT_ID":"6","FORM_ID":1,"TASK_BEGIN":"20190715135803","TASK_END":"20190715155803","TASK_END_DELAY":"20190715195803"}]},{"MERCHANT_ID":1400,"SITE_ID":1400,"DEPARTMENT":134,"CARE_UNIT":"1","BED_NUMBER":"14","BED_SEQ":14,"USED_FLAG":1,"CARE_UNIT_NAME":"血管外科单元","PATIENT_ID":null,"PATIENT_NAME":null,"BIRTHDAY":null,"PATIENT_SEX":null,"IN_DEPT_TIME":null,"IN_DEPT_CODE":null,"IN_DEPT_NAME":null,"VISIT_SQ_NO":null,"DOCTOR_NAME":null,"CURRENT_RISK_LEVEL":null,"levlist":[],"jibinlist":[],"remindelist":[{"MERCHANT_ID":1400,"SITE_ID":1400,"VISIT_SQ_NO":"ZY001","REMINDE_ID":1,"PATIENT_ID":"TMP110","PATIENT_TYPE":"Patient","REMINDE_TIME":"20190715135803","OPERATE_RESULT":10,"USER_ID":null,"OPERATE_TIME":null,"REMINDE_TYPE":"病程","REMINDE_LEVEL":"20","REMINDE_COLOR":"#ff4e6b","BUSINESS_ID":"1","POINT_ID":"6","FORM_ID":1,"TASK_BEGIN":"20190715135803","TASK_END":"20190715155803","TASK_END_DELAY":"20190715195803"}]},{"MERCHANT_ID":1400,"SITE_ID":1400,"DEPARTMENT":134,"CARE_UNIT":"1","BED_NUMBER":"15","BED_SEQ":15,"USED_FLAG":1,"CARE_UNIT_NAME":"血管外科单元","PATIENT_ID":null,"PATIENT_NAME":null,"BIRTHDAY":null,"PATIENT_SEX":null,"IN_DEPT_TIME":null,"IN_DEPT_CODE":null,"IN_DEPT_NAME":null,"VISIT_SQ_NO":null,"DOCTOR_NAME":null,"CURRENT_RISK_LEVEL":null,"levlist":[],"jibinlist":[],"remindelist":[{"MERCHANT_ID":1400,"SITE_ID":1400,"VISIT_SQ_NO":"ZY001","REMINDE_ID":1,"PATIENT_ID":"TMP110","PATIENT_TYPE":"Patient","REMINDE_TIME":"20190715135803","OPERATE_RESULT":10,"USER_ID":null,"OPERATE_TIME":null,"REMINDE_TYPE":"病程","REMINDE_LEVEL":"20","REMINDE_COLOR":"#ff4e6b","BUSINESS_ID":"1","POINT_ID":"6","FORM_ID":1,"TASK_BEGIN":"20190715135803","TASK_END":"20190715155803","TASK_END_DELAY":"20190715195803"}]},{"MERCHANT_ID":1400,"SITE_ID":1400,"DEPARTMENT":134,"CARE_UNIT":"1","BED_NUMBER":"16","BED_SEQ":16,"USED_FLAG":1,"CARE_UNIT_NAME":"血管外科单元","PATIENT_ID":null,"PATIENT_NAME":null,"BIRTHDAY":null,"PATIENT_SEX":null,"IN_DEPT_TIME":null,"IN_DEPT_CODE":null,"IN_DEPT_NAME":null,"VISIT_SQ_NO":null,"DOCTOR_NAME":null,"CURRENT_RISK_LEVEL":null,"levlist":[],"jibinlist":[],"remindelist":[{"MERCHANT_ID":1400,"SITE_ID":1400,"VISIT_SQ_NO":"ZY001","REMINDE_ID":1,"PATIENT_ID":"TMP110","PATIENT_TYPE":"Patient","REMINDE_TIME":"20190715135803","OPERATE_RESULT":10,"USER_ID":null,"OPERATE_TIME":null,"REMINDE_TYPE":"病程","REMINDE_LEVEL":"20","REMINDE_COLOR":"#ff4e6b","BUSINESS_ID":"1","POINT_ID":"6","FORM_ID":1,"TASK_BEGIN":"20190715135803","TASK_END":"20190715155803","TASK_END_DELAY":"20190715195803"}]},{"MERCHANT_ID":1400,"SITE_ID":1400,"DEPARTMENT":134,"CARE_UNIT":"1","BED_NUMBER":"17","BED_SEQ":17,"USED_FLAG":1,"CARE_UNIT_NAME":"血管外科单元","PATIENT_ID":null,"PATIENT_NAME":null,"BIRTHDAY":null,"PATIENT_SEX":null,"IN_DEPT_TIME":null,"IN_DEPT_CODE":null,"IN_DEPT_NAME":null,"VISIT_SQ_NO":null,"DOCTOR_NAME":null,"CURRENT_RISK_LEVEL":null,"levlist":[],"jibinlist":[],"remindelist":[{"MERCHANT_ID":1400,"SITE_ID":1400,"VISIT_SQ_NO":"ZY001","REMINDE_ID":1,"PATIENT_ID":"TMP110","PATIENT_TYPE":"Patient","REMINDE_TIME":"20190715135803","OPERATE_RESULT":10,"USER_ID":null,"OPERATE_TIME":null,"REMINDE_TYPE":"病程","REMINDE_LEVEL":"20","REMINDE_COLOR":"#ff4e6b","BUSINESS_ID":"1","POINT_ID":"6","FORM_ID":1,"TASK_BEGIN":"20190715135803","TASK_END":"20190715155803","TASK_END_DELAY":"20190715195803"}]},{"MERCHANT_ID":1400,"SITE_ID":1400,"DEPARTMENT":134,"CARE_UNIT":"1","BED_NUMBER":"18","BED_SEQ":18,"USED_FLAG":1,"CARE_UNIT_NAME":"血管外科单元","PATIENT_ID":null,"PATIENT_NAME":null,"BIRTHDAY":null,"PATIENT_SEX":null,"IN_DEPT_TIME":null,"IN_DEPT_CODE":null,"IN_DEPT_NAME":null,"VISIT_SQ_NO":null,"DOCTOR_NAME":null,"CURRENT_RISK_LEVEL":null,"levlist":[],"jibinlist":[],"remindelist":[{"MERCHANT_ID":1400,"SITE_ID":1400,"VISIT_SQ_NO":"ZY001","REMINDE_ID":1,"PATIENT_ID":"TMP110","PATIENT_TYPE":"Patient","REMINDE_TIME":"20190715135803","OPERATE_RESULT":10,"USER_ID":null,"OPERATE_TIME":null,"REMINDE_TYPE":"病程","REMINDE_LEVEL":"20","REMINDE_COLOR":"#ff4e6b","BUSINESS_ID":"1","POINT_ID":"6","FORM_ID":1,"TASK_BEGIN":"20190715135803","TASK_END":"20190715155803","TASK_END_DELAY":"20190715195803"}]},{"MERCHANT_ID":1400,"SITE_ID":1400,"DEPARTMENT":134,"CARE_UNIT":"1","BED_NUMBER":"19","BED_SEQ":19,"USED_FLAG":1,"CARE_UNIT_NAME":"血管外科单元","PATIENT_ID":null,"PATIENT_NAME":null,"BIRTHDAY":null,"PATIENT_SEX":null,"IN_DEPT_TIME":null,"IN_DEPT_CODE":null,"IN_DEPT_NAME":null,"VISIT_SQ_NO":null,"DOCTOR_NAME":null,"CURRENT_RISK_LEVEL":null,"levlist":[],"jibinlist":[],"remindelist":[{"MERCHANT_ID":1400,"SITE_ID":1400,"VISIT_SQ_NO":"ZY001","REMINDE_ID":1,"PATIENT_ID":"TMP110","PATIENT_TYPE":"Patient","REMINDE_TIME":"20190715135803","OPERATE_RESULT":10,"USER_ID":null,"OPERATE_TIME":null,"REMINDE_TYPE":"病程","REMINDE_LEVEL":"20","REMINDE_COLOR":"#ff4e6b","BUSINESS_ID":"1","POINT_ID":"6","FORM_ID":1,"TASK_BEGIN":"20190715135803","TASK_END":"20190715155803","TASK_END_DELAY":"20190715195803"}]},{"MERCHANT_ID":1400,"SITE_ID":1400,"DEPARTMENT":134,"CARE_UNIT":"1","BED_NUMBER":"20","BED_SEQ":20,"USED_FLAG":1,"CARE_UNIT_NAME":"血管外科单元","PATIENT_ID":null,"PATIENT_NAME":null,"BIRTHDAY":null,"PATIENT_SEX":null,"IN_DEPT_TIME":null,"IN_DEPT_CODE":null,"IN_DEPT_NAME":null,"VISIT_SQ_NO":null,"DOCTOR_NAME":null,"CURRENT_RISK_LEVEL":null,"levlist":[],"jibinlist":[],"remindelist":[{"MERCHANT_ID":1400,"SITE_ID":1400,"VISIT_SQ_NO":"ZY001","REMINDE_ID":1,"PATIENT_ID":"TMP110","PATIENT_TYPE":"Patient","REMINDE_TIME":"20190715135803","OPERATE_RESULT":10,"USER_ID":null,"OPERATE_TIME":null,"REMINDE_TYPE":"病程","REMINDE_LEVEL":"20","REMINDE_COLOR":"#ff4e6b","BUSINESS_ID":"1","POINT_ID":"6","FORM_ID":1,"TASK_BEGIN":"20190715135803","TASK_END":"20190715155803","TASK_END_DELAY":"20190715195803"}]},{"MERCHANT_ID":1400,"SITE_ID":1400,"DEPARTMENT":134,"CARE_UNIT":"2","BED_NUMBER":"21","BED_SEQ":21,"USED_FLAG":1,"CARE_UNIT_NAME":"骨科单元","PATIENT_ID":null,"PATIENT_NAME":null,"BIRTHDAY":null,"PATIENT_SEX":null,"IN_DEPT_TIME":null,"IN_DEPT_CODE":null,"IN_DEPT_NAME":null,"VISIT_SQ_NO":null,"DOCTOR_NAME":null,"CURRENT_RISK_LEVEL":null,"levlist":[],"jibinlist":[],"remindelist":[{"MERCHANT_ID":1400,"SITE_ID":1400,"VISIT_SQ_NO":"ZY001","REMINDE_ID":1,"PATIENT_ID":"TMP110","PATIENT_TYPE":"Patient","REMINDE_TIME":"20190715135803","OPERATE_RESULT":10,"USER_ID":null,"OPERATE_TIME":null,"REMINDE_TYPE":"病程","REMINDE_LEVEL":"20","REMINDE_COLOR":"#ff4e6b","BUSINESS_ID":"1","POINT_ID":"6","FORM_ID":1,"TASK_BEGIN":"20190715135803","TASK_END":"20190715155803","TASK_END_DELAY":"20190715195803"}]},{"MERCHANT_ID":1400,"SITE_ID":1400,"DEPARTMENT":134,"CARE_UNIT":"2","BED_NUMBER":"22","BED_SEQ":22,"USED_FLAG":1,"CARE_UNIT_NAME":"骨科单元","PATIENT_ID":null,"PATIENT_NAME":null,"BIRTHDAY":null,"PATIENT_SEX":null,"IN_DEPT_TIME":null,"IN_DEPT_CODE":null,"IN_DEPT_NAME":null,"VISIT_SQ_NO":null,"DOCTOR_NAME":null,"CURRENT_RISK_LEVEL":null,"levlist":[],"jibinlist":[],"remindelist":[{"MERCHANT_ID":1400,"SITE_ID":1400,"VISIT_SQ_NO":"ZY001","REMINDE_ID":1,"PATIENT_ID":"TMP110","PATIENT_TYPE":"Patient","REMINDE_TIME":"20190715135803","OPERATE_RESULT":10,"USER_ID":null,"OPERATE_TIME":null,"REMINDE_TYPE":"病程","REMINDE_LEVEL":"20","REMINDE_COLOR":"#ff4e6b","BUSINESS_ID":"1","POINT_ID":"6","FORM_ID":1,"TASK_BEGIN":"20190715135803","TASK_END":"20190715155803","TASK_END_DELAY":"20190715195803"}]},{"MERCHANT_ID":1400,"SITE_ID":1400,"DEPARTMENT":134,"CARE_UNIT":"2","BED_NUMBER":"23","BED_SEQ":23,"USED_FLAG":1,"CARE_UNIT_NAME":"骨科单元","PATIENT_ID":null,"PATIENT_NAME":null,"BIRTHDAY":null,"PATIENT_SEX":null,"IN_DEPT_TIME":null,"IN_DEPT_CODE":null,"IN_DEPT_NAME":null,"VISIT_SQ_NO":null,"DOCTOR_NAME":null,"CURRENT_RISK_LEVEL":null,"levlist":[],"jibinlist":[],"remindelist":[{"MERCHANT_ID":1400,"SITE_ID":1400,"VISIT_SQ_NO":"ZY001","REMINDE_ID":1,"PATIENT_ID":"TMP110","PATIENT_TYPE":"Patient","REMINDE_TIME":"20190715135803","OPERATE_RESULT":10,"USER_ID":null,"OPERATE_TIME":null,"REMINDE_TYPE":"病程","REMINDE_LEVEL":"20","REMINDE_COLOR":"#ff4e6b","BUSINESS_ID":"1","POINT_ID":"6","FORM_ID":1,"TASK_BEGIN":"20190715135803","TASK_END":"20190715155803","TASK_END_DELAY":"20190715195803"}]},{"MERCHANT_ID":1400,"SITE_ID":1400,"DEPARTMENT":134,"CARE_UNIT":"2","BED_NUMBER":"24","BED_SEQ":24,"USED_FLAG":1,"CARE_UNIT_NAME":"骨科单元","PATIENT_ID":null,"PATIENT_NAME":null,"BIRTHDAY":null,"PATIENT_SEX":null,"IN_DEPT_TIME":null,"IN_DEPT_CODE":null,"IN_DEPT_NAME":null,"VISIT_SQ_NO":null,"DOCTOR_NAME":null,"CURRENT_RISK_LEVEL":null,"levlist":[],"jibinlist":[],"remindelist":[{"MERCHANT_ID":1400,"SITE_ID":1400,"VISIT_SQ_NO":"ZY001","REMINDE_ID":1,"PATIENT_ID":"TMP110","PATIENT_TYPE":"Patient","REMINDE_TIME":"20190715135803","OPERATE_RESULT":10,"USER_ID":null,"OPERATE_TIME":null,"REMINDE_TYPE":"病程","REMINDE_LEVEL":"20","REMINDE_COLOR":"#ff4e6b","BUSINESS_ID":"1","POINT_ID":"6","FORM_ID":1,"TASK_BEGIN":"20190715135803","TASK_END":"20190715155803","TASK_END_DELAY":"20190715195803"}]},{"MERCHANT_ID":1400,"SITE_ID":1400,"DEPARTMENT":134,"CARE_UNIT":"2","BED_NUMBER":"25","BED_SEQ":25,"USED_FLAG":1,"CARE_UNIT_NAME":"骨科单元","PATIENT_ID":null,"PATIENT_NAME":null,"BIRTHDAY":null,"PATIENT_SEX":null,"IN_DEPT_TIME":null,"IN_DEPT_CODE":null,"IN_DEPT_NAME":null,"VISIT_SQ_NO":null,"DOCTOR_NAME":null,"CURRENT_RISK_LEVEL":null,"levlist":[],"jibinlist":[],"remindelist":[{"MERCHANT_ID":1400,"SITE_ID":1400,"VISIT_SQ_NO":"ZY001","REMINDE_ID":1,"PATIENT_ID":"TMP110","PATIENT_TYPE":"Patient","REMINDE_TIME":"20190715135803","OPERATE_RESULT":10,"USER_ID":null,"OPERATE_TIME":null,"REMINDE_TYPE":"病程","REMINDE_LEVEL":"20","REMINDE_COLOR":"#ff4e6b","BUSINESS_ID":"1","POINT_ID":"6","FORM_ID":1,"TASK_BEGIN":"20190715135803","TASK_END":"20190715155803","TASK_END_DELAY":"20190715195803"}]},{"MERCHANT_ID":1400,"SITE_ID":1400,"DEPARTMENT":134,"CARE_UNIT":"2","BED_NUMBER":"26","BED_SEQ":26,"USED_FLAG":1,"CARE_UNIT_NAME":"骨科单元","PATIENT_ID":null,"PATIENT_NAME":null,"BIRTHDAY":null,"PATIENT_SEX":null,"IN_DEPT_TIME":null,"IN_DEPT_CODE":null,"IN_DEPT_NAME":null,"VISIT_SQ_NO":null,"DOCTOR_NAME":null,"CURRENT_RISK_LEVEL":null,"levlist":[],"jibinlist":[],"remindelist":[{"MERCHANT_ID":1400,"SITE_ID":1400,"VISIT_SQ_NO":"ZY001","REMINDE_ID":1,"PATIENT_ID":"TMP110","PATIENT_TYPE":"Patient","REMINDE_TIME":"20190715135803","OPERATE_RESULT":10,"USER_ID":null,"OPERATE_TIME":null,"REMINDE_TYPE":"病程","REMINDE_LEVEL":"20","REMINDE_COLOR":"#ff4e6b","BUSINESS_ID":"1","POINT_ID":"6","FORM_ID":1,"TASK_BEGIN":"20190715135803","TASK_END":"20190715155803","TASK_END_DELAY":"20190715195803"}]},{"MERCHANT_ID":1400,"SITE_ID":1400,"DEPARTMENT":134,"CARE_UNIT":"2","BED_NUMBER":"27","BED_SEQ":27,"USED_FLAG":1,"CARE_UNIT_NAME":"骨科单元","PATIENT_ID":null,"PATIENT_NAME":null,"BIRTHDAY":null,"PATIENT_SEX":null,"IN_DEPT_TIME":null,"IN_DEPT_CODE":null,"IN_DEPT_NAME":null,"VISIT_SQ_NO":null,"DOCTOR_NAME":null,"CURRENT_RISK_LEVEL":null,"levlist":[],"jibinlist":[],"remindelist":[{"MERCHANT_ID":1400,"SITE_ID":1400,"VISIT_SQ_NO":"ZY001","REMINDE_ID":1,"PATIENT_ID":"TMP110","PATIENT_TYPE":"Patient","REMINDE_TIME":"20190715135803","OPERATE_RESULT":10,"USER_ID":null,"OPERATE_TIME":null,"REMINDE_TYPE":"病程","REMINDE_LEVEL":"20","REMINDE_COLOR":"#ff4e6b","BUSINESS_ID":"1","POINT_ID":"6","FORM_ID":1,"TASK_BEGIN":"20190715135803","TASK_END":"20190715155803","TASK_END_DELAY":"20190715195803"}]},{"MERCHANT_ID":1400,"SITE_ID":1400,"DEPARTMENT":134,"CARE_UNIT":"2","BED_NUMBER":"28","BED_SEQ":28,"USED_FLAG":1,"CARE_UNIT_NAME":"骨科单元","PATIENT_ID":null,"PATIENT_NAME":null,"BIRTHDAY":null,"PATIENT_SEX":null,"IN_DEPT_TIME":null,"IN_DEPT_CODE":null,"IN_DEPT_NAME":null,"VISIT_SQ_NO":null,"DOCTOR_NAME":null,"CURRENT_RISK_LEVEL":null,"levlist":[],"jibinlist":[],"remindelist":[{"MERCHANT_ID":1400,"SITE_ID":1400,"VISIT_SQ_NO":"ZY001","REMINDE_ID":1,"PATIENT_ID":"TMP110","PATIENT_TYPE":"Patient","REMINDE_TIME":"20190715135803","OPERATE_RESULT":10,"USER_ID":null,"OPERATE_TIME":null,"REMINDE_TYPE":"病程","REMINDE_LEVEL":"20","REMINDE_COLOR":"#ff4e6b","BUSINESS_ID":"1","POINT_ID":"6","FORM_ID":1,"TASK_BEGIN":"20190715135803","TASK_END":"20190715155803","TASK_END_DELAY":"20190715195803"}]},{"MERCHANT_ID":1400,"SITE_ID":1400,"DEPARTMENT":134,"CARE_UNIT":"2","BED_NUMBER":"29","BED_SEQ":29,"USED_FLAG":1,"CARE_UNIT_NAME":"骨科单元","PATIENT_ID":null,"PATIENT_NAME":null,"BIRTHDAY":null,"PATIENT_SEX":null,"IN_DEPT_TIME":null,"IN_DEPT_CODE":null,"IN_DEPT_NAME":null,"VISIT_SQ_NO":null,"DOCTOR_NAME":null,"CURRENT_RISK_LEVEL":null,"levlist":[],"jibinlist":[],"remindelist":[{"MERCHANT_ID":1400,"SITE_ID":1400,"VISIT_SQ_NO":"ZY001","REMINDE_ID":1,"PATIENT_ID":"TMP110","PATIENT_TYPE":"Patient","REMINDE_TIME":"20190715135803","OPERATE_RESULT":10,"USER_ID":null,"OPERATE_TIME":null,"REMINDE_TYPE":"病程","REMINDE_LEVEL":"20","REMINDE_COLOR":"#ff4e6b","BUSINESS_ID":"1","POINT_ID":"6","FORM_ID":1,"TASK_BEGIN":"20190715135803","TASK_END":"20190715155803","TASK_END_DELAY":"20190715195803"}]},{"MERCHANT_ID":1400,"SITE_ID":1400,"DEPARTMENT":134,"CARE_UNIT":"2","BED_NUMBER":"30","BED_SEQ":30,"USED_FLAG":1,"CARE_UNIT_NAME":"骨科单元","PATIENT_ID":null,"PATIENT_NAME":null,"BIRTHDAY":null,"PATIENT_SEX":null,"IN_DEPT_TIME":null,"IN_DEPT_CODE":null,"IN_DEPT_NAME":null,"VISIT_SQ_NO":null,"DOCTOR_NAME":null,"CURRENT_RISK_LEVEL":null,"levlist":[],"jibinlist":[],"remindelist":[{"MERCHANT_ID":1400,"SITE_ID":1400,"VISIT_SQ_NO":"ZY001","REMINDE_ID":1,"PATIENT_ID":"TMP110","PATIENT_TYPE":"Patient","REMINDE_TIME":"20190715135803","OPERATE_RESULT":10,"USER_ID":null,"OPERATE_TIME":null,"REMINDE_TYPE":"病程","REMINDE_LEVEL":"20","REMINDE_COLOR":"#ff4e6b","BUSINESS_ID":"1","POINT_ID":"6","FORM_ID":1,"TASK_BEGIN":"20190715135803","TASK_END":"20190715155803","TASK_END_DELAY":"20190715195803"}]}]
     */

    private String code;
    private String message;
    private String server_code;
    private List<ServerParamsBean> server_params;

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

    public List<ServerParamsBean> getServer_params() {
        return server_params;
    }

    public void setServer_params(List<ServerParamsBean> server_params) {
        this.server_params = server_params;
    }

    @Override
    public int getItemType() {
        return 0;
    }

    public static class ServerParamsBean implements Serializable, MultiItemEntity {
        /**
         * MERCHANT_ID : 1400
         * SITE_ID : 1400
         * DEPARTMENT : 134
         * CARE_UNIT : 1
         * BED_NUMBER : 01
         * BED_SEQ : 1
         * USED_FLAG : 1
         * CARE_UNIT_NAME : 血管外科单元
         * PATIENT_ID : TMP110
         * PATIENT_NAME : 张林峰
         * BIRTHDAY : 46
         * PATIENT_SEX : M
         * IN_DEPT_TIME : 20190712094122
         * IN_DEPT_CODE : 134
         * IN_DEPT_NAME : 血管外科
         * VISIT_SQ_NO : ZY001
         * DOCTOR_NAME : 王医生
         * CURRENT_RISK_LEVEL : 8
         * levlist : [{"CURRENT_RISK_LEVEL":"8","CURRENT_RISK_VALUE":10,"RISK_NAME":"极高危"},{"CURRENT_RISK_LEVEL":"22","CURRENT_RISK_VALUE":1,"RISK_NAME":"高危"}]
         * jibinlist : [{"DIAGNOSIS_DISEASE_NAME":"双下肢骨折","DIAGNOSIS_DATE":"20190712094226"}]
         * remindelist : [{"MERCHANT_ID":1400,"SITE_ID":1400,"VISIT_SQ_NO":"ZY001","REMINDE_ID":1,"PATIENT_ID":"TMP110","PATIENT_TYPE":"Patient","REMINDE_TIME":"20190715135803","OPERATE_RESULT":10,"USER_ID":null,"OPERATE_TIME":null,"REMINDE_TYPE":"病程","REMINDE_LEVEL":"20","REMINDE_COLOR":"#ff4e6b","BUSINESS_ID":"1","POINT_ID":"6","FORM_ID":1,"TASK_BEGIN":"20190715135803","TASK_END":"20190715155803","TASK_END_DELAY":"20190715195803"}]
         */

        private int MERCHANT_ID;
        private int SITE_ID;
        private int DEPARTMENT;
        private String CARE_UNIT;
        private String BED_NUMBER;
        private int BED_SEQ;
        private int USED_FLAG;
        private String CARE_UNIT_NAME;
        private String PATIENT_ID;
        private String PATIENT_NAME;
        private String BIRTHDAY;
        private String PATIENT_SEX;
        private String IN_DEPT_TIME;
        private String IN_DEPT_CODE;
        private String IN_DEPT_NAME;
        private String VISIT_SQ_NO;
        private String DOCTOR_NAME;
        private String CURRENT_RISK_LEVEL;
        private List<LevlistBean> levlist;
        private List<JibinlistBean> jibinlist;
        private List<RemindelistBean> remindelist;
        private int itemType;
        private boolean isType;
        private String color;

        public void setItemType(int itemType) {
            this.itemType = itemType;
        }

        public boolean isType() {
            return isType;
        }

        public void setType(boolean type) {
            isType = type;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
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

        public String getCARE_UNIT() {
            return CARE_UNIT;
        }

        public void setCARE_UNIT(String CARE_UNIT) {
            this.CARE_UNIT = CARE_UNIT;
        }

        public String getBED_NUMBER() {
            return BED_NUMBER;
        }

        public void setBED_NUMBER(String BED_NUMBER) {
            this.BED_NUMBER = BED_NUMBER;
        }

        public int getBED_SEQ() {
            return BED_SEQ;
        }

        public void setBED_SEQ(int BED_SEQ) {
            this.BED_SEQ = BED_SEQ;
        }

        public int getUSED_FLAG() {
            return USED_FLAG;
        }

        public void setUSED_FLAG(int USED_FLAG) {
            this.USED_FLAG = USED_FLAG;
        }

        public String getCARE_UNIT_NAME() {
            return CARE_UNIT_NAME;
        }

        public void setCARE_UNIT_NAME(String CARE_UNIT_NAME) {
            this.CARE_UNIT_NAME = CARE_UNIT_NAME;
        }

        public String getPATIENT_ID() {
            return PATIENT_ID;
        }

        public void setPATIENT_ID(String PATIENT_ID) {
            this.PATIENT_ID = PATIENT_ID;
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

        public String getIN_DEPT_TIME() {
            return IN_DEPT_TIME;
        }

        public void setIN_DEPT_TIME(String IN_DEPT_TIME) {
            this.IN_DEPT_TIME = IN_DEPT_TIME;
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

        public String getVISIT_SQ_NO() {
            return VISIT_SQ_NO;
        }

        public void setVISIT_SQ_NO(String VISIT_SQ_NO) {
            this.VISIT_SQ_NO = VISIT_SQ_NO;
        }

        public String getDOCTOR_NAME() {
            return DOCTOR_NAME;
        }

        public void setDOCTOR_NAME(String DOCTOR_NAME) {
            this.DOCTOR_NAME = DOCTOR_NAME;
        }

        public String getCURRENT_RISK_LEVEL() {
            return CURRENT_RISK_LEVEL;
        }

        public void setCURRENT_RISK_LEVEL(String CURRENT_RISK_LEVEL) {
            this.CURRENT_RISK_LEVEL = CURRENT_RISK_LEVEL;
        }

        public List<LevlistBean> getLevlist() {
            return levlist;
        }

        public void setLevlist(List<LevlistBean> levlist) {
            this.levlist = levlist;
        }

        public List<JibinlistBean> getJibinlist() {
            return jibinlist;
        }

        public void setJibinlist(List<JibinlistBean> jibinlist) {
            this.jibinlist = jibinlist;
        }

        public List<RemindelistBean> getRemindelist() {
            return remindelist;
        }

        public void setRemindelist(List<RemindelistBean> remindelist) {
            this.remindelist = remindelist;
        }

        @Override
        public int getItemType() {
            return itemType;
        }

        public static class LevlistBean implements Serializable, MultiItemEntity {
            /**
             * CURRENT_RISK_LEVEL : 8
             * CURRENT_RISK_VALUE : 10
             * RISK_NAME : 极高危
             */

            private String CURRENT_RISK_LEVEL;
            private int CURRENT_RISK_VALUE;
            private String RISK_NAME;
            private int levelColor;

            public int getLevelColor() {
                return levelColor;
            }

            public void setLevelColor(int levelColor) {
                this.levelColor = levelColor;
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

            public String getRISK_NAME() {
                return RISK_NAME;
            }

            public void setRISK_NAME(String RISK_NAME) {
                this.RISK_NAME = RISK_NAME;
            }

            @Override
            public int getItemType() {
                return 0;
            }
        }

        public static class JibinlistBean implements Serializable, MultiItemEntity {
            /**
             * DIAGNOSIS_DISEASE_NAME : 双下肢骨折
             * DIAGNOSIS_DATE : 20190712094226
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

            @Override
            public int getItemType() {
                return 0;
            }
        }

        public static class RemindelistBean implements Serializable, MultiItemEntity {
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

            @Override
            public int getItemType() {
                return 0;
            }
        }
    }

}
