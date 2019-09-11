package com.example.tidus.ristrat.utils;

import java.util.Calendar;

/**
 * Created by x_wind on 19/5/28.
 */
public class GetNowTime {

    private static GetNowTime instance;


    public static String initNowTime() {
        Calendar cal = Calendar.getInstance();
        //当前年
        int year = cal.get(Calendar.YEAR);
        //当前月
        int month = (cal.get(Calendar.MONTH)) + 1;
        //当前月的第几天：即当前日
        int day_of_month = cal.get(Calendar.DAY_OF_MONTH);
        //当前时：HOUR_OF_DAY-24小时制；HOUR-12小时制
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        //当前分
        int minute = cal.get(Calendar.MINUTE);
        //当前秒
        int second = cal.get(Calendar.SECOND);
        return year + "年" + month + "月" + day_of_month + "日";
    }

}
