package com.example.tidus.ristrat.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;

import com.example.tidus.ristrat.R;
import com.example.tidus.ristrat.bean.RiskAssessmentBean;
import com.example.tidus.ristrat.utils.GetNowTime;

import java.util.ArrayList;
import java.util.List;

public class QuestionOneAdapter extends RecyclerView.Adapter<QuestionOneAdapter.ViewHolder> {
    private Context context;
    private List<RiskAssessmentBean.ServerParamsBean.WENJUANNAMEBean.XUANXIANGBean.WENJUANBean.SublistBean> sublistBeans;
    private String age;

    public QuestionOneAdapter(Context context, String age) {
        sublistBeans = new ArrayList<>();
        this.context = context;
        this.age = age;
    }

    public void setSublistBeans(List<RiskAssessmentBean.ServerParamsBean.WENJUANNAMEBean.XUANXIANGBean.WENJUANBean.SublistBean> sublistBeans) {
        if (sublistBeans != null) {
            this.sublistBeans = sublistBeans;
        }
        notifyDataSetChanged();
    }

    public interface onCheckedClickListener {
        void onCheckedClick(View view, int position, String itemText, String initNowTime, boolean isChecked, RiskAssessmentBean.ServerParamsBean.WENJUANNAMEBean.XUANXIANGBean.WENJUANBean.SublistBean sublistBean);

        void onMorenSelect(boolean checked, RiskAssessmentBean.ServerParamsBean.WENJUANNAMEBean.XUANXIANGBean.WENJUANBean.SublistBean sublistBean);
    }

    private onCheckedClickListener onCheckedClickListener;

    public void setOnCheckedClickListener(QuestionOneAdapter.onCheckedClickListener onCheckedClickListener) {
        this.onCheckedClickListener = onCheckedClickListener;
    }

    @NonNull
    @Override
    public QuestionOneAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.risk_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final QuestionOneAdapter.ViewHolder holder, final int position) {
        final RiskAssessmentBean.ServerParamsBean.WENJUANNAMEBean.XUANXIANGBean.WENJUANBean.SublistBean sublistBean = sublistBeans.get(position);
        if (sublistBean.getFACTOR_GROUP_ID() == 1) {
            String risk_factor_name = sublistBean.getRISK_FACTOR_NAME();
            holder.cb_checked.setText(risk_factor_name);
            Integer integer = Integer.valueOf(age);
            if (sublistBean.getMUTEX_GROUP() == 1) {
                if (sublistBean.getIsslect().equals("1")) {
                    holder.cb_checked.setChecked(true);
                    onCheckedClickListener.onMorenSelect(holder.cb_checked.isChecked(), sublistBean);
                }
                holder.cb_checked.setEnabled(false);
            }


            holder.cb_checked.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (onCheckedClickListener != null) {
                        if (sublistBean.getMUTEX_GROUP() == 18 && holder.cb_checked.isChecked()) {
                            holder.et_shuru.setVisibility(View.VISIBLE);
                        }
                        String initNowTime = GetNowTime.initNowTime();
                        String itemText = holder.cb_checked.getText().toString().trim();
                        onCheckedClickListener.onCheckedClick(holder.itemView, position, itemText, initNowTime, holder.cb_checked.isChecked(), sublistBean);

                    }
                }
            });
        }

    }

    @Override
    public int getItemCount() {
        return sublistBeans.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private final CheckBox cb_checked;
        private final EditText et_shuru;

        public ViewHolder(View itemView) {
            super(itemView);
            cb_checked = itemView.findViewById(R.id.cb_checked);
            et_shuru = itemView.findViewById(R.id.et_shuru);
        }
    }
}
