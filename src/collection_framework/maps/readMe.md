Map is part of Collection framework but not part of Collection Interface


Map(Interface)

Methods: size(), isEmpty(), containsKey(Object key), containsValue(Object val),
V get(Object key)
V put(key, value)
V remove()
void putAll(Map m)
clear()
Set<K> keySet()
Collection<V> values()
entrySet()
equals(Object o)
int hasCode() => sum of hashCodes of all entries
getOrDefault(key, defaultValue)
forEach
replaceAll
putIfAbsent(key, value)
remove(key, value)
replace(key, oldVal, newVal)
compute()
computeIfAbsent()
merge()


### Hashing

Normal searching in array would take O(n) time
* Object -> HashFunction -> generated address of Object
so using HF O(1) time

* Java Object class has two methods
  * hashCode() => It is the hash function for that object. It generates a unique
                code(say numerical code) for the object.
                We can override it.
  * equals() => Two equal objects MUST have the same hashCode but
                two different objects can have the same hashCode
  * Therefore, override both the methods for better contract.
  
* Hash codes generates can be put into table like format (hash table)
* object => hashcode say 15 => modulo size of table say 5 => 15%5 = 0 (index in hash table)
* If two different objects have same hashcode => COLLISION
* RESOLVE COLLISION => put collided objects in a LinkedList


### HashMap
underlying data structure is a hash table

Map(I) > HashMap(c) > LinkedHashMap(c)

* Insertion order is not  preserved
* No dupe keys
* Allows null as key (only once)
* Heterogeneous elements as key and val
* Implements Serializable and Cloneable interface
* Extends an abstract class called Abstract Map
* Best choice for search operations
* Uses hashing to store data
* Hashing applied to keys of the HashMap

Hashing is converting large strings into small strings that represent the same string

HashMap contains
* an array of Buckets or Nodes(Hash, Key, Value, Next)
* It uses a LinkedList to store key value pairs and hence Node is used
* Hash value of key is stored in Node.Hash
* Key is stored in Node.Key
* Value is stored in Node.Value
* Address of next node is stored in Node.Next
* Index of key null will always be 0

### HashMap vs HashTable

* Not Thread safe (use SynchronizedHashMap) vs Thread safe(synchronized)
* Fast but data may be inconsistent vs Slow because of locking
* One null key, many null values vs Not allowed null key, values
* 1.2 version vs Legacy class
* Extends AbstractMap(c) vs Extends Dictionary(c)

* HashMap > LinkedHashMap(c)
  * Underlying Data structure is Hashtable + HashMap
  * Insertion order is preserved
  * 1.4 version
  * Cache based applications

* Map(I) > IdentityHashMap(c)
  * JVM uses == to check equality
  * key1 == key2 (compared via reference)
  * In HashMap key.equals(key1)
  * Keys can be same but references must be different!
  * Used when objects have to be compared via references

* Map > WeakHashMap(c)
  * GC cannot collect keys of Hashmap that are no more references
  * Weak hashmap keys can be GC collected
  * HashMap implements Serializable, Cloneable but WeakHashMap does not
  * Objects have weak references whereas in hashmap objects have strong references

* Map(I) > SortedMap(I) : ensures sorting in asc order
  * Null key or val both not allowed
  * natural ordering or comparator provided
  * firstKey, lastKey, subMap, headMap, tailMap

* SortedMap(I) > NavigableMap(I)
  * Has navigation functionality methods
  * TreeMap is the implementation class
  * ceilingEntry, floorKey, higherKey, subMap, tailMap, navigableKeySet,
  * descendingKeySet, descendingMap





