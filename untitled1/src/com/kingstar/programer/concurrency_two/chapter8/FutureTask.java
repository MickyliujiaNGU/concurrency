package com.kingstar.programer.concurrency_two.chapter8;

public interface FutureTask<T> {
    T call() throws InterruptedException;
}
