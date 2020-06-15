package com.main.june.oop;

import java.util.Date;

class News extends Articles {
    private Date createTime;

    private  String reporter;

    //接受五个参数设置父类的属性
    public News(String lang,String title,String content,String describe,String size){
        this.setTitle(title);
        this.setLang(lang);
        this.setContent(content);
        this.setDescribe(describe);
        this.setSize(size);

    }
    public  News(){
        setLangByTitle();

        this.getReporter();
    }
    public  News(String areporter,String title){
    reporter = areporter;

    }

    public  void reporter(String areporter){
        reporter = areporter;

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

    @Override
    public String toString() {
        return "News{" +
                "createTime=" + createTime +
                ", reporter='" + reporter + '\'' +
                "lang='" + getLang() + '\'' +
                ", title='" + getTitle() + '\'' +
                ", content='" + getContent() + '\'' +
                ", describe='" + getDescribe() + '\'' +
                ", size='" + getSize() + '\'' +
                '}';
    }
}
