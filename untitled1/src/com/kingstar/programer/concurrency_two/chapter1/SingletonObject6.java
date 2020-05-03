package com.kingstar.programer.concurrency_two.chapter1;

public class SingletonObject6 {
    private SingletonObject6() {
    }

    private static class Instance {
        private static SingletonObject6 singletonObject6 = new SingletonObject6();
    }

    public SingletonObject6 getInstance() {
        return Instance.singletonObject6;
    }
}
