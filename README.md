# Java and DSA Partner Challenge

Java fundamentals, practice programs, and DSA preparation notes.

## Repository structure

```text
.
├── docs/                  # Course notes arranged by learning day
├── src/main/java/         # Standalone Java practice programs
│   ├── conditionals/
│   ├── loops/
│   ├── methods/
│   ├── operators/
│   ├── patterns/
│   └── recursion/
└── README.md
```

## Course notes

- [Day 1 - Java introduction](docs/Day1-JavaIntroduction.md)
- [Day 1 - Pseudocode and flowcharts](docs/Day1(2)-PseudocodeAndFlowcharts.md)
- [Day 2 - Variables, data types, input, output and debugging](docs/Day2.md)
- [Day 2 - Practice](docs/Day2(2)-practice.md)
- [Day 3 - Literals, operators and conditional statements](docs/Day3.md)
- [Day 4 - Loops and pattern problems](docs/Day4-Loops.md)
- [Day 5 - Functions and methods](docs/Day5-Function&Method.md)
- [Day 6 - Functions and methods practice](docs/Day6-FunctionPractice.md)

## Java examples

Each `.java` file is a small standalone example with its own `main` method where applicable. The files intentionally remain in the default package so they can be compiled and run individually.

Example:

```powershell
javac src/main/java/patterns/HalfPyramid.java
java -cp src/main/java/patterns HalfPyramid
```

Compiled `.class` files are ignored and should not be pushed to Git.