package collection_framework.concurrent_collections;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CHashMapDemo extends Thread {
    static ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<Integer, String>();

    public static void main(String[] args) {
        CHashMapDemo childThread = new CHashMapDemo();
        map.put(1, "John");
        map.put(2, "Rohn");
        map.put(3, "Tom");
        map.put(4, "Shiva");

        Iterator<Map.Entry<Integer, String>> itr = map.entrySet().iterator();
        childThread.start();

        while(itr.hasNext()) {
            Map.Entry entry = itr.next();
            System.out.println(String.format("Key is %d and value is %s", entry.getKey(), entry.getValue()));
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
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        map.put(5, "Ganesh");
        map.put(6, "Hanuman");

    }
}
