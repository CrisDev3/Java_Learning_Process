package org.example.advanced_topics.generics;

public class Utils {
    public static <T extends Comparable<T>> T maximum(T first, T second) {
        return  (first.compareTo(second) < 0) ? second : first;
    }

    // Multiple type parameters
    public static <K, V, Z> void print(K key, V value, Z extra) {
        System.out.println(key + " = " + value + ", extra = " + extra);
    }

    public static void printUser(User user) {
        System.out.println("user = " + user.toString());
    }

    // wildcard character (?) -> it represents an unknown type
    // To limit the types that our method can support we use the extends key word followed by the type
    // with the extemds keyword we can only read from the list, we cannot add to it
    // to add to the list we use the keyword super and we will can add ir to a variable of type object
    public static void printUserList(GenericList<? super User> users) {
        Object x = users.get(0);
        users.add(new Instructor(3));
    }
}
