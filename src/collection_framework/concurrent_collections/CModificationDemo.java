package collection_framework.concurrent_collections;

import java.util.ArrayList;
import java.util.Iterator;

public class CModificationDemo extends Thread {
    // ConcurrentModificationException thrown when 2 threads access same object
    // by default locking whole object

    private static ArrayList<String> list = new ArrayList<String>();

    public static void main(String[] args) {
        CModificationDemo childThread = new CModificationDemo();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        Iterator itr = list.iterator();
        childThread.start();

        while (itr.hasNext()) {
            String name = (String) itr.next();
            System.out.println("Main Thread iterating => "+name);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void run() {
        try {
            Thread.sleep(100);
        } catch (Exception e) {
            e.printStackTrace();
        }
        list.add("E");
        list.add("F");
    }
}
