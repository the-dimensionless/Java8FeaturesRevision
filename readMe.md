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