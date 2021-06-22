package com.example.practice.lock.sync;

import java.util.concurrent.locks.ReentrantLock;

/**
 * synchronized 修饰静态和非静态方法的不同
 */
public class SyncTest {
    private static volatile int x=0;
    public static void main(String[] args) throws InterruptedException {
        ReentrantLock lock = new ReentrantLock(true);
        SyncTest test=new SyncTest();
        try {
            lock.lock();
            for (int i = 0; i < 100; i++) {
                new Thread(SyncTest::synAdd).start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
        Thread.sleep(2000);
        System.out.println(x);
    }
    private static  void synAdd(){
        ++x;
        System.out.println(Thread.currentThread().getName()+"执行修改 X的值: "+x);
    }
}

class Test1 {
    synchronized void test111() {
        System.out.println(Thread.currentThread().getName() + "执行了test1方法");
    }
}

class Test2 {
    synchronized static void test222() {
        System.out.println(Thread.currentThread().getName() + "执行了test2方法");
    }
}
