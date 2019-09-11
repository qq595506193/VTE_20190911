package com.example.tidus.ristrat.bean;

import java.io.Serializable;
import java.util.List;

public class AnwyAssessBean implements Serializable {
    private List<String> list;

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}
