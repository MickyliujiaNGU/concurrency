package com.kingstar.programer.concurrency_two.chapter7;

public class ImmutableClientTest {

    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        Sync shanxi = new Sync(12, "shanxi");
        for (int i = 0; i < 1000000; i++) {
            System.out.println(shanxi.toString());
        }
        System.out.println(System.currentTimeMillis()-begin);
    }
}


 class Sync {
    private int age;
    private String address;

    public Sync(int age, String address) {
        this.age = age;
        this.address = address;
    }

    @Override
    public synchronized String toString() {
        return "Sync{" +
                "age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}

final class Immutable {
    private final int age;
    private final String address;

    Immutable(int age, String address) {
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Immutable{" +
                "age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
