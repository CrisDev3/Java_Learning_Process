package org.example.advanced_topics.concurrency;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.LongAdder;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DownloadStatus {

    // 1. Confinement
//    private int totalBytes;
//
//    public int getTotalBytes() {
//        return totalBytes;
//    }
//
//    public void incrementTotalBytes() {
//        totalBytes++;
//    }

    // 2. Synchronization
//    private int totalBytes;
//    private Lock lock = new ReentrantLock();
//
//    public int getTotalBytes() {
//        return totalBytes;
//    }
//
//    public void incrementTotalBytes() {
//        lock.lock();
//        try {
//            totalBytes++;
//        }
//        finally {
//            lock.unlock();
//        }
//    }

    // 2.1. The synchronized keyword, This synchronized section was only added in order to understand how it works, but as best practice avoid ii and don´t use it in our code
//    private int totalBytes;
//    private int totalFiles;
//    private Object totalBytesLock = new Object();
//    private Object totalFilesLock = new Object();
//
//    public int getTotalBytes() {
//        return totalBytes;
//    }
//
//    public void incrementTotalBytes() {
//        synchronized (totalBytesLock) {  // using the this keyword is a bad practice because the threads cannot access two monitor objects and that cause unnecessary wait
//            totalBytes++;
//        }
//    }
//
//    public void incrementTotalFiles() {
//        synchronized (totalFilesLock) {
//            totalFiles++;
//        }
//    }
//
//    public int getTotalFiles() {
//        return totalFiles;
//    }

    // 3. The volatile keywoord approach -> A better alternative to the synchronized approach
//    private volatile boolean isDone;
//    private int totalBytes;
//    private int totalFiles;
//    private Object totalBytesLock = new Object();
//    private Object totalFilesLock = new Object();
//
//    public int getTotalBytes() {
//        return totalBytes;
//    }
//
//    public void incrementTotalBytes() {
//        synchronized (totalBytesLock) {  // using the this keyword is a bad practice because the threads cannot access two monitor objects and that cause unnecessary wait
//            totalBytes++;
//        }
//    }
//
//    public void incrementTotalFiles() {
//        synchronized (totalFilesLock) {
//            totalFiles++;
//        }
//    }
//
//    public int getTotalFiles() {
//        return totalFiles;
//    }
//
//    public boolean isDone() {
//        return isDone;
//    }
//
//    public void done() {
//        isDone = true;

    // 4. Atomic objects -> Great way to incrementing counters
//    private boolean isDone;
//    private AtomicInteger totalBytes = new AtomicInteger();
//    private int totalFiles;
//
//    public void incrementTotalBytes() {
//            totalBytes.incrementAndGet();
//    }
//
//    public void incrementTotalFiles() {
//            totalFiles++;
//    }
//
//    public int getTotalFiles() {
//        return totalFiles;
//    }
//
//    public int getTotalBytes() { return totalBytes.get(); }
//
//    public boolean isDone() { return isDone; }
//
//    public void done() { isDone = true; }

    // 5. Adders
    private boolean isDone;
    private LongAdder totalBytes = new LongAdder();
    private int totalFiles;

    public void incrementTotalBytes() {
        totalBytes.increment();
    }

    public void incrementTotalFiles() {
        totalFiles++;
    }

    public int getTotalFiles() {
        return totalFiles;
    }

    public int getTotalBytes() {
        return totalBytes.intValue();
    }

    public boolean isDone() {
        return isDone;
    }

    public void done() {
        isDone = true;
    }
}

