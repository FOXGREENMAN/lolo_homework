package com.main.june.oop.answer;


import com.main.june.oop.answer.entity.Articles;
import com.main.june.oop.answer.entity.News;
import com.main.utils.BeanUtils;

import java.util.Date;

/**
 * Created by admin on 2020/6/8.
 */
public class Demo {

    public static void main(String[] args) {
        /** 第一题调用 */
        // 使用工具类的打印方法, 打印通过自定义title创建的对象;
//        BeanUtils.printBean(createNewsByTitle("Foxman"));

        /** 第二题调用*/
        // 创建对象 newsSecond;
        News newsSecond = new News();

        // 设置对象的title属性, 标识下面两次打印的是同一个对象
        newsSecond.setTitle("News_0616");

        // 设置对象reporter属性
        newsSecond.setReporter("Foxman");

        // 打印第一次创建的对象内容
        BeanUtils.printBean(newsSecond);

        // 调用第二题方法更新对象的reporter属性
        newsSecond = updateNewsByReporter("lolo",newsSecond);

        // 打印更新后的对象内容
        BeanUtils.printBean(newsSecond);

    }

    /**
     * 1. 通过title创建News对象, 其他属性添加默认值; 日期类型添加当前时间, 字符串类型添加"None";
     *
     * 入参和返回值按要求修改;
     */
    public static News createNewsByTitle(String title){

        // 第一种写法
        // 创建一个对象 news, 用它接收带参数的构造方法返回的对象;
        News news = new News(title,"None",new Date(),"None","None","None","None");

        // 将创建的对象返回给方法的调用者;
        return news;

        // 第二种写法
        // return new News(title,"None",new Date(),"None","None","None","None");

        // 说明:
        // 直接返回创建语句;
        // 因为 new News(...); 这个写法已经获取到了一个创建的对象, 所以直接返回它也是可以的;
    }

    /**
     * 2. 通过reporter更新News对象, 接收reporter参数, 和原始News对象, 返回更新后的News对象;
     *
     * 入参和返回值按要求修改;
     */
    public static News updateNewsByReporter(String reporter, News updateNews){

        // 通过接收的reporter参数, 更新传入的News对象的reporter属性;
        updateNews.setReporter(reporter);

        // 然后将已经更新完的对象返回给调用者;
        return updateNews;

    }

    /**
     * 3. 编写一个方法, 接收两个参数, pName, cName; 要求: cName 传入子类对象的名称, pName传入父类对象的名称;
     *
     * 方法内新建一个对象, 初始title为cName, 打印一次对象内容, 然后将title更新为pName, 再打印一次对象内容;
     *
     * 入参和返回值按要求修改;
     */
    public static Articles changeTitle(String pName, String cName){
        return null;
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
        return null;
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
