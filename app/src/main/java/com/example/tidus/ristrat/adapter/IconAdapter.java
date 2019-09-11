package com.example.tidus.ristrat.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.tidus.ristrat.R;
import com.example.tidus.ristrat.bean.CaseControlBean;

import java.util.List;

public class IconAdapter extends RecyclerView.Adapter<IconAdapter.ViewHolder> {
    private Context context;
    private CaseControlBean.ServerParamsBean serverParamsBean;
    private List<CaseControlBean.ServerParamsBean.LevlistBean> levlist;

    public IconAdapter(Context context, CaseControlBean.ServerParamsBean serverParamsBean) {
        this.context = context;
        this.serverParamsBean = serverParamsBean;
        levlist = serverParamsBean.getLevlist();
        for (CaseControlBean.ServerParamsBean.LevlistBean levlistBean : levlist) {
            if (levlistBean.getCURRENT_RISK_LEVEL().equals("5")) {
                levlistBean.setLevelColor(R.mipmap.d);
            } else if (levlistBean.getCURRENT_RISK_LEVEL().equals("6")) {
                levlistBean.setLevelColor(R.mipmap.z);
            } else if (levlistBean.getCURRENT_RISK_LEVEL().equals("7")) {
                levlistBean.setLevelColor(R.mipmap.g);
            } else if (levlistBean.getCURRENT_RISK_LEVEL().equals("8")) {
                levlistBean.setLevelColor(R.mipmap.j);
            } else if (levlistBean.getCURRENT_RISK_LEVEL().equals("9")) {
                levlistBean.setLevelColor(R.mipmap.q);
            } else if (levlistBean.getCURRENT_RISK_LEVEL().equals("21")) {
                levlistBean.setLevelColor(R.mipmap.cd);
            } else if (levlistBean.getCURRENT_RISK_LEVEL().equals("22")) {
                levlistBean.setLevelColor(R.mipmap.cq);
            }
        }
    }

    @NonNull
    @Override
    public IconAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_icon, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull IconAdapter.ViewHolder holder, int position) {

        CaseControlBean.ServerParamsBean.LevlistBean levlistBean = levlist.get(position);
        holder.iv_icon.setImageResource(levlistBean.getLevelColor());
//        for (int i = 0; i < levlist.size(); i++) {
//            CaseControlBean.ServerParamsBean.LevlistBean levlistBean = levlist.get(i);
//            if (serverParamsBean.getLevlist().size() != 0 && serverParamsBean.getCURRENT_RISK_LEVEL() != null) {
//        if (levlistBean.getCURRENT_RISK_LEVEL().equals("5")) {
//            levlistBean.setLevelColor(R.mipmap.vet_green);
//        } else if (levlistBean.getCURRENT_RISK_LEVEL().equals("6")) {
//            levlistBean.setLevelColor(R.mipmap.vet_blue);
//        } else if (levlistBean.getCURRENT_RISK_LEVEL().equals("7")) {
//            levlistBean.setLevelColor(R.mipmap.vet_yellow);
//        } else if (levlistBean.getCURRENT_RISK_LEVEL().equals("8")) {
//            levlistBean.setLevelColor(R.mipmap.vet_orange);
//        } else if (levlistBean.getCURRENT_RISK_LEVEL().equals("9")) {
//            levlistBean.setLevelColor(R.mipmap.vet_red);
//        } else if (levlistBean.getCURRENT_RISK_LEVEL().equals("21")) {
//            levlistBean.setLevelColor(R.mipmap.chuxuedi);
//        } else if (levlistBean.getCURRENT_RISK_LEVEL().equals("22")) {
//            levlistBean.setLevelColor(R.mipmap.chuxuegao);
//        } else {
//            holder.iv_icon.setVisibility(View.GONE);
//        }


    }

    @Override
    public int getItemCount() {
        return levlist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private final ImageView iv_icon;

        public ViewHolder(View itemView) {
            super(itemView);
            iv_icon = itemView.findViewById(R.id.iv_icon);
        }
    }
}
