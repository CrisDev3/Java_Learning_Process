package org.example.advanced_topics.lambda_and_functional_interfaces;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class LambdasDemo {

    public LambdasDemo(String message) {
    }

    // Static method
    public static void printStatic(String message) {
        System.out.println(message);
    }

    public void InstancePrint(String message) {}

    public static void show() {
        DecimalFormat df = new DecimalFormat("0.00");
//        // Anonymous inner class -> Lambda expresions are a better way to reach the same goal that we reach with anonymous inner classes
//        greet(new Printer() {
//            @Override
//            public void print(String message) {
//                System.out.println(message);
//            }
//        });
//
//        // Lambda expretion
//        String prefix = "_";
//        greet(message -> System.out.println(prefix + message));
//
//
//        // In the case where we just want to reference a method directly, we use method references
//        // With method references we can use references to constructors, instance and static methods
//        // Syntax: Class/Object::method without parenthesis
//        greet(System.out::println); // This code does the same as the lambda expretion above
//        // Static method reference
//        greet(message -> LambdasDemo.printStatic(message));
//        greet(LambdasDemo::printStatic);
//        // Instance method reference
//        var demo = new LambdasDemo();
//        greet(message -> demo.InstancePrint(message)); //Using a lambda expretion
//        greet(demo::InstancePrint);; // Using a method reference
//        // Passing a value to a constructor
//        greet(message -> new LambdasDemo(message)); // Using a lambda expretion
//        greet(LambdasDemo::new); // method reference

        // The Java´s pre-build in consumer interface}
//        List<Integer> list = List.of(1, 2, 3);
//
//        // Two ways to iterate through a list
//        // Imperative programming -> Implementing logic by instructions (for, if/else, switch/case)
//        for (var item : list) {
//            System.out.println(item);
//        };
//        // Declarative programming
//        list.forEach(item -> System.out.println(item));

        // Chaining consumers
//        List<String> list = List.of("a", "b", "c");
//        Consumer<String> print = item -> System.out.println(item);
//        Consumer<String> printUpperCase = item -> System.out.println(item.toUpperCase());
//
//        list.forEach(print.andThen(printUpperCase).andThen(print));

        // The supplier interface
//
//        // As the consumer interface, the supplier interface also has primitive types implementations like, DoubleSupplier, IntegerSupplier, LongSupplier etc. And also the default implementation Supplier<T>
//        DoubleSupplier getRandom = () -> Double.parseDouble(df.format(Math.random() * 100));
//        var random = getRandom.getAsDouble();
//        System.out.println(random);

        // The function interface
//        Function<String, Integer> map = str -> str.length();
//        var length = map.apply("Jijiriji");
//        System.out.println(length);
//
//        // Composing Functions
//        // "key:value"
//        // first: "key=value"
//        // second: "{key=value}"
//
//        Function<String,String> replaceColon = str -> str.replace(":", "=");
//        Function<String, String> wrapString = str -> "{" + str + "}";
//
//        // There are two ways to compose Functions
//        // 1. Declarative programming with compose
//        var result = wrapString
//                        .compose(replaceColon)
//                        .apply("key:value");
//        System.out.println(result);
//
//        // 2. andThen method
//        var result2 = replaceColon
//                .andThen(wrapString)
//                .apply("key:value");
//        System.out.println(result2);}

        // The predicate interface -> Used to check for conditions
        // Let´s say that we want to check if a String has more than 5 characters
//        Predicate<String> isLongerThan5 = str -> str.length() > 5;
//        var result = isLongerThan5.test("ji");
//        System.out.println(result);

        // Combining predicates, in order of making more complex predicates, the Predicate interface provides multiple methods that act as logical operators like, and(), or(), negate()
//        Predicate<String> hasLeftBrace = str -> str.startsWith("{");
//        Predicate<String> hasRightBrace = str -> str.endsWith("}");
//        Predicate<String> hasLeftAndRightBraces = hasLeftBrace.and(hasRightBrace);
//        var result = hasLeftAndRightBraces.test("{test}");
//        System.out.println("The String has left and right braces?: " + result);

        // The BinaryOperator interface
        // a, b -> a + b -> square root
//        BinaryOperator<Integer> add = (a, b) -> a + b;
//        Function<Integer, Double> squareRoot = integer -> Double.parseDouble(df.format(Math.sqrt(integer)));
//        var rootNumber = add.andThen(squareRoot).apply(10, 400);
//        System.out.println(rootNumber);
//
//        // a, b -> a + b -> square
//        Function<Integer, Integer> square = a -> a * a;
//        var squaredNumber = add.andThen(square).apply(10, 400);
//        System.out.println(squaredNumber);
//
//        var result = add.apply(10, 550);
//        System.out.println(result);

        // The UnaryOperator interface
        UnaryOperator<Integer> square = n -> n * n;
        UnaryOperator<Integer> increment = n -> n + 1;
        var result = square.andThen(increment).apply(100);
        System.out.println(result);
    }

    public static void greet(Printer printer) {
        printer.print("How´s everithing");
    }
}