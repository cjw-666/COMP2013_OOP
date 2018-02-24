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

![UML class diagram](https://www.tutorialspoint.com/uml/images/uml_class_diagram.jpg)

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

#### Realization/Implementation: For Interface

---

![Class relationship diagram](https://d3n817fwly711g.cloudfront.net/blog/wp-content/uploads/2012/03/Class-Diagram-Relationships.png)

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

### Aggregation

```java
public class Wheel {
}
public class Car {
    public Wheel wheel;  // Car is aware of wheel
    public Car(Wheel wheel){  // Car needs wheel to exist
        this.wheel = wheel;
    }
}
```

### Composition

```java
public class Department {
    
}
public class Company {
    public Department departments;
    public Company(){
        // Must creat departments before creating company
        departments = new Departments;
    }
}
```

### Inheritance

```java
public class Animal {
}
public class Dog extends Animal {
}
```

### Polymorphisms

```java
public class Shape {
    public void draw() {
        
    }
    public void erase() {
        
    }
}
public class Square extends Shape {
    public void draw() {
        
    }
    public void erase() {
        
    }
}
public class Line extends Shape {
    public void draw() {
        
    }
    public void erase() {
        
    }
}
public class Circle extends Shape {
    public void draw() {
        
    }
    public void erase() {
        
    }
}
```

### Realization

```java
public class Shape {
    public void draw() {
        
    }
    public void erase() {
        
    }
}
public class Square implements Shape {
    public void draw() {
        
    }
    public void erase() {
        
    }
}
public class Line implements Shape {
    public void draw() {
        
    }
    public void erase() {
        
    }
}
public class Circle implements Shape {
    public void draw() {
        
    }
    public void erase() {
        
    }
}
```
## What can be classes?

1. Software Requirement Specification
2. Find all nouns in the SRS
3. Remove the following nouns:
   1. Duplicates
   2. Unrelated
   3. Vague or general nouns
   4. Dependent nouns, which should be attributes
   5. Interface, which is about other system interacting with the system

# OOP_HelloWorld.pdf

Outline:

- Computer language and Java
- History of Java language
- Java Architecture
- Java Virtual Machine (JVM)
- Garbage collection
- Java Development Environment
- First Java Program - `HelloWorld.java`

## Computer Language

- Machine Language: Binary
- Low-level languages: Assembly Language
- High-level: Hunan-friendly languages
  - Structure programming language [C, Pascal, Fortran]
  - C++, a combination of Structure programming & objected oriented
  - Java, pure object oriented language
  - C# (.NET)

## History of Java

- Developed by Sun Micro.
- Sun has merged into Oracle since 2010
  - 1995, Sun issued JDK 1.0
  - 1998, JDK 1.2, change name to Java 2
  - JDK 1.3, 1.4, 1.5, 1.6, 1.7
  - Latest version is JDK 1.9, also called JDK 9.0

### Version of Java

- Java Micro Edition (Java ME)
  - Very small Java environment for smart cards, pages, phones, and set-top boxes.
  - Subset of the standard Java libraries aimed at limited size and processing power.
- Java Standard Edition (Java SE)
  - The Basic Platform, which this course will cover
- Java Enterprise Edition (Java EE)
  - For business applications, web services, mission-critical systems.
  - JSP, Servlets, JDBC, EJB3.0, Struts – Spring - Hibernate

### Features of Java

- Simple
- Object-oriented
- Platform neutral
- Robust, secure, scalable.
- Java is Everywhere

### The heart of Java

#### Java Virtual Machine

- Read “byte code” and interpret it and executes the program

#### Garbage collection

- Release memory automatically

## Compiler / Interpreter

### Compiler

- A program that translates a high-level language program into an equivalent low-level language program
  - This translation process is called ***compiling***
- e.g.: Program Written in High-level Language Compile to Executable Program in Low-level Language

### Cross Platform

Pitfalls:

- Store and use different *compiled* versions
- Availability of compiler(s) is a must
- Compiler compatibility problem
- Re-compile all versions after an update

### Java Compilation Model

![Java Compilation Model](http://i.imgur.com/KhUw309.png)

### Byte-Code and the Java Virtual Machine

- Java compiler translates Java programs into **byte-code**, a machine language for **Java Virtual Machine**
- Once compiled to ***byte-code***, a Java program can be used
  on any computer, making it very portable.
- Write-Once -> Run-Anywhere

#### Interpreter

- This is the program that translates a program written in Java byte-code into the machine language for a particular computer when a Java program is executed.
  - The interpreter translates and immediately executes each byte-code instruction, one after another
  - Translating byte-code into machine code is relatively easy compared to the initial compilation step

## The First Program

JDK: Java Development Kit - For Development

JRE: Java Runtime Environment - For User

### Running a Java Program

1. Use IDE (e.g. JetBrains IntelliJ IDEA) to build a Java Project, and run Hello World
2. Use Notepad to write HelloWorld.java, and then use Command Line to run:
   - Change to the directory containing the file `HelloWorld.java`
     - `javac HelloWorld.java`
   - It generates a new file `HelloWorld.class`
     - `java HelloWorld`

```java
HelloWorld.java
public class HelloWorld {
    /* The HelloWorld Program
    -------------------
    Illustrates a simple program displaying
    a message.
    */
    public static void main (String[] args) {
		System.out.println(“HelloWorld!");
	}
}
```

### Code Analyze

- `class` key word: definition of classes

- `{} (Curly braces)` after the `class`: enclose a block of code

- `/**/`: comments

  - ```
    // Single line comment 1

    /* */ Single line comment 2

    /**
     * Multiple line comment
    **/
    ```

  - comment can be interpret by `javadoc`

- ```java
  public static void main (String[] args) {
  	System.out.println(“HelloWorld!");
  }
  // This is a method of the class HelloWorld, named main()
  // 'public static void' are the standard properties of the main() method
  ```

- ```java
  System.out.println(“HelloWorld!");
  // This is a statement (instruction) to display a message
  // semi-colon after every statement
  ```

- ```
  String[] args:
  In Java args contains the supplied command-line arguments as an array of String objects.In other words, if you run your program as

  java MyProgram one two

  then args will contain ["one", "two"].
  ```



## Java Programming

- A Java program consists of ***objects*** that interact with one another by means of actions (called ***methods***)
- Other high-level languages (C, Fortran) have procedures, functions, and subprograms.
  - These are called ***methods*** in Java
  - All programming constructs in Java, including methods, appear in an ***object*** (which is an ***instance*** of a ***class***)
- There are two types of Java programs: ***applications*** and ***applets***
- A Java ***application program*** or "regular" Java program is a class with a method named `main`
  - When a Java application program is run, the run-time system automatically invokes the method named `main`
  - All Java application programs start with the `main` method
  - Applets are not used often anymore
  - Application programs may use a windowing interface or console (i.e., text) I/O.
  - Java Swing (GUI)

## Program terminology

- Code: A program or a part of a program
- Source code (or source program): A program written in a high-level language such as Java
  - The input to the Compiler program
- Object code: The translated low-level program
  - The output from the compiler program, e.g., Java byte-code
  - In the case of Java byte-code, the input to the Java byte-code interpreter

### Syntax  and Semantics

- Syntax: The arrangement of words and punctuations that are legal in a language, the ***grammar rules*** of a language
- Semantics: The ***meaning*** of things written while following the syntax rules of a language

> Tips: Error Checking
>
> - Bug: A mistake in a program
>   - The process of eliminating bugs is called debugging
> - Syntax error: A grammatical mistake in a program
>   - The compiler (or IDE) can detect these errors, and will output an error message saying what it thinks the error is, and where it thinks the error is
> - Run-time error: An error that is not detected until a program is run
> - The compiler cannot detect these errors: an error message is not generated after compilation, but after execution (usually, program will not run!)
> - Logic error: A mistake in the underlying algorithm for a program
>   - The compiler cannot detect these errors, and no error message is generated after compilation or execution, but the program does not do what it is supposed to do