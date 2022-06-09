Collection(I) > Queue (I) >

1. Dequeue(I) > LinkedList (C) (1.5v)
2. PriorityQueue(int initialCapacity)
3. BlockingQueue > PriorityBlockingQueue, LinkedBlockingQueue

* add(E e) => add elements to tail,
* offer(E e) => add elements to tail, 
* remove() => removes the element and returns head of queue,
    throws NoSuchElementException if Queue is empty
* poll() => removes the element and returns head of queue,
        returns null if empty
* element() => get head of Queue, throws NoSuchElementException,
* peek() => get head of Queue but gives null when empty

