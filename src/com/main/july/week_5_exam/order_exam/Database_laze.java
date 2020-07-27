package com.main.july.week_5_exam.order_exam;

import java.util.Map;

/**
 * Created by admin on 2020/7/28.
 */
public class Database_laze {

    private Database_laze(){}

    private Map<String,Object> dbMap;

    public static Database_laze getInstance(){
        return new Database_laze();
    }

}
