package com.main.june.oop;

import java.util.Date;

public class Articles {
  private  String lang;
  private  String title;
  private  String content;
  private  String describe;
  private  String size;

    @Override
    public String toString() {
        return "Articles{" +
                "lang='" + lang + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", describe='" + describe + '\'' +
                ", size='" + size + '\'' +
                '}';
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



    public Articles(String alang, String atitle, String acontent, String adescribe, String asize){
        lang = alang;
        title = atitle;
        content = acontent;
        describe = adescribe;
        size = asize;




    }

    public  Articles(){

    }



}


