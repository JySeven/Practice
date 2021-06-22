package com.example.practice.single;

public class LHan {
    private static volatile LHan instance;


    public LHan() {
    }

    //线程不安全
    public static LHan getInstance(LHan instance) {
        if (instance == null) {
            instance = new LHan();
        }
        return instance;
    }

    //DoubleCheck
    public static LHan getInstance1(LHan instance) {
        if (instance == null) {
            synchronized (LHan.class) {
                if (instance == null) {
                    instance = new LHan();
                }
            }
        }
        return instance;
    }


}
