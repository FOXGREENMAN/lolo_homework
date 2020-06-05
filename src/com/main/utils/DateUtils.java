package com.main.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by admin on 2020/6/5.
 */
public class DateUtils {

    public static final String DATE_TIME_FORMAT_LONG_DEFAULT = "yyyy-MM-dd HH:mm:ss";
    public static final String DATE_FORMAT_SHORT = "yyyyMMdd";

    /**
     * 获取当前年月日时分秒 格式: yyyy-MM-dd HH:mm:ss
     * @return 当前年月日时分秒字符串
     */
    public static String getTodayLong() {
        return formatDate(new Date(),DATE_TIME_FORMAT_LONG_DEFAULT);
    }

    /**
     * 获取当前年月日时分秒 格式: yyyyMMdd
     * @return 当前年月日时分秒字符串
     */
    public static String getTodayShort() {
        return formatDate(new Date(),DATE_FORMAT_SHORT);
    }

    /**
     * 获取指定日期,指定格式时间字符串
     * @param date 指定日期
     * @param format 指定格式
     * @return 指定格式的字符串
     */
    public static String formatDate(Date date,String format) {
        if(date==null) {
            return "";
        }
        DateFormat df = new SimpleDateFormat(format);
        return df.format(date);
    }
}
