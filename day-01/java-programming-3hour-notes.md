# Java Programming - Complete 3-Hour Session Notes

## Table of Contents

1. [Introduction & Setup](#introduction--setup)
2. [Java Basics](#java-basics)
3. [Variables & Data Types](#variables--data-types)
4. [Operators](#operators)
5. [Control Flow](#control-flow)
6. [Object-Oriented Programming](#object-oriented-programming)
7. [Methods & Functions](#methods--functions)
8. [Arrays & Collections](#arrays--collections)
9. [Exception Handling](#exception-handling)
10. [String Handling](#string-handling)

---

## Introduction & Setup

### What is Java?

- **Platform-independent language**: "Write Once, Run Anywhere" (WORA)
- **Object-oriented**: Everything revolves around objects and classes
- **Strongly typed**: Variables must be declared with specific types
- **Compiled & Interpreted**: Compiled to bytecode, interpreted by JVM

### Java Environment Setup

```
JDK (Java Development Kit)
  ├── JVM (Java Virtual Machine) - Executes bytecode
  ├── JRE (Java Runtime Environment) - Runtime only
  └── Compiler (javac) - Converts .java to .class
```

### Your First Java Program

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

**Key Points:**

- `public` - Accessible from anywhere
- `static` - Belongs to class, not instance
- `void` - Returns nothing
- `main()` - Entry point of program
- `String[] args` - Command-line arguments

---

## Java Basics

### Compilation & Execution

```bash
# Compilation
javac HelloWorld.java  → Creates HelloWorld.class

# Execution
java HelloWorld        → Runs the program
```

### Comments

```java
// Single line comment

/*
  Multi-line comment
  Can span multiple lines
*/

/**
 * JavaDoc comment
 * Used for documentation
 */
```

### Package Structure

```java
package com.example.app;  // Package declaration (must be first)
import java.util.*;       // Import statements
```

---

## Variables & Data Types

### Primitive Data Types

| Type      | Size    | Range                       | Example             |
| --------- | ------- | --------------------------- | ------------------- |
| `byte`    | 8 bits  | -128 to 127                 | `byte b = 10;`      |
| `short`   | 16 bits | -32,768 to 32,767           | `short s = 100;`    |
| `int`     | 32 bits | -2^31 to 2^31-1             | `int i = 1000;`     |
| `long`    | 64 bits | Very large numbers          | `long l = 100000L;` |
| `float`   | 32 bits | Decimal numbers             | `float f = 3.14f;`  |
| `double`  | 64 bits | Decimal numbers (preferred) | `double d = 3.14;`  |
| `boolean` | 1 bit   | true / false                | `boolean b = true;` |
| `char`    | 16 bits | Single character            | `char c = 'A';`     |

### Variable Declaration

```java
int age = 25;              // Local variable
final int MAX = 100;       // Constant (cannot be changed)
static int counter = 0;    // Class variable (shared)
```

### Type Conversion

```java
// Implicit (automatic)
int a = 10;
double b = a;  // int → double (widening)

// Explicit (casting)
double x = 3.14;
int y = (int) x;  // double → int (narrowing)
```

### Variable Scope

```java
public class ScopeExample {
    static int globalVar = 10;  // Class scope

    public void method() {
        int localVar = 5;       // Method scope
        if (true) {
            int blockVar = 3;   // Block scope
        }
        // blockVar not accessible here
    }
}
```

---

## Operators

### Arithmetic Operators

```java
int a = 10, b = 3;
int sum = a + b;        // 13
int diff = a - b;       // 7
int product = a * b;    // 30
int quotient = a / b;   // 3 (integer division)
int remainder = a % b;  // 1
```

### Assignment Operators

```java
int x = 5;
x += 3;  // x = x + 3 → 8
x -= 2;  // x = x - 2 → 6
x *= 2;  // x = x * 2 → 12
x /= 3;  // x = x / 3 → 4
```

### Comparison Operators

```java
int a = 5, b = 10;
boolean result;

result = a == b;  // false (equal)
result = a != b;  // true (not equal)
result = a < b;   // true (less than)
result = a > b;   // false (greater than)
result = a <= b;  // true (less than or equal)
result = a >= b;  // false (greater than or equal)
```

### Logical Operators

```java
boolean p = true, q = false;

boolean and = p && q;  // false (AND - both must be true)
boolean or = p || q;   // true (OR - at least one true)
boolean not = !p;      // false (NOT - negation)
```

### Increment/Decrement

```java
int x = 5;
int a = x++;   // a = 5, then x = 6 (post-increment)
int b = ++x;   // x = 7, then b = 7 (pre-increment)
int c = x--;   // c = 7, then x = 6 (post-decrement)
```

### Ternary Operator

```java
int age = 20;
String status = age >= 18 ? "Adult" : "Minor";
```

### Operator Precedence

1. Parentheses `()`
2. Multiplication, Division, Modulus `*, /, %`
3. Addition, Subtraction `+, -`
4. Comparison `<, >, <=, >=`
5. Equality `==, !=`
6. Logical AND `&&`
7. Logical OR `||`
8. Assignment `=, +=, -=, etc.`

---

## Control Flow

### If-Else Statements

```java
int age = 20;

if (age < 13) {
    System.out.println("Child");
} else if (age < 18) {
    System.out.println("Teenager");
} else {
    System.out.println("Adult");
}
```

### Switch Statement

```java
char grade = 'A';

switch (grade) {
    case 'A':
        System.out.println("Excellent");
        break;
    case 'B':
        System.out.println("Good");
        break;
    case 'C':
        System.out.println("Average");
        break;
    default:
        System.out.println("Invalid grade");
}
```

### For Loop

```java
// Traditional for loop
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}

// Enhanced for loop (for-each)
int[] numbers = {1, 2, 3, 4, 5};
for (int num : numbers) {
    System.out.println(num);
}
```

### While Loop

```java
int i = 1;
while (i <= 5) {
    System.out.println(i);
    i++;
}
```

### Do-While Loop

```java
int i = 1;
do {
    System.out.println(i);
    i++;
} while (i <= 5);
```

### Break & Continue

```java
for (int i = 1; i <= 10; i++) {
    if (i == 3) {
        continue;  // Skip this iteration
    }
    if (i == 8) {
        break;     // Exit the loop
    }
    System.out.println(i);
}
```

---

## Object-Oriented Programming

### Classes & Objects

```java
public class Car {
    // Attributes (properties)
    String color;
    String model;
    int year;

    // Constructor
    public Car(String color, String model, int year) {
        this.color = color;
        this.model = model;
        this.year = year;
    }

    // Method
    public void display() {
        System.out.println(color + " " + model + " (" + year + ")");
    }
}

// Creating an object
Car myCar = new Car("Red", "Tesla", 2024);
myCar.display();  // Output: Red Tesla (2024)
```

### Access Modifiers

```
public        - Accessible from everywhere
private       - Accessible only within the class
protected     - Accessible in same package and subclasses
(default)     - Accessible only in same package
```

### Encapsulation (Getters & Setters)

```java
public class Student {
    private String name;
    private int age;

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 150) {
            this.age = age;
        }
    }
}
```

### Inheritance

```java
// Parent class
public class Animal {
    public void sound() {
        System.out.println("Some sound");
    }
}

// Child class
public class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Bark");
    }
}
```

### Polymorphism

```java
Animal animal = new Dog();
animal.sound();  // Outputs: Bark (calls Dog's method)
```

### Constructor

```java
public class Person {
    String name;
    int age;

    // Constructor 1
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Constructor 2 (Overloading)
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

### Static Keyword

```java
public class Counter {
    static int count = 0;  // Shared by all instances

    public Counter() {
        count++;
    }

    static void displayCount() {  // Can access static members only
        System.out.println("Count: " + count);
    }
}

Counter.displayCount();  // Call without creating object
```

---

## Methods & Functions

### Method Syntax

```java
accessModifier returnType methodName(parameters) {
    // Method body
    return value;  // If returnType is not void
}

// Example
public int add(int a, int b) {
    return a + b;
}

// Calling
int result = add(5, 3);  // result = 8
```

### Method Overloading

```java
public class Calculator {
    // Method 1
    public int add(int a, int b) {
        return a + b;
    }

    // Method 2 (same name, different parameters)
    public double add(double a, double b) {
        return a + b;
    }

    // Method 3 (different number of parameters)
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}
```

### Method Overriding

```java
public class Employee {
    public void work() {
        System.out.println("Working");
    }
}

public class Manager extends Employee {
    @Override
    public void work() {
        System.out.println("Managing team");
    }
}
```

### Variables Arguments (VarArgs)

```java
public int sum(int... numbers) {
    int total = 0;
    for (int num : numbers) {
        total += num;
    }
    return total;
}

sum(1, 2, 3);           // 6
sum(1, 2, 3, 4, 5);     // 15
```

---

## Arrays & Collections

### Arrays

```java
// Declaration & initialization
int[] numbers = new int[5];           // Size 5, default 0
int[] values = {10, 20, 30, 40, 50}; // With values
String[] names = new String[3];       // Array of strings

// Accessing elements
int first = values[0];    // 10
values[2] = 35;          // Change value

// Array length
int size = values.length;  // 5

// Printing array
System.out.println(Arrays.toString(values));
```

### Multi-dimensional Arrays

```java
// 2D Array
int[][] matrix = new int[3][3];
matrix[0][0] = 1;
matrix[0][1] = 2;

int[][] grid = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

// Accessing
int value = grid[1][2];  // 6
```

### ArrayList

```java
import java.util.ArrayList;

ArrayList<Integer> numbers = new ArrayList<>();
numbers.add(10);        // Add element
numbers.add(20);
numbers.add(30);

int first = numbers.get(0);  // Access: 10
numbers.set(1, 25);          // Modify: 25
numbers.remove(0);           // Remove element

int size = numbers.size();   // 2

// Iterate
for (int num : numbers) {
    System.out.println(num);
}
```

### HashMap

```java
import java.util.HashMap;

HashMap<String, Integer> ages = new HashMap<>();
ages.put("Alice", 25);
ages.put("Bob", 30);

int aliceAge = ages.get("Alice");  // 25
ages.remove("Bob");

if (ages.containsKey("Alice")) {
    System.out.println("Alice found");
}

// Iterate
for (String name : ages.keySet()) {
    System.out.println(name + ": " + ages.get(name));
}
```

---

## Exception Handling

### Try-Catch

```java
try {
    int[] numbers = {1, 2, 3};
    System.out.println(numbers[5]);  // ArrayIndexOutOfBoundsException
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Index out of bounds!");
    e.printStackTrace();
} finally {
    System.out.println("Cleanup code");  // Always executes
}
```

### Multiple Catch Blocks

```java
try {
    int result = 10 / 0;  // ArithmeticException
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero");
} catch (Exception e) {
    System.out.println("General exception");
}
```

### Try-Catch-Finally

```java
FileReader reader = null;
try {
    reader = new FileReader("file.txt");
    // Read file
} catch (FileNotFoundException e) {
    System.out.println("File not found");
} finally {
    if (reader != null) {
        reader.close();
    }
}
```

### Throwing Exceptions

```java
public void validateAge(int age) throws IllegalArgumentException {
    if (age < 0) {
        throw new IllegalArgumentException("Age cannot be negative");
    }
}
```

### Custom Exception

```java
public class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

// Using it
throw new InvalidInputException("Invalid input provided");
```

---

## String Handling

### String Creation

```java
String str1 = "Hello";           // String literal
String str2 = new String("Hello");  // String object

// Note: Both are valid, but literals are more efficient
```

### String Methods

```java
String text = "Hello, World!";

// Length
int len = text.length();  // 13

// Character at index
char ch = text.charAt(0);  // 'H'

// Substring
String sub = text.substring(0, 5);  // "Hello"

// Finding characters
int index = text.indexOf("World");  // 7

// Case conversion
String upper = text.toUpperCase();    // "HELLO, WORLD!"
String lower = text.toLowerCase();    // "hello, world!"

// Trim whitespace
String trimmed = "  Hello  ".trim();  // "Hello"

// Replace
String replaced = text.replace("World", "Java");  // "Hello, Java!"

// Split
String[] words = text.split(",");  // ["Hello", " World!"]

// Contains
boolean has = text.contains("World");  // true

// Comparison
boolean equal = text.equals("Hello, World!");  // true
boolean equalsIgnoreCase = text.equalsIgnoreCase("hello, world!");  // true
```

### String Concatenation

```java
String first = "Hello";
String second = "World";

// Method 1: + operator
String result1 = first + " " + second;  // "Hello World"

// Method 2: concat()
String result2 = first.concat(" ").concat(second);

// Method 3: StringBuilder (efficient for loops)
StringBuilder sb = new StringBuilder();
sb.append("Hello");
sb.append(" ");
sb.append("World");
String result3 = sb.toString();
```

### String Comparison

```java
String a = "Hello";
String b = "Hello";
String c = new String("Hello");

a == b;           // true (same reference)
a == c;           // false (different objects)
a.equals(c);      // true (same content)
a.compareTo(b);   // 0 (equal), <0 (less), >0 (greater)
```

---

## Key Concepts Summary

### Memory Management

- **Heap**: Objects and arrays
- **Stack**: Primitive variables and object references

### This Keyword

```java
public class Book {
    String title;

    public Book(String title) {
        this.title = title;  // Refers to instance variable
    }
}
```

### Final Keyword

```java
final int MAX = 100;           // Constant variable
final void method() {}         // Cannot override
final class MyClass {}         // Cannot extend
```

### Abstract Classes

```java
abstract class Shape {
    abstract void draw();  // Must be implemented

    void describe() {
        System.out.println("I am a shape");
    }
}
```

### Interfaces

```java
interface Animal {
    void sound();
    void move();
}

class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Bark");
    }

    @Override
    public void move() {
        System.out.println("Run");
    }
}
```

---

## Common Mistakes to Avoid

1. **Forgetting semicolons** - Every statement ends with `;`
2. **Type mismatch** - `int x = 3.14;` ❌ Use `int x = (int) 3.14;` ✓
3. **Array index out of bounds** - Check array length before accessing
4. **Null pointer exception** - Check for null before using objects
5. **Comparing strings with ==** - Use `.equals()` instead
6. **Forgetting to initialize variables** - Variables must be declared before use
7. **Case sensitivity** - Java is case-sensitive: `Main` ≠ `main`

---

## Practice Programs

### Program 1: Calculate Grade

```java
public class GradeCalculator {
    public static void main(String[] args) {
        int marks = 85;
        char grade;

        if (marks >= 90) {
            grade = 'A';
        } else if (marks >= 80) {
            grade = 'B';
        } else if (marks >= 70) {
            grade = 'C';
        } else {
            grade = 'F';
        }

        System.out.println("Grade: " + grade);
    }
}
```

### Program 2: Fibonacci Series

```java
public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        int a = 0, b = 1;

        System.out.println("Fibonacci Series:");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
}
```

### Program 3: Array Operations

```java
public class ArrayOps {
    public static void main(String[] args) {
        int[] nums = {5, 2, 8, 1, 9};

        // Find max
        int max = nums[0];
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Max: " + max);

        // Sum
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        System.out.println("Sum: " + sum);
    }
}
```

---

## Quick Reference

### Compilation & Execution t

```bash
javac FileName.java      # Compile
java FileName            # Run
```

### Important Imports

```java
import java.util.*;      // Collections
import java.io.*;        // Input/Output
import java.time.*;      // Date & Time
```

### Main Method Template

```java
public class Main {
    public static void main(String[] args) {
        // Your code here
    }
}
```

### covertion of array to array list

```java
import java.util.*;

String[] arr = {"Apple", "Banana", "Orange"};
List<String> list = Arrays.asList(arr);
```

```java
import java.util.*;

String[] arr = {"Apple", "Banana", "Orange"};
ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
```

```java
ArrayList<String> list = new ArrayList<>();
for (String item : arr) {
    list.add(item);
}
```

```java
ArrayList<String> list = new ArrayList<>();
list.add("Apple");
list.add("Banana");

String[] arr = list.toArray(new String[0]);
```
