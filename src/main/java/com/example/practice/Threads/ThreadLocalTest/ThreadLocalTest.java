package com.example.practice.Threads.ThreadLocalTest;

import java.util.ArrayList;
import java.util.List;

public class ThreadLocalTest {


    public static void main(String[] args) {
        ThreadLocal threadLocal = new ThreadLocal();
        Thread1 thread1=new Thread1(threadLocal);
        Thread2 thread2=new Thread2(threadLocal);
        thread1.start();
        thread2.start();
    }
}

class Thread1 extends Thread {
    private ThreadLocal<List<String>> threadLocal;
    public Thread1(ThreadLocal<List<String>> threadLocal){
        this.threadLocal=threadLocal;
    }
    @Override
    public void run() {
        List<String> list=new ArrayList<>();
        list.add("aaa");
        list.add("aaa2");
        threadLocal.set(list);
        System.out.println(threadLocal.get());
    }
}

class Thread2 extends Thread {
    private ThreadLocal<List<String>> threadLocal;
    public Thread2(ThreadLocal<List<String>> threadLocal){
        this.threadLocal=threadLocal;
    }
    @Override
    public void run() {
        List<String> list=new ArrayList<>();
        list.add("bbb");
        list.add("bbb2");
        threadLocal.set(list);
        System.out.println(threadLocal.get());
    }
}
