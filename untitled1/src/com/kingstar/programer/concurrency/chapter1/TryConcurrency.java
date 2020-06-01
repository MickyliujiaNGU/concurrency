package com.kingstar.programer.concurrency.chapter1;

public class TryConcurrency {
    public static void main(String[] args) {
        new Thread("newThread") {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName() + "--->" + i);
                }
            }
        }.start();
        readFromDatabase();
        System.out.println("helloworld");
        writeDataToFile();
    }

    private static void readFromDatabase() {
        try {
            println("Begin read data from db.");
            Thread.sleep(10_000);
            println("read data done and start handle it.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        println("The data handle fininsh and successfully");
    }

    private static void writeDataToFile() {
        try {
            println("begin write data to file");
            Thread.sleep(1000_000);
            println("write data done and start handle it.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        println("data has finish successfully!");
    }

    private static void println(String message) {
        System.out.println(message);
    }
}
