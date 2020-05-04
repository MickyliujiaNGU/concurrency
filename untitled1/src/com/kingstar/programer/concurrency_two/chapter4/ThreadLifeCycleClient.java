package com.kingstar.programer.concurrency_two.chapter4;

import java.util.Arrays;

public class ThreadLifeCycleClient {
    public static void main(String[] args) {
        new ThreadLifeCycleObserver().concurrenntQuery(Arrays.asList("1","2","3"));
    }
}
