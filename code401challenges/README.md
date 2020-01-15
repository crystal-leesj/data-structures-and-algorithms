# Challenge Summary
Put an element in the middle of given array.

## Challenge Description
Write a function called `insertShiftArray` which takes in an array and the value to be added. Without utilizing any of the built-in methods available to your language, return an array with the new value added at the middle index.

## Approach & Efficiency
O(n)
Becauce there was a single for loop, it would be O(n)

## Solution
![alt text](https://github.com/crystal-leesj/data-structures-and-algorithms/blob/master/code401challenges/assets/insertShiftArray.jpg "Logo Title Text 1")

## Link to code
[Link to code](https://github.com/crystal-leesj/data-structures-and-algorithms/blob/master/code401challenges/src/main/java/code401challenges/ArrayShift.java)

***

# Challenge Summary
Find the index of the given number in a given array.

## Challenge Description
Write a function called `BinarySearch` which takes in 2 parameters: a sorted array and the search key. Without utilizing any of the built-in methods available to your language, return the index of the array’s element that is equal to the search key, or -1 if the element does not exist.

## Approach & Efficiency
O(n)
Becauce there was a single for while loop, it would be O(n)

## Solution
![alt text](https://github.com/crystal-leesj/data-structures-and-algorithms/blob/master/code401challenges/assets/array-binary-search1.jpg "binarySearch1")
![alt text](https://github.com/crystal-leesj/data-structures-and-algorithms/blob/master/code401challenges/assets/array-binary-search2.jpg "binarySearch2")

## Link to code
[Link to code](https://github.com/crystal-leesj/data-structures-and-algorithms/blob/master/code401challenges/src/main/java/code401challenges/BinarySearch.java)

***

## Lab 5: Singly Linked Lists
# Singly Linked List
Like arrays, Linked List is a linear data structure. Unlike arrays, linked list elements are not stored at the contiguous location, the elements are linked using pointers as shown below.
![alt text](https://media.geeksforgeeks.org/wp-content/cdn-uploads/gq/2013/03/Linkedlist.png "singly linked list")
In Java, LinkedList can be represented as a class and a Node as a separate class. The LinkedList class contains a reference of Node class type.

## Challenge
1. Can successfully instantiate an empty linked list
2. Can properly insert into the linked list
3. The head property will properly point to the first node in the linked list
4. Can properly insert multiple nodes into the linked list
5. Will return true when finding a value within the linked list that exists
6. Will return false when searching for a value in the linked list that does not exist
7. Can properly return a collection of all the values that exist in the linked list

## Approach & Efficiency
Big O is O(1).

## API
1. insert Singly Linked Lists
  - Define a method called `insert` which takes any value as an argument and adds a new node with that value to the `head` of the list with an O(1) Time performance.
2. include Singly Linked Lists
  - Define a method called `include` which takes any value as an argument and returns a boolean result depending on whether that value exists as a Node’s value somewhere within the list.
3. toString Singly Linked Lists
  - Define a method called `toString` which takes in no arguments and returns a string representing all the values in the Linked List, formatted as:
  ```
  "{ a } -> { b } -> { c } -> NULL"
  ```
 
[Link to code](https://github.com/crystal-leesj/data-structures-and-algorithms/blob/master/code401challenges/src/main/java/code401challenges/linkedList/LinkedList.java)

***

# Challenge Summary
Given Linked List, add a new node with the given value.

## Challenge Description
`.append(value)` which adds a new node with the given `value` to the end of the list

## Approach & Efficiency
Bog O(n)

## Solution
![alt text](https://github.com/crystal-leesj/data-structures-and-algorithms/blob/master/code401challenges/assets/linkedlist-append.jpg "LL append")

## Link to code
[Link to code](https://github.com/crystal-leesj/data-structures-and-algorithms/blob/master/code401challenges/src/main/java/code401challenges/linkedList/LinkedList.java)

***

# Challenge Summary
Given Linked List, insert a new node with the given value before the target value.

## Challenge Description
`.insertBefore(value, newVal)` which add a new node with the given `newValue` immediately before the first `value` node

## Approach & Efficiency
Bog O(n)

## Solution
![alt text](https://github.com/crystal-leesj/data-structures-and-algorithms/blob/master/code401challenges/assets/linkedlist-inset-before.jpg "LL inser before")

## Link to code
[Link to code](https://github.com/crystal-leesj/data-structures-and-algorithms/blob/master/code401challenges/src/main/java/code401challenges/linkedList/LinkedList.java)

***

# Challenge Summary
Given Linked List, insert a new node with the given value after the target value.

## Challenge Description
`.insertAfter(value, newVal)` which add a new node with the given `newValue` immediately after the first `value` node

## Approach & Efficiency
Bog O(n)

## Solution
![alt text](https://github.com/crystal-leesj/data-structures-and-algorithms/blob/master/code401challenges/assets/linkedlist-insert-after.jpg "LL insert after")

## Link to code
[Link to code](https://github.com/crystal-leesj/data-structures-and-algorithms/blob/master/code401challenges/src/main/java/code401challenges/linkedList/LinkedList.java)

***

# Challenge Summary
Find k-th value from the end of a linked list.

## Challenge Description
Write a method for the Linked List class which takes a number, `k`, as a parameter. Return the node’s value that is `k` from the end of the linked list. You have access to the Node class and all the properties on the Linked List class as well as the methods created in previous challenges.

## Approach & Efficiency
Bog O(n)

## Solution
![alt text](https://github.com/crystal-leesj/data-structures-and-algorithms/blob/master/code401challenges/assets/array-binary-search1.jpg "LL getNthFromEnd")


## Link to code
[Link to code](https://github.com/crystal-leesj/data-structures-and-algorithms/blob/master/code401challenges/src/main/java/code401challenges/linkedList/LinkedList.java)

***
