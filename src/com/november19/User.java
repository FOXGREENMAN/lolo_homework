package com.november19;

public class User {
    private String id;
    private String type;
    private String age;
    private Integer sex;

    public String xinB;

    public String getXinB() {
        return xinB;
    }

    public void setXinB(String xinB) {
        this.xinB = xinB;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }


    private void si(){
        System.out.println("获取到了私有");
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", age='" + age + '\'' +
                ", sex=" + sex +
                ", xinB='" + xinB + '\'' +
                '}';
    }
}
