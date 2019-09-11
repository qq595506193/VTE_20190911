package com.example.tidus.ristrat.bean;

import java.io.Serializable;
import java.util.List;

public class LogMessageBean implements Serializable {
    private List<String> stringList;

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }
}
