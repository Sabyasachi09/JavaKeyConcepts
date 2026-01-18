# Immutable Class

Immutable classes prevent state changes after object creation. Once constructed, an immutable object’s internal state cannot be modified. This makes code more predictable and easier to understand.

Immutability enhances thread safety without synchronization. Because immutable objects can’t be changed, they can be safely shared between threads without requiring locks or synchronized blocks.

## Create an immutable class by following 5 principles

- Make the class final, so that it cannot be extended.

- Make all fields private, so that direct access is not allowed.

- Make all the fields final, so that values can be assigned only once.

- Do not provide setter(mutator) methods. Initialize all fields using constructor, that performs deep copy or defensive copying for mutable fields like: date, List, Map.

- Clone objects in the getter methods to return a copy rather than returning the actual object reference.


