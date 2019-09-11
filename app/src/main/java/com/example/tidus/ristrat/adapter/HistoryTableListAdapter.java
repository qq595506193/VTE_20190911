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
import com.example.tidus.ristrat.bean.HistoryAssessBean;

import java.util.ArrayList;
import java.util.List;

public class HistoryTableListAdapter extends RecyclerView.Adapter<HistoryTableListAdapter.ViewHolder> {
    private Context context;
    private List<HistoryAssessBean.ServerParamsBean.ReportListBean> wenjuannameBeans;

    public HistoryTableListAdapter(Context context) {
        wenjuannameBeans = new ArrayList<>();
        this.context = context;
    }

    public void setWenjuannameBeans(List<HistoryAssessBean.ServerParamsBean.ReportListBean> wenjuannameBeans) {
        if (wenjuannameBeans != null) {
            this.wenjuannameBeans = wenjuannameBeans;
//            if (wenjuannameBeans.size() == 1) {
//                setTableItem.setOnClickTableItem(wenjuannameBeans.get(0).getFORM_ID(), wenjuannameBeans.get(0));
//            }
        }
//        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public HistoryTableListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_risk_table, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final HistoryTableListAdapter.ViewHolder holder, final int position) {
        final HistoryAssessBean.ServerParamsBean.ReportListBean reportListBean = wenjuannameBeans.get(position);
        holder.tv_risk_table.setText(reportListBean.getFORM_NAME());

        if (reportListBean.getFORM_ID() == 2) {
            reportListBean.form_id = 2;
        } else if (reportListBean.getFORM_ID() == 1) {
            reportListBean.form_id = 1;
        }

        if (reportListBean.che_color) {
            holder.cly.setBackgroundColor(Color.parseColor("#28c48f"));
            holder.tv_risk_table.setTextColor(Color.WHITE);

        } else {
            holder.cly.setBackgroundColor(Color.WHITE);
            holder.tv_risk_table.setTextColor(Color.parseColor("#d2d0d0"));
        }


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setTableItem.setOnClickTableItem(reportListBean.form_id, reportListBean);


                for (int i = 0; i < wenjuannameBeans.size(); i++) {
                    HistoryAssessBean.ServerParamsBean.ReportListBean bean = wenjuannameBeans.get(i);
                    if (i == position) {
                        bean.che_color = true;
                    } else {
                        bean.che_color = false;
                    }
                }
                notifyDataSetChanged();
            }
        });
    }

    @Override
    public int getItemCount() {
        return wenjuannameBeans.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private final TextView tv_risk_table;
        private final ConstraintLayout cly;

        public ViewHolder(View itemView) {
            super(itemView);
            tv_risk_table = itemView.findViewById(R.id.tv_risk_table);
            cly = itemView.findViewById(R.id.cly);
        }
    }

    private SetTableItem setTableItem;

    public interface SetTableItem {
        void setOnClickTableItem(int form_id, HistoryAssessBean.ServerParamsBean.ReportListBean reportListBean);
    }

    public void setSetTableItem(SetTableItem setTableItem) {
        this.setTableItem = setTableItem;
    }
}
