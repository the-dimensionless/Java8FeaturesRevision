package streams_api.numeric_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BoxUnBoxEx {
    public static void main(String[] args) {
        boxing();
        unBoxing(Arrays.asList(1,2,3,4,5));
    }

    public static int unBoxing(List<Integer> list) {
        // Wrapper to primitive
        return list.stream().mapToInt(Integer :: intValue).sum();
    }

    public static void boxing() {
        List<Integer> collect = IntStream.rangeClosed(1, 10)
                // int types
                .boxed()
                // Integer types
                .collect(Collectors.toList());
        System.out.println(collect + " " + collect.getClass());
    }
}
