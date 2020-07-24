package com.main.Yan.day7;

public class Mankind {
    int sex;
    int salary;

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public  void manOrworman(){
        if (this.sex == 1){
            System.out.println("man");
        }else if (this.sex == 0){
            System.out.println("women");
        }
    }

    public void  employeed(){
        if (this.salary ==0){
            System.out.println(" no");
        }else{
            System.out.println("job");
        }
    }
}
