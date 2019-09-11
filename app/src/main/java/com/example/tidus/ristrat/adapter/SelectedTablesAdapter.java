package com.example.tidus.ristrat.adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.tidus.ristrat.R;
import com.example.tidus.ristrat.bean.CheckRiskBean;
import com.example.tidus.ristrat.bean.SelectedTablesBean;

import java.util.List;

/**
 * Created by TriumphalSun
 * on 2019/7/15 0015
 */
public class SelectedTablesAdapter extends RecyclerView.Adapter<SelectedTablesAdapter.ViewHolder> {
    private Context context;
    private List<SelectedTablesBean.ServerParamsBean.BusinesslistBean> businesslist;
    private CheckRiskBean checkRiskBean;

    public SelectedTablesAdapter(Context context, List<SelectedTablesBean.ServerParamsBean.BusinesslistBean> businesslist) {
        this.context = context;
        this.businesslist = businesslist;
    }

    public void setServerParamsBeans(CheckRiskBean checkRiskBean) {
        if (checkRiskBean != null) {
            this.checkRiskBean = checkRiskBean;
        }
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public SelectedTablesAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_select_tables, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SelectedTablesAdapter.ViewHolder holder, final int position) {
        final SelectedTablesBean.ServerParamsBean.BusinesslistBean businesslistBean = businesslist.get(position);
        holder.tv_table_name.setText(businesslistBean.getASSESS_BUSINESS());// 评估项名字

        if (businesslistBean.isChe_color()) {
            holder.tv_table_name.setBackgroundColor(Color.WHITE);
            holder.tv_table_name.setTextColor(Color.parseColor("#abd7b4"));
        } else {
            holder.tv_table_name.setBackgroundColor(Color.parseColor("#eceff3"));
            holder.tv_table_name.setTextColor(Color.BLACK);
        }

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0; i < businesslist.size(); i++) {
                    SelectedTablesBean.ServerParamsBean.BusinesslistBean businesslistBean1 = businesslist.get(i);
                    if (i == position) {
                        businesslistBean1.setChe_color(true);
                    } else {
                        businesslistBean1.setChe_color(false);
                    }
                }
                setSelectTables.onSelectTables(position, businesslistBean, checkRiskBean);
                notifyDataSetChanged();
            }
        });
    }

    @Override
    public int getItemCount() {
        return businesslist == null ? 0 : businesslist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView tv_table_name;

        public ViewHolder(View itemView) {
            super(itemView);
            tv_table_name = itemView.findViewById(R.id.tv_table_name);
        }
    }

    // 选表切换回调
    private SetSelectTables setSelectTables;

    public interface SetSelectTables {
        void onSelectTables(int position, SelectedTablesBean.ServerParamsBean.BusinesslistBean businesslistBean, CheckRiskBean checkRiskBean);
    }

    public void setSetSelectTables(SetSelectTables setSelectTables) {
        this.setSelectTables = setSelectTables;
    }
}
