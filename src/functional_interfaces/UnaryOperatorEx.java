package functional_interfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorEx {

    static UnaryOperator<String> uop = (s) -> s.concat(" Default");

    public static void main(String[] args) {
        System.out.println(uop.apply("Java 8"));
    }
}
