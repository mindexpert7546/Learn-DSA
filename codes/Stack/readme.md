# Stack Data Structure 
## What is Stack Data Structure?
A stack is a linear data structure that follows a particular order in which the operations are performed. The order may be LIFO(Last In First Out) or FILO(First In Last Out). Mainly the following three basic operations are performed in the stack:
* Push: Adds an item in the stack. If the stack is full, then it is said to be an Overflow condition.
* Pop: Removes an item from the stack. The items are popped in the reversed order in which they are pushed. If the stack is empty, then it is said to be an Underflow condition.
* Peek or Top: Returns top element of stack.
* isEmpty: Returns true if stack is empty, else false.

## Applications of Stack Data Structure
* Balancing of symbols
* Infix to Postfix /Prefix conversion
* Redo-undo features at many places like editors, photoshop.
* Forward and backward feature in web browsers
* Used in many algorithms like Tower of Hanoi, tree traversals, stock span problem, histogram problem.

## Creating a Java Stack
### Creating a Stack
```java
Stack<Type> stack = new Stack<>();
```
```java
import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<String>();
        animals.push("Lion");
        animals.push("Tiger");
        animals.push("Cat");
        animals.push("Dog");
        System.out.println(animals);
    }
}
```
### Output
```java
[Dog, Cat, Tiger, Lion]
```
### Accessing an element from the stack
```java
import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<String>();
        animals.push("Lion");
        animals.push("Tiger");
        animals.push("Cat");
        animals.push("Dog");
        System.out.println(animals.peek());
    }
}
```
### Output
```java
Dog
```
### Removing an element from the stack
```java
import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<String>();
        animals.push("Lion");
        animals.push("Tiger");
        animals.push("Cat");
        animals.push("Dog");
        System.out.println(animals.pop());
    }
}
```
### Output
```java
Dog
```
### Checking if the stack is empty
```java
import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<String>();
        System.out.println(animals.isEmpty());
    }
}
```
### Output
```java
true
```
### Checking the size of the stack
```java
import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<String>();
        animals.push("Lion");
        animals.push("Tiger");
        animals.push("Cat");
        animals.push("Dog");
        System.out.println(animals.size());
    }
}
```
### Output
```java
4
```
### Iterating through the stack
```java
import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<String>();
        animals.push("Lion");
        animals.push("Tiger");
        animals.push("Cat");
        animals.push("Dog");
        for (String animal : animals) {
            System.out.println(animal);
        }
    }
}
```
### Output
```java
Dog
Cat
Tiger
Lion
```
### Searching an element in the stack
```java
import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<String>();
        animals.push("Lion");
        animals.push("Tiger");
        animals.push("Cat");
        animals.push("Dog");
        System.out.println(animals.search("Tiger"));
    }
}
```
### Output
```java
3
```
### Clearing the stack
```java
import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<String>();
        animals.push("Lion");
        animals.push("Tiger");
        animals.push("Cat");
        animals.push("Dog");
        animals.clear();
        System.out.println(animals);
    }
}
```
### Output
```java
[]
```
### Creating a Stack using Array
```java
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        String[] animals = new String[4];
        animals[0] = "Lion";
        animals[1] = "Tiger";
        animals[2] = "Cat";
        animals[3] = "Dog";
        System.out.println(Arrays.toString(animals));
    }
}
```
### Output
```java
[Lion, Tiger, Cat, Dog]
```
