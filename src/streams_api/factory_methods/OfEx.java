package streams_api.factory_methods;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class OfEx {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("A", "B", "C");
        stream.forEach(System.out::println);

        // iterate & generate can create infinite streams
        Stream.iterate(1, x -> x*2).
                limit(10).forEach(System.out::println);

        Supplier<Integer> integerSupplier = new Random()::nextInt;
        Stream.generate(integerSupplier)
                .limit(5)
                .forEach(System.out::println);
    }
}
