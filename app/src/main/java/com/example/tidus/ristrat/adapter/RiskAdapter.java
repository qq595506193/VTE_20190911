package com.example.tidus.ristrat.adapter;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tidus.ristrat.R;
import com.example.tidus.ristrat.bean.RiskBean;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RiskAdapter extends RecyclerView.Adapter<RiskAdapter.ViewHlder> {


    private Context context;
    private List<RiskBean.ServerParamsBean> list;

    private String age;

    public RiskAdapter(Context context, List<RiskBean.ServerParamsBean> list, String age) {
        this.context = context;
        this.list = list;
        this.age = age;
    }

    public interface onCheckedClickListener {
        void onCheckedClick(View view, int position, boolean isChecked);
    }

    private onCheckedClickListener onCheckedClickListener;

    public void setOnCheckedClickListener(RiskAdapter.onCheckedClickListener onCheckedClickListener) {
        this.onCheckedClickListener = onCheckedClickListener;
    }

    @NonNull
    @Override
    public ViewHlder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = View.inflate(context, R.layout.risk_item, null);
        return new ViewHlder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHlder holder, final int position) {
        holder.cbChecked.setText(list.get(position).getRISK_FACTOR_NAME());
        holder.cbChecked.setTextColor(Color.BLACK);
        Integer integer = Integer.valueOf(age);
        if(list.get(position).getRISK_FACTOR_ID()==1001||list.get(position).getRISK_FACTOR_ID()==1018||list.get(position).getRISK_FACTOR_ID()==1026||list.get(position).getRISK_FACTOR_ID()==1036) {
                if(integer>40&&integer<60&&list.get(position).getRISK_FACTOR_ID()==1001){
                    holder.cbChecked.setChecked(true);
                }else if (integer>60&&integer<65&&list.get(position).getRISK_FACTOR_ID()==1018){
                    holder.cbChecked.setChecked(true);
                }else if(integer>76&&list.get(position).getRISK_FACTOR_ID()==1026){
                    holder.cbChecked.setChecked(true);
                }else if(list.get(position).getRISK_FACTOR_ID()==1036&&list.get(position).getRISK_FACTOR_NAME().equals("脑卒中")){
                    holder.cbChecked.setChecked(true);
                }
            holder.cbChecked.setEnabled(false);
        }
//        if (holder.cbChecked.isChecked()){
//            holder.cbChecked.setButtonDrawable(R.drawable.check2);
//        }else{
//            holder.cbChecked.setButtonDrawable(R.drawable.check);
//        }

        holder.cbChecked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onCheckedClickListener != null) {
                    onCheckedClickListener.onCheckedClick(holder.itemView, position, holder.cbChecked.isChecked());
                }
            }
        });



    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHlder extends RecyclerView.ViewHolder {
        @BindView(R.id.cb_checked) CheckBox cbChecked;

        public ViewHlder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
