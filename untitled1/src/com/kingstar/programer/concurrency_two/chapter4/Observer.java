package com.kingstar.programer.concurrency_two.chapter4;

public abstract class Observer {
    protected Subject subject;
    public Observer(Subject subject){
        this.subject=subject;
        subject.attach(this);
    }
    public abstract void update();
}
