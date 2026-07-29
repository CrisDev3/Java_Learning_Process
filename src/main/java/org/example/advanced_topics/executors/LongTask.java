package org.example.advanced_topics.executors;

public class LongTask {
    public static void simulate() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
