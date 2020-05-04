package com.kingstar.programer.concurrency_two.chapter5;

public class Gate {
    private String name;

    public Gate() {
    }

    private String address;
    private int count;

    public void pass(String name, String address) {
        this.name = name;
        this.address = address;
        count++;
        verify();
    }

    private void verify() {
        if (name.charAt(1) != address.charAt(1)) {
            System.out.println("*******BROKEN**********" + toString());
        }
    }

    public String toString() {
        return "{name:" + this.name + ",address:" + this.address + "}";
    }


}
