package com.main.notepad;

import com.main.july.week_5_exam.order_exam.entity.A;
import com.main.july.week_5_exam.order_exam.entity.B;

import java.util.ArrayList;
import java.util.List;

public class FangfaBiJi {

    /**
     * 集合和调用
     *
     * 1. 演示集合中对象存在集合属性, 这种情况的调用;
     * 2. 演示方法调用
     */
    public void jiHehediaoYong(){

        // A对象中有集合属性list, 在A对象的集合属性中存入元素;
        A a= new A();
        List<B> list =new ArrayList<>();
        a.setList(list);

        // 集合c中存入元素A, 元素A中有集合属性list, 获取元素A中集合属性list中的元素;
        List<A> c = new ArrayList<>( );
        c.add(a);

        // 写法1 方法调用链
        // 1:从右往左看 最后有一个方法返回的结果给调用者 调用者是=号左边的对象 L;
        // 2:方法调用链 返回的结果必须和调用者的类型一致
        List l = c.get(0).getList();

        // 写法2
        A aBean = c.get(0);
        aBean.getList();
    }

}
