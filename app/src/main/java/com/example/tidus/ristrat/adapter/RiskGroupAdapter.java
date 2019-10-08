package com.example.tidus.ristrat.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.tidus.ristrat.R;
import com.example.tidus.ristrat.application.App;
import com.example.tidus.ristrat.bean.RiskAssessmentBean;

import java.util.List;

/**
 * Created by TriumphalSun
 * on 2019/7/17 0017
 */
public class RiskGroupAdapter extends RecyclerView.Adapter<RiskGroupAdapter.ViewHolder> {
    private Context context;
    private List<RiskAssessmentBean.ServerParamsBean.WENJUANNAMEBean.XUANXIANGBean.WENJUANBean> wenjuanBeans;
    private List<RiskAssessmentBean.ServerParamsBean.WENJUANNAMEBean.XUANXIANGBean.WENJUANBean.SublistBean> sublistBeans_checked;
    private RiskItemCheckboxAdapter riskItemCheckboxAdapter;
    private boolean isCommit = false;

    public RiskGroupAdapter(Context context) {
        this.context = context;
    }

    public void setWenjuanBeans(List<RiskAssessmentBean.ServerParamsBean.WENJUANNAMEBean.XUANXIANGBean.WENJUANBean> wenjuanBeans) {
        if (wenjuanBeans != null) {
            this.wenjuanBeans = wenjuanBeans;
        }
        notifyDataSetChanged();
    }

    public void setCommit(boolean commit) {
        this.isCommit = commit;
        notifyDataSetChanged();
    }

    public void setSublistBeans(List<RiskAssessmentBean.ServerParamsBean.WENJUANNAMEBean.XUANXIANGBean.WENJUANBean.SublistBean> sublistBeans_checked) {
        if (sublistBeans_checked != null) {
            this.sublistBeans_checked = sublistBeans_checked;
        }
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public RiskGroupAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.rv_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RiskGroupAdapter.ViewHolder holder, int position) {
        RiskAssessmentBean.ServerParamsBean.WENJUANNAMEBean.XUANXIANGBean.WENJUANBean wenjuanBean = wenjuanBeans.get(position);
        holder.tv_xiaobiao_name.setText(wenjuanBean.getFACTOR_GROUP_NAME());
        // 内层复选框列表
        riskItemCheckboxAdapter = new RiskItemCheckboxAdapter(context);
        holder.rv_question_check.setLayoutManager(new GridLayoutManager(App.getContext(), 4));
        holder.rv_question_check.setAdapter(riskItemCheckboxAdapter);
        // 设置内层item数据
        riskItemCheckboxAdapter.setSublistBeans(wenjuanBean.getSublist());
        // 接收内层算分回调
        riskItemCheckboxAdapter.setSetGradeListener(new RiskItemCheckboxAdapter.SetGradeListener() {
            @Override
            public void onGradeListener(boolean isChecked, RiskAssessmentBean.ServerParamsBean.WENJUANNAMEBean.XUANXIANGBean.WENJUANBean.SublistBean sublistBean) {
                // 算分回调+题ID
                setGroupGradeListener.onGroupGradeListener(isChecked, sublistBean);
            }
        });
        // 提交后置空
        riskItemCheckboxAdapter.setCommit(isCommit);
    }

    @Override
    public int getItemCount() {
        return wenjuanBeans == null ? 0 : wenjuanBeans.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView tv_xiaobiao_name;
        private final RecyclerView rv_question_check;

        public ViewHolder(View itemView) {
            super(itemView);
            tv_xiaobiao_name = itemView.findViewById(R.id.tv_xiaobiao_name);
            rv_question_check = itemView.findViewById(R.id.rv_question_check);
        }
    }

    // 算分回调
    private SetGroupGradeListener setGroupGradeListener;

    public interface SetGroupGradeListener {
        void onGroupGradeListener(boolean isChecked, RiskAssessmentBean.ServerParamsBean.WENJUANNAMEBean.XUANXIANGBean.WENJUANBean.SublistBean sublistBean);
    }

    public void setSetGroupGradeListener(SetGroupGradeListener setGroupGradeListener) {
        this.setGroupGradeListener = setGroupGradeListener;
    }


}
