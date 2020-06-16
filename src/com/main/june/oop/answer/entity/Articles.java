package com.main.june.oop.answer.entity;

public class Articles {
  private  String lang;
  private  String title;
  private  String content;
  private  String describe;
  private  String size;



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


