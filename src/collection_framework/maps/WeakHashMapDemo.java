package collection_framework.maps;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String[] args) throws InterruptedException {
       HashMap hm = new HashMap();
       WeakHashMap whm = new WeakHashMap();

       Temp t = new Temp();
       hm.put(t, "element");
       System.out.println("HashMap "+hm);

        t = null;
        System.gc();
        Thread.sleep(3000);
        System.out.println("HashMap "+hm);

        Temp t2 = new Temp();
        whm.put(t2, "element");
        System.out.println("WeakHashMap "+whm);

        t2 = null;
        System.gc();
        Thread.sleep(3000);
        System.out.println("WeakHashMap "+whm);
    }
}

class Temp {
    public String toString() {
        return "temp";
    }

    public void finalize() {
        System.out.println("Finalize method");
    }
}