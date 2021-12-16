package com.exercise;

public class Return {

//    1. 方法的返回:
//1.1有返回值且返回值有具体类型的方法;

    public String juTIReturn(){
        String str = "1";
        return str;
    }


//1.2没有返回值的方法;

    public void notReturn(){

    }



//1.3有返回值,在方法的执行过程中被判断条件阻断的方法;
    public String ifReturn(Integer integer){
        String str = "等于0";
        if(integer != 0){
            str = "不等于0";
            return str;

        }
    return str;
    }


//1.4没有返回值,在方法执行的过程中,被判定条件阻断的方法;
    public void notIfReturn(Integer integer){
        String str = "0";
        if(integer != 0){
            str = "不等于0";
            return ;
        }
        System.out.println(str.length());
    }



//1.5方法名和类名相同,返回对象为这个类的实体的方法
    public Return onedianwu(){
        Return r = new Return();

        return r;
    }



    //4.交易挖矿 在现货交易里面弄个合约交易挖矿.现货统计用户合约交易数据 根据用户交易的手续费返还平台币给这个用户
    //查询用户合约交易的手续费
    //查询手续费和平台币的汇率,根据汇率得到(手续费 = 平台币的数量)币的数量
    //然后通过公司账户去增币给这个用户

    public static void main(String[] args) {
    GZao gzao = GZao.openFang();
    gzao.getStr();

    }
}
