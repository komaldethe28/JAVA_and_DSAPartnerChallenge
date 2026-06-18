# Day 2 — Java Practice Solutions

## 1. Even or Odd

```java
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        sc.close();
    }
}
```

---

## 2. Greeting Program

```java
import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        System.out.println("Hello " + name + ", welcome!");

        sc.close();
    }
}
```

---

## 3. Simple Interest Calculator

```java
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double principal = sc.nextDouble();
        double time = sc.nextDouble();
        double rate = sc.nextDouble();

        double si = (principal * time * rate) / 100;

        System.out.println("Simple Interest = " + si);

        sc.close();
    }
}
```

---

## 4. INR to USD Converter

```java
import java.util.Scanner;

public class INRtoUSD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double inr = sc.nextDouble();

        double usd = inr / 83.5;

        System.out.printf("USD = %.2f%n", usd);

        sc.close();
    }
}
```

---

## 5. Fibonacci Series

```java
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a = 0, b = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");

            int next = a + b;
            a = b;
            b = next;
        }

        sc.close();
    }
}
```

### Sample Input

```text
7
```

### Output

```text
0 1 1 2 3 5 8
```

---

## 6. Palindrome String

```java
import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        if (str.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        sc.close();
    }
}
```

### Sample Input

```text
racecar
```

### Output

```text
Palindrome
```

### Sample Input

```text
hello
```

### Output

```text
Not a Palindrome
```

---

## 7. Armstrong Numbers Between Two Numbers

```java
import java.util.Scanner;

public class ArmstrongRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();

        for (int num = start; num <= end; num++) {

            int original = num;
            int temp = num;
            int digits = String.valueOf(num).length();

            int sum = 0;

            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }

            if (sum == original) {
                System.out.println(original);
            }
        }

        sc.close();
    }
}
```

### Sample Input

```text
100 500
```

### Output

```text
153
370
371
407
```

---

## Concepts Practiced

* Variables
* Primitive Data Types
* Input using Scanner
* Output using print / println / printf
* Arithmetic Operators
* Strings
* Basic Problem Solving
