package com.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    public static String FORMAT_SHORT = "yyyy-MM-dd";
    public static void main(String[] args) throws ParseException {
        String str = "1619772949000";
        Date dNow = new Date( );
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
        Date date = ft.parse(ft.format(dNow));
        System.out.println("当前时间为: " + date);
        System.out.println(getTimeToDate(Long.valueOf(str)));
    }

    public static Date longToDate(Long milliSecond){
        Date date = new Date();
        date.setTime(milliSecond);
        System.out.println(date.getDate());
        return date;
    }

    public static Date getTimeToDate(long time){
        String dateTime;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        long timeLong = Long.valueOf(time);
        dateTime = simpleDateFormat.format(new Date(time));
        return StringToDate(dateTime,"yyyy-MM-dd HH:mm:ss");
    }
    public static Date StringToDate(String dateTime,String pattern){
        //创建SimpleDateFormat对象实例并定义好转换格式
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        Date date = null;
        try {
            // 注意格式需要与上面一致，不然会出现异常
            date = sdf.parse(dateTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

}
