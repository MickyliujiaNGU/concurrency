package com.kingstar.programer.concurrency_two.chapter1;

public class SingletonObject3 {
    private static SingletonObject3 singletonObject3;

    private SingletonObject3() {
    }

    public static synchronized SingletonObject3 getSingletonObject3() {
        if (singletonObject3 == null) {
            SingletonObject3.singletonObject3 = new SingletonObject3();
        }
        return SingletonObject3.singletonObject3;
    }
}
