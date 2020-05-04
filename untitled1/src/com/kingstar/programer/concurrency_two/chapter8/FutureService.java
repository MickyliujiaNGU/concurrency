package com.kingstar.programer.concurrency_two.chapter8;

public class FutureService {
    public <T> Future<T> submit(final FutureTask<T> task) {
        AsynFuture<T> asynFuture = new AsynFuture<>();
        new Thread(() -> {
            T result = null;
            try {
                result = task.call();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            asynFuture.done(result);
        }).start();
        return asynFuture;
    }
}
