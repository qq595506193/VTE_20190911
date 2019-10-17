package com.example.tidus.ristrat.fragment;

import android.support.v7.app.AlertDialog;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.lib_core.base.mvp.BaseMvpFragment;
import com.example.lib_core.base.mvp.BasePresenter;
import com.example.tidus.ristrat.R;
import com.example.tidus.ristrat.adapter.RiskGroupAdapter;
import com.example.tidus.ristrat.application.App;
import com.example.tidus.ristrat.bean.CaseControlBean;
import com.example.tidus.ristrat.bean.LoginBean;
import com.example.tidus.ristrat.bean.NowSelectTablesBean;
import com.example.tidus.ristrat.bean.QueryHMBean;
import com.example.tidus.ristrat.bean.RiskAssessmentBean;
import com.example.tidus.ristrat.bean.SelectQuestionListBean;
import com.example.tidus.ristrat.bean.SelectedTablesBean;
import com.example.tidus.ristrat.utils.LoadingDialog;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * Created by TriumphalSun
 * on 2019/10/10 0010
 * com.example.tidus.ristrat.fragment name of the package in which the new file is created
 */
public class RiskAssessFragment_02 extends BaseMvpFragment {

    public static final String TAG = "RiskAssessFragment";

    // 单选框 按计分/按临床
    @BindView(R.id.rg_select)
    RadioGroup rg_select;
    // 按计分
    @BindView(R.id.rb_score_jifen)
    RadioButton rb_score_jifen;
    // 按临床
    @BindView(R.id.rb_score_linchuang)
    RadioButton rb_score_linchuang;
    // 选题列表
    @BindView(R.id.rv_question_check)
    RecyclerView rv_question_check;
    // 模型总分
    @BindView(R.id.tv_score_sum)
    TextView tv_score_sum;
    // 危险等级
    @BindView(R.id.tv_level)
    TextView tv_level;
    // 暂时保存
    @BindView(R.id.btn_save)
    Button btn_save;
    // 提交
    @BindView(R.id.btn_sign_list)
    Button btn_sign_list;


    private RiskAssessmentBean.ServerParamsBean.WENJUANNAMEBean wenjuannameBean;
    private RiskGroupAdapter riskGroupAdapter;
    // 组ID
    private int GROUP_TAB_ID = 1;
    // 总分数
    private int gross_score = 0;
    // 存题ID
    private List<RiskAssessmentBean.ServerParamsBean.WENJUANNAMEBean.XUANXIANGBean.WENJUANBean.SublistBean> sublistBeans_checked = new ArrayList<>();// itemId
    private AlertDialog.Builder builder;// dialog
    private CaseControlBean.ServerParamsBean serverParamsBean;// 患者信息
    private SelectedTablesBean.ServerParamsBean.BusinesslistBean businesslistBean;// 业务信息
    private NowSelectTablesBean.ServerParamsBean.BusinesslistBean businesslistBean_now;// 业务信息
    private LoginBean loginBean;// 用户信息
    private QueryHMBean.ServerParamsBean.TixingLISTBean tixingListBean;// 继续评估后接过来的对象
    private SelectQuestionListBean selectQuestionListBean;// 一共有多少个表
    private String commit_form_id;// 记录提交了哪个表
    private RiskAssessmentBean.ServerParamsBean.WENJUANNAMEBean.XUANXIANGBean.WENJUANBean.SublistBean sublistBean;
    private LoadingDialog loadingDialog;
    private int jianSum = 0;
    private List<RiskAssessmentBean.ServerParamsBean.WENJUANNAMEBean.XUANXIANGBean.WENJUANBean> wenjuan;
    private List<RiskAssessmentBean.ServerParamsBean.WENJUANNAMEBean.XUANXIANGBean.WENJUANBean> wenjuan1;
    private String patient_id;
    private int form_id_;// 接过来的表ID


    @Override
    protected void init() {

    }

    @Override
    protected int setContentView() {
        return R.layout.fragment_risk_assess;
    }

    @Override
    protected void initView() {
        // 接值
        initGetBundle();
        // 设置值
        initSetValue();
    }

    private void initSetValue() {
        riskGroupAdapter = new RiskGroupAdapter(getActivity());// 内部有popupwindow弹出框，所以使用Activity上下文
        rv_question_check.setLayoutManager(new LinearLayoutManager(App.getContext()));
        rv_question_check.setAdapter(riskGroupAdapter);
        for (RiskAssessmentBean.ServerParamsBean.WENJUANNAMEBean.XUANXIANGBean xuanxiangBean : wenjuannameBean.getXUANXIANG()) {
            // 给单选框赋值
            if (xuanxiangBean.getGROUP_TAB_ID() == 1) {
                rb_score_jifen.setText(xuanxiangBean.getGROUP_TAB());
            } else if (xuanxiangBean.getGROUP_TAB_ID() == 2) {
                rb_score_linchuang.setText(xuanxiangBean.getGROUP_TAB());
            } else {
                rb_score_jifen.setText(xuanxiangBean.getGROUP_TAB());
            }
        }

        // 两个组的数据
        for (RiskAssessmentBean.ServerParamsBean.WENJUANNAMEBean.XUANXIANGBean xuanxiangBean : wenjuannameBean.getXUANXIANG()) {
            if (xuanxiangBean.getGROUP_TAB_ID() == GROUP_TAB_ID) {
                wenjuan = xuanxiangBean.getWENJUAN();
                riskGroupAdapter.setWenjuanBeans(wenjuan, GROUP_TAB_ID);
            }
            if (xuanxiangBean.getGROUP_TAB_ID() == 3) {
                wenjuan1 = xuanxiangBean.getWENJUAN();
                riskGroupAdapter.setWenjuanBeans(wenjuan1, GROUP_TAB_ID);
            }
        }

        // 同步选中的数据
        riskGroupAdapter.setSetGroupValueUpdate(new RiskGroupAdapter.SetGroupValueUpdate() {
            @Override
            public void onSetGroupValueUpdate(List<RiskAssessmentBean.ServerParamsBean.WENJUANNAMEBean.XUANXIANGBean.WENJUANBean> wenjuanBeans) {
                for (RiskAssessmentBean.ServerParamsBean.WENJUANNAMEBean.XUANXIANGBean xuanxiangBean : wenjuannameBean.getXUANXIANG()) {
                    List<RiskAssessmentBean.ServerParamsBean.WENJUANNAMEBean.XUANXIANGBean.WENJUANBean> wenjuan = xuanxiangBean.getWENJUAN();
                    wenjuan = wenjuanBeans;
                }
            }
        });

        // 分组切换
        rg_select.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.rb_score_jifen:
                        GROUP_TAB_ID = 1;
                        for (RiskAssessmentBean.ServerParamsBean.WENJUANNAMEBean.XUANXIANGBean xuanxiangBean : wenjuannameBean.getXUANXIANG()) {
                            if (xuanxiangBean.getGROUP_TAB_ID() == GROUP_TAB_ID) {
                                riskGroupAdapter.setWenjuanBeans(xuanxiangBean.getWENJUAN(),GROUP_TAB_ID);
                            }
                        }
                        break;
                    case R.id.rb_score_linchuang:
                        GROUP_TAB_ID = 2;
                        for (RiskAssessmentBean.ServerParamsBean.WENJUANNAMEBean.XUANXIANGBean xuanxiangBean : wenjuannameBean.getXUANXIANG()) {
                            if (xuanxiangBean.getGROUP_TAB_ID() == GROUP_TAB_ID) {
                                riskGroupAdapter.setWenjuanBeans(xuanxiangBean.getWENJUAN(), GROUP_TAB_ID);
                            }
                        }
                        break;
                }
            }
        });


    }

    private void initGetBundle() {
        // 从Activity接过来的问卷对象
        wenjuannameBean = (RiskAssessmentBean.ServerParamsBean.WENJUANNAMEBean) getArguments().getSerializable(TAG);
        // 每次接到新数据清空集合
        sublistBeans_checked.clear();
        // 接业务对象
        businesslistBean = (SelectedTablesBean.ServerParamsBean.BusinesslistBean) getArguments().getSerializable("businesslistBean");
        businesslistBean_now = (NowSelectTablesBean.ServerParamsBean.BusinesslistBean) getArguments().getSerializable("businesslistBean_now");
        // 接患者信息对象
        serverParamsBean = (CaseControlBean.ServerParamsBean) getArguments().getSerializable("serverParamsBean");
        // 用户信息
        loginBean = (LoginBean) getArguments().getSerializable("loginBean");
        // 提醒信息
        tixingListBean = (QueryHMBean.ServerParamsBean.TixingLISTBean) getArguments().getSerializable("tixingListBean");
        // 一共有多少个表
        selectQuestionListBean = (SelectQuestionListBean) getArguments().getSerializable("selectQuestionListBean");
        // 从消息页面患者ID
        patient_id = getArguments().getString("patient_id");
        // 接过来的表ID
        form_id_ = getArguments().getInt("form_id");
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
}
