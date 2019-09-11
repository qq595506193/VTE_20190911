package com.example.tidus.ristrat.fragment;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.lib_core.base.mvp.BaseMvpFragment;
import com.example.lib_core.base.mvp.BasePresenter;
import com.example.tidus.ristrat.R;
import com.example.tidus.ristrat.adapter.PingTablesAdapter;
import com.example.tidus.ristrat.application.App;
import com.example.tidus.ristrat.bean.CheckRiskBean;
import com.example.tidus.ristrat.bean.SelectedTablesBean;

import butterknife.BindView;

/**
 * Created by TriumphalSun
 * on 2019/7/15 0015
 */
public class SelectedTablesFragment extends BaseMvpFragment {

    @BindView(R.id.rv_checkbox)
    RecyclerView rv_checkbox;

    public static final String TAG = "SelectTablesFragment";
    private SelectedTablesBean.ServerParamsBean.BusinesslistBean businesslistBean;
    private PingTablesAdapter tablesAdapter;
    private CheckRiskBean checkRiskBean;

    @Override
    protected void init() {

    }

    @Override
    protected void initView() {
        businesslistBean = (SelectedTablesBean.ServerParamsBean.BusinesslistBean) getArguments().getSerializable(TAG);// 表数据
        checkRiskBean = (CheckRiskBean) getArguments().getSerializable("checkRiskBean");// 判断是否有人在评估
        tablesAdapter = new PingTablesAdapter(App.getContext(), businesslistBean.getListforms(),checkRiskBean);
        rv_checkbox.setLayoutManager(new GridLayoutManager(App.getContext(), 2));
        rv_checkbox.setAdapter(tablesAdapter);
        tablesAdapter.notifyDataSetChanged();
        tablesAdapter.setSetCheckboxFormId(new PingTablesAdapter.SetCheckboxFormId() {
            @Override
            public void onCheckboxFormId(boolean checked, int form_id) {
                setFormId.onFormId(checked, form_id);
            }
        });
    }

    @Override
    protected int setContentView() {
        return R.layout.fragment_checkbox;
    }

    @Override
    protected void lazyLoad() {

    }

    @Override
    public BasePresenter initPresenter() {
        return null;
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void failure(String msg) {

    }

    private SetFormId setFormId;

    public interface SetFormId {
        void onFormId(boolean checked, int form_id);
    }

    public void setSetFormId(SetFormId setFormId) {
        this.setFormId = setFormId;
    }
}
