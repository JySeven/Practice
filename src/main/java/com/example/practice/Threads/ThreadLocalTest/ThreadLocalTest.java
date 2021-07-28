package com.example.practice.Threads.ThreadLocalTest;

import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThreadLocalTest {


    public static void main(String[] args) {
        ThreadLocal threadLocal = new ThreadLocal();
        Thread1 thread1=new Thread1(threadLocal);
        Thread2 thread2=new Thread2(threadLocal);
        thread1.start();

        System.out.println(thread1.getThreadLocal());
        thread2.start();
    }
}

@Data
class Thread1 extends Thread {
    private ThreadLocal<List<String>> threadLocal;
    private ThreadLocal<Map<String,String>> threadLocal2;
    public Thread1(ThreadLocal<List<String>> threadLocal){
        this.threadLocal=threadLocal;
        this.threadLocal2=new ThreadLocal<>();
    }
    @Override
    public void run() {
        List<String> list=new ArrayList<>();
        Map<String, String> map=new HashMap<>();
        map.put("a","a");
        list.add("aaa");
        list.add("aaa2");
        threadLocal.set(list);
        threadLocal2.set(map);
        System.out.println(threadLocal.get());
        System.out.println(threadLocal2.get());
        threadLocal.set(null);
        System.out.println(threadLocal.get());
        System.gc();
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
