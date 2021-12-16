package com.november12;

public class Test {
    public static void main(String[] args) {
        Internal internal  = Internal.demo();
        Internal interna2  = Internal.demo();

        System.out.println(internal.hashCode());
        System.out.println(interna2.hashCode());

    }
}