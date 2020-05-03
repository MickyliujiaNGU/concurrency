package com.kingstar.programer.concurrency_two.chapter4;

public class OctalObserver extends Observer {
    public OctalObserver(Subject subject) {
        super(subject);
    }

    @Override
    public void update() {
        System.out.println("OctalString" + Integer.toOctalString(subject.getState()));
    }
}
