# Java Notes – Literals, Operators, Conditional Statements & Switch Statement

## 1. Literals

### Definition
Literals are the actual values that we put into variables.

### Example

```java
int age = 25;
```

Here:

- `int` → Data Type
- `age` → Variable
- `25` → Literal

### Common Types of Literals

#### Integer Literal

```java
int num = 100;
```

#### Floating Point Literal

```java
double price = 99.99;
```

#### Character Literal

```java
char grade = 'A';
```

#### String Literal

```java
String name = "Komal";
```

#### Boolean Literal

```java
boolean isJavaFun = true;
```

---

# 2. Operators

### Definition

Operators are symbols that tell the compiler to perform some operation on operands.

Example:

```java
int result = 10 + 20;
```

Here `+` is an operator.

---

## 2.1 Arithmetic Operators

Used for mathematical calculations.

### Binary Arithmetic Operators

| Operator | Meaning |
|-----------|-----------|
| `+` | Addition |
| `-` | Subtraction |
| `*` | Multiplication |
| `/` | Division |
| `%` | Modulus (Remainder) |

### Example

```java
int a = 10;
int b = 3;

System.out.println(a + b); // 13
System.out.println(a - b); // 7
System.out.println(a * b); // 30
System.out.println(a / b); // 3
System.out.println(a % b); // 1
```

---

### Unary Operators

| Operator | Meaning |
|-----------|-----------|
| `++` | Increment |
| `--` | Decrement |

#### Increment

```java
int x = 5;
x++;
System.out.println(x); // 6
```

#### Decrement

```java
int x = 5;
x--;
System.out.println(x); // 4
```

---

## 2.2 Relational Operators

Used to compare two values.

| Operator | Meaning |
|-----------|-----------|
| `==` | Equal To |
| `!=` | Not Equal To |
| `>` | Greater Than |
| `<` | Less Than |
| `>=` | Greater Than or Equal To |
| `<=` | Less Than or Equal To |

### Example

```java
int a = 10;
int b = 20;

System.out.println(a == b); // false
System.out.println(a != b); // true
System.out.println(a > b);  // false
System.out.println(a < b);  // true
```

---

## 2.3 Logical Operators

Used to combine multiple conditions.

| Operator | Meaning |
|-----------|-----------|
| `&&` | Logical AND |
| `||` | Logical OR |
| `!` | Logical NOT |

### Logical AND (`&&`)

Returns `true` only if both conditions are true.

```java
System.out.println(true && true);   // true
System.out.println(true && false);  // false
```

### Logical OR (`||`)

Returns `true` if at least one condition is true.

```java
System.out.println(true || false);  // true
System.out.println(false || false); // false
```

### Logical NOT (`!`)

Reverses the boolean value.

```java
System.out.println(!true);  // false
System.out.println(!false); // true
```

---

## 2.4 Assignment Operators

Used to assign values to variables.

| Operator | Meaning |
|-----------|-----------|
| `=` | Assign |
| `+=` | Add and Assign |
| `-=` | Subtract and Assign |
| `*=` | Multiply and Assign |
| `/=` | Divide and Assign |

### Examples

```java
int a = 10;

a += 5;   // a = a + 5
a -= 2;   // a = a - 2
a *= 3;   // a = a * 3
a /= 2;   // a = a / 2
```

### Note

Assignment operators have **Right-to-Left Associativity**.

Example:

```java
int a, b, c;
a = b = c = 10;
```

Execution:

```java
c = 10
b = c
a = b
```

---

# 3. Conditional Statements

Conditional statements allow a program to make decisions based on conditions.

---

## 3.1 if Statement

### Syntax

```java
if(condition)
{
    // code
}
```

### Example

```java
int age = 18;

if(age >= 18)
{
    System.out.println("Eligible to vote");
}
```

---

## 3.2 if-else Statement

### Syntax

```java
if(condition)
{
    // code
}
else
{
    // code
}
```

### Example

```java
int age = 16;

if(age >= 18)
{
    System.out.println("Adult");
}
else
{
    System.out.println("Minor");
}
```

---

## 3.3 else-if Ladder

Used when multiple conditions need to be checked.

### Syntax

```java
if(condition1)
{
    // code
}
else if(condition2)
{
    // code
}
else
{
    // code
}
```

### Example

```java
int marks = 75;

if(marks >= 90)
{
    System.out.println("Grade A");
}
else if(marks >= 70)
{
    System.out.println("Grade B");
}
else
{
    System.out.println("Grade C");
}
```

### Flow(Important)

- Check Condition 1
- If true → Execute block
- Otherwise check Condition 2
- If true → Execute block
- Otherwise execute `else` block

---

# 4. Ternary Operator

The ternary operator is a shorthand version of `if-else`.

### Syntax

```java
variable = condition ? statement1 : statement2;
```

### Example

```java
String type = (5 % 2 == 0) ? "Even" : "Odd";

System.out.println(type);
```

### Working

```text
Condition True  → statement1
Condition False → statement2
```

Equivalent to:

```java
if(5 % 2 == 0)
{
    type = "Even";
}
else
{
    type = "Odd";
}
```

---

# 5. Switch Statement

Used when multiple choices depend on the value of a single variable.

### Syntax

```java
switch(variable)
{
    case value1:
        // code
        break;

    case value2:
        // code
        break;

    case value3:
        // code
        break;

    default:
        // code
}
```

### Example

```java
int day = 2;

switch(day)
{
    case 1:
        System.out.println("Monday");
        break;

    case 2:
        System.out.println("Tuesday");
        break;

    case 3:
        System.out.println("Wednesday");
        break;

    default:
        System.out.println("Invalid Day");
}
```

### Importance of `break`

`break` stops execution after a matching case is found.

Without `break`, execution continues to the next cases (fall-through behavior).

---

# Quick Revision

### Literals

- Actual values stored in variables.
- Example: `25`, `'A'`, `"Java"`, `true`

### Operators

- Arithmetic → `+ - * / %`
- Unary → `++ --`
- Relational → `== != > < >= <=`
- Logical → `&& || !`
- Assignment → `= += -= *= /=`

### Conditional Statements

- `if`
- `if-else`
- `else-if ladder`

### Ternary Operator

```java
condition ? value1 : value2
```

### Switch Statement

```java
switch(variable)
{
    case value:
        break;

    default:
}
```

---
## Todays Practice Codes:

## 1. Find Even and Odd using Conditional Statement

```java
public class EvenOdd{
    public static void main(String args[]){
        int num=101;
        if (num %2==0){
            System.out.print("the number is Even");
        }
        else{
            System.out.print("the number is Odd");
        }
    }
}
```
## 2. Find Greatest Of Three using Conditional Statement 

```java
import java.util.Scanner;
public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int A= sc.nextInt();
        int B= sc.nextInt();
        int C= sc.nextInt();

        if((A>B) && (A>C)){
            System.out.print("Greatest number is" + A);
        }
        else if(B>C){
            System.out.print("Greatest number is" + A);
        }
        else{
            System.out.print("Greatest number is" + C);
        }
        sc.close();
    }
}
```
## 3. Find You have a fever or Not from given temperature

```java
public class Solution {
    public static void main(String[] args) {
        double temp = 103.5;
        if (temp>100){
            System.out.print("You have a fever");
        }else{
            System.out.print("You don't have a fever");
        }

    }
}
```
## 4. Take a nput from user and find if the year is Leap or Not

```java
import java.util.Scanner;

public class LeapYr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int yr=sc.nextInt();
        
        if((yr%4==0) && (yr%100!=0 || yr%400==0)){
            System.out.println(yr + "-is leap year");
        }else{
            System.out.println(yr + "-is not a leap year");
        }

        sc.close();
    }
}
```
## 5. Calculate Tax from users given income

```java
import java.util.Scanner;

public class IncomeTaxCal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int income= sc.nextInt();
        int tax;
        if(income<500000){
            tax =0;
        }
        else if(income>=500000 && income<1000000){
            tax= (int) (income*(0.2));
        }
        else{
            tax= (int) (income*(0.3));
        }
        System.out.print("ypur TAX is-" + tax);
        sc.close();
    }
    
}
```
## 6. Find Day of week using Switch Statement

```java
public class DayOfWeek {
    public static void main(String[] args) {
        int num=7;
        
        switch(num){
            case 1: System.out.println("Its Sunday");
                break;
            case 2: System.out.println("Its Monday");
                break;
            case 3: System.out.println("Its Tuesday");
                break;
            case 4: System.out.println("Its Wedsday");
                break;
            case 5: System.out.println("Its Thusday");
                break;
            case 6: System.out.println("Its Friday");
                break;
            case 7: System.out.println("Its Saturday");
                break; 
            default: System.out.println("Enter number between 1 to 7");
        }
    }
}

```
---
## Day 3 Progress and Concepts Practiced

✅ Literals  
✅ Operators  
✅ Conditional Statements  
✅ Ternary Operator  
✅ Switch Statement