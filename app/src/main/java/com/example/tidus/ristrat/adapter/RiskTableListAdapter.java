package com.example.tidus.ristrat.adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.tidus.ristrat.R;
import com.example.tidus.ristrat.bean.RiskAssessmentBean;

import java.util.ArrayList;
import java.util.List;

public class RiskTableListAdapter extends RecyclerView.Adapter<RiskTableListAdapter.ViewHolder> {
    private Context context;
    private List<RiskAssessmentBean.ServerParamsBean.WENJUANNAMEBean> wenjuannameBeans;

    public RiskTableListAdapter(Context context) {
        wenjuannameBeans = new ArrayList<>();
        this.context = context;
    }

    public void setWenjuannameBeans(List<RiskAssessmentBean.ServerParamsBean.WENJUANNAMEBean> wenjuannameBeans) {
        if (wenjuannameBeans != null) {
            this.wenjuannameBeans = wenjuannameBeans;
        }
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public RiskTableListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_risk_table, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RiskTableListAdapter.ViewHolder holder, final int position) {


        final RiskAssessmentBean.ServerParamsBean.WENJUANNAMEBean wenjuannameBean = wenjuannameBeans.get(position);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0; i < wenjuannameBeans.size(); i++) {
                    RiskAssessmentBean.ServerParamsBean.WENJUANNAMEBean bean = wenjuannameBeans.get(i);
                    if (i == position) {
                        bean.setChe_color(true);
                    } else {
                        bean.setChe_color(false);
                    }
//                    wenjuannameBeans.get(i).che_color = false;
                }
                setSelectTableListener.onClickSelectTable(wenjuannameBean, wenjuannameBean.getForm_id(), v);
            }
        });

        if (wenjuannameBean.getFORM_ID() == 2) {
            wenjuannameBean.setForm_id(2);
        } else if (wenjuannameBean.getFORM_ID() == 1) {
            wenjuannameBean.setForm_id(1);
        }

        if (wenjuannameBean.isChe_color()) {
            holder.cly.setBackgroundColor(Color.parseColor("#28c48f"));
        } else {
            holder.cly.setBackgroundColor(Color.WHITE);
        }
        if (wenjuannameBean.isChe_color()) {
            holder.cly.setBackgroundColor(Color.parseColor("#28c48f"));
            holder.tv_risk_table.setTextColor(Color.WHITE);

        } else {
            holder.cly.setBackgroundColor(Color.WHITE);
            holder.tv_risk_table.setTextColor(Color.parseColor("#d2d0d0"));
        }
        holder.tv_risk_table.setText(wenjuannameBean.getFORM_NAME());

    }

    @Override
    public int getItemCount() {
        return wenjuannameBeans.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private final TextView tv_risk_table;
        private final ConstraintLayout cly;

        public ViewHolder(View itemView) {
            super(itemView);
            tv_risk_table = itemView.findViewById(R.id.tv_risk_table);
            cly = itemView.findViewById(R.id.cly);
        }
    }

    private SetSelectTableListener setSelectTableListener;

    public interface SetSelectTableListener {
        void onClickSelectTable(RiskAssessmentBean.ServerParamsBean.WENJUANNAMEBean wenjuannameBean, int form_id, View v);
    }

    public void setSetSelectTableListener(SetSelectTableListener setSelectTableListener) {
        this.setSelectTableListener = setSelectTableListener;
    }
}
