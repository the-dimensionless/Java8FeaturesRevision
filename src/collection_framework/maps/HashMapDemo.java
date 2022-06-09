package collection_framework.maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap();
        // default size is 16, loadFactor is 0.75 same as HashSet

        Map map = new HashMap(20); // initial Capacity

        HashMap newMap = new HashMap(map); // map from map


        hm.put("John", 1);
        hm.put("Redmaine", 2);
        hm.put("Eddie", 3);
        hm.put("English", 4);
        hm.put("Science", 4);
        System.out.println(hm);
    }
}
