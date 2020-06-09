package com.main.whiteBoard;

/**
 * Created by admin on 2020/6/8.
 */
public class FoxHasDefault {

    private int age;
    private String name;

    public FoxHasDefault(){
        this.age = 18;
        this.name = "FOXMAN";
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
