package org.example.advanced_topics.collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
    public static void show() {
        Queue<String> queue = new ArrayDeque<>();
        queue.add("A");
        queue.add("B");
        queue.add("C");
        queue.offer("D");
        var front = queue.peek(); // It returns the element at the front of the queue, if the queue is empty it returns null
        System.out.println(front);

        var element = queue.element(); // It works similar to the peek method, but if the queue is empty it returns a exception
        System.out.println(element);

        var removed = queue.remove(); // It removes the first item of the queue and returns it, if the queue is empty it returns an exception
        System.out.println(removed);

        System.out.println(queue);

        // var removed = queue.poll(); // This method works similar to the remove method, but if the queue is empty it returns null,
    }
}
