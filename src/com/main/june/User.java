package com.main.june;
// 这个满分
public class User {
    private String name ;

    private String phone;

    private String addr;

    private String nickeName;



    public  User (){


    }
    public  User (String name,String addr){
        this.name = name;
        this.addr = addr;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getNickeName() {
        return nickeName;
    }

    public void setNickeName(String nickeName) {
        this.nickeName = nickeName;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", addr='" + addr + '\'' +
                ", nickeName='" + nickeName + '\'' +
                '}';
    }
}
