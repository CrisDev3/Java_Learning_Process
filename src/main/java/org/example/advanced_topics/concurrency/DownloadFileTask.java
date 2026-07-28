package org.example.advanced_topics.concurrency;

public class DownloadFileTask implements Runnable {

    private DownloadStatus status;

    // This approach cause a race condition with the threads
//    public DownloadFileTask(DownloadStatus status) {
//        this.status = status;
//    }

    // Confinement strategy for race condition safety -> instead of sharing a single status object between every thread, each thread will has its own status object
//    public DownloadFileTask() {
//        this.status = new DownloadStatus();
//    }
//
//    @Override
//    public void run() {
//        System.out.println("Downloading a file " + Thread.currentThread().getName());
////        try {
////            //Pausing a thread
////            Thread.sleep(5000);
////        } catch (InterruptedException e) {
////            throw new RuntimeException(e);
////        }
//
//        // Interrupting a thread
//        for (int i = 0; i < 10_000; i++) {
//            if (Thread.currentThread().isInterrupted()) return;
//            status.incrementTotalBytes();
//        }
//
//        System.out.println("Download complete: " + Thread.currentThread().getName());
//
//
//    }
//
//    public DownloadStatus getStatus() {
//        return status;
//    }

    // 3. The volatile keyword
    public DownloadFileTask(DownloadStatus status) {
    this.status = status;
}

    @Override
    public void run() {
        System.out.println("Downloading a file " + Thread.currentThread().getName());

        for (int i = 0; i < 1_000_000; i++) {
            if (Thread.currentThread().isInterrupted()) return;
            status.incrementTotalBytes();
        }

        status.done();

        synchronized (status) {
            status.notifyAll();
        }

        System.out.println("Download complete: " + Thread.currentThread().getName());
    }

    public DownloadStatus getStatus() {
        return status;
    }
}
