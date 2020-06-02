package com.concurrent.chapter1;

import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class TicketWIndowRunnable implements Runnable {
    private static final int MAX = 50;
    private int index;

    @Override
    public void run() {
        System.out.println("hello world this is update");
        while (index<MAX){
            System.out.println(Thread.currentThread()+" 的号码是："+index++);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("hello git this is update for 模板方法");
        System.out.println("some thing is update after hello git");

    }

    public static void main(String[] args) {
        TicketWIndowRunnable ticketWIndowRunnable = new TicketWIndowRunnable();
        IntStream.range(1,4).forEach(i->{new Thread(ticketWIndowRunnable,"sellwindow"+i).start();});
    }
}
