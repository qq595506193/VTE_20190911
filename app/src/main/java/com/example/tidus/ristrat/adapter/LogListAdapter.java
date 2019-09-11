package com.example.tidus.ristrat.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.tidus.ristrat.R;
import com.example.tidus.ristrat.utils.GetNowTime;

import java.util.ArrayList;
import java.util.List;

public class LogListAdapter extends RecyclerView.Adapter<LogListAdapter.ViewHolder> {
    private Context context;
    private List<String> logList;

    public LogListAdapter(Context context) {
        logList = new ArrayList<>();
        this.context = context;
    }

    public void setLogList(List<String> logList) {
        if (logList != null) {
            this.logList = logList;
        }
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public LogListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_list_log, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LogListAdapter.ViewHolder holder, int position) {
        holder.tv_log_time.setText(GetNowTime.initNowTime());
        holder.tv_log_message.setText(logList.get(position).toString());
    }

    @Override
    public int getItemCount() {
        return logList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private final TextView tv_log_time;
        private final TextView tv_log_message;

        public ViewHolder(View itemView) {
            super(itemView);
            tv_log_time = itemView.findViewById(R.id.tv_log_time);
            tv_log_message = itemView.findViewById(R.id.tv_log_message);
        }
    }
}
