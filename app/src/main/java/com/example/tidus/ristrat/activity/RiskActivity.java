package com.example.tidus.ristrat.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tidus.ristrat.R;
import com.example.tidus.ristrat.adapter.RiskAdapter;
import com.example.tidus.ristrat.base.BaseActivity;
import com.example.tidus.ristrat.bean.RiskBean;
import com.example.tidus.ristrat.mvp.presenter.RiskPresenter;
import com.example.tidus.ristrat.mvp.view.iview.IRiskView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * 选择疾病页面
 */
public class RiskActivity extends BaseActivity<RiskPresenter> implements IRiskView {


    @BindView(R.id.title_back) ImageView titleBack;
    @BindView(R.id.title_lable) TextView titleLable;
    @BindView(R.id.txt_one) TextView txtOne;
    @BindView(R.id.rl_one) RecyclerView rlOne;
    @BindView(R.id.txt_two) TextView txtTwo;
    @BindView(R.id.rl_two) RecyclerView rlTwo;
    @BindView(R.id.txt_three) TextView txtThree;
    @BindView(R.id.rl_three) RecyclerView rlThree;
    @BindView(R.id.txt_four) TextView txtFour;
    @BindView(R.id.rl_four) RecyclerView rlFour;
    @BindView(R.id.txt_fraction) TextView txtFraction;
    @BindView(R.id.txt_result) TextView txtResult;
    @BindView(R.id.title_left_lable) TextView titleLeftLable;
    private List<RiskBean.ServerParamsBean> oneList;
    private List<RiskBean.ServerParamsBean> twoList;
    private List<RiskBean.ServerParamsBean> threeList;
    private List<RiskBean.ServerParamsBean> fourList;
    private RiskAdapter oneAdapter;//分数为1
    private RiskAdapter fourAdapter;//分数为5
    private RiskAdapter twoAdapter;//分数为2
    private RiskAdapter threeAdapter;//分数为3
    private ArrayList<RiskBean.ServerParamsBean> intentList;
    private int index = 1;//分数
    private int allNum = 0; //总和
    private String leftLable = "风险评估";
    public static Activity mActivity;
    private String age;

    @Override
    protected void initData() {
        mActivity = this;
        final Intent intent = getIntent();
        final String topic_id = intent.getStringExtra("topic_id");
        age = intent.getStringExtra("age");
        control(topic_id, age);
        String leftable = getIntent().getStringExtra("leftable");
        titleLeftLable.setText(leftable);

        txtResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (allNum == 0) {
                    Toast.makeText(RiskActivity.this, "最少勾选一个", Toast.LENGTH_SHORT).show();
                    return;
                }
                Intent intent = new Intent(RiskActivity.this, ReportActivity.class);
                intent.putExtra("intentList", (Serializable) (RiskActivity.this.intentList));//key就是自己定义一个String的字符串就行了
                intent.putExtra("allnum", allNum);
                intent.putExtra("topic_id", topic_id);
                intent.putExtra("leftable", leftLable);
                startActivity(intent);
            }
        });

    }


    @Override
    protected RiskPresenter getProduct() {
        return new RiskPresenter();
    }

    @Override
    protected void initView() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_risk;
    }

    @Override
    public void success(RiskBean riskBean) {
        if (riskBean != null) {
            for (RiskBean.ServerParamsBean serverParamsBean : riskBean.getServer_params()) {
                if (serverParamsBean.getFACTOR_GROUP_ID() == 1) {
                    oneList.add(serverParamsBean);
                } else if (serverParamsBean.getFACTOR_GROUP_ID() == 2) {
                    twoList.add(serverParamsBean);
                } else if (serverParamsBean.getFACTOR_GROUP_ID() == 3) {
                    threeList.add(serverParamsBean);
                } else {
                    fourList.add(serverParamsBean);
                }
            }
            oneAdapter.notifyDataSetChanged();
            twoAdapter.notifyDataSetChanged();
            threeAdapter.notifyDataSetChanged();
            fourAdapter.notifyDataSetChanged();
        }

        txtOne.setText("以下每项风险因素记 1 分");
        txtTwo.setText("以下每项风险因素记 2 分");
        txtThree.setText("以下每项风险因素记 3 分");
        txtFour.setText("以下每项风险因素记 5 分");
        Integer integer = Integer.valueOf(age);

        if(oneList.get(0).getRISK_FACTOR_ID()==1001&&integer>40&&integer<60){
            index=1;
            sum(true);
            intentList.add(oneList.get(0));
        }
        if(twoList.get(0).getRISK_FACTOR_ID()==1018&&integer>60&&integer<65){
            index=2;
            sum(true);
            intentList.add(twoList.get(0));
        }
        if(integer>76&&threeList.get(0).getRISK_FACTOR_ID()==1026){
            index=3;
            sum(true);
            intentList.add(threeList.get(0));
        }
        if(fourList.get(0).getRISK_FACTOR_NAME().equals("脑卒中")&&fourList.get(0).getRISK_FACTOR_ID()==1036){
            index=5;
            sum(true);
            intentList.add(fourList.get(0));
        }
    }

    @Override
    public void faild(Throwable t) {

    }

    @Override
    public Context context() {
        return this;
    }


    private void control(String topic_id, String age) {
        titleLable.setText(leftLable);
        Map<String, String> params = new HashMap<>();
        params.put("Type", "queryPGWJweixianyinsu");
        params.put("TOPIC_ID", topic_id);
        presenter.getRiskBean(params);
        oneList = new ArrayList<>();
        twoList = new ArrayList<>();
        threeList = new ArrayList<>();
        fourList = new ArrayList<>();
        intentList = new ArrayList<>();
        intentList.clear();

        oneAdapter = new RiskAdapter(this, oneList, age);
        fourAdapter = new RiskAdapter(this, fourList, age);
        twoAdapter = new RiskAdapter(this, twoList, age);
        threeAdapter = new RiskAdapter(this, threeList, age);
        rlOne.setLayoutManager(new GridLayoutManager(this, 2));
        rlTwo.setLayoutManager(new GridLayoutManager(this, 2));
        rlThree.setLayoutManager(new GridLayoutManager(this, 2));
        rlFour.setLayoutManager(new GridLayoutManager(this, 2));

        oneAdapter.setOnCheckedClickListener(new RiskAdapter.onCheckedClickListener() {
            @Override
            public void onCheckedClick(View view, int position, boolean isChecked) {
                index = 1;
                sum(isChecked);
                if (isChecked) {
                    intentList.add(oneList.get(position));
                } else {
                    intentList.remove(oneList.get(position));
                }
            }
        });
        twoAdapter.setOnCheckedClickListener(new RiskAdapter.onCheckedClickListener() {
            @Override
            public void onCheckedClick(View view, int position, boolean isChecked) {
                index = 2;
                sum(isChecked);
                if (isChecked) {
                    intentList.add(twoList.get(position));
                } else {
                    intentList.remove(twoList.get(position));
                }
            }
        });
        threeAdapter.setOnCheckedClickListener(new RiskAdapter.onCheckedClickListener() {
            @Override
            public void onCheckedClick(View view, int position, boolean isChecked) {
                index = 3;
                sum(isChecked);
                if (isChecked) {
                    intentList.add(threeList.get(position));
                } else {
                    intentList.remove(threeList.get(position));
                }
            }
        });
        fourAdapter.setOnCheckedClickListener(new RiskAdapter.onCheckedClickListener() {
            @Override
            public void onCheckedClick(View view, int position, boolean isChecked) {
                index = 5;
                sum(isChecked);
                if (isChecked) {
                    intentList.add(fourList.get(position));
                } else {
                    intentList.remove(fourList.get(position));
                }
            }
        });
        rlOne.setAdapter(oneAdapter);
        rlTwo.setAdapter(twoAdapter);
        rlThree.setAdapter(threeAdapter);
        rlFour.setAdapter(fourAdapter);

    }

    private void sum(boolean isChecked) {
        if (isChecked) {
            allNum = index + allNum;
        } else {
            allNum = allNum - index;
        }
        txtFraction.setText("风险因素总分为:" + allNum);
    }


    @OnClick({R.id.title_back, R.id.title_left_lable})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.title_back:
                finish();
                break;
            case R.id.title_left_lable:
                finish();
                break;
        }
    }
}
