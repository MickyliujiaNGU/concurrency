package com.kingstar.programer.concurrency_two.chapter3;

public class VolatileTest {
    private static  int INIT_VALUE = 0;
    private static final int MAX_VALUE = 5;

    public static void main(String[] args) {
        new Thread(() -> {
            int localValue = INIT_VALUE;
            while (localValue < MAX_VALUE) {
                if (localValue != INIT_VALUE) {
                    System.out.printf("The value update to [%d]\n", INIT_VALUE);
                    localValue = INIT_VALUE;
                }
            }
        }).start();
        new Thread(() -> {
            while (INIT_VALUE < MAX_VALUE) {
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.printf("update value to [%d]\n", ++INIT_VALUE);
            }
        }).start();
    }
}
