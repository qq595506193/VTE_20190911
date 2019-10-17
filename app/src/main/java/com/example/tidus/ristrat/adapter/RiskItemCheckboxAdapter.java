package com.example.tidus.ristrat.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tidus.ristrat.R;
import com.example.tidus.ristrat.bean.RiskAssessmentBean;
import com.example.tidus.ristrat.utils.CommonPopupWindow;

import java.util.List;

/**
 * Created by TriumphalSun
 * on 2019/7/17 0017
 */
public class RiskItemCheckboxAdapter extends RecyclerView.Adapter<RiskItemCheckboxAdapter.ViewHolder> {

    private Context context;
    private List<RiskAssessmentBean.ServerParamsBean.WENJUANNAMEBean.XUANXIANGBean.WENJUANBean.SublistBean> sublistBeans;
    private List<RiskAssessmentBean.ServerParamsBean.WENJUANNAMEBean.XUANXIANGBean.WENJUANBean.SublistBean> sublistBeans_checked;
    private CommonPopupWindow commonPopupWindow;
    private boolean isCommit = false;
    private RiskAssessmentBean.ServerParamsBean.WENJUANNAMEBean wenjuannameBean;
    private List<RiskAssessmentBean.ServerParamsBean.WENJUANNAMEBean.XUANXIANGBean.WENJUANBean> group_id;


    public RiskItemCheckboxAdapter(Context context) {
        this.context = context;
    }

    public void setSublistBeans(List<RiskAssessmentBean.ServerParamsBean.WENJUANNAMEBean.XUANXIANGBean.WENJUANBean.SublistBean> sublistBeans) {
        if (sublistBeans != null) {
            this.sublistBeans = sublistBeans;
        }
        notifyDataSetChanged();
    }

    public void setCommit(boolean commit) {
        this.isCommit = commit;
        notifyDataSetChanged();
    }

    public void setWenjuannameBean(RiskAssessmentBean.ServerParamsBean.WENJUANNAMEBean wenjuannameBean) {
        if (wenjuannameBean != null) {
            this.wenjuannameBean = wenjuannameBean;
        }
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public RiskItemCheckboxAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.risk_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final RiskItemCheckboxAdapter.ViewHolder holder, final int position) {
        final RiskAssessmentBean.ServerParamsBean.WENJUANNAMEBean.XUANXIANGBean.WENJUANBean.SublistBean sublistBean = sublistBeans.get(position);
        holder.ck_checked.setText(sublistBean.getRISK_FACTOR_NAME());
        holder.ck_checked.setChecked(sublistBean.isChecked());
        // 默认勾选y
        if (sublistBean.getIsslect().equals("1")) {
            holder.iv_wenhao.setVisibility(View.VISIBLE);
            sublistBean.setChecked(true);
        } else {
            sublistBean.setChecked(false);
            holder.iv_wenhao.setVisibility(View.INVISIBLE);
        }


        holder.ck_checked.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    sublistBean.setChecked(true);
                    setValueUpdate.onSetValueUpdate(sublistBeans);// 数据同步
                    setGradeListener.onGradeListener(true, sublistBean);
                    if (sublistBean.getSCORE_SHOW_TYPE() == 30) {
                        holder.et_shuru.setVisibility(View.VISIBLE);
                        //sublistBean.setShuruValue(holder.et_shuru);
                        String shuruValue = holder.et_shuru.getText().toString().trim();
                        sublistBean.setShuruValue(shuruValue);
                    }
                } else {
                    sublistBean.setChecked(false);
                    setValueUpdate.onSetValueUpdate(sublistBeans);// 数据同步
                    setGradeListener.onGradeListener(false, sublistBean);
                    if (sublistBean.getSCORE_SHOW_TYPE() == 30) {
                        holder.et_shuru.setVisibility(View.INVISIBLE);
                        //sublistBean.setShuruValue(holder.et_shuru);
                        holder.et_shuru.setText("");
                        sublistBean.setShuruValue("");
                    }
                }
            }
        });

        holder.et_shuru.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                sublistBean.setShuruValue(holder.et_shuru.getText().toString().trim());
            }
        });


        holder.ck_checked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // 算分回调+题ID
                setGradeListener.onGradeListener(holder.ck_checked.isChecked(), sublistBean);
                // 判断选中了其他，显示输入框
                if (holder.ck_checked.isChecked()) {
                    if (sublistBean.getSCORE_SHOW_TYPE() == 30) {
                        holder.et_shuru.setVisibility(View.VISIBLE);
                        String trim = holder.et_shuru.getText().toString().trim();
                    }
                } else {
                    //setCheckItem.onSetCheckItem(isChecked, position, sublistBean);
                    if (sublistBean.getSCORE_SHOW_TYPE() == 30) {
                        holder.et_shuru.setVisibility(View.GONE);
                    }
                }
            }
        });

        //判断提交后置为不能选择
        if (isCommit) {
            holder.ck_checked.setEnabled(false);
        } else {
            holder.ck_checked.setEnabled(true);
        }

        // 问号pop弹窗
        holder.iv_wenhao.setOnClickListener(new View.OnClickListener() {

            private TextView tv_wenhao_content;

            @Override
            public void onClick(View v) {

                commonPopupWindow = new CommonPopupWindow.Builder(context)
                        //设置PopupWindow布局
                        .setView(R.layout.item_wenhao_pop)
                        //设置宽高
                        .setWidthAndHeight(1000,
                                ViewGroup.LayoutParams.WRAP_CONTENT)
                        //设置动画
                        //.setAnimationStyle(R.style.PopupWindow)
                        //设置背景颜色，取值范围0.0f-1.0f 值越小越暗 1.0f为透明
                        //.setBackGroundLevel(0.5f)
                        //设置PopupWindow里的子View及点击事件
                        .setViewOnclickListener(new CommonPopupWindow.ViewInterface() {
                            @Override
                            public void getChildView(View view, int layoutResId) {
                                TextView tv_wenhao_content = view.findViewById(R.id.tv_wenhao_content);
                                tv_wenhao_content.setText(sublistBean.getANALYSIS_SOURCE_STR());
                            }
                        })//设置外部是否可点击 默认是true
                        .setOutsideTouchable(true)
                        //开始构建
                        .create();
                commonPopupWindow.showAsDropDown(v, 0, 0);
            }
        });

        holder.ck_checked.setChecked(sublistBean.isChecked());
        Log.e("RiskAssessFragment", "组ID：" + sublistBean.getFACTOR_GROUP_ID() + "题ID：" + sublistBean.getRISK_FACTOR_ID() + "复选框设置的值：" + sublistBean.isChecked());
    }

    @Override
    public int getItemCount() {
        return sublistBeans == null ? 0 : sublistBeans.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private final CheckBox ck_checked;
        private final ImageView iv_wenhao;
        private final EditText et_shuru;

        public ViewHolder(View itemView) {
            super(itemView);
            ck_checked = itemView.findViewById(R.id.cb_checked);
            iv_wenhao = itemView.findViewById(R.id.iv_wenhao);
            et_shuru = itemView.findViewById(R.id.et_shuru);
        }
    }

    // 算分回调
    private SetGradeListener setGradeListener;

    public interface SetGradeListener {
        void onGradeListener(boolean isChecked, RiskAssessmentBean.ServerParamsBean.WENJUANNAMEBean.XUANXIANGBean.WENJUANBean.SublistBean sublistBean);
    }

    public void setSetGradeListener(SetGradeListener setGradeListener) {
        this.setGradeListener = setGradeListener;
    }

    // 数据同步回调
    private SetValueUpdate setValueUpdate;

    public interface SetValueUpdate {
        void onSetValueUpdate(List<RiskAssessmentBean.ServerParamsBean.WENJUANNAMEBean.XUANXIANGBean.WENJUANBean.SublistBean> sublistBeans);
    }

    public void setSetValueUpdate(SetValueUpdate setValueUpdate) {
        this.setValueUpdate = setValueUpdate;
    }
}
