package org.example.advanced_topics.executors;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class EFDemo {
    public static void show() {
        // Executors Demo
        // We don´t have to explicitly create threads, the thread pool does that implicitly
        // The executor maantain a queue, every task that was submitted, goes in this queue and waits for an available thread to be executed

//        var executor = Executors.newFixedThreadPool(5);
//
//        try {
//            for (var i = 0; i < 10; i++)
//                executor.submit(() -> System.out.println(Thread.currentThread().getName()));
//        }
//        finally {
//
//            // The executor doesn´t shutdown the threads implicitly, it waits in the background for new tasks, we have to explicitly shutdown the executors, we do that with the shutdown() and shutdownNow() methods
//            // The difference between them is that the shutdown() method waits until all the current assigned tasks  gets executed and then shutdowns, in contrast the shutdownNow() method terminates the
//            // threads at that moment no matter if there are more tasks waiting to get executed.
//            // If an exception is thrown before the shutdown method gets called and executed, we are not going to be able to shut down our threads. to prevent that it is a best practice to run this
//            // inside a try finally block. With this we ensure that not matter what we always shut down the executor.
//            executor.shutdown();

        // Callables and futures
        // The following code is synchronous, that means that it is blocking
        var executor = Executors.newFixedThreadPool(5);

        try {
            var future = executor.submit(() ->{
                LongTask.simulate();
                return 1;
            });

            System.out.println("Do more work");
            try {
                var result = future.get();
                System.out.println(result);
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        }
        finally {
            executor.shutdown();
        }

        // To solve the blocking problem we use Asynchronous programming or non-blocking programming using completable futures
        // The reason for its name is that with this we can explicitly complete a future object.
    }
}
