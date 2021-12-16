package com.kaoshi;

public class Achievement {
    private String stuName; // 学生姓名
    private Byte stuSex; // 学生性别, 用枚举
    private Integer stuClass; // 学生班级
    private String subject; // 学生科目
    private String achievement; // 学生成绩

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Byte getStuSex() {
        return stuSex;
    }

    public void setStuSex(Byte stuSex) {
        this.stuSex = stuSex;
    }

    public Integer getStuClass() {
        return stuClass;
    }

    public void setStuClass(Integer stuClass) {
        this.stuClass = stuClass;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAchievement() {
        return achievement;
    }

    public void setAchievement(String achievement) {
        this.achievement = achievement;
    }

    @Override
    public String toString() {
        return "Achievement{" +
                "stuName='" + stuName + '\'' +
                ", stuSex=" + stuSex +
                ", stuClass=" + stuClass +
                ", subject='" + subject + '\'' +
                ", achievement='" + achievement + '\'' +
                '}';
    }
}
