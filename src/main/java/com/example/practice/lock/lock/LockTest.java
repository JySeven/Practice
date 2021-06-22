package com.example.practice.lock.lock;

import java.util.concurrent.locks.ReentrantLock;

public class LockTest {
    ReentrantLock reentrantLock=new ReentrantLock(true);
    static int sum=0;

    public static void main(String[] args) {
        LockTest lockTest=new LockTest();
        Thread thread1=new Thread1();
        Thread thread3=new Thread1();
        thread1.start();
        thread3.start();
        Thread thread2=new Thread2();
//        for (int i = 0; i < 50; i++) {
//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    sum++;
//                    //System.out.println(sum);
//                }
//            }).start();
//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    sum++;
//                    //System.out.println(sum);
//                }
//            }).start();
//        }
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println(sum);
    }

    static class Thread1 extends Thread{
        int cc=0;
        @Override
        public void run() {
            for (int i = 0; i < 50; i++) {
                cc++;
                System.out.println(Thread.currentThread().getName()+"    "+cc);
            }
        }
    }

    static class Thread2 extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < 50; i++) {
                sum--;
            }
        }
    }
}
