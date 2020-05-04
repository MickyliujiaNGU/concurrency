package com.kingstar.programer.concurrency_two.chapter6;

public class ReadWriteLock {
    private int readingReaders = 0;
    private int waitingReaders = 0;
    private int writingWriters = 0;
    private int waitingWriters = 0;
    private boolean prefer;

    public ReadWriteLock() {
        this(true);
    }

    public ReadWriteLock(boolean prefer) {
        this.prefer = prefer;
    }

    public synchronized void readLock() throws InterruptedException {
        this.waitingReaders++;
        try {
            while (waitingWriters > 0 || (prefer && writingWriters > 0)) {
                this.wait();
            }
            readingReaders++;
        } finally {
            waitingReaders--;
        }
    }

    public synchronized void unReadLock() {
        readingReaders--;
        this.notifyAll();
    }

    public synchronized void unWriteLock() {
        writingWriters--;
        this.notifyAll();
    }

    public synchronized void writeLock() throws InterruptedException {
        waitingWriters++;
        try {
            while (readingReaders > 0 || writingWriters > 0) {
                wait();
            }
            writingWriters++;
        } finally {
            waitingWriters--;
        }
    }


}
