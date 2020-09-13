package com.main.whiteBoard;

/**
 * Created by admin on 2020/6/8.
 */
public class Fox {
    private int age;
    private String name;
    private Long uid;
    private String InviteCode;

    public Fox(){}

    public Fox(int age, String name){
        this.age = age;
        this.name = "name";
    }

    public String getInviteCode() {
        return InviteCode;
    }

    public void setInviteCode(String inviteCode) {
        InviteCode = inviteCode;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "FoxHasDefault{" +
                "age=" + age +
                ", name=" + name +
                '}';
    }
}
