package com.example.tidus.ristrat.adapter;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.tidus.ristrat.R;
import com.example.tidus.ristrat.bean.Patient;
import com.example.tidus.ristrat.weight.BaseRecyclerAdapter;

import java.util.List;

import butterknife.BindView;

public class RuestAdapter extends BaseRecyclerAdapter<Patient.ServerParamsBean.WillpushListBean>{

    public interface OnItemClickListener {
        void onItemClick(int position);
    }
    private OnItemClickListener listener;

    public void setListener(OnItemClickListener listener) {
        this.listener = listener;
    }

    @Override
    public RecyclerView.ViewHolder onCreate(ViewGroup parent, int viewType) {
        View layout = LayoutInflater.from(parent.getContext()).inflate(R.layout.ruest_item, parent, false);
        return new MyHolder(layout);
    }

    @Override
    public void onBind(RecyclerView.ViewHolder viewHolder, final int RealPosition, Patient.ServerParamsBean.WillpushListBean data) {
        if(viewHolder instanceof MyHolder) {
            ((MyHolder) viewHolder).txtName.setText(data.getPATIENT_NAME());
            ((MyHolder) viewHolder).txtNum.setText(data.getMEDICAL_REC_NUMBER());
            ((MyHolder) viewHolder).txtSex.setText(data.getPATIENT_SEX());
            ((MyHolder) viewHolder).txtAge.setText(data.getBIRTHDAY());
            ((MyHolder) viewHolder).txtDepartment.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(listener!=null) listener.onItemClick(RealPosition);
                }
            });
            if(data.getRISK_NAME()!=null){
                if (data.getRISK_NAME().equals("确诊")) {
                    ((MyHolder) viewHolder).txtState.setBackgroundColor(Color.parseColor("#f72e54"));
                    ((MyHolder) viewHolder).txtState.setText(String.valueOf(data.getRISK_NAME()));
                    ((MyHolder) viewHolder).txtState.setTextColor(Color.parseColor("#ffffff"));
                } else if (data.getRISK_NAME().equals("极高危")) {
                    ((MyHolder) viewHolder).txtState.setTextColor(Color.parseColor("#ffffff"));
                    ((MyHolder) viewHolder).txtState.setBackgroundColor(Color.parseColor("#f56500"));
                    ((MyHolder) viewHolder).txtState.setText(String.valueOf(data.getRISK_NAME()));
                } else if (data.getRISK_NAME().equals("高危")) {
                    ((MyHolder) viewHolder).txtState.setTextColor(Color.parseColor("#ffffff"));
                    ((MyHolder) viewHolder).txtState.setBackgroundColor(Color.parseColor("#f3ca00"));
                    ((MyHolder) viewHolder).txtState.setText(String.valueOf(data.getRISK_NAME()));
                } else if (data.getRISK_NAME().equals("中危")) {
                    ((MyHolder) viewHolder).txtState.setTextColor(Color.parseColor("#ffffff"));
                    ((MyHolder) viewHolder).txtState.setBackgroundColor(Color.parseColor("#54a5f5"));
                    ((MyHolder) viewHolder).txtState.setText(String.valueOf(data.getRISK_NAME()));
                } else if (data.getRISK_NAME().equals("低危")) {
                    ((MyHolder) viewHolder).txtState.setTextColor(Color.parseColor("#ffffff"));
                    ((MyHolder) viewHolder).txtState.setBackgroundColor(Color.parseColor("#009543"));
                    ((MyHolder) viewHolder).txtState.setText(String.valueOf(data.getRISK_NAME()));
                } else {
                    ((MyHolder) viewHolder).txtState.setText(String.valueOf(data.getRISK_NAME()));
                    ((MyHolder) viewHolder).txtState.setBackgroundColor(Color.parseColor("#f8f8f8"));
                }
                ((MyHolder) viewHolder).txtDepartment.setText("查看");
            }else{
                ((MyHolder) viewHolder).txtDepartment.setText("无报告");
                ((MyHolder) viewHolder).txtState.setTextColor(Color.parseColor("#8a000000"));
                ((MyHolder) viewHolder).txtState.setText("未评估");
                ((MyHolder) viewHolder).txtState.setBackgroundColor(Color.parseColor("#f8f8f8"));

            }
        }

    }
    class MyHolder extends BaseRecyclerAdapter.Holder{
     TextView   txtDepartment;
     TextView   txtName;
     TextView   txtNum;
     TextView   txtSex;
     TextView   txtAge;
     TextView   txtState;
        public MyHolder(View itemView) {
            super(itemView);
            txtDepartment=(TextView)itemView.findViewById(R.id.txt_department);
            txtName=(TextView)itemView.findViewById(R.id.txt_name);
            txtNum=(TextView)itemView.findViewById(R.id.txt_num);
            txtSex=(TextView)itemView.findViewById(R.id.txt_sex);
            txtAge=(TextView)itemView.findViewById(R.id.txt_age);
            txtState=(TextView)itemView.findViewById(R.id.txt_state);
        }
    }
}
