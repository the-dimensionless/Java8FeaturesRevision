package streams_api.optional;

import data.StudentDatabase;

import java.util.Optional;

public class OptionalEx {
    public static void main(String[] args) {

        Optional<String> op = Optional.ofNullable("Hello");
        System.out.println(op.isPresent() + " " +op.get());
        System.out.println(Optional.ofNullable(null));

        System.out.println(Optional.of("Hello")); // use when sure that null wont occur
        // System.out.println(Optional.of(null));

        System.out.println(Optional.empty());

    }
}
