package org.example.advanced_topics.executors;

public class Main {
    public static void main(String[] args) {
        // EFDemo.show();

        var service = new MailService();
        service.sendAsync();
        System.out.println("Hello World!");

        CompletableFuturesDemo.show();
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
