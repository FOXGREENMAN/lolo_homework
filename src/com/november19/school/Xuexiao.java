package com.november19.school;

import com.kaoshi.Achievement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Xuexiao {

    public static void main(String[] args) {
        //    private String stuName; // 学生姓名
        //    private Byte stuSex; // 学生性别, 用枚举
        //    private Integer stuClass; // 学生班级
        //    private String subject; // 学生科目
        //    private String achievement; // 学生成绩
        //4 .要求: 用代码统计, 每个班级, 每个科目, 每个性别的总分; 4个办, 三个科目.
        Achievement achievement = new Achievement();
        Achievement achievement1 = new Achievement();
        Achievement achievement2 = new Achievement();
        Achievement achievement3 = new Achievement();

        achievement.setStuName("小明");
        achievement.setAchievement("100");
        achievement.setSubject("语文");
        achievement.setStuSex(Sex.Nan.getType());
        achievement.setStuClass(1);


        achievement1.setStuName("张三");
        achievement1.setAchievement("87");
        achievement1.setSubject("英文");
        achievement1.setStuSex(Sex.Nv.getType());
        achievement1.setStuClass(2);


        achievement2.setStuName("李四");
        achievement2.setAchievement("66");
        achievement2.setSubject("数学");
        achievement2.setStuSex(Sex.Nan.getType());
        achievement2.setStuClass(3);

        achievement3.setStuName("王五");
        achievement3.setAchievement("32");
        achievement3.setSubject("数学");
        achievement3.setStuSex(Sex.Nv.getType());
        achievement3.setStuClass(4);

        List<com.kaoshi.Achievement> list = new ArrayList<>();
        list.add(achievement);
        list.add(achievement1);
        list.add(achievement2);
        list.add(achievement3);
        Integer banji =0;
        Integer yuWen = 0;
        Integer shuXue = 0;
        Integer yingWen = 0;
        Integer nan = 0;
        Integer nv = 0;
        Map<Object, Object> map1 = new HashMap<>();
        for (Achievement achi : list){
            banji += Integer.valueOf(achi.getAchievement());
            if (achi.getSubject().equals("语文")){
                yuWen += Integer.valueOf(achi.getAchievement());
            }else if(achi.getSubject().equals("数学")){
                shuXue += Integer.valueOf(achi.getAchievement());
            }else if(achi.getSubject().equals("英文")){
                yingWen += Integer.valueOf(achi.getAchievement());
            }
            if (achi.getStuSex() == 1){
                nan += Integer.valueOf(achi.getAchievement());
            }else {
                nv += Integer.valueOf(achi.getAchievement());
            }
        }
        System.out.println("每个班级的"+banji);
        System.out.println("语文"+yuWen);
        System.out.println("数学"+shuXue);
        System.out.println("英文"+yingWen);
        System.out.println("男生"+nan);
        System.out.println("女生"+nv);


    }


}