package streams_api.numeric_streams;

import java.util.stream.IntStream;

public class RangesEx {
    public static void main(String[] args) {
        IntStream stream = IntStream.range(1, 10);
        System.out.println(stream.count());

        IntStream s1 = IntStream.rangeClosed(1, 10);
        System.out.println(s1.count());


        IntStream.range(1, 10).asDoubleStream().forEach(val -> {
            System.out.println(val);
        });
    }
}
