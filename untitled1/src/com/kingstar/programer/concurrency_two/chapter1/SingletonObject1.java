package com.kingstar.programer.concurrency_two.chapter1;
//恶汉式
public class SingletonObject1 {
    private final static SingletonObject1 singletonObject1 = new SingletonObject1();

    private SingletonObject1() {
    }

    public SingletonObject1 getSingletonObject1() {
        return singletonObject1;
    }
}
