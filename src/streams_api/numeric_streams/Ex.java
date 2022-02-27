package streams_api.numeric_streams;

import com.sun.source.doctree.SummaryTree;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Ex {

    public static int sumOfNNumbers(List<Integer> list) {
        return list.stream()
                .reduce(0, (x,y) -> x+y); //unboxing to convert Integer to int
    }

    public static int sumOfNNumbersIntStream(List<Integer> list) {
        return IntStream.rangeClosed(1, 9).sum();
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println("sUM OF N NUMBERS IS "+ sumOfNNumbers(list));
        System.out.println("sUM OF N NUMBERS IS "+ sumOfNNumbersIntStream(list));
    }
}
