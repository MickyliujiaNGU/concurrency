package com.kingstar.programer;

public class Method2 {
    int i = f();
    int j = g(i);


    private int f() {
        return 11;
    }

    private int g(int i) {
        return i + 2;
    }
}
