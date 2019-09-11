package com.example.tidus.ristrat.utils;

import android.content.Context;
import android.util.TypedValue;

public class DensityUtils {
    /**
     * 不允许初始化
     */
    private DensityUtils() {
    }

    /**
     * dp2px
     *
     * @param context
     * @param val
     * @return
     */
    public static int dp2px(Context context, float dpVal) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,
                dpVal, context.getResources().getDisplayMetrics());
    }

    /**
     * sp2px
     *
     * @param context
     * @param val
     * @return
     */
    public static int sp2px(Context context, float spVal) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP,
                spVal, context.getResources().getDisplayMetrics());
    }

    /**
     * px2dp
     *
     * @param context
     * @param pxVal
     * @return
     */
    public static int px2dp(Context context, float pxVal) {
        float scale = context.getResources().getDisplayMetrics().density;
        return (int) (pxVal / scale + 0.5f);
    }

    /**
     * px2sp
     *
     * @param fontScale
     * @param pxVal
     * @return
     */
    public static int px2sp(Context context, float pxVal) {
        float fontScale = context.getResources().getDisplayMetrics().scaledDensity;
        return (int) (pxVal / fontScale + 0.5);
    }
}
