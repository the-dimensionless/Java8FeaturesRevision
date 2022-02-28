package streams_api.parallel_streams;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class Ex {
    public static void main(String[] args) {
        System.out.println("Sequential sum : " + IntStream.rangeClosed(1, 100000).sum());
        System.out.println("Parallel sum : " + IntStream.rangeClosed(1, 100000).parallel().sum());

        System.out.println(Runtime.getRuntime().availableProcessors());
    }
}
