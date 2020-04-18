package com.kingstar.programer.concurrency.chapter3;

public class CreateThread3 {
    private static int count;

    public static void main(String[] args) {
        Thread thread = new Thread(null,new Runnable() {
            @Override
            public void run() {
                try {
                    add(count);
                } catch (Error e) {
                    System.out.println(count);
                }
                add(count);
            }
            private void add(int i) {
                count++;
                add(count);
            }
        },"test",1<<24);
        thread.start();
    }
}
