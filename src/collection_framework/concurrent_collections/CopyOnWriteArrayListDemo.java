package collection_framework.concurrent_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    static CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();

    public static void main(String[] args) {
        list.add("John");
        list.add("Rohn");
        list.add("Harry");
        list.add("Potter");

        Iterator itr = list.iterator();

        while(itr.hasNext()) {
            String name = (String) itr.next();
            if (name == "Harry") {
                itr.remove(); // CANNOT REMOVE
            }
        }
        System.out.println("List is "+list);

    }
}
