# Day 05 – Functions (Methods) in Java

## Topics Covered

- Why Functions are Important
- Methods in Java
- Anatomy of a Method
- Types of Methods
- The `static` Keyword
- Method Overloading
- Pass by Value
- Pass by Reference (Objects & Arrays)
- Best Practices for Writing Methods

---

# 1. Why Functions?

## What is a Function?

A function is a reusable block of code that performs a specific task.

Instead of writing the same code multiple times, we write it once inside a function and call it whenever needed.

---

## Why Do We Need Functions?

Without functions:

- Code repetition increases
- Programs become difficult to read
- Debugging becomes harder
- Maintenance becomes difficult

With functions:

- Code becomes reusable
- Programs become modular
- Easier to test and debug
- Improves readability
- Reduces duplication

---

## Real-Life Example

Imagine a calculator application.

Without functions:

```java
// Addition logic repeated everywhere
a + b

// Again
x + y

// Again
m + n
```

With functions:

```java
add(a, b);
add(x, y);
add(m, n);
```

Write once. Use everywhere.

---

## Functions in DSA

In Data Structures and Algorithms, almost every algorithm is written inside a function.

Examples:

```java
binarySearch()
mergeSort()
quickSort()
reverseArray()
isPrime()
```

---

# Golden Rule of Functions

## Do One Thing and Do It Well

A function should have a single responsibility.

### Good Examples

```java
isEven(n)
```

Checks if a number is even.

```java
calculateArea(r)
```

Calculates area only.

---

### Bad Example

```java
calculateAreaAndPerimeterAndPrint()
```

Doing multiple jobs in one function makes code difficult to maintain.

---

# 2. Functions in Java = Methods

In Java, functions are called **Methods**.

Unlike some languages, methods must always be written inside a class.

---

## Example

```java
public class Main {

    public static void greet() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        greet();
    }
}
```

---

# 3. Anatomy of a Method

## General Syntax

```java
accessModifier returnType methodName(parameters)
{
    // method body

    return value;
}
```

---

## Example

```java
public static int add(int a, int b)
{
    return a + b;
}
```

---

## Breakdown

| Part | Example | Meaning |
|--------|---------|---------|
| Access Modifier | public | Who can access the method |
| Return Type | int | What type of value is returned |
| Method Name | add | Describes the task |
| Parameters | int a, int b | Inputs required |
| Return Statement | return a+b | Sends result back |

---

# 4. Types of Methods

---

## 4.1 Void Method

A method that performs a task but does not return anything.

### Syntax

```java
public static void greet(String name)
{
    System.out.println("Hello " + name);
}
```

### Calling

```java
greet("Komal");
```

### Output

```text
Hello Komal
```

---

## 4.2 Return Type Method

Returns a value to the caller.

### Example

```java
public static int add(int a, int b)
{
    return a + b;
}
```

### Calling

```java
int result = add(5, 3);
```

### Output

```text
8
```

---

## 4.3 Method with No Parameters

A method that doesn't require any input.

### Example

```java
public static void printLine()
{
    System.out.println("----------------");
}
```

### Calling

```java
printLine();
```

---

# 5. The static Keyword

## What is static?

The `static` keyword means that the method belongs to the class rather than an object.

---

## Why Are Our Methods Static?

Because:

```java
main()
```

is itself a static method.

A static method can directly call another static method.

---

## Example

```java
public class Main {

    public static void main(String[] args) {

        int ans = square(4);

        System.out.println(ans);
    }

    public static int square(int n) {
        return n * n;
    }
}
```

### Output

```text
16
```

---

# 6. Method Overloading

## Definition

Method Overloading means:

Multiple methods can have the same name if their parameter lists are different.

---

## Example

```java
public static int add(int a, int b)
{
    return a + b;
}

public static double add(double a, double b)
{
    return a + b;
}

public static int add(int a, int b, int c)
{
    return a + b + c;
}
```

---

## Calling

```java
add(2, 3);
```

Calls:

```java
add(int a, int b)
```

Returns:

```text
5
```

---

```java
add(2.5, 3.5);
```

Calls:

```java
add(double a, double b)
```

Returns:

```text
6.0
```

---

```java
add(1, 2, 3);
```

Calls:

```java
add(int a, int b, int c)
```

Returns:

```text
6
```

---

## Important Rule

Method overloading depends on:

- Number of parameters
- Type of parameters
- Order of parameters

---

### Invalid Overloading

Changing only the return type is NOT overloading.

❌ Invalid

```java
public static int add(int a, int b)
{
    return a + b;
}

public static double add(int a, int b)
{
    return a + b;
}
```

This causes a compilation error.

---

# 7. Pass By Value

## Definition

Java passes primitive data types by value.

This means a copy of the variable is sent to the method.

Changes made inside the method do not affect the original variable.

---

## Example

```java
public static void doubleIt(int x)
{
    x = x * 2;
}

public static void main(String[] args)
{
    int num = 5;

    doubleIt(num);

    System.out.println(num);
}
```

### Output

```text
5
```

Not:

```text
10
```

---

## Why?

Because:

```java
num = 5
```

A copy is sent.

```text
Original Variable
num = 5

Copy
x = 5
```

Only the copy changes.

```text
x = 10
```

Original remains:

```text
num = 5
```

---

# 8. Pass By Reference (Objects & Arrays)

## Important Note

Java is technically pass-by-value.

However, when objects and arrays are passed, the value being copied is the reference.

This allows methods to modify the original object or array.

---

## Example with Array

```java
public static void change(int[] arr)
{
    arr[0] = 100;
}

public static void main(String[] args)
{
    int[] nums = {1, 2, 3};

    change(nums);

    System.out.println(nums[0]);
}
```

### Output

```text
100
```

---

# 9. Strings and Immutability

Strings are objects, but they behave differently.

Strings are immutable.

Once created, they cannot be changed.

---

## Example

```java
public static void change(String s)
{
    s = "Java";
}

public static void main(String[] args)
{
    String name = "Komal";

    change(name);

    System.out.println(name);
}
```

### Output

```text
Komal
```

The original string remains unchanged.

---

# 10. Best Practices for Writing Methods

## Use Meaningful Names

Good:

```java
calculateArea()
isPrime()
findMaximum()
```

Bad:

```java
calc()
fun1()
abc()
```

---

## Keep Methods Small

Good:

```java
calculateArea()
```

Bad:

```java
calculateAreaAndPrintAndSaveAndSend()
```

---

## One Responsibility

A method should solve one problem only.

---

## Avoid Repetition

If code is repeated more than once:

Move it into a method.

---

# Quick Revision

## Functions

- Reusable block of code
- Improve readability and reusability
- Reduce duplication

---

## Methods in Java

```java
returnType methodName(parameters)
```

---

## Types of Methods

### Void Method

```java
public static void greet()
```

Returns nothing.

---

### Return Method

```java
public static int add()
```

Returns a value.

---

### No Parameter Method

```java
printLine()
```

Requires no input.

---

## static

- Belongs to class
- Can be called without creating objects

---

## Method Overloading

```java
add(int,int)
add(double,double)
add(int,int,int)
```

Same name, different parameters.

---

## Pass By Value

Primitive types:

```java
int
double
char
boolean
```

Copy is passed.

Original variable remains unchanged.

---

## Arrays & Objects

Reference is copied.

Original data can be modified.

---

## Strings

Immutable.

Cannot be modified after creation.

---

# Day 05 Progress

✅ Why Functions  
✅ Methods in Java  
✅ Anatomy of a Method  
✅ Void Methods  
✅ Return Type Methods  
✅ Methods with No Parameters  
✅ static Keyword  
✅ Method Overloading  
✅ Pass By Value  
✅ Arrays & References  
✅ String Immutability  
✅ Method Best Practices