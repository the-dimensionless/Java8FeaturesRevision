package collection_framework.queues;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.SortedSet;
import java.util.TreeSet;

public class PriorityQueueDemo {

    public static void main(String[] args) {
        // inserted / deleted on priority basis, order not preserved, duplicates not allowed
        // null insertion not allowed
        PriorityQueue<String> pq = new PriorityQueue<String>(); // default size 11
        //priority default natural sorting order
        PriorityQueue<String> pq2 = new PriorityQueue<String>(20);
        //PriorityQueue<String> pq3 = new PriorityQueue<String>(10, Comparator c);

        SortedSet s = new TreeSet();
        PriorityQueue<String> pq4 = new PriorityQueue<String>(s); // sortedSet

        //PriorityQueue<String> pq5= new PriorityQueue<String>(Collection c);



    }
}
