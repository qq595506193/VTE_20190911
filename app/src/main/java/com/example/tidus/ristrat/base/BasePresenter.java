package com.example.tidus.ristrat.base;

import android.content.Context;

public abstract class BasePresenter<V extends IView> {
    protected V v;

    public BasePresenter() {
        initModel();
    }

    protected abstract void initModel();
    public void attach(V v){
        this.v = v;
    }
    public void detach(){
        this.v = null;
    }
    protected void getdata(){
        this.v = null;
    }
    protected Context context() {
        if (v != null) {
            return v.context();
        }
        return null;
    }
}
