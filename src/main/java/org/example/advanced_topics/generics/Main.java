package org.example.advanced_topics.generics;

public class Main {
    public static void main(String[] args) {
        // The poor solution without generics
//        var list = new List();
//        list.add(1);
//        list.add("jirji");
//        list.add(new User());

//        var list = new GenericList<User>();
//        list.add(new User());
//
//        User user = list.get(0);

//        var integers = new GenericList<Integer>();
//        integers.add(3); // This process is called boxing: The compiler wrap the primitivy type in an object
//        int number = integers.get(1); // Unboxing

        // Compare 2 User objects
        var user1 = new User(3);
        var user2 = new User(3);
        if (user1.compareTo(user2) == 0)
            System.out.println("Same user");
        else if (user1.compareTo(user2) == -1)
            System.out.println("user1 < user2");
        else
            System.out.println("user1 > user2");

        // Comparing objects
        System.out.println(Utils.maximum(1, 2));
        System.out.println(Utils.maximum(user1, user2));

        Utils.print(1, "Cris", false);

        // Generic classes and inheritance
        User user = new Instructor(10);
        Utils.printUser(new Instructor(20));

        // this code has a problem, a genericList of Instructors is not a subtype of genericList of Users
//     var users = new GenericList<Instructor>();
//     Utils.printUserList(users);

        // Solution using wildcards, using this approach we can pass any type of genericList to the method.
        var instructors = new GenericList<Instructor>();
        var users = new GenericList<User>();
        //Utils.printUserList(instructors);
        //Utils.printUserList(new GenericList<Instructor>()); // In this particular case, the GenericList has a constraint with the User class, so it only admits User objects or its subtypes
    }

}
