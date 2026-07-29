package org.example.advanced_topics.executors;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
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
        // For example we want to calla a remote service to get the price of a produce, and that going to  returns the price in US dollars
        // first task:  20 USD
        // second task: 0.9 -> exchange rate between dollars and euros
        // We don´t want to call the second service upon completion of the first task, we want to stat this task concurrently and then wait for both of them to complete
        // in orden to calculate the result

        var firstTask = CompletableFuture
                .supplyAsync(() -> "20USD")
                .thenApply(str -> {
                    var price = str.replace("USD", "");
                    return Integer.parseInt(price);
                });
        var secondTask = CompletableFuture.supplyAsync(() -> 0.9 );

        firstTask
                .thenCombine(secondTask, (price, ExchangeRate) -> price * ExchangeRate)
                .thenAccept(System.out::println);
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
