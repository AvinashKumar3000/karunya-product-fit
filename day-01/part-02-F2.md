# plan


- intro to map, stack, queue
- DS introduction
- time and space complexity

## map ( hashmap ) - fast lookup  / counting / indexing

```java
Map<Key, Value>
```

```java
HashMap<String, Integer> map = new HashMap<>();
map.put("apple", 3);
map.get("apple"); // 3
```

```java
map.put(x, map.getOrDefault(x, 0) + 1);

```

```java
Map<Integer, Integer> map = new HashMap<>();

for (int i = 0; i < nums.length; i++) {
    int need = target - nums[i];
    if (map.containsKey(need)) {
        return new int[]{map.get(need), i};
    }
    map.put(nums[i], i);
}
```

## STACK — Last In, First Out (LIFO)

```java
Stack<Integer> stack = new Stack<>();
stack.push(10);
stack.pop();
```

```java
Stack<Character> stack = new Stack<>();

for (char c : s.toCharArray()) {
    if (c == '(') stack.push(c);
    else {
        if (stack.isEmpty()) return false;
        stack.pop();
    }
}
return stack.isEmpty();
```

## Queue

```java
Queue<Integer> q = new LinkedList<>();
q.offer(10);
q.poll();
```

```java
Queue<Integer> q = new LinkedList<>();
q.offer(start);

while (!q.isEmpty()) {
    int cur = q.poll();
}

```

```bash

# Explain System.out.println(
class PrintStream {
    public void println() {}
}
public final class System {
    static PrintStream out;
}
public class Sample {
    public static void main(String[] args) {
        System.out.println("hello world");
    }
}
System : class
out    : object
println: method


# package

always should mention which package the code belongs, at top of source code.

## folder structure

📁 java-tuorial
    📄 Main.java
    📁 Controller
       📄 LoginController.java
       📄 AuthController.java 


# variable declaration

public class Sample {
    int a = 10;
    static int b = 20;
    final static int c = 30;
    public static void main(String args[]) {
        Sample obj = new Sample();
        System.out.println(obj.a);      // 10
        System.out.println(b);   // 20
        System.out.println(C);   // 20
    }
}

# final usage

final int a;        // invalid
final int a = 0;    // valid
why?  all final variable / attibutes support to be initialized.

# java is a fully object oriented programming lang ?
- we cannot write a code without a class.
# method
- a function declared inside a class is called method
# attribute
- a variable declared inside a class is called attribute

# SCOPE
>> in other languages like c, cpp
- global | function |  local  scope
>> in java
- method | local | class   scope

# increment
    - post eg: a++;
    - pre  eg: ++a;
# decrement
    - post eg: a--;
    - pre  eg: --a;

System.out.println(10 + 20++); // error
System.out.println(10 + ++20); // error
In java, ++ need to applied on varibles not values.

```