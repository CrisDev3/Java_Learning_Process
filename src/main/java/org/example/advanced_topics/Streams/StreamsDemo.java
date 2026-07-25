package org.example.advanced_topics.Streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void show() {
        List<Movie> movies = List.of(
                new Movie("b", 10),
                new Movie("b_repeated", 10),
                new Movie("a_repeated", 10),
                new Movie("c", 20),
                new Movie("c_repeated", 20),
                new Movie("a", 100)
        );

//        // Imperative programming
//        int couunt = 0;
//        for (var movie : movies) {
//            if (movie.getLikes() > 10)
//                couunt++;
//        }
//
//        // Declarative (Functional) programming
//        var count2 = movies.stream()
//                .filter(movie -> movie.getLikes() > 10)
//                .count();
//
//        // Creating streams. In Java we have different ways to create a stream, we can create them from a collection, from an array, from an arbritrary number of objects
//        // or generate infinite/ finite streams
//
//        //Collection
//        Collection<Integer> x = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        var count3 = x.stream()
//                .filter(a -> a.equals(1))
//                .count();
//
//        //Array
//        int[] numbers = {1, 2, 3, 4, 5};
//        Arrays.stream(numbers)
//                .forEach(System.out::println);
//
//        //Arbitraty number of objects
//        Stream.of(1,2,3,4,5,6,7,8,9,10)
//                .forEach(System.out::println);
//
//        // Infinite streams
//        var stream = Stream.generate(() -> Math.random() * 100); //This is lazy evaluation, the number will be generate only when we execute the function
//        stream
//                .limit(10) // In order to make an infinite stream finite, we use the limit method
//                .forEach(System.out::println);
//
//        // Another way of creating infinite streams is the iterate method
//        Stream.iterate(1, n -> n + 1)
//                .limit(20)
//                .forEach(n -> System.out.println(n));

        // Mapping elements -> there are many implementations for the map method, from the .map, to the primitive implementations like mapToint or mapToLong
//        movies.stream()
//                .map(movie -> movie.getTitle())
//                .forEach(System.out::println);
//
//        movies.stream()
//                .mapToInt(Movie::getLikes)
//                .forEach(System.out::println);
//
//        // FlatMap method -> this method also has its primitive implementations such as flatMapToDouble
//        // Without the flatMap
//        var stream = Stream.of(List.of(1, 2, 3), List.of(4, 5, 6));
//        stream.forEach(System.out::println);
//
//        // Using flatMap: Stream<List<x>> -> Stream<x>
//        stream
//                .flatMap(List::stream)
//                .forEach(System.out::println);

        //Slicing streams
        // For example if we want to paginate pages:
        //1000 movies
        // 10 movies per page
        // 3rd page
        // skip(20) = skip( (page - 1) x pageSize)
        // limit(10) = limit(pageSize)
//        movies.stream()
//                .skip(2)
//                .map(Movie::getTitle)
//                .forEach(System.out::println);

        // TakeWhile method -> Contrary to the filter method, This only takes the objects that meet the condition, at the moment an object breaks the condition the stream stop, regardless of whether other objects in the stream meet the condition
//        movies.stream()
//                .takeWhile(m -> m.getLikes() < 30)
//                .forEach(m -> System.out.println(m.getTitle()));
//
//        // DropWhile method -> This is the oposite of the takeWhile method, it will escape all the elements that match the condition and take the rest
//        movies.stream()
//                .dropWhile(m -> m.getLikes() == 10)
//                .forEach(m -> System.out.println(m.getTitle()));

        // Sorting streams
//        movies.stream()
//                // .sorted((a, b) -> a.getTitle().compareTo(b.getTitle()))
//                .sorted(Comparator.comparing(Movie::getTitle)) // Ascending sort order
//                .forEach(m -> System.out.println(m.getTitle()));
//
//        movies.stream()
//                .sorted(Comparator.comparing(Movie::getTitle).reversed()) // Reversed sort order
//                .forEach(m -> System.out.println(m.getTitle()));

        // Getting unique elements -> To accomplish that we use the distinct() method
//        movies.stream()
//                .map(Movie::getLikes)
//                .distinct()
//                .forEach(System.out::println);

        // The peek method, useful for troubleshooting problems
//        movies.stream()
//                .filter(movie -> movie.getLikes() > 10)
//                .peek(movie -> System.out.println("filtered: " + movie.getTitle()))
//                .map(Movie::getTitle)
//                .peek(t -> System.out.println("mapped: " + t))
//                .forEach(System.out::println);

        // simple reducers -> all this methods are terminal methods
        //count() -> Returns the number of elements in a stream as a primitive long value
        // anyMaatch() -> tell us if any element in the stream satisfies a condition
        // allMatch() -> tell us if all the elements in the stream satisfies a condition
        // noneMatch() -> tell us if none of the elements in the stream satisfies a condition
        // findFirst() -> Returns the first element in the stream
        // findAny() -> Returns any elements in t he stream
        // max() and min() -> Return the max or min element in the stream
//        movies.stream()
//                .count();

        
    }
}
