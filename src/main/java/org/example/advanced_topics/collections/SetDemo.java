package org.example.advanced_topics.collections;

import java.util.*;

public class SetDemo {
    public static void show() {
        Set<String> set = new HashSet<>();
        set.add("Sky");
        set.add("is");
        set.add("blue");
        set.add("blue");
        System.out.println(set);

        // An approach to guarantee the uniqueness of a collection
        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection, "a", "b", "c", "e", "e");
        Set<String> set1 = new HashSet<>(collection);
        System.out.println(set1);

        // Set operations
        Set<String> set2 = new HashSet<>(Arrays.asList("a", "b", "c", "d"));

        Set<String> set3 = new HashSet<>(Arrays.asList("e", "b", "f", "a"));

        // The intersection operation: It gives us the items that are common in both sets
        set2.retainAll(set3);
        System.out.println(set2);

        // The union operation: It is used to combine two sets without any duplicates.
        set2.addAll(set3);
        System.out.println(set2);

        // The difference operation: It shows us which items are unique in the first set that we don´t have in the second set
        set2.removeAll(set3);
        System.out.println(set2);
    }
}
