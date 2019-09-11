package com.example.tidus.ristrat.adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tidus.ristrat.R;
import com.example.tidus.ristrat.bean.MessageBean;
import com.example.tidus.ristrat.bean.TiaoBean;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.jcodecraeer.xrecyclerview.XRecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MessageListAdapter extends XRecyclerView.Adapter<MessageListAdapter.ViewHolder> {
    private Context context;
    private List<MessageBean.ServerParamsBean.ListBean> listBeans;
    private List<TiaoBean> messageTiaoBeans = new ArrayList<>();
    private SpannableString spanString;

    public MessageListAdapter(Context context) {
        listBeans = new ArrayList<>();
        this.context = context;
    }

    public void setListBeans(List<MessageBean.ServerParamsBean.ListBean> listBeans) {
        if (listBeans != null) {
            this.listBeans = listBeans;
        }
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MessageListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.im_message_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final MessageListAdapter.ViewHolder holder, final int position) {
        final MessageBean.ServerParamsBean.ListBean listBean = listBeans.get(position);

        //恢复状态
        //holder.recyclerViewItem.apply();
        ////
        if (listBean.getMESSAGE_STATUS() == 0) {
            holder.iv_dian.setImageResource(R.mipmap.red_dian);
            String send_time = listBean.getSEND_TIME();
            String year = send_time.substring(0, 4);// 年
            String month = send_time.substring(4, 6);// 月
            String day = send_time.substring(6, 8);// 日
            String time = send_time.substring(8, 10);// 时
            String minute = send_time.substring(10, 12);// 分
            String second = send_time.substring(12, 14);// 秒
            holder.tv_message_time.setText(year + "年" + month + "月" + day + "日" + time + "时" + minute + "分" + second + "秒");
            holder.tv_system_message.setTextColor(Color.BLACK);
            String message_content = listBean.getMESSAGE_CONTENT();
            if (message_content != null && !"".equals(message_content)) {
                if (message_content.startsWith("[")) {
                    String replace = message_content.replace("\\", "");
                    Gson gson = new Gson();
                    List<TiaoBean> tiaoBeans = gson.fromJson(replace, new TypeToken<List<TiaoBean>>() {
                    }.getType());
                    String str = "";
                    for (int i = 0; i < tiaoBeans.size(); i++) {
                        TiaoBean tiaoBean = tiaoBeans.get(i);
                        str += tiaoBean.getCont();
                    }
                    holder.tv_message_content.setText(str);
                } else {
                    holder.tv_message_content.setText(listBean.getMESSAGE_CONTENT());
                }
            }
        } else {
            holder.tv_system_message.setTextColor(Color.GRAY);
            holder.iv_dian.setImageResource(R.mipmap.gray_dian);
            String send_time = listBean.getSEND_TIME();
            String year = send_time.substring(0, 4);// 年
            String month = send_time.substring(4, 6);// 月
            String day = send_time.substring(6, 8);// 日
            String time = send_time.substring(8, 10);// 时
            String minute = send_time.substring(10, 12);// 分
            String second = send_time.substring(12, 14);// 秒
            holder.tv_message_time.setText(year + "年" + month + "月" + day + "日" + time + "时" + minute + "分" + second + "秒");
            String message_content = listBean.getMESSAGE_CONTENT();
            if (message_content != null && !"".equals(message_content)) {
                if (message_content.startsWith("[")) {
                    String replace = message_content.replace("\\", "");
                    Gson gson = new Gson();
                    List<TiaoBean> tiaoBeans = gson.fromJson(replace, new TypeToken<List<TiaoBean>>() {
                    }.getType());
                    String str = "";
                    for (TiaoBean tiaoBean : tiaoBeans) {
                        str += tiaoBean.getCont();
                    }
                    holder.tv_message_content.setText(str);
                } else {
                    holder.tv_message_content.setText(listBean.getMESSAGE_CONTENT());
                }
            }
        }
//        holder.click.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                listBeans.remove(position);
//                notifyDataSetChanged();
//            }
//        });
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setMessageType.onMessageType(listBean.getMESSAGE_ID(), listBean.getMESSAGE_CONTENT());
            }
        });
    }

    @Override
    public int getItemCount() {
        return listBeans.size();
    }

    public static class ViewHolder extends XRecyclerView.ViewHolder {

        private final TextView tv_message_content;
        private final TextView tv_message_time;
        private final ImageView iv_dian;
        private final TextView tv_system_message;
        //private final TextView click;
        //private final MyRecyclerViewItem recyclerViewItem;

        public ViewHolder(View itemView) {
            super(itemView);
            tv_message_content = itemView.findViewById(R.id.tv_message_content);
            tv_message_time = itemView.findViewById(R.id.tv_message_time);
            iv_dian = itemView.findViewById(R.id.iv_dian);
            tv_system_message = itemView.findViewById(R.id.tv_system_message);
            //recyclerViewItem = itemView.findViewById(R.id.scroll_item);
            //click = itemView.findViewById(R.id.click);
        }
    }

    private SetMessageType setMessageType;

    public interface SetMessageType {
        void onMessageType(int message_id, String message_content);
    }

    public void setSetMessageType(SetMessageType setMessageType) {
        this.setMessageType = setMessageType;
    }
}
