package com.example.practice;


public class Test {
    @org.junit.jupiter.api.Test
    public void test(){
        String s="123456";
        System.out.println(s.length());
        System.out.println(s.substring(0,s.length()-2));
    }
}
