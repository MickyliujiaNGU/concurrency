package com.kingstar.programer.concurrency_two.chapter2;

import java.util.Optional;
import java.util.stream.IntStream;

public class WaitSet {
    private final static Object LOCK = new Object();

    public static void main(String[] args) throws InterruptedException {
        IntStream.rangeClosed(1, 20).forEach(i ->
                new Thread(() -> {
                    synchronized (LOCK){
                        try {
                            Optional.of(Thread.currentThread().getName()+"will come to wait set.").ifPresent(System.out::println);
                            LOCK.wait();
                            Optional.of(Thread.currentThread().getName()+"will leave wait set.").ifPresent(System.out::println);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }).start()
        );
        Thread.sleep(1000);
     IntStream.rangeClosed(1,100).forEach(i->{
         new Thread(){
             @Override
             public void run() {
                 synchronized (LOCK){
                     LOCK.notifyAll();
                 }
             }
         }.start();
     });
    }
}
