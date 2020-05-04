package com.kingstar.programer.concurrency_two.chapter8;

public class FutureClient {
    public static void main(String[] args) throws InterruptedException {
        FutureService service = new FutureService();
        Future<String> submit = service.submit(() -> {
            Thread.sleep(3_000);
            return "finished";
        });
        System.out.println("===============");
        System.out.println("do something  others");
        Thread.sleep(4_000);
        System.out.println(" something is  done ");
        System.out.println(submit.get());
    }
}
