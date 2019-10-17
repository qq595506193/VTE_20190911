package com.example.tidus.ristrat.adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import com.example.tidus.ristrat.R;
import com.example.tidus.ristrat.bean.CheckRiskBean;
import com.example.tidus.ristrat.bean.NowSelectTablesBean;

import java.util.List;

/**
 * Created by TriumphalSun
 * on 2019/7/15 0015
 */
public class TablesAdapter extends RecyclerView.Adapter<TablesAdapter.ViewHolder> {
    private Context context;
    private List<NowSelectTablesBean.ServerParamsBean.BusinesslistBean.ListformsBean> listforms;
    private CheckRiskBean checkRiskBean;

    public TablesAdapter(Context context, List<NowSelectTablesBean.ServerParamsBean.BusinesslistBean.ListformsBean> listforms, CheckRiskBean checkRiskBean) {
        this.context = context;
        this.listforms = listforms;
        this.checkRiskBean = checkRiskBean;
    }

    @NonNull
    @Override
    public TablesAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_tables_checkbox, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final TablesAdapter.ViewHolder holder, int position) {
        final NowSelectTablesBean.ServerParamsBean.BusinesslistBean.ListformsBean listformsBean = listforms.get(position);
        if (checkRiskBean != null) {
            for (CheckRiskBean.ServerParamsBean server_param : checkRiskBean.getServer_params()) {
                if (listformsBean.getFORM_ID() == server_param.getFORM_ID()) {
                    if (server_param.getSublist().size() != 0) {
                        holder.tv_user_id_01.setVisibility(View.VISIBLE);
                        holder.ck_tables.setEnabled(false);
                        holder.ck_tables.setTextColor(Color.GRAY);
                        for (CheckRiskBean.ServerParamsBean.SublistBean sublistBean : server_param.getSublist()) {
                            holder.tv_user_id_01.setText("(" + sublistBean.getUSER_NAME() + "正在进行评估)");
                        }
                    } else {
                        holder.tv_user_id_01.setVisibility(View.INVISIBLE);
                        holder.ck_tables.setEnabled(true);
                    }
                }

            }
//            for (CheckRiskBean.ServerParamsBean.SublistBean businesslistBean : checkRiskBean.getServer_params().getBusinesslist()) {
//                for (CheckRiskBean.ServerParamsBean.SublistBean.ListformsBean listform : businesslistBean.getListforms()) {
//                    if (listform.getSublist().size() != 0) {
//                        holder.tv_user_id_01.setVisibility(View.VISIBLE);
//                        holder.ck_tables.setEnabled(false);
//                        listform.getSublist().for
//
//                    } else {
//                        holder.tv_user_id_01.setVisibility(View.GONE);
//                        holder.ck_tables.setEnabled(true);
//                        holder.ck_tables.setTextColor(Color.BLACK);
//                    }
//                }
//            }
        }

        holder.ck_tables.setChecked(listformsBean.isSelect());
        holder.ck_tables.setText(listformsBean.getFORM_NAME());
        holder.ck_tables.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    listformsBean.setSelect(true);
                    setCheckboxFormId.onCheckboxFormId(isChecked, listformsBean.getFORM_ID());
                }else {
                    listformsBean.setSelect(false);
                    setCheckboxFormId.onCheckboxFormId(isChecked, listformsBean.getFORM_ID());
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return listforms == null ? 0 : listforms.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private final CheckBox ck_tables;
        private final TextView tv_user_id_01;

        public ViewHolder(View itemView) {
            super(itemView);
            ck_tables = itemView.findViewById(R.id.ck_tables);
            tv_user_id_01 = itemView.findViewById(R.id.tv_user_id_01);
        }
    }

    private SetCheckboxFormId setCheckboxFormId;

    public interface SetCheckboxFormId {
        void onCheckboxFormId(boolean checked, int form_id);
    }

    public void setSetCheckboxFormId(SetCheckboxFormId setCheckboxFormId) {
        this.setCheckboxFormId = setCheckboxFormId;
    }
}
