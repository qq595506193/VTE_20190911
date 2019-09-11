package com.example.tidus.ristrat.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.tidus.ristrat.R;
import com.example.tidus.ristrat.bean.SelectedTablesBean;

import java.util.List;

/**
 * Created by TriumphalSun
 * on 2019/7/15 0015
 */
public class BusinessListAdalter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context context;
    private List<SelectedTablesBean.ServerParamsBean.RemindlistBean> remindlistBeans;

    public BusinessListAdalter(Context context) {
        this.context = context;
    }

    public void setRemindlistBeans(List<SelectedTablesBean.ServerParamsBean.RemindlistBean> remindlistBeans) {
        if (remindlistBeans != null) {
            this.remindlistBeans = remindlistBeans;
        }
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_business_list_other, parent, false);
        return new OtherViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        SelectedTablesBean.ServerParamsBean.RemindlistBean remindlistBean = remindlistBeans.get(position);
        OtherViewHolder otherViewHolder = (OtherViewHolder) holder;
        // 评估业务
        otherViewHolder.tv_pingguyewu_content.setText(remindlistBean.getASSESS_BUSINESS());
        // 业务类型
        otherViewHolder.tv_yewuleixing_content.setText(remindlistBean.getREMINDE_TYPE());
        // 时限
        otherViewHolder.tv_shixian_content.setText(remindlistBean.getRETIMECONTENT());
        // 操作
        // 不再评估
        otherViewHolder.btn_over_assess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setBusinessOver.onBusinessOver(position);
            }
        });
        // 下次评估
        otherViewHolder.btn_next_assess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setBusinessNext.onBusinessNext();
            }
        });

    }


    @Override
    public int getItemCount() {
        return remindlistBeans == null ? 0 : remindlistBeans.size();
    }

    public static class OtherViewHolder extends RecyclerView.ViewHolder {

        private final TextView tv_pingguyewu_content;
        private final TextView tv_yewuleixing_content;
        private final TextView tv_shixian_content;
        private final Button btn_over_assess;
        private final Button btn_next_assess;

        public OtherViewHolder(View itemView) {
            super(itemView);
            tv_pingguyewu_content = itemView.findViewById(R.id.tv_pingguyewu_content);
            tv_yewuleixing_content = itemView.findViewById(R.id.tv_yewuleixing_content);
            tv_shixian_content = itemView.findViewById(R.id.tv_shixian_content);
            btn_over_assess = itemView.findViewById(R.id.btn_over_assess);
            btn_next_assess = itemView.findViewById(R.id.btn_next_assess);
        }
    }

    // 不再评估接口
    private SetBusinessOver setBusinessOver;

    public interface SetBusinessOver {
        void onBusinessOver(int position);
    }

    public void setSetBusinessOver(SetBusinessOver setBusinessOver) {
        this.setBusinessOver = setBusinessOver;
    }

    // 下次评估接口
    private SetBusinessNext setBusinessNext;

    public interface SetBusinessNext {
        void onBusinessNext();
    }

    public void setSetBusinessNext(SetBusinessNext setBusinessNext) {
        this.setBusinessNext = setBusinessNext;
    }
}
