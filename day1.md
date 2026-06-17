# Day 1 — Introduction to Java: How Java Works, Memory Management & Program Flow

> Java DSA Foundation | Day 1

Before learning DSA in Java, you must understand how Java works internally, how memory is managed, and how a Java program executes.

---

# What is Java?

Java is a **high-level, object-oriented, platform-independent programming language**.

Java allows developers to write code once and run it anywhere using the JVM.

### Java's Motto

**Write Once, Run Anywhere (WORA)**

---

# How Java Works

When you write a Java program, the computer cannot directly understand it.

The Java execution process is:

```text
Java Source Code (.java)
          ↓
      Compiler
          ↓
     Bytecode (.class)
          ↓
         JVM
          ↓
    Machine Code
          ↓
      Execution
```

Example:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Java");
    }
}
```

## Step 1: Write Source Code

```text
Main.java
```

Human-readable code.

## Step 2: Compilation

Java Compiler (`javac`) converts:

```text
Main.java
```

into

```text
Main.class
```

This `.class` file contains **Bytecode**.

## Step 3: Execution

JVM reads bytecode and converts it into machine code.

The operating system executes the machine code.

---

# JDK, JRE and JVM

## 1. JVM (Java Virtual Machine)

JVM is a virtual machine responsible for executing Java bytecode.

### Responsibilities

* Loads classes
* Verifies bytecode
* Allocates memory
* Executes code
* Runs Garbage Collector

Without JVM, Java programs cannot run.

---

## 2. JRE (Java Runtime Environment)

JRE provides everything required to RUN Java applications.

Contains:

```text
JRE
 ├── JVM
 └── Java Libraries
```

Used when:

* You only want to run Java programs
* No development required

---

## 3. JDK (Java Development Kit)

JDK is used to DEVELOP Java applications.

Contains:

```text
JDK
 ├── JRE
 │    └── JVM
 ├── Compiler (javac)
 ├── Debugger
 └── Development Tools
```

Used when:

* Writing Java code
* Compiling Java code
* Running Java code

---

## Relationship

```text
JDK
 └── JRE
      └── JVM
```

---

# Why Java is Platform Independent

Java source code:

```java
int a = 10;
```

gets converted into:

```text
Bytecode
```

Bytecode is platform-independent.

Different operating systems have different JVMs:

* Windows JVM
* Linux JVM
* macOS JVM

The same bytecode runs on all of them.

```text
Write Once
     ↓
Bytecode
     ↓
Run Anywhere
```

---

# Java is a Statically Typed Language

In Java, variable types must be declared before use.

Example:

```java
int age = 22;
String name = "Komal";
```

Compiler already knows:

* age → int
* name → String

### Benefits

* Compile-time error checking
* Better performance
* Easier maintenance

---

# Compile-Time Error Example

```java
int age = "Komal";
```

Output:

```text
Compilation Error
```

The program will not run.

Java catches type-related errors before execution.

---

# Primitive Data Types

Java primitives store actual values.

```java
byte
short
int
long
float
double
char
boolean
```

Example:

```java
int x = 10;
```

Value `10` is stored directly.

---

# Stack Memory

Stack stores:

* Primitive variables
* Method calls
* Local variables
* References to objects

Example:

```java
int age = 22;
```

Stored in stack.

### Characteristics

* Fast
* Fixed size
* Automatic memory management
* Follows LIFO (Last In First Out)

---

# Heap Memory

Heap stores:

* Objects
* Arrays
* Dynamic data

Example:

```java
Student s = new Student();
```

The object is created inside Heap Memory.

---

# Objects and References

Consider:

```java
Student s = new Student();
```

Memory:

```text
Stack
-----
s -----> Heap Object
```

The object lives in Heap.

The variable `s` only stores the object's reference.

---

# Primitive vs Reference Variables

## Primitive Example

```java
int a = 10;
int b = a;
```

Memory:

```text
a = 10
b = 10
```

Two separate copies exist.

Changing `b` does not affect `a`.

```java
b = 20;
```

Result:

```java
a = 10
b = 20
```

---

## Reference Example

```java
Student s1 = new Student();
Student s2 = s1;
```

Memory:

```text
s1 ----\
        \
         ---> Student Object
        /
s2 ----/
```

Both references point to the same object.

### Reference Trap

```java
s2.name = "Komal";
```

Now:

```java
s1.name
```

also becomes:

```text
Komal
```

because both references point to the same object.

---

# Garbage Collection (GC)

Java automatically cleans unused objects from Heap Memory.

Example:

```java
Student s = new Student();
s = null;
```

Now no reference points to the object.

The object becomes eligible for Garbage Collection.

### Advantages

* Prevents memory leaks
* Automatic memory management
* Developer doesn't manually free memory

---

# Flow of a Java Program

Java executes code:

```text
Top → Bottom
Left → Right
```

unless redirected by:

* Method calls
* Conditions
* Loops

---

# Method Calls and Call Stack

Example:

```java
public class Main {

    static void greet() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        greet();
    }
}
```

Execution:

```text
main()
   ↓
greet()
   ↓
return
   ↓
main()
```

---

# Call Stack

Whenever a method is called:

A stack frame is created.

Example:

```text
main()
   ↓
methodA()
   ↓
methodB()
```

Stack:

```text
methodB()
methodA()
main()
```

When `methodB()` finishes:

```text
methodA()
main()
```

When `methodA()` finishes:

```text
main()
```

This is called the **Call Stack**.

---

# Stack Overflow

Occurs when the call stack becomes too large.

Example:

```java
static void fun() {
    fun();
}
```

Infinite recursion creates unlimited stack frames.

Result:

```text
StackOverflowError
```

---

# Conditional Statements

Example:

```java
if(age >= 18){
    System.out.println("Adult");
}
else{
    System.out.println("Minor");
}
```

Only one branch executes.

---

# Loops

Loops repeatedly execute code.

Example:

```java
for(int i = 1; i <= 5; i++){
    System.out.println(i);
}
```

Flow:

```text
Check Condition
      ↓
 Execute Block
      ↓
Update
      ↓
Check Again
```

---

# Java Execution Lifecycle

```text
Write Java Code
        ↓
Compile using javac
        ↓
Generate Bytecode
        ↓
Class Loader loads classes
        ↓
Bytecode Verifier checks code
        ↓
JVM allocates memory
        ↓
Execution Engine executes code
        ↓
Garbage Collector cleans memory
```

---

# Interview Questions

### Q1. What is Java?

Java is a high-level, object-oriented, platform-independent programming language that runs using JVM.

### Q2. What is JVM?

JVM is a virtual machine that executes Java bytecode and converts it into machine code.

### Q3. What is JRE?

JRE contains JVM and Java libraries required to run Java applications.

### Q4. What is JDK?

JDK contains JRE, compiler, debugger, and development tools required to develop Java applications.

### Q5. What is Bytecode?

Bytecode is the intermediate code generated by the Java compiler and executed by JVM.

### Q6. Why is Java platform independent?

Because Java compiles source code into platform-independent bytecode which can run on any JVM.

### Q7. Difference between Stack and Heap?

| Stack                  | Heap              |
| ---------------------- | ----------------- |
| Stores local variables | Stores objects    |
| Fast                   | Relatively slower |
| Fixed size             | Larger size       |
| Auto managed           | Managed by GC     |

### Q8. What is Garbage Collection?

Garbage Collection is the automatic process of removing unused objects from Heap memory.

### Q9. What is Call Stack?

Call Stack is the memory structure that tracks method calls during program execution.

### Q10. What causes StackOverflowError?

Infinite recursion or excessive method calls causing stack memory exhaustion.

---

# Day 1 Checklist

*  Understand Java execution flow
*  Understand JDK, JRE, JVM
*  Know what Bytecode is
*  Understand platform independence
*  Understand Stack vs Heap
*  Understand objects and references
*  Understand Garbage Collection
*  Understand Call Stack
*  Understand StackOverflowError
*  Able to explain complete Java execution lifecycle
