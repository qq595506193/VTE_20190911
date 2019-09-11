package com.example.tidus.ristrat.bean;

import java.io.Serializable;

/**
 * Created by TriumphalSun
 * on 2019/8/1 0001
 */
public class MessageStartBean implements Serializable {
    private int messageType = 0;
    private String patient_id;
    private String VISIT_SQ_NO;
    private String REPORT_ID;

    public int getMessageType() {
        return messageType;
    }

    public void setMessageType(int messageType) {
        this.messageType = messageType;
    }

    public String getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(String patient_id) {
        this.patient_id = patient_id;
    }

    public String getVISIT_SQ_NO() {
        return VISIT_SQ_NO;
    }

    public void setVISIT_SQ_NO(String VISIT_SQ_NO) {
        this.VISIT_SQ_NO = VISIT_SQ_NO;
    }

    public String getREPORT_ID() {
        return REPORT_ID;
    }

    public void setREPORT_ID(String REPORT_ID) {
        this.REPORT_ID = REPORT_ID;
    }
}
