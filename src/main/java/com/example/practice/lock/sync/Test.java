package com.example.practice.lock.sync;

public class Test {
    public static void main(String[] args) {
        System.out.println();
        A a=new A();
    }
}
class A{
    synchronized void a1() throws InterruptedException {
        System.out.println("执行a1方法");
        Thread.sleep(10000);
    }
    synchronized void a2(){
        System.out.println("执行a2方法");
    }
}