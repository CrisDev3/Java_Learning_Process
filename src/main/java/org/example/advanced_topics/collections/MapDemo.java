package org.example.advanced_topics.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo {
    public static void show() {
        // Different names for maps in different programing languages
        // Java: Maps
        // C#: Dictionary
        // Python: Dictionary
        // Javascript: Objects

        var c1 = new Customer("Cristel", "crs11@jiri.com");
        var c2 = new Customer("Jhonathan", "jhon11@jiri.com");
        var c3 = new Customer("Petronila", "petronila@jiri.com");

        Map<String, Customer> map = new HashMap<>();
        map.put(c1.getEmail(), c1);
        map.put(c2.getEmail(), c2);
        map.put(c3.getEmail(), c3);

        var customer = map.get("crs11@jiri.com");
        System.out.println(customer);

        var unknown = new Customer("Unknown", "");
        var customer2 = map.getOrDefault("e10", unknown);
        System.out.println(customer2);

        // Different methods

        //contains method
        var exists = map.containsKey("e10");
        System.out.println(exists);

        // replace method
        map.replace("crs11@jiri.com", new Customer("C++", "crs11@jiri.com"));
        System.out.println(map);

        // Different methods to iterate across a map

        // Iterate across its key
        for (var key : map.keySet())
            System.out.println(key);

        // Iterate across its values
        for (var custom : map.values())
            System.out.println(custom);

        // EntrySet method, it returns a set that is iterable
        for (var enty : map.entrySet())
            System.out.println(enty);
    }
}
