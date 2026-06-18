# Day 2 — Variables, Data Types, Input, Output & Debugging

> Java DSA Foundation | Day 2

Before solving DSA problems, you must understand how Java stores data, how users provide input, how programs display output, and how to find and fix errors.

---

# What is a Variable?

A variable is a named memory location used to store data.

Think of a variable as a labeled container that holds a value.

Example:

```java
int age = 21;
```

Here:

```text
age → Variable Name
21  → Value
int → Data Type
```

---

# Why Do We Need Variables?

Without variables:

```java
System.out.println(21);
System.out.println(21);
System.out.println(21);
```

The value is hardcoded.

Using variables:

```java
int age = 21;

System.out.println(age);
```

Now the value can be changed from one place.

Variables make programs:

* Flexible
* Reusable
* Easy to maintain

---

# Variable Declaration and Initialization

## Declaration

Creating a variable.

```java
int age;
```

Memory is reserved but no value is assigned.

---

## Initialization

Assigning a value.

```java
age = 21;
```

---

## Declaration + Initialization

Most common approach.

```java
int age = 21;
```

---

# Variable Naming Rules

A variable name:

* Can contain letters, digits, `_`, and `$`
* Cannot start with a digit
* Cannot use Java keywords
* Is case-sensitive

Valid:

```java
int age;
int myAge;
int totalMarks;
```

Invalid:

```java
int 1age;
int class;
```

---

# Java Naming Convention

Java follows **camelCase**.

Example:

```java
int myAge = 21;
String firstName = "Komal";
double accountBalance = 5000.0;
```

Avoid:

```java
int my_age = 21;
```

---

# Data Types in Java

Every variable must have a data type.

A data type tells Java:

* What kind of data is stored
* How much memory is needed
* What operations are allowed

Java data types are divided into:

```text
Data Types
│
├── Primitive
│
└── Non-Primitive
```

---

# Primitive Data Types

Primitive data types store actual values.

| Type      | Size    | Example                | Use              |
| --------- | ------- | ---------------------- | ---------------- |
| `byte`    | 1 byte  | `byte b = 127;`        | Small integers   |
| `short`   | 2 bytes | `short s = 300;`       | Small integers   |
| `int`     | 4 bytes | `int x = 10;`          | Whole numbers    |
| `long`    | 8 bytes | `long x = 100000L;`    | Large integers   |
| `float`   | 4 bytes | `float f = 3.14f;`     | Decimal numbers  |
| `double`  | 8 bytes | `double d = 3.14;`     | Decimal numbers  |
| `char`    | 2 bytes | `char c = 'A';`        | Single character |
| `boolean` | 1 bit   | `boolean flag = true;` | True/False       |

---

# Memory Representation of Primitive Variables

Example:

```java
int age = 21;
```

Memory:

```text
Stack Memory
------------
age = 21
```

The actual value is stored directly.

---

# Non-Primitive Data Types

Non-primitive types store references to objects.

Examples:

```java
String
Array
Object
Class
Interface
```

---

## String Example

```java
String name = "Komal";
```

Important:

* Uses capital `S`
* Uses double quotes
* Is not a primitive type

Memory:

```text
Stack
-----
name -----> Heap Object ("Komal")
```

---

# Primitive vs Non-Primitive

## Primitive

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

Changing one does not affect the other.

---

## Non-Primitive

```java
String s1 = "Java";
String s2 = s1;
```

Memory:

```text
s1 ----\
         ---> "Java"
s2 ----/
```

Both references point to the same object.

---

# Type Casting

Type casting means converting one data type into another.

---

# Widening Casting (Automatic)

Smaller type → Larger type

```text
byte → short → int → long → float → double
```

Example:

```java
int num = 10;
long value = num;
double d = value;
```

Memory:

```text
10
 ↓
10L
 ↓
10.0
```

No data loss occurs.

---

# Narrowing Casting (Manual)

Larger type → Smaller type

Example:

```java
double pi = 9.99;
int x = (int) pi;
```

Output:

```text
9
```

The decimal portion is removed.

---

# Output in Java

Output means displaying information to the user.

Java provides:

```java
System.out.print()
System.out.println()
System.out.printf()
```

---

# println()

Prints and moves to the next line.

```java
System.out.println("Hello");
System.out.println("Java");
```

Output:

```text
Hello
Java
```

---

# print()

Prints without moving to the next line.

```java
System.out.print("Hello ");
System.out.print("Java");
```

Output:

```text
Hello Java
```

---

# printf()

Used for formatted output.

```java
String name = "Komal";
int age = 21;

System.out.printf("Name: %s, Age: %d%n", name, age);
```

Output:

```text
Name: Komal, Age: 21
```

---

# Format Specifiers

| Specifier | Meaning  |
| --------- | -------- |
| `%d`      | int      |
| `%f`      | double   |
| `%s`      | String   |
| `%c`      | char     |
| `%b`      | boolean  |
| `%n`      | New Line |

Example:

```java
double pi = 3.14159;

System.out.printf("%.2f", pi);
```

Output:

```text
3.14
```

---

# Input in Java

Input means taking data from the user.

Java commonly uses the Scanner class.

---

# Scanner Class

```java
import java.util.Scanner;
```

Create Scanner object:

```java
Scanner sc = new Scanner(System.in);
```

---

# Taking Different Types of Input

```java
int num = sc.nextInt();

double d = sc.nextDouble();

String word = sc.next();

String line = sc.nextLine();

char c = sc.next().charAt(0);
```

---

# Complete Example

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.println("Name = " + name);
        System.out.println("Age = " + age);

        sc.close();
    }
}
```

---

# Common Scanner Problem

Consider:

```java
int age = sc.nextInt();
String name = sc.nextLine();
```

Input:

```text
21
Komal
```

Result:

```text
name = ""
```

Why?

Because:

```java
nextInt()
```

leaves a newline character (`\n`) in the input buffer.

---

# Solution

Consume the leftover newline.

```java
int age = sc.nextInt();

sc.nextLine();

String name = sc.nextLine();
```

Now input works correctly.

---

# What is Debugging?

Debugging is the process of finding and fixing errors in a program.

Every programmer spends a large amount of time debugging.

---

# Types of Errors

Java errors are generally divided into:

```text
1. Syntax Errors
2. Runtime Errors
3. Logic Errors
```

---

# Syntax Error

Java grammar is incorrect.

Example:

```java
int x = 10
```

Output:

```text
Compilation Error
```

Reason:

```text
Missing semicolon
```

---

# Runtime Error

Program compiles successfully but crashes during execution.

Example:

```java
int x = 10 / 0;
```

Output:

```text
ArithmeticException
```

Reason:

```text
Division by zero
```

---

# Logic Error

Program runs but produces the wrong result.

Example:

```java
int a = 10;
int b = 20;

System.out.println(a - b);
```

Expected:

```text
30
```

Actual:

```text
-10
```

Reason:

```text
Wrong operator used
```

---

# Debugging Checklist

When your code doesn't work:

✔ Read the complete error message

✔ Verify variable names

✔ Check semicolons and brackets

✔ Verify loop conditions

✔ Check `=` versus `==`

✔ Print intermediate values

```java
System.out.println(variable);
```

✔ Use breakpoints and debugger tools in your IDE

---

# Flow of a Java Program with Input and Output

```text
User Input
      ↓
Scanner Reads Input
      ↓
Variables Store Data
      ↓
Program Processes Data
      ↓
System.out Displays Output
```

---

# Real-Life Example

```java
Scanner sc = new Scanner(System.in);

int a = sc.nextInt();
int b = sc.nextInt();

int sum = a + b;

System.out.println(sum);
```

Execution:

```text
Input:
10 20

Processing:
10 + 20

Output:
30
```

---

# Interview Questions

### Q1. What is a variable?

A variable is a named memory location used to store data.

---

### Q2. What is a data type?

A data type defines the type of value a variable can store.

---

### Q3. Difference between primitive and non-primitive data types?

| Primitive           | Non-Primitive         |
| ------------------- | --------------------- |
| Stores actual value | Stores reference      |
| Fixed size          | Variable size         |
| Built into Java     | Created using classes |

---

### Q4. What is type casting?

Type casting is converting one data type into another.

---

### Q5. Difference between widening and narrowing casting?

| Widening      | Narrowing          |
| ------------- | ------------------ |
| Automatic     | Manual             |
| No data loss  | Possible data loss |
| Small → Large | Large → Small      |

---

### Q6. What is Scanner?

Scanner is a Java class used to take input from the user.

---

### Q7. Difference between next() and nextLine()?

| next()         | nextLine()        |
| -------------- | ----------------- |
| Reads one word | Reads entire line |
| Stops at space | Reads until Enter |

---

### Q8. What is debugging?

Debugging is the process of finding and fixing errors in a program.

---

### Q9. What are the three main types of errors?

* Syntax Errors
* Runtime Errors
* Logic Errors

---

### Q10. Why does nextLine() sometimes return an empty string?

Because methods like `nextInt()` leave a newline character in the input buffer.

---

# Practice Questions

1. Even or Odd
2. Greeting Program
3. Simple Interest Calculator
4. INR to USD Converter
5. Fibonacci Series
6. Palindrome String
7. Armstrong Numbers
---

# Day 2 Checklist

* Understand variables and memory storage
* Understand primitive and non-primitive data types
* Learn Java naming conventions
* Understand type casting
* Learn input using Scanner
* Learn output using print, println and printf
* Understand common Scanner pitfalls
* Understand syntax, runtime and logic errors
* Learn basic debugging techniques
* Solve all practice questions
