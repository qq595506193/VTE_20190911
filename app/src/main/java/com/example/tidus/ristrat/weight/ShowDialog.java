package com.example.tidus.ristrat.weight;

import android.content.Context;

public class ShowDialog {
    private CustomDialog customDialog;

    public ShowDialog() {

    }

    public void show(final Context context, String title, String message, String name, final OnBottomClickListener onBottomClickListener) {
        customDialog = new CustomDialog(context);
        customDialog.setTitle(title);
        customDialog.setMessage(message);
        customDialog.setName(name);
        customDialog.setYesOnClickListener("确定", new CustomDialog.onYesOnClickListener() {
            @Override
            public void onYesClick() {
                if (onBottomClickListener != null) {
                    onBottomClickListener.positive();
                }
                customDialog.dismiss();
            }
        });

        customDialog.setNoOnClickListener("取消", new CustomDialog.onNoClickListener() {
            @Override
            public void onNoClick() {
                if (onBottomClickListener != null) {
                    onBottomClickListener.negative();
                }
                customDialog.dismiss();
            }
        });
        customDialog.show();

    }

    public void show2(final Context context, String title, String message, String yes, String no, final OnBottomClickListener onBottomClickListener) {
        customDialog = new CustomDialog(context);
        customDialog.setTitle(title);
        customDialog.setMessage(message);
        customDialog.setYesOnClickListener(yes, new CustomDialog.onYesOnClickListener() {
            @Override
            public void onYesClick() {
                if (onBottomClickListener != null) {
                    onBottomClickListener.positive();
                }
                customDialog.dismiss();
            }
        });

        customDialog.setNoOnClickListener(no, new CustomDialog.onNoClickListener() {
            @Override
            public void onNoClick() {
                if (onBottomClickListener != null) {
                    onBottomClickListener.negative();
                }
                customDialog.dismiss();
            }
        });
        customDialog.show();
    }

    public interface OnBottomClickListener {
        void positive();

        void negative();
    }

}
