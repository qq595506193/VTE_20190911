package com.example.tidus.ristrat.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.tidus.ristrat.R;
import com.example.tidus.ristrat.bean.HistoryAssessBean;

import java.util.List;

/**
 * Created by TriumphalSun
 * on 2019/7/22 0022
 */
public class HazardsAdapter extends RecyclerView.Adapter<HazardsAdapter.ViewHolder> {
    private Context context;
    private List<HistoryAssessBean.ServerParamsBean.ReportListBean.WENJUANBean.WxysBean> wxysBeans;

    public HazardsAdapter(Context context) {
        this.context = context;
    }

    public void setWxysBeans(List<HistoryAssessBean.ServerParamsBean.ReportListBean.WENJUANBean.WxysBean> wxysBeans) {
        if (wxysBeans != null) {
            this.wxysBeans = wxysBeans;
        }
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public HazardsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.wxys_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HazardsAdapter.ViewHolder holder, int position) {
        if (wxysBeans.size() != 0) {
            HistoryAssessBean.ServerParamsBean.ReportListBean.WENJUANBean.WxysBean wxysBean = wxysBeans.get(position);
            if (wxysBean.getSCORE_SHOW_TYPE() == 30) {
                holder.tv_wxys.setText(wxysBean.getCURRENT_DESC());
                holder.tv_wxys_time.setText("-(" + wxysBean.getANALYSIS_SOURCE_STR() + ")");
            } else {
                holder.tv_wxys.setText(wxysBean.getRISK_FACTOR_NAME());// 危险因素名字
                holder.tv_wxys_time.setText("-(" + wxysBean.getANALYSIS_SOURCE_STR() + ")");
            }
        } else {
            holder.tv_wxys.setText("暂无危险因素");
            holder.tv_wxys_time.setVisibility(View.GONE);
        }


    }

    @Override
    public int getItemCount() {
        return wxysBeans == null ? 0 : wxysBeans.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private final TextView tv_wxys;
        private final TextView tv_wxys_time;

        public ViewHolder(View itemView) {
            super(itemView);
            tv_wxys = itemView.findViewById(R.id.tv_wxys);
            tv_wxys_time = itemView.findViewById(R.id.tv_wxys_time);
        }
    }
}
