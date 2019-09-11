package com.example.tidus.ristrat.bean;

import java.io.Serializable;
import java.util.List;

public class SelectQuestionListBean implements Serializable {
    private List<String> indexTable;

    public List<String> getIndexTable() {
        return indexTable;
    }

    public void setIndexTable(List<String> indexTable) {
        this.indexTable = indexTable;
    }
}
