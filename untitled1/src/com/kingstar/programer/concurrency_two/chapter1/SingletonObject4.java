package com.kingstar.programer.concurrency_two.chapter1;

public class SingletonObject4 {
    private static SingletonObject4 singletonObject4;

    private SingletonObject4() {
    }

    public static SingletonObject4 getSingletonObject4() {
        if (singletonObject4 == null) {
            synchronized (SingletonObject4.class) {
                if (singletonObject4 == null) {
                    SingletonObject4.singletonObject4 = new SingletonObject4();
                }
            }
        }
        return singletonObject4;
    }
}
