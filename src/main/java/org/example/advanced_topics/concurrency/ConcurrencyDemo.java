package org.example.advanced_topics.concurrency;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrencyDemo {
    public static void show() {
//        System.out.println(Thread.activeCount());  // My program has 2 threads active, the main method thread, and the garbage collector thread
//        System.out.println(Runtime.getRuntime().availableProcessors()); // My pc has 20 threads available to run different processes concurrently
//
//        // Starting a thread
//        System.out.println(Thread.currentThread().getName());
//
//        for (int i = 0; i < 5; i ++) {
//            var thread = new Thread(new DownloadFileTask());
//            thread.start();
//
//            // Joining a thread
//            try {
//                thread.join();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println("File is ready to be scanned.");

        // Interrupting a thread
//        Thread thread = new Thread(new DownloadFileTask());
//        thread.start();
//
//        try {
//            Thread.sleep(1000);
//        }catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        thread.interrupt();

        // The race condition problem in concurrent programs
//        var status = new DownloadStatus();
//
//        List<Thread> threads = new ArrayList<>();
//
//        for (var i = 0; i < 10; i++) {
//            var thread = new Thread(new DownloadFileTask(status));
//            thread.start();
//            threads.add(thread);
//        }
//
//        for (var thread : threads) {
//            try {
//                thread.join();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        System.out.println(status.getTotalBytes());

        // Thread safety strategies
        // 1 confinement
//        List<Thread> threads = new ArrayList<>();
//        List<DownloadFileTask> tasks = new ArrayList<>();
//
//        for (var i = 0; i < 10; i++) {
//            var task = new DownloadFileTask();
//            tasks.add(task);
//
//            var thread = new Thread(task);
//            thread.start();
//            threads.add(thread);
//        }
//
//        for (var thread : threads) {
//            try {
//                thread.join();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//
//        var totalBytes = tasks.stream()
//                .map(t -> t.getStatus().getTotalBytes())
//                .reduce(0, (a, b) -> a + b);
//
//        System.out.println("Total bytes: " + totalBytes);

        // 2. Synchronization -> its a bad practice because we loose concurrency
//        List<Thread> threads = new ArrayList<>();
//        List<DownloadFileTask> tasks = new ArrayList<>();
//
//        for (var i = 0; i < 10; i++) {
//            var task = new DownloadFileTask();
//            tasks.add(task);
//
//            var thread = new Thread(task);
//            thread.start();
//            threads.add(thread);
//        }
//
//        for (var thread : threads) {
//            try {
//                thread.join();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//
//        var totalBytes = tasks.stream()
//                .map(t -> t.getStatus().getTotalBytes())
//                .reduce(0, (a, b) -> a + b);
//
//        System.out.println("Total bytes: " + totalBytes);

        // 3. The volatile keyword, better alternative to the synchronized approach
//        var status = new DownloadStatus();
//
//        var thread1 = new Thread(new DownloadFileTask(status));
//        var thread2 = new Thread(() -> {
//            while(!status.isDone()) {  // A more efficient way of handling thread communication, put to sleep this thread until other thread change it and wakes it up.. But anyway it is better to
//                // not use the wait and notify approach this days, because it can become tricky and cause many weird bugs, there are safer and simpler ways of doing this now
//                synchronized (status) {
//                    try {
//                        status.wait();
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//            }
//            System.out.println(status.getTotalBytes());
//        });
//        thread1.start();
//        thread2.start();

        // 4. Atomic objects
//        var status = new DownloadStatus();
//
//        List<Thread> threads = new ArrayList<>();
//
//        for (var i = 0; i < 10; i++) {
//            var thread = new Thread(new DownloadFileTask(status));
//            thread.start();
//            threads.add(thread);
//        }
//
//        for (var thread : threads) {
//            try {
//                thread.join();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//
//        System.out.println(status.getTotalBytes());

        // 5. Adders
//        var status = new DownloadStatus();
//
//        List<Thread> threads = new ArrayList<>();
//
//        for (var i = 0; i < 10; i++) {
//            var thread = new Thread(new DownloadFileTask(status));
//            thread.start();
//            threads.add(thread);
//        }
//
//        for (var thread : threads) {
//            try {
//                thread.join();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//
//        System.out.println(status.getTotalBytes());

        // Sometimes we have to share a collection between many threads, in order to da that we can apply the following approaches
        // 1. Synchronized collections
        Collection<Integer> collection = Collections.synchronizedCollection(new ArrayList<>());

        var thread1 = new Thread(() -> {
            collection.addAll(Arrays.asList(1, 2, 3, 4, 5));
        });

        var thread2 = new Thread(() -> {
            collection.addAll(Arrays.asList(6, 7, 8, 9, 10));
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(collection);

        // 2. concurrent collections
        Map<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "a");
        map.get(1);
        map.remove(1);
    }
}
