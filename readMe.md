### Lambda = function without a name (Anonymous functions)

It has Method Params, Body and return type.
Not tied to any class like a regular method
Can be assigned to a variable and passed around.

Syntax:

() -> { }
(input parms) -> {body}

Uses:
* Implement Functional Interfaces (SAM)
    Only Single Abstract Method
    @FunctionalInterface annotation (Optional)
    ex - Runnable, Comparator



### Functional Interfaces since Jdk 1.0
interfaces with exactly one abstract method
New one => 
1. Consumer - BiConsumer
2. Predicate - BiPredicate
3. Function - BiFunction, Unary, Binary Operator
4. Supplier

### Consumer & BiConsumer
void accept(T t)

### Predicate
boolean test(T t)
and()
negate()
or()

### Function

apply(T t)
andThen(Function f)
compose(Function f)

### Unary & binary Operator
Same as Function. Use when i/p and o/p types are same
maxBy()
minBy()

### Supplier
T get()


## Method Reference (Shortcut for lambda) 
* Simplifies SAMs
* Used to refer a method in a class
* ex: ClassName::instance-methodName
* ClassName::static-methodName
* Instance::methodName


### Streams

of, iterate, generate

* Numeric Streams -> represent primitive values in streams
Int, Long and Double Stream
IntStream
  * range(1, 10) = 9 elements
  * rangeClosed(1,  10) = 10 elements
  
same for LongStream
use .asDoubleStream for double stream

* Aggregate Fn
    * Sum, max, min, avg
    max and min return Optional<E> values
    avg returns OptionalDouble value
  
* Boxing and Unboxing
    Boxing -> primitive -> Wrapper
    UnBoxing -> Wrapper -> primitive
    
    mapToInt(), mapToObject(), mapToDouble(), mapToLong()

### Terminal Operations
joining()
counting()
mapping()
minBy, maxBy using collect()
summingInt, averagingInt, same for long, double
groupingBy()
(classifier),
(classifier, downstream)
(classifier, supplier, downstream
partitioningBy()

### Parallel Streams
Split source data into multiple parts & combine all solutions after operation on each
Not to be used when
1. when time is wasted in boxing/unboxing
2. when we have mutable variables


### Optional
* Represents a Non Null Value
* Avoids Null Pointer Exception and Unnecessary Null Checks
flatMap, map, filter


### Interfaces
* Define contract
* Before Java 8 only allowed declaring method
* default keyword to identify a default method
* default methods can be overridden
* static methods unlike default ones cannot be overridden