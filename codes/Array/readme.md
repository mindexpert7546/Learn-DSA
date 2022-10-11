# How to Initialize Arrays in Java?
## 1. Declaration and Instantiation
```java
//declare and initialize and array
int[] age = {12, 4, 5, 2, 5};
```
Here, we have created an array named age and initialized it with the values inside the curly brackets.

Note that we have not provided the size of the array. In this case, the Java compiler automatically specifies the size by counting the number of elements in the array (i.e. 5).

In the Java array, each memory location is associated with a number. The number is known as an array index. We can also initialize arrays in Java, using the index number. For example,
```java
// declare an array
int[] age = new int[5];

// initialize array
age[0] = 12;
age[1] = 4;
age[2] = 5;
..
```
![image](https://user-images.githubusercontent.com/83773953/195007975-a39d0897-9b5c-4545-8697-72a230466eae.png)

Note that the index of the first element is 0 and the index of the last element is size-1.

# How to Access Elements of an Array in Java?
We can access the element of an array using the index number. Here is the syntax for accessing elements of an array,
```java
// access array elements
array[index]
```
For example,
```java
class Main {
 public static void main(String[] args) {
  
   // create an array
   int[] age = {12, 4, 5, 2, 5};

   // access each array elements
   System.out.println("Accessing Elements of Array:");
   System.out.println("First Element: " + age[0]);
   System.out.println("Second Element: " + age[1]);
   System.out.println("Third Element: " + age[2]);
   System.out.println("Fourth Element: " + age[3]);
   System.out.println("Fifth Element: " + age[4]);
 }
}
```
Output:
```java
Accessing Elements of Array:
First Element: 12
Second Element: 4
Third Element: 5
Fourth Element: 2
Fifth Element: 5
```
