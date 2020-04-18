package com.kingstar.programer.concurrency.chapter3;

public class CreateThread {
    public static void main(String[] args) {
        Thread t1 = new Thread();
        System.out.println(t1.getName());
        Thread t2 = new Thread();
        System.out.println(t2.getName());
        t1.start();

    }
}
