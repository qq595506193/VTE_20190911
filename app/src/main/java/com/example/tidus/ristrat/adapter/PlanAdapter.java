package com.example.tidus.ristrat.adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.tidus.ristrat.R;
import com.example.tidus.ristrat.bean.Patient;
import com.example.tidus.ristrat.bean.PlanBean;
import com.example.tidus.ristrat.weight.BaseRecyclerAdapter;

import java.util.List;

public class PlanAdapter extends RecyclerView.Adapter<PlanAdapter.MyHolder> {

    private List<PlanBean.ServerParamsBean.ListBean> list;

    public PlanAdapter(List<PlanBean.ServerParamsBean.ListBean> list) {
        this.list = list;
    }

    public interface OnItemClickListener {
        void onClick(int position);
    }

    private OnItemClickListener onItemClickListener;

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    private Context context;

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        View layout = LayoutInflater.from(parent.getContext()).inflate(R.layout.plan_item, parent, false);
        return new MyHolder(layout);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, final int position) {
        PlanBean.ServerParamsBean.ListBean data = list.get(position);
        holder.txtPlanName.setText(data.getSERVICE_PLAN());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onItemClickListener != null) {
                    onItemClickListener.onClick(position);
                }
            }
        });

        String one = data.getCREATE_TIME().substring(0, 4);
        String two = data.getCREATE_TIME().substring(4, 6);
        String thr = data.getCREATE_TIME().substring(6, 8);
        String createTime = one + "." + two + "." + thr;
        String fo = data.getSTART_TIME().substring(0, 4);
        String fiv = data.getSTART_TIME().substring(4, 6);
        String at = data.getSTART_TIME().substring(6, 8);
        String endTime = fo + "." + fiv + "." + at;
        holder.txtPlanTime.setText(createTime + " - " + endTime);
        if (data.getUSED_FLAG() == 10) {
            holder.txtPlanState.setText("未执行");
            holder.itemView.setBackgroundColor(Color.parseColor("#ffffff"));
            Glide.with(context).load(R.drawable.icon_go).into(holder.imgIconGo);
        } else if (data.getUSED_FLAG() == 20) {
            holder.itemView.setBackgroundColor(Color.parseColor("#eeeeee"));
            holder.txtPlanState.setText("执行中");
            Glide.with(context).load(R.drawable.icon_go1).into(holder.imgIconGo);
        } else if (data.getUSED_FLAG() == 40) {
            holder.txtPlanState.setText("已结束");
            holder.itemView.setBackgroundColor(Color.parseColor("#ffffff"));
            Glide.with(context).load(R.drawable.icon_go).into(holder.imgIconGo);
        } else if (data.getUSED_FLAG() == 30) {
            holder.txtPlanState.setText("暂停中");
            holder.itemView.setBackgroundColor(Color.parseColor("#ffffff"));
            Glide.with(context).load(R.drawable.icon_go).into(holder.imgIconGo);

        } else {
            holder.txtPlanState.setText("已失效");
            holder.itemView.setBackgroundColor(Color.parseColor("#ffffff"));
            Glide.with(context).load(R.drawable.icon_go).into(holder.imgIconGo);
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyHolder extends RecyclerView.ViewHolder {
        TextView txtPlanName;
        TextView txtPlanTime;
        TextView txtPlanState;
        ImageView imgIconGo;

        public MyHolder(View itemView) {
            super(itemView);
            txtPlanName = (TextView) itemView.findViewById(R.id.txt_plan_name);
            txtPlanTime = (TextView) itemView.findViewById(R.id.txt_plan_time);
            txtPlanState = (TextView) itemView.findViewById(R.id.txt_plan_state);
            imgIconGo = (ImageView) itemView.findViewById(R.id.icon_go);
        }
    }
}
