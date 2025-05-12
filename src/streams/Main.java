package streams;

import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> strings = List.of("one", "two", "three", "four");

        List<Integer> list = strings
                .stream()
                .map(String::length)
                        .toList();

        System.out.println("Done processing");
        System.out.println(list);

        long count = strings
                .stream()
                .filter(str -> str.length() > 3)
                .count();
        System.out.println("count: " + count);
    }
}
