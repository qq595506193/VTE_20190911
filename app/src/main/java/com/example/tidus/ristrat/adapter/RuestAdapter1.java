package com.example.tidus.ristrat.adapter;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.tidus.ristrat.R;
import com.example.tidus.ristrat.bean.Patient;
import com.example.tidus.ristrat.weight.BaseRecyclerAdapter;

import java.util.List;

public class RuestAdapter1 extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final int TYPE_HEADER = 0;  //说明是带有Header的
    public static final int TYPE_FOOTER = 1;  //说明是带有Footer的
    public static final int TYPE_NORMAL = 2;  //说明是不带有header和footer的

    public static final int FIRST_STICKY_VIEW = 1;
    public static final int HAS_STICKY_VIEW = 2;
    public static final int NONE_STICKY_VIEW = 3;

    //获取从Activity中传递过来每个item的数据集合
    private List<Patient.ServerParamsBean.WillpushListBean> mDatas;
    //HeaderView, FooterView
    private View mHeaderView;
    private View mFooterView;

    public interface OnItemClickListener {
        void onItemClick(int position);
    }
    private OnItemClickListener listener;

    public void setListener(OnItemClickListener listener) {
        this.listener = listener;
    }

    //构造函数
    public RuestAdapter1(List<Patient.ServerParamsBean.WillpushListBean> list) {
        this.mDatas = list;
    }

    //HeaderView和FooterView的get和set函数
    public View getHeaderView() {
        return mHeaderView;
    }

    public void setHeaderView(View headerView) {
        mHeaderView = headerView;
        notifyItemInserted(0);
    }

    public View getFooterView() {
        return mFooterView;
    }

    public void setFooterView(View footerView) {
        mFooterView = footerView;
        notifyItemInserted(getItemCount() - 1);
    }

    /** 重写这个方法，很重要，是加入Header和Footer的关键，我们通过判断item的类型，从而绑定不同的view    * */
    @Override
    public int getItemViewType(int position) {
        if (mHeaderView == null && mFooterView == null) {
            return TYPE_NORMAL;
        }
        if (position == 0&& mHeaderView != null) {
            //第一个item应该加载Header
            return TYPE_HEADER;
        }
        if (position == getItemCount() - 1&& mFooterView != null) {
            //最后一个,应该加载Footer
            return TYPE_FOOTER;
        }
        return TYPE_NORMAL;
    }

    //创建View，如果是HeaderView或者是FooterView，直接在Holder中返回
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (mHeaderView != null && viewType == TYPE_HEADER) {
            return new ListHolder(mHeaderView);
        }
        if (mFooterView != null && viewType == TYPE_FOOTER) {
            return new ListHolder(mFooterView);
        }
        View layout = LayoutInflater.from(parent.getContext()).inflate(R.layout.ruest_item, parent, false);
        return new ListHolder(layout);
    }

    //绑定View，这里是根据返回的这个position的类型，从而进行绑定的，   HeaderView和FooterView, 就不同绑定了
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        if (getItemViewType(position) == TYPE_NORMAL) {
            if (holder instanceof ListHolder) {
                //这里加载数据的时候要注意，是从position-1开始，因为position==0已经被header占用了
                ((ListHolder) holder).txtName.setText(mDatas.get(position ).getPATIENT_NAME());
                ((ListHolder) holder).txtNum.setText(mDatas.get(position ).getMEDICAL_REC_NUMBER());
                if(mDatas.get(position).getPATIENT_SEX()!=null) {
                    if (mDatas.get(position).getPATIENT_SEX().equals("M")) {
                        ((ListHolder) holder).txtSex.setText("男");
                    } else {
                        ((ListHolder) holder).txtSex.setText("女");
                    }
                }
                ((ListHolder) holder).txtAge.setText(mDatas.get(position ).getBIRTHDAY());
                ((ListHolder) holder).txtDepartment.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(listener!=null) listener.onItemClick(position);
                    }
                });
                if (mDatas.get(position ).getRISK_NAME() != null) {
                    if (mDatas.get(position).equals("确诊")) {
                        ((ListHolder) holder).txtState.setBackgroundColor(Color.parseColor("#f72e54"));
                        ((ListHolder) holder).txtState.setText(String.valueOf(mDatas.get(position).getRISK_NAME()));
                        ((ListHolder) holder).txtState.setTextColor(Color.parseColor("#ffffff"));
                    } else if (mDatas.get(position ).getRISK_NAME().equals("极高危")) {
                        ((ListHolder) holder).txtState.setTextColor(Color.parseColor("#ffffff"));
                        ((ListHolder) holder).txtState.setBackgroundColor(Color.parseColor("#f56500"));
                        ((ListHolder) holder).txtState.setText(String.valueOf(mDatas.get(position ).getRISK_NAME()));
                    } else if (mDatas.get(position).getRISK_NAME().equals("高危")) {
                        ((ListHolder) holder).txtState.setTextColor(Color.parseColor("#ffffff"));
                        ((ListHolder) holder).txtState.setBackgroundColor(Color.parseColor("#f3ca00"));
                        ((ListHolder) holder).txtState.setText(String.valueOf(mDatas.get(position ).getRISK_NAME()));
                    } else if (mDatas.get(position ).getRISK_NAME().equals("中危")) {
                        ((ListHolder) holder).txtState.setTextColor(Color.parseColor("#ffffff"));
                        ((ListHolder) holder).txtState.setBackgroundColor(Color.parseColor("#54a5f5"));
                        ((ListHolder) holder).txtState.setText(String.valueOf(mDatas.get(position ).getRISK_NAME()));
                    } else if (mDatas.get(position).getRISK_NAME().equals("低危")) {
                        ((ListHolder) holder).txtState.setTextColor(Color.parseColor("#ffffff"));
                        ((ListHolder) holder).txtState.setBackgroundColor(Color.parseColor("#009543"));
                        ((ListHolder) holder).txtState.setText(String.valueOf(mDatas.get(position).getRISK_NAME()));
                    } else {
                        ((ListHolder) holder).txtState.setText(String.valueOf(mDatas.get(position ).getRISK_NAME()));
                        ((ListHolder) holder).txtState.setBackgroundColor(Color.parseColor("#f8f8f8"));
                    }
                    ((ListHolder) holder).txtDepartment.setText("查看");
                } else {
                    ((ListHolder) holder).txtDepartment.setText("开始评估");
                    ((ListHolder) holder).txtState.setTextColor(Color.parseColor("#8a000000"));
                    ((ListHolder) holder).txtState.setText("未评估");
                    ((ListHolder) holder).txtState.setBackgroundColor(Color.parseColor("#f8f8f8"));

                }
            }
            return;
        } else if (getItemViewType(position) == TYPE_HEADER) {
            return;
        } else {
            return;
        }


    }

    //在这里面加载ListView中的每个item的布局
    class ListHolder extends RecyclerView.ViewHolder {
        TextView txtDepartment;
        TextView txtName;
        TextView txtNum;
        TextView txtSex;
        TextView txtAge;
        TextView txtState;

        public ListHolder(View itemView) {
            super(itemView);
            //如果是headerview或者是footerview,直接返回
            if (itemView == mHeaderView) {
                return;
            }
            if (itemView == mFooterView) {
                return;
            }
            txtDepartment = (TextView) itemView.findViewById(R.id.txt_department);
            txtName = (TextView) itemView.findViewById(R.id.txt_name);
            txtNum = (TextView) itemView.findViewById(R.id.txt_num);
            txtSex = (TextView) itemView.findViewById(R.id.txt_sex);
            txtAge = (TextView) itemView.findViewById(R.id.txt_age);
            txtState = (TextView) itemView.findViewById(R.id.txt_state);
        }
    }

    //返回View中Item的个数，这个时候，总的个数应该是ListView中Item的个数加上HeaderView和FooterView
    @Override
    public int getItemCount() {
        if (mHeaderView == null && mFooterView == null) {
            return mDatas.size();
        } else if (mHeaderView == null && mFooterView != null) {
            return mDatas.size() + 1;
        } else if (mHeaderView != null && mFooterView == null) {
            return mDatas.size() + 1;
        } else {
            return mDatas.size() + 2;
        }
    }
}


