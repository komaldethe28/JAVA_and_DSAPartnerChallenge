# Day 1 (Part 2) — Pseudocode & Flowcharts

> Java DSA Foundation | Day 1 Practice

Before writing Java programs, learn to think like a programmer using pseudocode and flowcharts.

---

# 1. Leap Year Check

## Problem

Input a year and determine whether it is a leap year.

### Leap Year Rule

A year is a leap year if:
* It is divisible by 4
* AND
* It is not divisible by 100 OR it is divisible by 400
---

## Pseudocode
```text
START

INPUT year

IF (year % 4 == 0) AND (year % 100 != 0 OR year % 400 == 0)
    PRINT "Leap Year"
ELSE
    PRINT "Not Leap Year"
END IF

END
```

---

## Flowchart

```text
Start
  ↓
Input Year
  ↓
Check:
Year % 4 == 0
AND
(Year % 100 != 0 OR Year % 400 == 0) ?
  ↓
Yes → Print "Leap Year"
No  → Print "Not Leap Year"
  ↓
End
```

---

# 2. Sum of Two Numbers

## Problem

Take two numbers as input and print their sum.

---

## Pseudocode

```text
START

INPUT num1
INPUT num2

sum = num1 + num2

PRINT sum

END
```

---

## Flowchart

```text
Start
  ↓
Input num1, num2
  ↓
sum = num1 + num2
  ↓
Print sum
  ↓
End
```

---

# 3. Multiplication Table

## Problem

Take a number as input and print its multiplication table from 1 to 10.

---

## Pseudocode

```text
START

INPUT number

FOR i = 1 TO 10
    result = number * i
    PRINT number × i = result
END FOR

END
```

---

## Flowchart

```text
Start
  ↓
Input number
  ↓
i = 1
  ↓
Check i ≤ 10 ?
  ↓
Yes → Print number × i
       i = i + 1
       Repeat
No
  ↓
End
```

---

# 4. HCF and LCM

## Problem

Take two numbers as input and find:

* HCF (Highest Common Factor)
* LCM (Least Common Multiple)

### Formula

```text
LCM = (a × b) / HCF
```

---

## Pseudocode

```text
START

INPUT a
INPUT b

temp1 = a
temp2 = b

WHILE b ≠ 0
    remainder = a % b
    a = b
    b = remainder
END WHILE

HCF = a

LCM = (temp1 * temp2) / HCF

PRINT HCF
PRINT LCM

END
```

---

## Flowchart

```text
Start
  ↓
Input a, b
  ↓
Check b ≠ 0 ?
  ↓
Yes → remainder = a % b
       a = b
       b = remainder
       Repeat
No
  ↓
HCF = a
  ↓
LCM = (temp1 × temp2) / HCF
  ↓
Print HCF and LCM
  ↓
End
```

---

# 5. Sum Until 'x'

## Problem

Keep taking numbers as input until the user enters `x`.

After that, print the total sum.

---

## Pseudocode

```text
START

sum = 0

REPEAT

    INPUT value

    IF value == 'x'
        BREAK
    END IF

    sum = sum + value

UNTIL value == 'x'

PRINT sum

END
```

---

## Flowchart

```text
Start
  ↓
sum = 0
  ↓
Input value
  ↓
Check value == 'x' ?
  ↓
Yes → Print sum
        ↓
       End

No
  ↓
sum = sum + value
  ↓
Repeat
```

---

# Key Takeaways

* Pseudocode focuses on logic, not syntax.
* Flowcharts visually represent program flow.
* Conditions are represented using decision blocks.
* Loops repeat execution until a condition becomes false.
* Good programmers design logic before writing code.

---