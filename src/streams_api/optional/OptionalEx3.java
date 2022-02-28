package streams_api.optional;

import java.util.Optional;

public class OptionalEx3 {
    public static void main(String[] args) {
        //isPresent()
        Optional<String> opt = Optional.ofNullable("Hello");
        System.out.println(opt.isPresent());
        Optional<String> opt2 = Optional.ofNullable(null);
        System.out.println(opt2.isPresent());

                Optional.ofNullable("hello").ifPresent(i -> System.out.println(i));
    }
}
