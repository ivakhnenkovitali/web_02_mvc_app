package by._java_SE.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "world");
        List<Integer> wordLengths = words.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(wordLengths); // [5, 5]

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNumbers); //[2, 4]

        List<String> fruits = Arrays.asList("apple", "banana", "cherry");
        fruits.stream().forEach(System.out::println);
        // apple
        //banana
        //cherry
        List<Integer> numbers1 = Arrays.asList(5, 3, 8, 1, 4);
        List<Integer> numbersdddd = numbers1.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(numbersdddd);  //[1, 3, 4, 5, 8]

        List<Integer> numbersWithDuplicates = Arrays.asList(1, 2, 2, 3, 4, 4);
        List<Integer> distinctNumbers = numbersWithDuplicates.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(distinctNumbers); //[1, 2, 3, 4]

        List<Integer> firstThree = numbers.stream()
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(firstThree); //[1, 2, 3]

        List<String> collected = Stream.of("a", "b", "c")
                .collect(Collectors.toList());
        System.out.println(collected);
    }
}
