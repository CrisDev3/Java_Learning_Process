package org.example.advanced_topics.executors.best_price_finder_project;

import java.time.Duration;
import java.time.LocalTime;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        var start = LocalTime.now();

        var flight = new FlightService();
        var futures = flight.getQuotes()
                .map(future -> future.thenAccept((System.out::println)))
                .collect(Collectors.toList());

        CompletableFuture.allOf(futures.toArray(new CompletableFuture[0]))
                .thenRun(() -> {
                    var end = LocalTime.now();
                    var duration = Duration.between(start, end);
                    System.out.println("Retrived all quotes in " + duration + " msec.");
                });

        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
