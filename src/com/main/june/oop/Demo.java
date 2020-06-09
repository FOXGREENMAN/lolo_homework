package com.main.june.oop;

/**
 * Created by admin on 2020/6/8.
 */
public class Demo {

    public static void main(String[] args) {

    }

    /**
     * 1. 通过title创建News对象, 其他属性添加默认值; 日期类型添加当前时间, 字符串类型添加"None";
     *
     * 入参和返回值按要求修改;
     */
    public static News createNewsByTitle(String sdasd){
        News news = new News();
        String sun = "None";
        news.setTitle(sun);
        return null;
    }

    /**
     * 2. 通过reporter更新News对象, 接收reporter参数, 和原始News对象, 返回更新后的News对象;
     *
     * 入参和返回值按要求修改;
     */
    public static News updateNewsByReporter(String reporter){
            News news = new News();
            String sdad = "sadsad";
            news.setReporter(sdad);


            return  news;

    }

    /**
     * 3. 编写一个方法, 接收两个参数, pName, cName; 要求: cName 传入子类对象的名称, pName传入父类对象的名称;
     *
     * 方法内新建一个对象, 初始title为cName, 打印一次对象内容, 然后将title更新为pName, 再打印一次对象内容;
     *
     * 入参和返回值按要求修改;
     */
    public static Articles changeTitle(String pName, String cName){
        Articles articles = new Articles();
        News sadd = new News();
        sadd.setTitle(cName);
        articles.setTitle(pName);






        return articles;
    }


    /**
     *  4. 父类Articles中定义方法 setLangByTitle:
     *
     * 接收三个参数, art 为对象实体, langKey 设置art的属性lang, title 设置art的title属性;
     *
     * 在子类News的构造方法里调用这个方法, 接收两个参数 langkey设置属性lang, title设置属性title;
     *
     * 入参和返回值按要求修改;
     */
    public static Articles setLangByTitle(Articles art, String langKey , String title ){
    }


    /**
     *  5. 是否能定义一个父类对象, 但新建一个子类对象对其赋值; 用代码证明结论;
     *
     *  入参和返回值按要求修改;
     */
    public static Articles proveParentsAndChild(){


        return null;


    }

}
