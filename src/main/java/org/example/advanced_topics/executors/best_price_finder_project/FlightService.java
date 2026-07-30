package org.example.advanced_topics.executors.best_price_finder_project;

import org.example.advanced_topics.executors.LongTask;

import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class FlightService {
    public CompletableFuture<Quote> getQuote(String siteName) {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("Getting a quote from " + siteName);
            var random = new Random();

            LongTask.simulate(1_000 + random.nextInt(2_000));

            var price = 5_0000 + random.nextDouble(10.0);

            return new Quote(siteName, price);
        });
    }

    public Stream<CompletableFuture<Quote>> getQuotes() {
        var sites = List.of("Despegar.com", "Trivago.com", "PaginasAmarillas.com");
        return sites.stream().map(this::getQuote);
    }
}
