* Need for concurrent collections

1. Avoid data inconsistency during multi threading
2. Better than using synchronized block

* DEFAULT CONCURRENT COLLECTIONS

Legacy classes like Vector, Stack, HashTable (slow & safer)
List, LinkedList are not synchronized

Synchronizing existing older collections

Collections.synchronizedList(list)
Collections.synchronizedSet(set)
Collections.synchronizedMap(map)

Concurrent Collections needed for
* Better sync & thread safety
* Better performance
* Improved Locking mechanism 
* Instead of locking whole object, lock only certain segments in collection

* ConcurrentModificationException : Exception in multi threading env


### Examples
java.util.concurrent

1. ConcurrentHashMap implements ConcurrentMap (interface) that implements Map (interface) + extra methods

HashMap => not thread safe & can lead to data inconsistency issues

HashTable => Thread Safe but poor performance as whole object is locked in W/R
            Only one thread is allowed to operate

ConcurrentHashMap => Thread safe + better performance
                    Segment (instead of whole object) is locked while write
                    no lock while read

* ConcurrentHashMap is by default divided into 16 regions/buckets/segments
so 16 threads can operate at a time. It can be changed in constructor
* ConcurrentHashMap(int initialCapacity, float loadFactor, int concurrencyLevel

* Null is not allowed as key or value

* Does not throw ConcurrentModificationException


HashMap is FAIL FAST whereas ConcurrentHashMap is FAIL SAFE


* Concurrent Array List

Collection (Interface) > List (Interface) > CopyOnWriteArrayList(class)
inside java.util.concurrent
No locking for read
For writing, a clone is created.
Update is performed on the cloned copy
Read is done on original copy
Internally JVM syncs them

For every update new clone copy will be created (Overhead)
* Use only when less no of updates/writes to be performed
* Thread safe
* Iterator on it cannot perform remove operation

Similarly, CopyOnWriteArraySet (internally using CopyOnWriteArrayList)

