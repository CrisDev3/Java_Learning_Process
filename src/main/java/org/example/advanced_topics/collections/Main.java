package org.example.advanced_topics.collections;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // the iterrator interface
        // Traditional Iterator approach
        var list = new GenericList<String>();
        list.add("one");
        list.add("two");
//        var iterator = list.iterator();
//        while(iterator.hasNext()){
//            var current = iterator.next();
//            System.out.println(current);
//        }

        // Modern approach -> foreach, in fact the foreach loop is just a syntactical sugar
        // Behind the scene the compiler executes the iterable object
        for (var item : list) {
            System.out.println(item);
        }

        // The collection interface: It provides subclasses the essential core methods that every collection should has, like add, remove, etc.
        CollectionsDemo.show();


        // The comparable interface
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("John", "e3"));
        customers.add(new Customer("Cris", "e2"));
        customers.add(new Customer("Fernando", "e1"));
        Collections.sort(customers);
        System.out.println(customers);

        // The comparat or interface
        Collections.sort(customers, new EmailComparator());
        System.out.println(customers);

        // The Queue interface
        QueueDemo.show();

        // The Set interface
        SetDemo.show();

        // The map interface
        MapDemo.show();
    }
}
