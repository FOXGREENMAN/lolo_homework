package com.main.Yan.muke.List.Demo2;

public class Product {

    private int id; //商品编号;
    private String name; //名称
    private float price; //价格

    public  Product(int id, String name, float price){
        this.id = id;
        this.name = name;
        this.price = price;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    // 这里是上面3个属性的setter/getter方法，这里省略
    public String toString() {
        return "商品编号：" + id + "，名称：" + name + "，价格：" + price;
    }

}
