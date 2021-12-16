package com.rewrite;

public class Ax<T> {

    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {
        Ax<Integer> integerAx = new Ax<>();
            integerAx.add(Integer.valueOf("10"));
        Ax<String> stringAx = new Ax<>();
        stringAx.add("Ark");

        System.out.println(integerAx.get());
        System.out.println(stringAx.get());
    }
}
