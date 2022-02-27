package streams_api.numeric_streams;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class AggregateEx {
    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1, 10).sum();
        System.out.println("Sum is "+sum);

        OptionalInt optionalInt
                = IntStream.rangeClosed(1,7).max();
        System.out.println("max is " +
                (optionalInt.isPresent() ? optionalInt.getAsInt()
                        : 0));

        OptionalDouble avg =  IntStream.rangeClosed(1, 10).average();
        System.out.println("avg is " + avg.getAsDouble());
    }
}
