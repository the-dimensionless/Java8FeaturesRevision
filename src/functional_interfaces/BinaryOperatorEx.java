package functional_interfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorEx {

    static BinaryOperator<Integer> biOp = (a, b) -> a*b;

    static Comparator<Integer> comparator = (a, b) -> a.compareTo(b);

    static BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
    static BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);


    public static void main(String[] args) {
        System.out.println(biOp.apply(2, 3));
        System.out.println(maxBy.apply(2, 3));
        System.out.println(minBy.apply(2, 3));
    }
}
