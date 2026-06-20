# Day 04 – Loops, Nested Loops ,Break and Continue & Pattern Problems in Java

## Topics Covered

- While Loop
- For Loop
- Do-While Loop
- Break Statement
- Continue Statement
- Number-Based Loop Problems
- Nested Loops
- Pattern Printing Logic

---

# 1. While Loop

## Definition

A `while` loop is used when we don't know exactly how many times a task needs to be repeated.

The loop continues executing as long as the condition remains `true`.

## Syntax

```java
while(condition)
{
    // code
}
```

## Flow

```text
Condition Check
      ↓
   True ?
      ↓
 Execute Code
      ↓
 Back to Condition

False → Exit Loop
```

## Example

```java
int i = 1;

while(i <= 5)
{
    System.out.println(i);
    i++;
}
```

### Output

```text
1
2
3
4
5
```

---

# 2. For Loop

## Definition

A `for` loop is used when we know exactly how many times the loop should execute.

## Syntax

```java
for(initialization; condition; updation)
{
    // code
}
```

## Example

```java
for(int i = 1; i <= 5; i++)
{
    System.out.println(i);
}
```

### Output

```text
1
2
3
4
5
```

---

# 3. Do-While Loop

## Definition

A `do-while` loop executes the loop body at least one time and then checks the condition.

### Important Point

Even if the condition is false, the code runs once.

## Syntax

```java
do
{
    // code
}
while(condition);
```

## Example

```java
int i = 1;

do
{
    System.out.println(i);
    i++;
}
while(i <= 5);
```

### Output

```text
1
2
3
4
5
```

---

# Difference Between While and Do-While

| While Loop | Do-While Loop |
|------------|---------------|
| Checks condition first | Executes code first |
| May run zero times | Runs at least once |
| Entry Controlled Loop | Exit Controlled Loop |

---

# 4. Break Statement

## Definition

The `break` statement immediately terminates the loop.

## Example

```java
for(int i = 1; i <= 10; i++)
{
    if(i == 5)
    {
        break;
    }
    System.out.println(i);
}
```

### Output

```text
1
2
3
4
```

---

# 5. Continue Statement

## Definition

The `continue` statement skips the current iteration and moves to the next iteration.

## Example

```java
for(int i = 1; i <= 5; i++)
{
    if(i == 3)
    {
        continue;
    }

    System.out.println(i);
}
```

### Output

```text
1
2
4
5
```

---

# Loop Practice Problems

---

# 6. Reverse the Number (Digit by Digit)

## Problem
Print digits of a number in reverse order.

## Code
```java
public class ReverseNum{
    public static void main(String[] args) {
        int n = 28032004;

        while(n > 0){
            int rev = n % 10;
            System.out.print(rev + " ");
            n /= 10;
        }
    }
}
```

### Output
```text
4 0 0 2 3 0 8 2
```

## Logic
```text
28032004 % 10 = 4
2803200  % 10 = 0
280320   % 10 = 0...
```
Each time:
```java
n % 10
```
gives the last digit and
```java
n /= 10
```
removes the last digit.

---

# 7. Reverse the Whole Number

## Problem
Reverse the complete number.

## Code
```java
public class ReverseWholeNum {
    public static void main(String[] args) {
        int n = 28032004;
        int rev = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            rev = (rev * 10) + lastDigit;
            n = n / 10;
        }
        System.out.print(rev);
    }
}
```

### Output
```text
40023082
```

## Logic
```text
rev = 0
4      → 4
0      → 40
0      → 400
2      → 4002...
```
Formula:
```java
rev = (rev * 10) + lastDigit;
```
---

# 8. Prime Number Check

## Problem
Check whether a number is prime or not.

## Code
```java
import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean isPrime = true;

        if (n == 2) {
            System.out.println(n + " is a prime number.");
        }
        else {

            for (int i = 2; i <= n / 2; i++) {

                if (n % i == 0) {
                    isPrime = false;
                }
            }
        }

        if (isPrime == true) {
            System.out.println(n + " is a prime number.");
        }
        else {
            System.out.println(n + " is not a prime number.");
        }

        sc.close();
    }
}
```

## Logic
A prime number is divisible only by:
```text
1 and itself
```
Examples:
```text
2, 3, 5, 7, 11, 13
```
Non-prime:
```text
4, 6, 8, 9, 10
```
Because:
```text
4 → divisible by 2
6 → divisible by 2 and 3
```
---

# 9. Nested Loops

## Definition
A loop inside another loop is called a Nested Loop.
## Structure
```java
for(...)
{
    for(...)
    {
        // code
    }
}
```

### Terminology
```text
Outer Loop → Controls rows/lines
Inner Loop → Controls columns/items
```
---

# Pattern Printing Logic
Most pattern problems follow three questions:

### Step 1: Count Lines
The outer loop controls the number of rows.
```text
4 rows → Outer loop runs 4 times
```
### Step 2: Count Items
The inner loop controls how many symbols/numbers are printed.
### Step 3: Decide What to Print
```java
"*"
number
character
space
```

---

# 10. Pattern 1 – Half Pyramid
## Pattern
```text
*
**
***
****
```
## Logic
```text
Line 1 → 1 star
Line 2 → 2 stars
Line 3 → 3 stars
Line 4 → 4 stars
```
### Outer Loop
```java
line = 1 to 4
```
### Inner Loop
```java
star = 1 to line
```
## Code
```java
for(int line = 1; line <= 4; line++)
{
    for(int star = 1; star <= line; star++)
    {
        System.out.print("*");
    }
    System.out.println();
}
```

---

# 11. Pattern 2 – Inverted Half Pyramid
## Pattern

```text
****
***
**
*
```
## Logic
```text
Line 1 → 4 stars
Line 2 → 3 stars
Line 3 → 2 stars
Line 4 → 1 star
```
Formula:
```java
stars = n - line + 1
```
## Code
```java
int n = 4;

for(int line = 1; line <= n; line++)
{
    for(int star = 1; star <= n - line + 1; star++)
    {
        System.out.print("*");
    }
    System.out.println();
}
```

---

# 12. Pattern 3 – Half Pyramid with Numbers
## Pattern
```text
1
12
123
1234
```
## Logic
```text
Line 1 → 1
Line 2 → 1 2
Line 3 → 1 2 3
Line 4 → 1 2 3 4
```
### Outer Loop
```java
line = 1 to 4
```
### Inner Loop
```java
number = 1 to line
```
## Code
```java
for(int line = 1; line <= 4; line++)
{
    for(int num = 1; num <= line; num++)
    {
        System.out.print(num);
    }
    System.out.println();
}
```
### Output
```text
1
12
123
1234
```

---

# 13. Pattern 4 – Character Pyramid
## Problem
Print characters continuously in pyramid form.
## Code
```java
public class Ptn4 {
    public static void main(String[] args) {

        char ch = 'A';
        int n = 4;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
```
### Output
```text
A
BC
DEF
GHIJ
```
## Logic
```text
Line 1 → A
Line 2 → B C
Line 3 → D E F
Line 4 → G H I J
```
Character variable keeps increasing:
```java
ch++;
```
which moves:
```text
A → B → C → D → E ...
```
---

# Quick Revision
### Loops
- `while`
- `for`
- `do-while`
### Loop Control Statements
- `break`
- `continue`
### Number Problems
- Reverse Digits
- Reverse Whole Number
- Prime Number
### Nested Loops
- Loop inside another loop
### Pattern Logic
1. Count rows
2. Count items per row
3. Decide what to print
### Patterns Practiced
- Half Pyramid
- Inverted Half Pyramid
- Number Pyramid
- Character Pyramid
---

# Day 04 Progress
✅ While Loop  
✅ For Loop  
✅ Do-While Loop  
✅ Break Statement  
✅ Continue Statement  
✅ Reverse Number  
✅ Reverse Whole Number  
✅ Prime Number Check  
✅ Nested Loops  
✅ Pattern Printing Logic  
✅ Half Pyramid  
✅ Inverted Half Pyramid  
✅ Number Pyramid  
✅ Character Pyramid