package collection_framework.maps;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        IdentityHashMap<String, String> ihm = new IdentityHashMap<>();

        hm.put("First", "1");
        hm.put("Second", "2");
        hm.put("First", "3");
        System.out.println(hm);

        String s1 = new String("First");
        String s2 = new String("First");

        ihm.put(s1, "1");
        ihm.put("Second", "2");
        ihm.put(s2, "3");
        System.out.println(ihm);
    }
}
