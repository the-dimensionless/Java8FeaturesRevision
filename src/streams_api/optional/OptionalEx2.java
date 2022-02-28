package streams_api.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalEx2 {
    public static void main(String[] args) {
        // orElse (accepts actual string)
        System.out.println(Optional.ofNullable("Hello")
                .map(i -> i)
                .orElse("Default"));
        System.out.println(Optional.ofNullable(null)
                .map(i -> i)
                .orElse("Default"));

        // orElseGet (accepts a supplier)
        System.out.println(Optional.ofNullable("Hello")
                .map(i -> i)
                .orElseGet(() -> "DEfault"));
        System.out.println(Optional.ofNullable(null)
                .map(i -> i)
                .orElseGet(() -> "DEfault"));

        // orElseGetThrow
        System.out.println(Optional.ofNullable("EHllo")
                .map(i -> i)
                .orElseThrow());

        System.out.println(Optional.ofNullable(null)
                .map(i -> i)
                .orElseThrow(() ->
                        new RuntimeException("No data available")));
    }
}
