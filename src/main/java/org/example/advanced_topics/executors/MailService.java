package org.example.advanced_topics.executors;

import java.util.concurrent.CompletableFuture;

public class MailService {
    public void send() {
        LongTask.simulate();
        System.out.println("Message was send.");
    }

    // In order to make a method asynchronous we have to wrapped it in a completableFuture object
    public CompletableFuture<Void> sendAsync() {
        return CompletableFuture.runAsync(() -> send());
    }
}
