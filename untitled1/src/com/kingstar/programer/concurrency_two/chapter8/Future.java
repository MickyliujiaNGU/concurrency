package com.kingstar.programer.concurrency_two.chapter8;

public interface Future<T> {
    T get() throws InterruptedException;
}
