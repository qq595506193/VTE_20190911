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
import com.example.tidus.ristrat.bean.RiskAssessmentBean;

import java.util.ArrayList;
import java.util.List;

public class QuestionAdapter extends RecyclerView.Adapter<QuestionAdapter.ViewHolder> {

    private Context context;

    private List<RiskAssessmentBean.ServerParamsBean.WENJUANNAMEBean.XUANXIANGBean.WENJUANBean> wenjuanBeans;

    private RiskAssessmentBean.ServerParamsBean.WENJUANNAMEBean wenjuannameBean;


    private boolean isCommit = false;

    private int form_id;


    public QuestionAdapter(Context context) {
        wenjuanBeans = new ArrayList<>();
        this.context = context;
    }

    public void setCommit(boolean commit, int form_id) {
        this.isCommit = commit;
        this.form_id = form_id;
        notifyDataSetChanged();
    }

    public void setWenjuannameBean(RiskAssessmentBean.ServerParamsBean.WENJUANNAMEBean wenjuannameBean) {
        if (wenjuannameBean != null) {
            this.wenjuannameBean = wenjuannameBean;
        }
        notifyDataSetChanged();
    }

    public void setWenjuanBeans(List<RiskAssessmentBean.ServerParamsBean.WENJUANNAMEBean.XUANXIANGBean.WENJUANBean> wenjuanBeans) {
        if (wenjuanBeans != null) {
            this.wenjuanBeans = wenjuanBeans;
        }
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public QuestionAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.rv_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull QuestionAdapter.ViewHolder holder, final int position) {
        final RiskAssessmentBean.ServerParamsBean.WENJUANNAMEBean.XUANXIANGBean.WENJUANBean wenjuanBean = wenjuanBeans.get(position);
        for (RiskAssessmentBean.ServerParamsBean.WENJUANNAMEBean.XUANXIANGBean.WENJUANBean.SublistBean sublistBean : wenjuanBean.getSublist()) {
            holder.tv_xiaobiao_name.setText(sublistBean.getFACTOR_GROUP_NAME());
            final TopicAdapter topicAdapter = new TopicAdapter(context, wenjuanBeans.get(position).getSublist(), wenjuanBeans, this, position);
            holder.rv_question_check.setLayoutManager(new GridLayoutManager(context, 4));
            holder.rv_question_check.setAdapter(topicAdapter);
            topicAdapter.setWenjuannameBean(wenjuannameBean);
            // 算分回调
            topicAdapter.setSetCheckItem(new TopicAdapter.SetCheckItem() {
                @Override
                public void onSetCheckItem(boolean checked, int position, RiskAssessmentBean.ServerParamsBean.WENJUANNAMEBean.XUANXIANGBean.WENJUANBean.SublistBean sublistBean) {
                    setItemGroupCheckListener.setItemGroupCheck(checked, position, sublistBean);
                }
            });
            // 输入框的值
            topicAdapter.setSetShuRuText(new TopicAdapter.SetShuRuText() {
                @Override
                public void onShuRuText(String shuruValue) {
                    setShuruTextStr.onShuruTextStr(shuruValue);
                }
            });
            // 提交后置为不可选
            topicAdapter.setCommit(isCommit, form_id);

            /*
            // 互斥回调
            topicAdapter.setSetCheckedItem(new TopicAdapter.SetCheckedItem() {
                @Override
                public void onSetCheckedItem(int itemPosition) {
                    setItemChecked.onSetItemChecked(itemPosition, position);
                }
            });*/

        }


    }

    @Override
    public int getItemCount() {
        return wenjuanBeans.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private final TextView tv_xiaobiao_name;
        private final RecyclerView rv_question_check;

        public ViewHolder(View itemView) {
            super(itemView);
            tv_xiaobiao_name = itemView.findViewById(R.id.tv_xiaobiao_name);
            rv_question_check = itemView.findViewById(R.id.rv_question_check);
        }
    }

    // 算分回调
    private SetItemGroupCheckListener setItemGroupCheckListener;

    public interface SetItemGroupCheckListener {
        void setItemGroupCheck(boolean isChecked, int position, RiskAssessmentBean.ServerParamsBean.WENJUANNAMEBean.XUANXIANGBean.WENJUANBean.SublistBean sublistBean);
    }

    public void setSetItemGroupCheckListener(SetItemGroupCheckListener setItemGroupCheckListener) {
        this.setItemGroupCheckListener = setItemGroupCheckListener;
    }

    // 输入框的值
    private SetShuruTextStr setShuruTextStr;

    public interface SetShuruTextStr {
        void onShuruTextStr(String shuruStr);
    }

    public void setSetShuruTextStr(SetShuruTextStr setShuruTextStr) {
        this.setShuruTextStr = setShuruTextStr;
    }

    /*

    private SetItemChecked setItemChecked;

    public interface SetItemChecked {
        void onSetItemChecked(int i, int position);
    }

    public void setSetItemChecked(SetItemChecked setItemChecked) {
        this.setItemChecked = setItemChecked;
    }*/
}
