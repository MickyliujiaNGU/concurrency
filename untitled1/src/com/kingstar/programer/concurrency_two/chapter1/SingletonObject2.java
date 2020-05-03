package com.kingstar.programer.concurrency_two.chapter1;
//multThread is not safe;
public   class SingletonObject2 {
    public static SingletonObject2 instance;

    private SingletonObject2() {
    }

    public SingletonObject2 getInstance() {
        if (SingletonObject2.instance == null) {
            SingletonObject2.instance = new SingletonObject2();
        }
        return SingletonObject2.instance;
    }
}
