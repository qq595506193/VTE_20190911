package com.example.tidus.ristrat.bean;


public class TiaoBean {


    /**
     * cont : 患者 9.30（TMP101） 已达到VTE风险评估标准，已延迟30分钟未处理，请及时安排患者进行
     * type : 0
     * patient_id : TMP101
     * visit_sq_no : 122222222223wqew
     */

    private String cont;
    private int type;
    private String patient_id;
    private String visit_sq_no;
    private String report_id;

    public String getReport_id() {
        return report_id;
    }

    public void setReport_id(String report_id) {
        this.report_id = report_id;
    }

    public String getCont() {
        return cont;
    }

    public void setCont(String cont) {
        this.cont = cont;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(String patient_id) {
        this.patient_id = patient_id;
    }

    public String getVisit_sq_no() {
        return visit_sq_no;
    }

    public void setVisit_sq_no(String visit_sq_no) {
        this.visit_sq_no = visit_sq_no;
    }

}
