package org.example.advanced_topics.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {
    public static void show() {
        Collection<String> collection = new ArrayList<>();

        // The tedious way of adding to a collection, line by line
        collection.add("a");
        collection.add("b");
        collection.add("c");
        collection.add("d");
        for (String item : collection) {
            System.out.println(item);
        }
        System.out.println(collection);

        // A better approach to add members to a collection, using the Collection´s addAll method
        Collections.addAll(collection, "e", "f", "g", "h");
        for (String item : collection) {
            System.out.println(item);
        }

        // The size method, it is used to obtain the size of a collection.
        System.out.println("The size of this collection is: " +collection.size() + " indexes");

        // The remove method, it is used to delete a object of the collection
        collection.remove("e");
        for (String item : collection) {
            System.out.println(item);
        }

        // The clear method, it´s  used to remove every object from a collection
        // collection.clear();
        System.out.println("The size of this collection is: " + collection.size() + " indexes");

        // The isEmpty method, it´s used to check if a collection has no content
        String empty = collection.isEmpty() ? " Yes is empty" : "No, is not empty";
        System.out.println("The collection is empty: " + empty);

        // The contains method, it´s used to check for the existence of an item
        System.out.println("The collection contains the letter a: " + collection.contains("a"));

        //  The toArray method, it´s used to convert a collection to a regular array
        var stringArray = collection.toArray(new String[0]);

        //  The equals method, it´s used to compare two collections for equality
        Collection<String> other = new ArrayList<>();
        other.addAll(collection);
        System.out.println("this two collections have the same content?: " + collection.equals(other));

        // The List interface, it provides sort and indexes to the collection

    }
}
