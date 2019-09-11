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

import java.util.List;

/**
 * Created by TriumphalSun
 * on 2019/7/17 0017
 */
public class RiskTitleTableListAdapter extends RecyclerView.Adapter<RiskTitleTableListAdapter.ViewHolder> {
    private Context context;
    private List<RiskAssessmentBean.ServerParamsBean.WENJUANNAMEBean> wenjuannameBeans;

    public RiskTitleTableListAdapter(Context context) {
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
    public RiskTitleTableListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_risk_table, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RiskTitleTableListAdapter.ViewHolder holder, final int position) {
        final RiskAssessmentBean.ServerParamsBean.WENJUANNAMEBean wenjuannameBean = wenjuannameBeans.get(position);
        holder.tv_risk_table.setText(wenjuannameBean.getFORM_NAME());
        if (wenjuannameBean.isChe_color()) {
            holder.cly.setBackgroundColor(Color.parseColor("#28c48f"));
            holder.tv_risk_table.setTextColor(Color.WHITE);

        } else {
            holder.cly.setBackgroundColor(Color.WHITE);
            holder.tv_risk_table.setTextColor(Color.parseColor("#d2d0d0"));
        }
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setOnItemClickListener.onItemClickListener(wenjuannameBean.getFORM_ID());
                for (int i = 0; i < wenjuannameBeans.size(); i++) {
                    RiskAssessmentBean.ServerParamsBean.WENJUANNAMEBean bean = wenjuannameBeans.get(i);
                    if (i == position) {
                        bean.setChe_color(true);
                    } else {
                        bean.setChe_color(false);
                    }
                }
                notifyDataSetChanged();
            }
        });
    }

    @Override
    public int getItemCount() {
        return wenjuannameBeans == null ? 0 : wenjuannameBeans.size();
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

    // 条目点击事件
    private SetOnItemClickListener setOnItemClickListener;

    public interface SetOnItemClickListener {
        void onItemClickListener(int form_id);
    }

    public void setSetOnItemClickListener(SetOnItemClickListener setOnItemClickListener) {
        this.setOnItemClickListener = setOnItemClickListener;
    }
}
