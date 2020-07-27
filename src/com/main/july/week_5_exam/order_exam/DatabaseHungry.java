package com.main.july.week_5_exam.order_exam;

import java.util.Map;

/**
 * Created by admin on 2020/7/28.
 */
public class DatabaseHungry {

    private DatabaseHungry(){}

    private Map<String,Object> dbMap;

    public static DatabaseHungry getInstance(){
        return new DatabaseHungry();
    }

}
