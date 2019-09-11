package com.example.tidus.ristrat.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
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

public class TopicAdapter extends RecyclerView.Adapter<TopicAdapter.ViewHolder> {

    private Context context;
    private List<RiskAssessmentBean.ServerParamsBean.WENJUANNAMEBean.XUANXIANGBean.WENJUANBean.SublistBean> sublistBeans;
    private View customView;
    private List<RiskAssessmentBean.ServerParamsBean.WENJUANNAMEBean.XUANXIANGBean.WENJUANBean> wenjuanBeans;// 所有组
    private QuestionAdapter questionAdapter;
    private int groupPosition;// 当前组
    private CommonPopupWindow commonPopupWindow;
    private boolean isCommit = false;
    private int form_id;
    private RiskAssessmentBean.ServerParamsBean.WENJUANNAMEBean wenjuannameBean;

    public TopicAdapter(Context context, List<RiskAssessmentBean.ServerParamsBean.WENJUANNAMEBean.XUANXIANGBean.WENJUANBean.SublistBean> sublistBeans, List<RiskAssessmentBean.ServerParamsBean.WENJUANNAMEBean.XUANXIANGBean.WENJUANBean> wenjuanBeans, QuestionAdapter questionAdapter, int groupPosition) {
        this.context = context;
        this.sublistBeans = sublistBeans;
        this.wenjuanBeans = wenjuanBeans;
        this.questionAdapter = questionAdapter;
        this.groupPosition = groupPosition;
    }

    public void setWenjuannameBean(RiskAssessmentBean.ServerParamsBean.WENJUANNAMEBean wenjuannameBean) {
        if (wenjuannameBean != null) {
            this.wenjuannameBean = wenjuannameBean;
        }
        notifyDataSetChanged();
    }

    public void setCommit(boolean commit, int form_id) {
        this.isCommit = commit;
        this.form_id = form_id;
        notifyDataSetChanged();
    }

    @NonNull
    @Override

    public TopicAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.risk_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final TopicAdapter.ViewHolder holder, final int position) {
        final RiskAssessmentBean.ServerParamsBean.WENJUANNAMEBean.XUANXIANGBean.WENJUANBean.SublistBean sublistBean = sublistBeans.get(position);
        holder.cb_checked.setText(sublistBean.getRISK_FACTOR_NAME());
        if (sublistBean.getIsslect().equals("1")) {
            sublistBean.getOptionList().get(0).setItemChecked(true);
            holder.cb_checked.setChecked(true);
            holder.iv_wenhao.setVisibility(View.VISIBLE);
        } else {
            sublistBean.getOptionList().get(0).setItemChecked(false);
            holder.cb_checked.setChecked(false);
            holder.iv_wenhao.setVisibility(View.GONE);
        }

        holder.cb_checked.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    //setCheckItem.onSetCheckItem(isChecked, position, sublistBean);
                    if (sublistBean.getSCORE_SHOW_TYPE() == 30) {
                        holder.et_shuru.setVisibility(View.VISIBLE);
                        String trim = holder.et_shuru.getText().toString().trim();
                        setShuRuText.onShuRuText(trim);
                    }
                } else {
                    //setCheckItem.onSetCheckItem(isChecked, position, sublistBean);
                    if (sublistBean.getSCORE_SHOW_TYPE() == 30) {
                        holder.et_shuru.setVisibility(View.GONE);
                    }
                }
            }
        });
        // 互斥
        if (sublistBean.getMUTEX_GROUP() == 1) {
            holder.cb_checked.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        for (int i = 0; i < wenjuanBeans.size(); i++) {
                            if (i != groupPosition) {
                                holder.cb_checked.setChecked(false);
                            } else {
                                holder.cb_checked.setChecked(true);
                            }
                        }
                    }
                }
            });
        }

        // 判断提交后置为不能选择
        if (form_id == wenjuannameBean.getFORM_ID()) {
            if (isCommit) {
                holder.cb_checked.setEnabled(false);
            }
        } else {
            if (isCommit) {
                holder.cb_checked.setEnabled(true);
            }
        }
        // 计算分数
        holder.cb_checked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //setCheckedItem.onSetCheckedItem(position);
                setCheckItem.onSetCheckItem(holder.cb_checked.isChecked(), position, sublistBean);
            }
        });


/*


        final View view_pop = (View) LayoutInflater.from(context).inflate(R.layout.item_wenhao_pop, null);

        */
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


    }


    @Override
    public int getItemCount() {
        return sublistBeans.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {

        private final CheckBox cb_checked;
        private final ImageView iv_wenhao;
        private final EditText et_shuru;

        public ViewHolder(View itemView) {
            super(itemView);
            cb_checked = itemView.findViewById(R.id.cb_checked);
            iv_wenhao = itemView.findViewById(R.id.iv_wenhao);
            et_shuru = itemView.findViewById(R.id.et_shuru);
        }
    }

    // 计算分数接口
    private SetCheckItem setCheckItem;

    public interface SetCheckItem {
        void onSetCheckItem(boolean checked, int position, RiskAssessmentBean.ServerParamsBean.WENJUANNAMEBean.XUANXIANGBean.WENJUANBean.SublistBean sublistBean);
    }

    public void setSetCheckItem(SetCheckItem setCheckItem) {
        this.setCheckItem = setCheckItem;
    }

    // 其他输入框内容回调接口
    private SetShuRuText setShuRuText;

    public interface SetShuRuText {
        void onShuRuText(String shuruValue);
    }

    public void setSetShuRuText(SetShuRuText setShuRuText) {
        this.setShuRuText = setShuRuText;
    }

    /*private SetCheckedItem setCheckedItem;

    public interface SetCheckedItem {
        void onSetCheckedItem(int position);
    }

    public void setSetCheckedItem(SetCheckedItem setCheckedItem) {
        this.setCheckedItem = setCheckedItem;
    }*/
}
