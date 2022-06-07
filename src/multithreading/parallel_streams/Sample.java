package multithreading.parallel_streams;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class Sample {

    public static void demoBasic(List<Integer> integers) {
        // find total of double of even numbers
        // functional style -> functional composition
        System.out.println(
                integers.stream()
                        .filter(e -> e%2 == 0)
                        .mapToInt(e -> e*2)
                        .sum()
        );
    }

    public static boolean sleep(int number) {
        try {
            Thread.sleep(number);
            return true;
        } catch (InterruptedException ex) {
            return false;
        }
    }

    public static int transform(int number) {
        System.out.println("t: "+number+" & thread "+Thread.currentThread());
        sleep(1000);
        return number + 1;
    }

    public static void sequentialRun(List<Integer> integers) {
        // sequential execution
        // structure of code different from concurrent code
        integers.stream()
                .map(e -> transform(e))
                .forEach(System.out::println);
    }

    public static void parallelRun(List<Integer> integers) {
        // parallel execution
        integers.parallelStream()
                .map(e -> transform(e))
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9 , 10);
        // demoBasic(integers);
        // sequentialRun(integers);
        // parallelRun(integers);

//        integers.parallelStream()
//                .map(e -> transform(e))
//                .forEachOrdered(System.out::println);

//        integers.parallelStream()
//                .filter(e -> check(e))
//                .forEachOrdered(e -> {});

//        integers
//                .parallelStream()
//                .reduce(0, (total, e) -> add(e, total));
        // cannot use any value instead of 0: identity value needed

        System.out.println(String.format(
                "Number of Processors: %d"
        ,Runtime.getRuntime().availableProcessors()));
        System.out.println(ForkJoinPool.commonPool());


        List<Integer> numbers =
                Arrays.asList(
                        1, 2, 3, 4, 5, 6, 7, 8, 9 , 10,
                        11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

        numbers.parallelStream()
                .map(e -> transform(e))
                .forEach(e -> {});



    }

    public static int add(int a, int b) {
        int result = a + b;
        System.out.println("A = "+a+" B = "+b + " result "+ result +
                " & "+Thread.currentThread());
        return result;
    }

    public static boolean check(int number) {
        System.out.println("c: "+number+ " & "+Thread.currentThread());
        sleep(1000);
        return true;
    }
}
