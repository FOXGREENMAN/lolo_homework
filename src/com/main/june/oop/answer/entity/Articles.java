package com.main.june.oop.answer.entity;

import com.alibaba.fastjson.JSON;

public class Articles {
  private  String lang;
  private  String title;
  private  String content;
  private  String describe;
  private  String size;


    /**
     * 设置Articles对象的两个属性
     *
     * @param articles 原始对象
     * @param langKey 语言标识
     * @param title 标题
     * @return 更新了以上两个属性的对象
     */
    public Articles setLangByTitle(Articles articles, String langKey, String title){

        // 打印方法接收的, 原始的articles对象
        System.out.println("初始化articles 对象:" + JSON.toJSONString(articles));

        // 用入参的 langKey 设置原始对象的lang属性
        articles.setLang(langKey);

        // 用入参的 title 设置原始对象的title属性
        articles.setTitle(title);

        // 返回该对象
        return articles;
    }

  public String setLangByTitle(){
      return null;
  }
    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Articles(String lang, String title, String content, String describe, String size){
        this.content = "None";
        this.describe = "None";
        this.lang = "None";
        this.size = "None";
        this.title = title;


    }

    public Articles(){

    }

}


