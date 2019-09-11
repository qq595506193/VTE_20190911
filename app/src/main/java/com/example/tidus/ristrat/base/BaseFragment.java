package com.example.tidus.ristrat.base;


import android.content.IntentFilter;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class BaseFragment<P extends BasePresenter> extends Fragment implements IView {

    protected P presenter;
    private Unbinder unbinder;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(getlayout(), container, false);
        unbinder = ButterKnife.bind(this, v);
        return v;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView();
        presenter = getProducter();
        initAttach();
        initData();
        initListener();
    }

    protected abstract int getlayout();

    public void initListener() {
    }

    protected abstract void initData();

    private void initAttach() {
        if (presenter != null) {
            presenter.attach(this);
        }
    }

    protected abstract P getProducter();

    public void initView() {
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (presenter != null) {
            presenter.detach();
        }
        unbinder.unbind();
    }
}
