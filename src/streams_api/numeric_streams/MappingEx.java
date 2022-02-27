package streams_api.numeric_streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MappingEx {
    public static void main(String[] args) {
        IntStream s = IntStream.rangeClosed(1, 10);
        List<Integer> obj =  s.mapToObj((i) -> i*i).collect(Collectors.toList());
        System.out.println("Object is " + obj);

        IntStream s1 = IntStream.rangeClosed(1, 10);
        s1.mapToLong(i -> i).forEach(i -> System.out.println(i));

    }
}
