package collection_framework.concurrent_collections;

import java.util.concurrent.ConcurrentHashMap;

public class CHashMapEx {
    // implements ConcurrentMap interface
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> hm = new ConcurrentHashMap<Integer, String>();
        // normal put methods
        hm.put(0, "Basics");
        hm.put(1, "Strong");
        hm.put(0, "Else"); // overwrites existing key value pair
        hm.remove(1);

        // New methods
        hm.putIfAbsent(0, "If"); // wont change
        hm.put(1, "Strong");
        hm.remove(1, "Hello"); // checks both key and value for removal (here wont delete entry 1)

        hm.replace(0, "Else", "Tech");

        String previousValue = hm.replace(0, "Tech2"); // returns old value
        hm.replace(10, "Tech2"); // does nothing
        System.out.println(hm);
        System.out.println("Old value for 0 "+previousValue);

    }
}
