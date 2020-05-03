package com.kingstar.programer.concurrency_two.chapter4;

public class ObserveClient {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new OctalObserver(subject);
        new BinaryObserver(subject);
        System.out.println("++++++++++++++++++");
        subject.setState(10);
        System.out.println("++++++++++++++++++");
        subject.setState(10);
        System.out.println("+++++++++++++++++++");
        subject.setState(12);

    }
}
