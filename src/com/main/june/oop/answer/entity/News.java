package com.main.june.oop.answer.entity;


import com.alibaba.fastjson.JSON;

import java.util.Date;

// 类名前面需要用public 修饰, 才能被其他包引用
public class News extends Articles {
    private Date createTime;

    private  String reporter;

    /**
     * 空参构造方法
     */
    public News(){}

    /**
     * 带一个参数的构造方法
     * 通过reporter参数创建对象;
     * 其他属性为空
     * reporter属性为传入属性
     *
     * @param reporter 记者名称
     */
    public News(String reporter){
        this.reporter = reporter;
    }

    /**
     * 带所有参数的构造方法
     * 接收以下参数列表
     *
     * @param title 标题
     * @param reporter 记者名称
     * @param createTime 创建时间
     * @param lang 语言类型
     * @param content 内容
     * @param describe 新闻描述
     * @param size 新闻内容长度
     */
    public News(String title, String reporter, Date createTime, String lang, String content, String describe, String size){
//        this.title = title; //这样写会报错, 因为this关键字仅指代本类属性, 如果需要使用父类属性, 需要父类的属性修饰符为 public 或者 protected ;
//        super.title = title; //这样写会报错, 因为super关键字可以使用父类属性, 但修饰符依然和this关键字有相同规则(见上)

        // 调用父类方法
        this.setTitle(title);

        // 传入参数给本类属性赋值
        this.reporter = reporter;
        this.createTime = createTime;

        // 调用父类方法
        this.setLang(lang);
        this.setContent(content);
        this.setDescribe(describe);
        this.setSize(size);
    }

    /**
     * News的构造方法
     *
     * @param articles 原始对象
     * @param langKey 语言标识
     * @param title 标题
     */
    public News (Articles articles, String langKey, String title){

        // 用传入的对象接收父类方法返回的更新后的对象
        articles = setLangByTitle(articles, langKey, title);

        // 打印更新后的对象
        System.out.println("News 构造方法里调用父类方法setLangByTitle, 变更articles 之后的结果:" + JSON.toJSONString(articles));
    }



    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = new Date();
    }

    public String getReporter() {
        return reporter;
    }

    public void setReporter(String reporter) {
        this.reporter = reporter;
    }
}
