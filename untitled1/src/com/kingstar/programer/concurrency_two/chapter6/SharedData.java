package com.kingstar.programer.concurrency_two.chapter6;

import java.util.Arrays;

public class SharedData {
    private final char[] buffer;
    private final ReadWriteLock readWriteLock = new ReadWriteLock();

    public SharedData(int size) {
        this.buffer = new char[size];
        Arrays.fill(buffer, '*');
    }

    public char[] read() throws InterruptedException {
        try {
            readWriteLock.readLock();
            return readData();
        } finally {
            readWriteLock.unReadLock();
        }
    }

    public void write(char c) throws InterruptedException {
        try {
            readWriteLock.writeLock();
            Arrays.fill(buffer, c);
        } finally {
            readWriteLock.unWriteLock();
        }
    }

    private char[] readData() {
        char[] chars = new char[buffer.length];
        System.arraycopy(buffer, 0, chars, 0, chars.length);
        return chars;
    }
}
