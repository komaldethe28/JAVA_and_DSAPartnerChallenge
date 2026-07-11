# Day 06 – Functions Practice for DSA

## Topics Covered

- Problem Solving with Functions
- Function Design
- Input → Process → Output Thinking
- Prime Number Function
- Grade Calculator Function
- Factorial Function
- Palindrome Number Function
- Refactoring Previous Programs into Functions
- Pythagorean Triplet Check
- Prime Numbers in a Range
- Sum of First N Natural Numbers

---

# Today's Goal

No new Java syntax.
The focus is on strengthening problem-solving skills using methods (functions).
Every problem should be solved using a proper function and called from `main()`.

---

# How to Approach Every Function Problem
Before writing code, answer these questions:

### 1. What are the Inputs?
What values does the function need?
Example:
```java
isPrime(int n)
```
Input:
```text
n
```
---

### 2. What is the Output?
What should the function return?
Example:
```java
boolean
```
Output:
```text
true or false
```
---

### 3. What is the Logic?
Write the steps before coding.
Example:
```text
Check divisibility
If divisible → false
Otherwise → true
```
---

# Function Design Formula
```text
Input
  ↓
Process
  ↓
Output
```
Every DSA problem follows this pattern.
---

# Q1. Is a Number Prime?

## Problem
Create a method that returns:

```java
true
```

if the number is prime, otherwise

```java
false
```

---

## What Makes a Number Prime?
A prime number has exactly two factors:

```text
1 and itself
```

Examples:

```text
2, 3, 5, 7, 11, 13
```

Not Prime:

```text
1, 4, 6, 8, 9, 10
```

---

## Optimized Solution

### Why Check Only Until √n?

Example:

```text
36
```

Factors:

```text
2 × 18
3 × 12
4 × 9
6 × 6
```

After √36 = 6, factor pairs repeat.

Therefore:

```text
Checking till √n is enough
```

---

## Java Code

```java
public static boolean isPrime(int n) {

    if (n <= 1)
        return false;

    if (n == 2)
        return true;

    if (n % 2 == 0)
        return false;

    for (int i = 3; i <= Math.sqrt(n); i += 2) {

        if (n % i == 0)
            return false;
    }

    return true;
}
```

### Example

```java
System.out.println(isPrime(13));
```

### Output

```text
true
```

---

# Q2. Grade Calculator

## Problem

Create a method that takes marks and returns grade.

---

## Grade Table

| Marks | Grade |
|---------|---------|
| 91-100 | AA |
| 81-90 | AB |
| 71-80 | BB |
| 61-70 | BC |
| 51-60 | CD |
| 41-50 | DD |
| ≤40 | Fail |

---

## Java Code

```java
public static String getGrade(int marks) {

    if (marks >= 91)
        return "AA";

    else if (marks >= 81)
        return "AB";

    else if (marks >= 71)
        return "BB";

    else if (marks >= 61)
        return "BC";

    else if (marks >= 51)
        return "CD";

    else if (marks >= 41)
        return "DD";

    else
        return "Fail";
}
```

### Example

```java
System.out.println(getGrade(85));
```

### Output

```text
AB
```

---

# Q3. Factorial

## Problem

Create a method that returns:

```text
n!
```

---

## Formula

```text
n! = 1 × 2 × 3 × ... × n
```

Examples:

```text
5! = 120
```

```text
4! = 24
```

---

## Important Edge Cases

```text
0! = 1
1! = 1
```

---

## Java Code

```java
public static long factorial(int n) {

    if (n == 0 || n == 1)
        return 1;

    long result = 1;

    for (int i = 2; i <= n; i++) {
        result *= i;
    }

    return result;
}
```

### Example

```java
System.out.println(factorial(5));
```

### Output

```text
120
```

---

# Q4. Is a Number a Palindrome?

## Problem

Return:

```java
true
```

if a number reads the same from both directions.

---

## Examples

Palindrome:

```text
121
1331
777
```

Not Palindrome:

```text
123
456
```

---

## Logic

Reverse the number and compare.

---

## Java Code

```java
public static boolean isPalindrome(int n) {

    if (n < 0)
        return false;

    int original = n;
    int reversed = 0;

    while (n > 0) {

        int digit = n % 10;

        reversed = reversed * 10 + digit;

        n = n / 10;
    }

    return original == reversed;
}
```

### Example

```java
System.out.println(isPalindrome(121));
```

### Output

```text
true
```

---

## How Reversal Works

Example:

```text
121
```

### Iteration 1

```text
digit = 1
reversed = 1
n = 12
```

### Iteration 2

```text
digit = 2
reversed = 12
n = 1
```

### Iteration 3

```text
digit = 1
reversed = 121
n = 0
```

Compare:

```text
121 == 121
```

Result:

```text
true
```

---

# Q5. Refactor Previous Programs into Functions

## What is Refactoring?

Refactoring means improving code structure without changing behavior.

---

## Examples

### Even/Odd

```java
public static boolean isEven(int n)
{
    return n % 2 == 0;
}
```

---

### Leap Year

```java
public static boolean isLeapYear(int year)
{
    return (year % 400 == 0)
        || (year % 4 == 0 && year % 100 != 0);
}
```

---

### Area of Circle

```java
public static double areaOfCircle(double r)
{
    return Math.PI * r * r;
}
```

---

### Rectangle Perimeter

```java
public static double perimeterOfRectangle(double l, double b)
{
    return 2 * (l + b);
}
```

---

### Simple Interest

```java
public static double simpleInterest(double p,
                                    double t,
                                    double r)
{
    return (p * t * r) / 100;
}
```

---

# Why Refactoring Matters

Bad:

```java
if(...)
{
   // random logic
}
```

Good:

```java
isLeapYear(year);
```

Named functions make code easier to read and maintain.

---

# Q6. Pythagorean Triplet

## Problem

Determine whether three numbers form a Pythagorean triplet.

---

## Formula

```text
a² + b² = c²
```

Example:

```text
3, 4, 5

9 + 16 = 25
```

Result:

```text
true
```

---

## Java Code

```java
public static boolean isPythagorean(int a,
                                    int b,
                                    int c)
{
    int[] nums = {a, b, c};

    java.util.Arrays.sort(nums);

    return nums[0] * nums[0]
         + nums[1] * nums[1]
         == nums[2] * nums[2];
}
```

### Example

```java
System.out.println(
    isPythagorean(3, 4, 5)
);
```

### Output

```text
true
```

---

# Q7. All Primes Between Two Numbers

## Problem

Print all prime numbers within a range.

---

## Important Concept

Reuse:

```java
isPrime()
```

This demonstrates the power of functions.

---

## Java Code

```java
public static void printPrimes(
        int start,
        int end)
{
    for(int i = start;
        i <= end;
        i++)
    {
        if(isPrime(i))
        {
            System.out.print(i + " ");
        }
    }
}
```

### Example

```java
printPrimes(10, 30);
```

### Output

```text
11 13 17 19 23 29
```

---

# Reusability in Action

Without functions:

```java
Prime logic repeated everywhere
```

With functions:

```java
if(isPrime(i))
```

Cleaner, shorter, reusable.

---

# Q8. Sum of First N Natural Numbers

## Problem

Return:

```text
1 + 2 + 3 + ... + n
```

---

## Approach 1 – Formula (Preferred)

### Formula

```text
n × (n + 1) / 2
```

### Time Complexity

```text
O(1)
```

---

## Java Code

```java
public static long sumNaturals(int n)
{
    return (long)n * (n + 1) / 2;
}
```

### Example

```java
System.out.println(sumNaturals(5));
```

### Output

```text
15
```

---

# Approach 2 – Loop

### Time Complexity

```text
O(n)
```

---

## Java Code

```java
public static long sumNaturalsLoop(int n)
{
    long sum = 0;

    for(int i = 1; i <= n; i++)
    {
        sum += i;
    }

    return sum;
}
```

---

# DSA Insight

The formula:

```text
n × (n + 1) / 2
```

appears frequently in:

- Array problems
- Mathematical algorithms
- Complexity analysis
- Counting problems

Memorize it.

---

# Key Learning of Day 06

Functions help us:

- Reuse code
- Reduce duplication
- Improve readability
- Make DSA solutions modular

Most real-world algorithms are broken into small reusable methods.

---

# Quick Revision

### Functions Practiced

- `isPrime()`
- `getGrade()`
- `factorial()`
- `isPalindrome()`
- `isEven()`
- `isLeapYear()`
- `areaOfCircle()`
- `perimeterOfRectangle()`
- `simpleInterest()`
- `isPythagorean()`
- `printPrimes()`
- `sumNaturals()`

---

# Checklist Before Sleep

✅ Solved `isPrime()` using √n optimization  
✅ Implemented `getGrade()` using if-else ladder  
✅ Solved `factorial()` and handled `0!`  
✅ Implemented palindrome using digit reversal  
✅ Refactored old programs into methods  
✅ Solved Pythagorean Triplet problem  
✅ Printed prime numbers in a range  
✅ Learned formula for sum of N natural numbers

---

# Day 06 Progress

✅ Functions Practice  
✅ Prime Number Function  
✅ Grade Calculator  
✅ Factorial  
✅ Palindrome Number  
✅ Refactoring  
✅ Pythagorean Triplet  
✅ Prime Range  
✅ Sum of Natural Numbers  
✅ Function-Based Problem Solving