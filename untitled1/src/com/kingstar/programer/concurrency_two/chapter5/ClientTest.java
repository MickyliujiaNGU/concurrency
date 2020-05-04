package com.kingstar.programer.concurrency_two.chapter5;

public class ClientTest {
    public static void main(String[] args) {
        Gate gate = new Gate();
        User bj = new User(gate, "Baobao", "Beijing");
        User sh = new User(gate, "ShangLao", "Shanghai");
        User gl = new User(gate, "GuangLao", "Guangzhou");
        bj.start();
        sh.start();
        gl.start();
    }
}
