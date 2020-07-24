package com.main.Yan.day7;

import java.util.Objects;

public class Student extends Person {
    String  school;

//    public void showInfo(){
//        System.out.println(this.sex);
//        System.out.println(this.name);
//        System.out.println(this.age);
//        System.out.println(this.school);
//
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(school, student.school);
    }

    @Override
    public int hashCode() {
        return Objects.hash(school);
    }
}
