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

- DRY: **D**o not **R**epeat **Y**ourself
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


## UML (Unified Modeling Language)

- The most popular diagrammatic notation used for Object-Oriented Development
- Support from OOA (Object-Oriented Analysis) to OOP (Object-Oriented Programming)
- Consists of:
  - **Class diagrams**
  - Sequence diagrams
  - Use case diagrams
  - Activity diagrams

### Class Diagrams

- Describe the system in terms of *object classes* and their *relationship*
- Natural ways of reflecting the real-world entities and their relationships
- Essential part in OO software Development

| Class name |
| :--------: |
| Attributes |
| Operations |

![Image result for uml class diagram](https://www.tutorialspoint.com/uml/images/uml_class_diagram.jpg)

### Relationship between classes

- Association (directional+Multiplicity) (关联)
- Aggregation (聚合)
- Composition (组合)
- Inheritance (继承)
- Polymorphisms (多态)

#### Association (关联)

- An association is a linkage between two classes.
- A class *is aware of* and *holds a reference* to another class
- Often referred as a “has-a” relationship

##### Bidirectional or unidirectional (单向&双向)

- Unidirectional Association: *A student can query the books he/she borrowed but it is **NOT** possible to find which student the book is lent to.*
- Bidirectional Association: *A student can query the books he/she borrowed and it is **possible** to find which student the book is lent to.*

##### Multiplicity (多重)

> One student has only one library card, and one library card can only be owned by one student

- One to one Relationship
- One to many Relationship
- Many to many Relationship

#### Aggregation (聚合)

- A special type of association
- Used to model a "whole to its parts" relationship.
- Also referred as a “has-a” relationship
  - E.g.: College has Professors
- **They may have different life time**

#### Composition (组合)

- Another form of the aggregation
- Child class's instance **lifecycle is dependent** on the parent class's instance lifecycle

#### Inheritance (继承)

- Often referred as a “is-a” relationship
  - E.g.: a dog is an animal

#### Polymorphisms (多态)

- Base class has more than one derived classes
- Decide which method to run at **run time**
- When adding more classes, no need to touch code in other classes

> Realization/Implementation: For Interface

![Image result for class relationship diagram](https://d3n817fwly711g.cloudfront.net/blog/wp-content/uploads/2012/03/Class-Diagram-Relationships.png)

## Object-oriented Design

1. Given a problem, considering which class/object will exist in the problem domain.
2. Considering for each class/object, what field and methods it should have
3. Considering the relationships between different classes/objects

## Class Diagram -> Java Code

### Unidirectional

```java
public class Student {
    public String name;
    public String studentID;
    public Book myBook;
}

public class Book {
    public String title;
    public LIST String authors;
}
```

### Bidirectional

```java
public class Student {
    public String name;
    public String studentID;
    public Book myBook;
}

public class Book {
    public String title;
    public LIST String authors;
    public Student theStudent;
}
```

### Multiplicity

```java
public class Student {
    public String name;
    public String studentID;
    public Book myBook;
    private numberOfBooks;
    public void maintainBooks(){
        ...
    }
}

public class Book {
    public String title;
    public LIST String authors;
    public Student theStudent;
}
```

### Composition

```java
public class Wheel {
}
public class Car {
    public Wheel wheel;
    public Car(Wheel wheel){
        this.wheel = wheel;
    }
}
```





