[TOC]

# OOP_Week1_OO_UML.pdf

Outline:

- Object-Oriented Development
- Objects vs. Classes
- UML
- Class Diagram
- Class Relationship
- Class Diagram -> Java code

## Objects vs. Classes

### Class

- A set of entities with similar attributes
- A generalized description the describes a collection of similar objects.

### Object

- An object is an instance (实例) of a class.
- An entity
- Maybe Physical (chair/desk/...) or Logical (list/stack/...).
- Object have **state** and **behavior**.
  - State: Color, Name, Breed, ...
    - Stored in instance variables
  - Behaviors: Fetch, Drink, Bark, ...
    - Accomplished by methods

| No.  | Object                                                       | Class                                                        |
| ---- | :----------------------------------------------------------- | ------------------------------------------------------------ |
| 1    | Object is an **instance** of a class.                        | Class is a **blueprint or template** from which objects are created. |
| 2    | Object is a **real world entity** such as pen, laptop, mobile, bed, keyboard, mouse, chair etc. | Class is a **group of similar objects**.                     |
| 3    | Object is a **physical** entity.                             | Class is a **logical** entity.                               |
| 4    | Object is created through **new keyword** mainly e.g. `Student s1 = new Student();` | Class is declared using **class keyword** e.g.`class Student{...}` |
| 5    | Object is created **many times** as per requirement.         | Class is declared **once**.                                  |
| 6    | Object **allocates memory when it is created**.              | Class **doesn't allocated memory when it is created**.       |
| 7    | There are **many ways to create object** in java such as **new keyword**, **newInstance()** method, **clone()** method, **factory** method and **deserialization**. | There is only **one way to define class** in java using **class keyword**. |

## Object-Oriented Development

- A popular software development method
- Develop reusable system
- The concept started in 1968
- Based on the use of single object

### Object-Oriented

>  OO in one sentence: keep it **DRY**, keep it **Shy** and **Tell the other guy**
>
> --- Andy Hunt and Dave Thomas

- DRY: Do not Repeat Yourself
- Shy: Should not reveal the information about itself unless really necessary.
- Tell the other guy: Send a message rather than a function call.

### Benefits of OOP Approach

- Modularity:
  - The source code for an object can be written and maintained independently of the source code for other objects.
- Information-hiding:
  - By interacting only with an object's methods, the details of its internal implementation are hidden from the outside world.
- Code re-use:
  - If an object already exists, you can use that object in your program. This allows specialists to implement/test/debug complex, task-specific objects, which you can then trust to run in your own code.

### Object-Oriented Software Development Process

1. OO Analysis: Requirement specification
2. OO Design: Architectural design
3. Object Design: Detailed design
4. Object-Oriented Programming: Implementation (Focus on this semester)

