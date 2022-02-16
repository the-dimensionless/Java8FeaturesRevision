package functional_interfaces;

import java.util.function.Predicate;

public class PredicateEx {
    static Predicate<Integer> isEven = (e) -> e%2 == 0;
    static Predicate<Integer> divisibleBy5 = (e) -> e%5 == 0;

    public static void predicateAnd() {
        System.out.println(isEven.and(divisibleBy5).test(10)); // predicate chaining
        System.out.println(isEven.and(divisibleBy5).test(9));
    }

    public static void predicateOR() {
        System.out.println(isEven.or(divisibleBy5).test(10)); // predicate chaining
        System.out.println(isEven.or(divisibleBy5).test(15));
        System.out.println(isEven.or(divisibleBy5).test(7));
    }

    public static void predicateNegate() {
        System.out.println(isEven.or(divisibleBy5).negate().test(10)); // predicate chaining
        System.out.println(isEven.or(divisibleBy5).negate().test(15));
        System.out.println(isEven.or(divisibleBy5).negate().test(7));
    }

    public static void main(String[] args) {
        System.out.println( isEven.test(4) + " "+ isEven.test(3));
        predicateAnd();
        predicateOR();
        predicateNegate();
    }
}
