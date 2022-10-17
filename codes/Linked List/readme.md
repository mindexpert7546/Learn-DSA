# Linked List Data Structure
## What is Linked List?
A linked list is a linear data structure, in which the elements are not stored at contiguous memory locations. The elements in a linked list are linked using pointers.

## Types of Linked List
* Singly Linked List
* Doubly Linked List
* Circular Linked List

## Singly Linked List
A linked list is a linear data structure, in which the elements are not stored at contiguous memory locations. The elements in a linked list are linked using pointers.

## Doubly Linked List
A Doubly Linked List contains an extra pointer, typically called previous pointer, together with next pointer and data which are there in singly linked list.

## Circular Linked List
A circular linked list is a linked list where all nodes are connected to form a circle. There is no NULL at the end. A circular linked list can be a singly circular linked list or doubly circular linked list.

## Advantages of Linked List
* Dynamic size
* Ease of insertion/deletion

## Disadvantages of Linked List
* Random access is not allowed. We have to access elements sequentially starting from the first node. So we cannot do binary search with linked lists efficiently with its default implementation. Read about it here.
* Extra memory space for a pointer is required with each element of the list.
* Not cache friendly. Since array elements are contiguous locations, there is locality of reference which is not there in case of linked lists.

## Applications of Linked List
* Implementation of stacks and queues
* Maintaining directory of names
* Implementation of graph
* Undo mechanism at many places like editors, photoshop.
* Hash table implementation

# Creating a Java LinkedList
## Creating a LinkedList
```java
LinkedList<Type> linkedList = new LinkedList<>();
```
```java
import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<String>();
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Dog");
        System.out.println(animals);
    }
}
```