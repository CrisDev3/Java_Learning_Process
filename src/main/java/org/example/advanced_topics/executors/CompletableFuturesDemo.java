package org.example.advanced_topics.executors;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

public class CompletableFuturesDemo {

    public static void show() {
//        Supplier<Integer> task = () -> 1;
//        var future = CompletableFuture.supplyAsync(task);
//        try {
//            var result = future.get();
//            System.out.println(result);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        } catch (ExecutionException e) {
//            throw new RuntimeException(e);
//        }

        // Running code on completion
//        var future = CompletableFuture.supplyAsync(() -> 1);
//        future.thenAcceptAsync(result -> {
//            System.out.println(Thread.currentThread().getName());
//            System.out.println(result);
//        });
//
//        try {
//            Thread.sleep(7000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        // Handling exceptions
//        var future = CompletableFuture.supplyAsync(() -> {
//            System.out.println("Getting the current weather");
//            throw new IllegalStateException();
//        });
//
//        try {
//            var temperature = future.exceptionally(ex -> "33°C").get();
//            System.out.println("The temperature is: " + temperature);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        } catch (ExecutionException e) {
//            e.getCause();
//            e.printStackTrace();
//        }

        // Transforming a completable future
//        var future = CompletableFuture.supplyAsync(() -> 20);
//        future
//                .thenApply(CompletableFuturesDemo::toFahrenheit)
//                .thenAccept(result -> System.out.println("Temperature = " + result + "° Fahrenheit"));

        // Composing completable futures
        // id -> email
        // email -> playlist
//        getUserEmailAsync()
//                .thenCompose(CompletableFuturesDemo::getPlaylistAsync)
//                .thenAccept(System.out::println);

        // Combining completable futures
        // For example we want to call a remote service to get the price of a produce, and that going to  returns the price in US dollars
        // first task:  20 USD
        // second task: 0.9 -> exchange rate between dollars and euros
        // We don´t want to call the second service upon completion of the first task, we want to stat this tasks concurrently and then wait for both of them to complete
        // in orden to calculate the result

//        var firstTask = CompletableFuture
//                .supplyAsync(() -> "20USD")
//                .thenApply(str -> {
//                    var price = str.replace("USD", "");
//                    return Integer.parseInt(price);
//                });
//        var secondTask = CompletableFuture.supplyAsync(() -> 0.9 );
//
//        firstTask
//                .thenCombine(secondTask, (price, ExchangeRate) -> price * ExchangeRate)
//                .thenAccept(System.out::println);

        // Waiting for many tasks to complete
        // Three completable futures to represent three asynchronous tasks
//        var first = CompletableFuture.supplyAsync(() -> 1);
//        var second = CompletableFuture.supplyAsync(() -> 2);
//        var third = CompletableFuture.supplyAsync(() -> 3);
//
//        var all = CompletableFuture.allOf(first, second, third);
//        try {
//            var firstResult = first.get();
//            var secondResult = second.get();
//            var thirdResult = third.get();
//            System.out.println(firstResult);
//            System.out.println(secondResult);
//            System.out.println(thirdResult);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        } catch (ExecutionException e) {
//            throw new RuntimeException(e);
//        }
//        all.thenRun(() -> System.out.println("All tasks completed successfully"));

        // Waiting for the first task
        // Let´s say there are two ways to get the current weather in a given city, perhaps we have two different remote services, sometimes one of these services response a little bit slower. So we want to call these
        // services concurrently and as soon as we get a response, we're going to display to the user. to do that we use the anyOf() method.
//        var first = CompletableFuture.supplyAsync(() -> {
//            LongTask.simulate();
//            return 20;
//        });
//
//        var second = CompletableFuture.supplyAsync(() -> 20);
//
//        CompletableFuture.anyOf(first, second)
//                .thenAccept(System.out::println);

        // Handling timeouts
        // When we are calling remote services we want to have a limit in terms of how long we're willing to wait to get a response. We don't want to wait forever
        // To do that we use the completeOnTimeout() and orTimeout() methods, the first one require a default value to return, the second one throws an exception after the timeout is terminated
        var future = CompletableFuture.supplyAsync(() -> {
            LongTask.simulate();
            return 1;
                });

        try {
            var result = future
                    .completeOnTimeout(1, 3, TimeUnit.SECONDS)
                    .get();
            System.out.println(result);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    public static int toFahrenheit(int celsius) {
        return (int) (celsius * 1.8) + 32;
    }

    public static CompletableFuture<String> getUserEmailAsync() {
        return CompletableFuture.supplyAsync(() -> "email.com");
    }

    public static CompletableFuture<String> getPlaylistAsync(String email) {
        return CompletableFuture.supplyAsync(() -> "Worship songs playlist");
    }
}
