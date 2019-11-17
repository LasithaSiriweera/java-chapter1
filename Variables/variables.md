#Variables

The variable is the basic unit of storage in a java program.

## Declaring a Variable

type identifier [ = value][, identifier [= value] ...]

## The Scope of Variables

    1. Block scope
    2. Method scope
    3. Class scope
    
When you declare a variable within a scope, you are localizing that variable and protecting it from unauthorized access
and/or modification. Indeed, the scope rules provide the foundation for encapsulation

## Lifetime of Variables

Variables are created when their scope is entered, and destroyed when their scope is left. This means that a variable
will not hold its value once it has gone out of scope

#Type Conversion and Casting

If the two types are compatible, then Java will perform the conversion automatically. For example, it is always possible
to assign an int value to a long variable. However, not all types are compatible, and thus, not all type conversions are
implicitly allowed. For instance, there is no automatic conversion defined from double to byte.

##Automatic Conversions
    1.When the two types are compatible.
    2.When the destination type is larger than the source type

##Casting Incompatible Types

(target-type) value


