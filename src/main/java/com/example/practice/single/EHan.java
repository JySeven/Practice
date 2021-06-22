package com.example.practice.single;

public class EHan {
    private static EHan instance=new EHan();

    public static EHan getInstance() {
        return instance;
    }
}
