package functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.*;

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        Square square = (x) -> x*x;
        System.out.println(square.calculate(10));

        List<String> list = Arrays.asList(
                "Hello",
                "Hi",
                "World"
        );

        // Predicate functional interface
        // has .test() method
        // use to test a condition
        // used in filter() method
        Predicate<String> p = str -> str.startsWith("H");

        for (String s: list) {
            System.out.println(p.test(s));
        }

        System.out.println("*".repeat(20));

        // Supplier functional interface
        // has generic implementation
        // does not take an argument and returns an object
        Supplier<String> supplier = () -> "Hello World!";
        System.out.println(supplier.get());

        Random random = new Random(314L);

        // Specialized Supplier for Integer type
        // We have three more - BooleanSupplier, LongSupplier and DoubleSupplier
        IntSupplier newRandom = random::nextInt;

        for (int i=0; i<5; i++) {
            System.out.println(newRandom.getAsInt());
        }

        System.out.println("*".repeat(20));

        // Consumer functional interface
        // takes an argument and returns nothing
        // used in forEach() method
        Consumer<Integer> consumer = str1 -> System.out.println(str1);

        // Specialized consumer
        IntConsumer consumer1 = System.out::println;

        for (int i=0; i<5; i++) {
            consumer.accept(random.nextInt());
            consumer1.accept(random.nextInt());
        }

        System.out.println("*".repeat(20));

        // Function interface
        // takes object of one type and transforms it to object of another type
        // used in map() method
        Function<String, Integer> func = String::length;
        String hello = "hello";
        System.out.println(func.apply(hello));
    }
}
