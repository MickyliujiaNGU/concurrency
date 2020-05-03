package com.kingstar.programer.concurrency_two.chapter4;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private final List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return this.state;
    }

    public void setState(int state) {
        if (this.state != state) {
            this.state = state;
            notifyAllObserver();
        }
    }

    public void attach(Observer observer) {
        this.observers.add(observer);
    }

    private void notifyAllObserver() {
        observers.stream().forEach(Observer::update);
    }

    public Subject() {
    }
}
