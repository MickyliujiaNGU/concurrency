package com.kingstar.programer.concurrency_two.chapter5;

public class User extends Thread {
    private final String name;
    private final String address;
    private final Gate gate;


    public User(Gate gate, String name, String address) {
        this.name = name;
        this.address = address;
        this.gate = gate;
    }

    @Override
    public void run() {
        System.out.println(name + " begin");
        while (true) {
            gate.pass(name, address);
        }
    }
}
