import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //Q1
        List<String> names = Stream.of("aBc", "d", "ef")
                .map(String::toUpperCase)
                .toList();
        System.out.println("Converting the given strings to UpperCase:");
        System.out.println(names);


        //Q2
        System.out.println("List of Non-Empty String:");
        List<String> listStrings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        listStrings.stream().
                filter(i -> !i.isEmpty()).
                forEach(System.out::println);


        //Q3
        List<String> list = Arrays.asList("Shankar", "Ajay", "Peter", "John", "Aadhi", "Allen", "Zack", "Mick", "Sid", "Albert");
        list.stream()
                .filter(i -> i.startsWith("A"))
                .forEach(System.out::println);




    }
}