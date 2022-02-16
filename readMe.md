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