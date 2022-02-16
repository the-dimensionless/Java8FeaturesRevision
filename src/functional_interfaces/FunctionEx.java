package functional_interfaces;

import java.util.function.Function;

public class FunctionEx {
    static Function<String, String> f1 = (name) -> name.toUpperCase();
    static Function<String, String> f2 = (name) -> name.toUpperCase().concat("default");

    public static void main(String[] args) {
        System.out.println("Result is "+ f1.apply("Java 8 "));
        System.out.println("Result is "+ f1.andThen(f2).apply("Java 8 ")); // in the order mentioned
        System.out.println("Composed " + f1.compose(f2).apply("Java 8")); // first function inside compose() then outwards
    }
}
