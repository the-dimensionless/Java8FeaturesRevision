package multithreading;

import java.util.concurrent.*;

public class CompletableFutureEx {

    public static CompletableFuture<Integer> create() {
        return CompletableFuture.supplyAsync(() -> 2);
    }

    public static void main(String[] args) {
        create()
                .thenAccept(data -> System.out.println(data))
                .thenRun(() -> System.out.println("Never dies"))
                .thenRun(() -> System.out.println("Really, Never dies"));




//        CompletableFuture<Void> future1 = future.
//                thenAccept(data -> System.out.println(data));

        // Famous functional interfaces
        // Supplier<T> T get()
        // Predicate<T> boolean test()
        // Function<T, R> R apply(T)
        // Consumer<T> void accept(T)

    }
}
