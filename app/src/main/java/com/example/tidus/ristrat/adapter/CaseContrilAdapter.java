package com.example.tidus.ristrat.adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tidus.ristrat.R;
import com.example.tidus.ristrat.activity.CaseControlActivity;
import com.example.tidus.ristrat.application.App;
import com.example.tidus.ristrat.bean.CaseControlBean;
import com.example.tidus.ristrat.bean.QueryHMBean;
import com.example.tidus.ristrat.utils.CommonPopupWindow;
import com.example.tidus.ristrat.utils.LogUtils;
import com.jcodecraeer.xrecyclerview.XRecyclerView;


import java.util.ArrayList;
import java.util.List;

public class CaseContrilAdapter extends XRecyclerView.Adapter<XRecyclerView.ViewHolder> {
    private Context context;
    private List<CaseControlBean.ServerParamsBean> serverParamsBeans;
    private CaseControlActivity caseControlActivity;
    private View view_pop;
    private QueryHMBean.ServerParamsBean queryHMBean;
    private final int YOU = 0;
    private final int WU = 1;
    private View view_select;
    private List<Integer> checkIds = new ArrayList<>();
    private CommonPopupWindow commonPopupWindow;
    private String liushui;

    public CaseContrilAdapter(Context context, CaseControlActivity caseControlActivity) {
        this.context = context;
        serverParamsBeans = new ArrayList<>();
        queryHMBean = new QueryHMBean.ServerParamsBean();
        this.caseControlActivity = caseControlActivity;
    }


    public void setQueryHMBean(QueryHMBean.ServerParamsBean queryHMBean) {
        if (queryHMBean != null) {
            this.queryHMBean = queryHMBean;

            for (CaseControlBean.ServerParamsBean serverParamsBean : serverParamsBeans) {
                for (QueryHMBean.ServerParamsBean.LISTBean listBean : queryHMBean.getLIST()) {
                    if (serverParamsBean.getVISIT_SQ_NO() != null) {
                        if (serverParamsBean.getVISIT_SQ_NO().equals(listBean.getVISIT_SQ_NO())) {
                            serverParamsBean.setType(true);
                            serverParamsBean.setColor(listBean.getREMINDE_COLOR());
                        }
                    }
                }
            }
        }
        notifyDataSetChanged();

    }

    public void setCaseControlBean(List<CaseControlBean.ServerParamsBean> serverParamsBeans) {
        if (serverParamsBeans != null) {
            this.serverParamsBeans = serverParamsBeans;
        }
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public XRecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;

        if (viewType == YOU) {
            // 布局
            view = LayoutInflater.from(context).inflate(R.layout.item_patient_list, parent, false);
            return new ViewHolder(view);
        } else {
            view = LayoutInflater.from(context).inflate(R.layout.item_patient_wu_list, parent, false);
            return new WuViewHolder(view);
        }

    }


    @Override
    public void onBindViewHolder(@NonNull XRecyclerView.ViewHolder holder, int position) {
        //View view_pop = (View) LayoutInflater.from(context).inflate(R.layout.pop_child, null);
        final CaseControlBean.ServerParamsBean serverParamsBean = serverParamsBeans.get(position);
        if (getItemViewType(position) == YOU) {

            ViewHolder viewHolder = (ViewHolder) holder;
            if (serverParamsBean.getPATIENT_NAME() != null) {
                viewHolder.tv_icon_name.setText(serverParamsBean.getPATIENT_NAME());
            }
            if (serverParamsBean.getBIRTHDAY() != null) {
                viewHolder.tv_age.setText(serverParamsBean.getBIRTHDAY() + "岁");
            }
            if (serverParamsBean.getBED_NUMBER() != null) {
                viewHolder.tv_bed_id.setText(serverParamsBean.getBED_NUMBER() + "床");
            }

            if (serverParamsBean.getVISIT_SQ_NO() != null) {
                viewHolder.tv_accommodation_id.setText(serverParamsBean.getVISIT_SQ_NO());
            }

            if (serverParamsBean.getIN_DEPT_NAME() != null) {
                viewHolder.tv_section.setText(serverParamsBean.getIN_DEPT_NAME());
            }

            if (serverParamsBean.getDOCTOR_NAME() != null) {
                viewHolder.tv_doctor_name.setText(serverParamsBean.getDOCTOR_NAME());
            }

            // 判断提示框颜色
            if (serverParamsBean.isType()) {
                viewHolder.card_view.setBackgroundColor(Color.RED);
                ((ViewHolder) holder).iv_ping.setVisibility(View.VISIBLE);
            } else {
                ((ViewHolder) holder).iv_ping.setVisibility(View.GONE);
                viewHolder.card_view.setBackgroundColor(Color.WHITE);
            }

            if (serverParamsBean.getCARE_UNIT_NAME() != null) {
                viewHolder.tv_danyuan.setText(serverParamsBean.getCARE_UNIT_NAME());
            }


            // 性别图片
            if (serverParamsBean.getPATIENT_SEX() != null) {
                String patient_sex = serverParamsBean.getPATIENT_SEX();
                if (patient_sex.equals("M")) {
                    viewHolder.iv_icon.setImageResource(R.mipmap.xx1);
                } else {
                    viewHolder.iv_icon.setImageResource(R.mipmap.xx2);
                }
            }


            // 就诊信息
            if (serverParamsBean.getJibinlist().size() != 0 && serverParamsBean != null) {
                viewHolder.tv_content.setText(serverParamsBean.getJibinlist().get(0).getDIAGNOSIS_DISEASE_NAME());
            } else {
                viewHolder.tv_content.setText("暂无就诊信息");
            }

            IconAdapter iconAdapter = new IconAdapter(context, serverParamsBean);
            ((ViewHolder) holder).rv_icon.setLayoutManager(new LinearLayoutManager(App.getContext(), LinearLayoutManager.HORIZONTAL, false));
            ((ViewHolder) holder).rv_icon.setAdapter(iconAdapter);

            if (serverParamsBean.getRemindelist().size() != 0) {
                ((ViewHolder) holder).iv_ping.setVisibility(View.VISIBLE);
                viewHolder.card_view.setBackgroundColor(Color.RED);
                // 点击评字
                ((ViewHolder) holder).iv_ping.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        setPingTiaoZhuan.onPingTiaoZhuan(serverParamsBean, queryHMBean);
                    }
                });
            } else {
                ((ViewHolder) holder).iv_ping.setVisibility(View.GONE);
                viewHolder.card_view.setBackgroundColor(Color.WHITE);
            }

            initListener(viewHolder, view_pop, serverParamsBean, position);// 事件监听

        } else if (getItemViewType(position) == WU) {
            WuViewHolder viewHolder = (WuViewHolder) holder;
            viewHolder.tv_wu_bed_id.setText(serverParamsBean.getBED_NUMBER() + "床");


        }
    }

    private void initListener(ViewHolder holder, final View view_pop, final CaseControlBean.ServerParamsBean serverParamsBean, final int position) {
        CaseControlBean.ServerParamsBean serverParamsBean1 = serverParamsBeans.get(position);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                ////////////////////
                LogUtils.e("坐标===================" + position);
//                if (queryHMBean != null) {
//                    for (QueryHMBean.ServerParamsBean.LISTBean listBean : queryHMBean.getLIST()) {
//                        if (listBean.getVISIT_SQ_NO().equals(serverParamsBean.getVISIT_SQ_NO())) {
//                            commonPopupWindow = new CommonPopupWindow.Builder(context)
//                                    //设置PopupWindow布局
//                                    .setView(R.layout.pop_child)
//                                    //设置宽高
//                                    .setWidthAndHeight(ViewGroup.LayoutParams.WRAP_CONTENT,
//                                            ViewGroup.LayoutParams.WRAP_CONTENT)
//                                    //设置动画
//                                    //.setAnimationStyle(R.style.PopupWindow)
//                                    //设置背景颜色，取值范围0.0f-1.0f 值越小越暗 1.0f为透明
//                                    //.setBackGroundLevel(0.5f)
//                                    //设置PopupWindow里的子View及点击事件
//                                    .setViewOnclickListener(new CommonPopupWindow.ViewInterface() {
//                                        @Override
//                                        public void getChildView(View view, int layoutResId) {
//                                            TextView tv_now_assess = view.findViewById(R.id.tv_now_assess);// 立即评估
//                                            TextView tv_next_assess = view.findViewById(R.id.tv_next_assess);// 下次评估
//                                            TextView tv_no_assess = view.findViewById(R.id.tv_no_assess);// 不再评估
//                                            TextView tv_history_assess = view.findViewById(R.id.tv_history_assess);// 查看详情
//                                            // 透明度
//                                            tv_now_assess.getBackground().setAlpha(200);
//                                            tv_next_assess.getBackground().setAlpha(200);
//                                            tv_no_assess.getBackground().setAlpha(200);
//                                            tv_history_assess.getBackground().setAlpha(200);
//                                            //
//                                            tv_now_assess.setVisibility(View.VISIBLE);
//                                            tv_next_assess.setVisibility(View.VISIBLE);
//                                            tv_next_assess.setVisibility(View.VISIBLE);
//                                            tv_next_assess.setVisibility(View.VISIBLE);
//
//                                            // 立即评估
//                                            tv_now_assess.setOnClickListener(new View.OnClickListener() {
//                                                @Override
//                                                public void onClick(View v) {
//                                                    setOnIntentActivity.onStartActivity(serverParamsBeans, queryHMBean, position);// 接口回调
//                                                    commonPopupWindow.dismiss();
//                                                }
//                                            });
//                                            // 下次评估
//                                            tv_next_assess.setOnClickListener(new View.OnClickListener() {
//                                                @Override
//                                                public void onClick(View v) {
//                                                    setOnIntentActivityCancel.onStartActivity(queryHMBean, position);// 接口回调
//                                                    commonPopupWindow.dismiss();
//                                                }
//                                            });
//                                            // 不再评估
//                                            tv_no_assess.setOnClickListener(new View.OnClickListener() {
//                                                @Override
//                                                public void onClick(View v) {
//                                                    setOnTanChuangDiaLog.OnTanChuangDiaLog(serverParamsBean, queryHMBean, position);
//                                                    commonPopupWindow.dismiss();
//                                                }
//                                            });
//                                            // 查看详情
//                                            tv_history_assess.setOnClickListener(new View.OnClickListener() {
//                                                @Override
//                                                public void onClick(View v) {
//                                                    setOnIntentActivityHistory.onStratActivity(serverParamsBeans, queryHMBean, position);// 接口回调
//                                                    commonPopupWindow.dismiss();
//                                                }
//                                            });
//                                        }
//                                    })//设置外部是否可点击 默认是true
//                                    .setOutsideTouchable(true)
//                                    //开始构建
//                                    .create();
//                            commonPopupWindow.showAsDropDown(v, 180, -260);
//                            //popWindowUtil.showAssessPopupWindow(view_select, position, view_pop, 180, -260, R.style.PopupWindow);
//                            return;
//                        }
//                    }
//                }
                setOnIntentStartActivity.onStartActivity(serverParamsBeans, queryHMBean, position);
            }
        });


    }

    @Override
    public int getItemViewType(int position) {
        CaseControlBean.ServerParamsBean serverParamsBean = serverParamsBeans.get(position);
        if (serverParamsBean != null) {
            if (TextUtils.isEmpty(serverParamsBean.getVISIT_SQ_NO())) {
                return WU;
            } else {
                return YOU;
            }
        }
        return YOU;
    }

    @Override
    public int getItemCount() {
        return serverParamsBeans.size();
    }

    public static class ViewHolder extends XRecyclerView.ViewHolder {
        private final ImageView iv_icon;
        private final TextView tv_icon_name;
        private final TextView tv_age;
        private final TextView tv_bed_id;
        private final TextView tv_accommodation_id;
        private final TextView tv_section;
        private final TextView tv_doctor_name;
        private final TextView tv_content;
        private final CardView card_view;
        private TextView tv_danyuan;
        private final RecyclerView rv_icon;
        private final ImageView iv_ping;

        public ViewHolder(View itemView) {
            super(itemView);
            iv_icon = itemView.findViewById(R.id.iv_icon);
            tv_icon_name = itemView.findViewById(R.id.tv_icon_name);
            tv_age = itemView.findViewById(R.id.tv_age);
            tv_bed_id = itemView.findViewById(R.id.tv_bed_id);
            tv_accommodation_id = itemView.findViewById(R.id.tv_accommodation_id);
            tv_section = itemView.findViewById(R.id.tv_section);
            tv_doctor_name = itemView.findViewById(R.id.tv_doctor_name);
            tv_content = itemView.findViewById(R.id.tv_content);
            card_view = itemView.findViewById(R.id.card_view);
            tv_danyuan = itemView.findViewById(R.id.tv_danyuan);
            rv_icon = itemView.findViewById(R.id.rv_icon);
            iv_ping = itemView.findViewById(R.id.iv_ping);

        }
    }

    public static class WuViewHolder extends XRecyclerView.ViewHolder {

        private ImageView iv_wu_bed;
        private TextView tv_wu_bed_id;


        public WuViewHolder(View itemView) {
            super(itemView);

            iv_wu_bed = itemView.findViewById(R.id.iv_wu_bed);
            tv_wu_bed_id = itemView.findViewById(R.id.tv_wu_bed_id);

        }
    }


    private SetOnIntentActivity setOnIntentActivity;

    public interface SetOnIntentActivity {
        void onStartActivity(List<CaseControlBean.ServerParamsBean> serverParamsBeans, QueryHMBean.ServerParamsBean queryHMBean, int position);
    }

    public void setSetOnIntentActivity(SetOnIntentActivity setOnIntentActivity) {
        this.setOnIntentActivity = setOnIntentActivity;
    }

    private SetOnIntentActivityCancel setOnIntentActivityCancel;

    public interface SetOnIntentActivityCancel {
        void onStartActivity(QueryHMBean.ServerParamsBean queryHMBean, int position);
    }

    public void setSetOnIntentActivityCancel(SetOnIntentActivityCancel setOnIntentActivityCancel) {
        this.setOnIntentActivityCancel = setOnIntentActivityCancel;
    }

    private SetOnIntentActivityHistory setOnIntentActivityHistory;

    public interface SetOnIntentActivityHistory {
        void onStratActivity(List<CaseControlBean.ServerParamsBean> serverParamsBeans, QueryHMBean.ServerParamsBean queryHMBean, int position);
    }

    public void setSetOnIntentActivityHistory(SetOnIntentActivityHistory setOnIntentActivityHistory) {
        this.setOnIntentActivityHistory = setOnIntentActivityHistory;
    }

    private SetOnIntentStartActivity setOnIntentStartActivity;

    public interface SetOnIntentStartActivity {
        void onStartActivity(List<CaseControlBean.ServerParamsBean> serverParamsBeans, QueryHMBean.ServerParamsBean queryHMBean, int position);
    }

    public void setSetOnIntentStartActivity(SetOnIntentStartActivity setOnIntentStartActivity) {
        this.setOnIntentStartActivity = setOnIntentStartActivity;
    }

    private SetOnTanChuangDiaLog setOnTanChuangDiaLog;

    public interface SetOnTanChuangDiaLog {
        void OnTanChuangDiaLog(CaseControlBean.ServerParamsBean serverParamsBean, QueryHMBean.ServerParamsBean queryHMBean, int position);
    }

    public void setSetOnTanChuangDiaLog(SetOnTanChuangDiaLog setOnTanChuangDiaLog) {
        this.setOnTanChuangDiaLog = setOnTanChuangDiaLog;
    }

    private SetPingTiaoZhuan setPingTiaoZhuan;

    // 评跳转回调
    public interface SetPingTiaoZhuan {
        void onPingTiaoZhuan(CaseControlBean.ServerParamsBean serverParamsBean, QueryHMBean.ServerParamsBean queryHMBean);
    }

    public void setSetPingTiaoZhuan(SetPingTiaoZhuan setPingTiaoZhuan) {
        this.setPingTiaoZhuan = setPingTiaoZhuan;
    }
}
