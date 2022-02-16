package lambdas;

public class RunnableEx {
    public static void main(String[] args) {
        // before java 8

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1");
            }
        };

        new Thread(runnable).start();

        // using lambdas
        Runnable runnable1 = () -> {
            System.out.println("Inside Runnable 2");
        };
        new Thread(runnable1).start();

        // even simpler
        Runnable runnable2 = () -> System.out.println("Inside runnable 3");
        new Thread(runnable2).start();

        // more
        new Thread(() -> System.out.println("Inside runnable 4")).start();
    }
}
