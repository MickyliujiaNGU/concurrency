package com.kingstar.programer.concurrency_two.chapter6;

public class ClientReadWriteLock {
    public static void main(String[] args) {
        SharedData data = new SharedData(10);
        String name ="liujia";
        new ReadWorker(data).start();
        new WriterWorker(data,"guanshiayao").start();
    }
}
