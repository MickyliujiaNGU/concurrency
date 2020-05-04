package com.kingstar.programer.concurrency_two.chapter6;

public class ReadWorker extends Thread {
    private final SharedData dara;

    public ReadWorker(SharedData dara) {
        this.dara = dara;
    }

    @Override
    public void run() {
        try {
            while (true) {
                char[] read = dara.read();
                System.out.println(read);
                sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
