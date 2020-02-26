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
![alt text](https://github.com/crystal-leesj/data-structures-and-algorithms/blob/master/code401challenges/assets/linkedlist-kth-value.jpg "LL getNthFromEnd")


## Link to code
[Link to code](https://github.com/crystal-leesj/data-structures-and-algorithms/blob/master/code401challenges/src/main/java/code401challenges/linkedList/LinkedList.java)

***

# Challenge Summary
Given two Linked Lists, merge them by zipping.

## Challenge Description
Write a function called `mergeLists` which takes two linked lists as arguments. Zip the two linked lists together into one so that the nodes alternate between the two lists and return a reference to the head of the zipped list. Try and keep additional space down to O(1). You have access to the Node class and all the properties on the Linked List class as well as the methods created in previous challenges.

## Approach & Efficiency
Bog O(n)

## Solution
![alt text](https://github.com/crystal-leesj/data-structures-and-algorithms/blob/master/code401challenges/assets/linkedlist-mergeLists.jpg "LL merge")

## Link to code
[Link to code](https://github.com/crystal-leesj/data-structures-and-algorithms/blob/master/code401challenges/src/main/java/code401challenges/linkedList/LinkedList.java)

***

# Stacks and Queues
Create a `Node` class that has properties for the value stored in the Node, and a pointer to the next node.
Create a `Stack` class that has a top property. It creates an empty Stack when instantiated.
This object should be aware of a default empty value assigned to `top` when the stack is created.

## Challenge
Define a method called `push` which takes any value as an argument and adds a new node with that value to the `top` of the stack with an O(1) Time performance.

## Approach & Efficiency
Bog O(1)

## Link to code
[Link to code](https://github.com/crystal-leesj/data-structures-and-algorithms/blob/master/code401challenges/src/main/java/code401challenges/stacksAndQueues/Stack.java)

***

# Stacks and Queues
Create a `Node` class that has properties for the value stored in the Node, and a pointer to the next node.
Create a `Stack` class that has a top property. It creates an empty Stack when instantiated.
This object should be aware of a default empty value assigned to `top` when the stack is created.

## Challenge
Define a method called `pop` that does not take any argument, removes the node from the top of the stack, and returns the node’s value.

## Approach & Efficiency
Bog O(1)

## Link to code
[Link to code](https://github.com/crystal-leesj/data-structures-and-algorithms/blob/master/code401challenges/src/main/java/code401challenges/stacksAndQueues/Stack.java)

***

# Stacks and Queues
Create a `Node` class that has properties for the value stored in the Node, and a pointer to the next node.
Create a `Stack` class that has a top property. It creates an empty Stack when instantiated.
This object should be aware of a default empty value assigned to `top` when the stack is created.

## Challenge
Define a method called `peek` that does not take an argument and returns the value of the node located on top of the stack, without removing it from the stack.

## Approach & Efficiency
Bog O(1)

## Link to code
[Link to code](https://github.com/crystal-leesj/data-structures-and-algorithms/blob/master/code401challenges/src/main/java/code401challenges/stacksAndQueues/Stack.java)

***

# Stacks and Queues
Create a `Node` class that has properties for the value stored in the Node, and a pointer to the next node.
Create a `Stack` class that has a top property. It creates an empty Stack when instantiated.
This object should be aware of a default empty value assigned to `top` when the stack is created.

## Challenge
Define a method called `isEmpty` that does not take an argument, and returns a boolean indicating whether or not the stack is empty.

## Approach & Efficiency
Bog O(1)

## Link to code
[Link to code](https://github.com/crystal-leesj/data-structures-and-algorithms/blob/master/code401challenges/src/main/java/code401challenges/stacksAndQueues/Stack.java)

***

# Stacks and Queues
Create a `Node` class that has properties for the value stored in the Node, and a pointer to the next node.
Create a `Queue` class that has a front property. It creates an empty Queue when instantiated.
This object should be aware of a default empty value assigned to `front` when the queue is created.

## Challenge
Define a method called `enqueue` which takes any value as an argument and adds a new node with that value to the back of the queue with an O(1) Time performance.

## Approach & Efficiency
Bog O(n)

## Link to code
[Link to code](https://github.com/crystal-leesj/data-structures-and-algorithms/blob/master/code401challenges/src/main/java/code401challenges/stacksAndQueues/Queue.java)

***

# Stacks and Queues
Create a `Node` class that has properties for the value stored in the Node, and a pointer to the next node.
Create a `Queue` class that has a front property. It creates an empty Queue when instantiated.
This object should be aware of a default empty value assigned to `front` when the queue is created.

## Challenge
Define a method called `dequeue` that does not take any argument, removes the node from the front of the queue, and returns the node’s value.

## Approach & Efficiency
Bog O(1)

## Link to code
[Link to code](https://github.com/crystal-leesj/data-structures-and-algorithms/blob/master/code401challenges/src/main/java/code401challenges/stacksAndQueues/Queue.java)

***

# Stacks and Queues
Create a `Node` class that has properties for the value stored in the Node, and a pointer to the next node.
Create a `Queue` class that has a front property. It creates an empty Queue when instantiated.
This object should be aware of a default empty value assigned to `front` when the queue is created.

## Challenge
Define a method called `dequeue` that does not take any argument, removes the node from the front of the queue, and returns the node’s value.

## Approach & Efficiency
Bog O(n)

## Link to code
[Link to code](https://github.com/crystal-leesj/data-structures-and-algorithms/blob/master/code401challenges/src/main/java/code401challenges/stacksAndQueues/Queue.java)

***

# Stacks and Queues
Create a `Node` class that has properties for the value stored in the Node, and a pointer to the next node.
Create a `Queue` class that has a front property. It creates an empty Queue when instantiated.
This object should be aware of a default empty value assigned to `front` when the queue is created.

## Challenge
Define a method called `peek` that does not take an argument and returns the value of the node located in the front of the queue, without removing it from the queue.

## Approach & Efficiency
Bog O(1)

## Link to code
[Link to code](https://github.com/crystal-leesj/data-structures-and-algorithms/blob/master/code401challenges/src/main/java/code401challenges/stacksAndQueues/Queue.java)

***

# Stacks and Queues
Create a `Node` class that has properties for the value stored in the Node, and a pointer to the next node.
Create a `Queue` class that has a front property. It creates an empty Queue when instantiated.
This object should be aware of a default empty value assigned to `front` when the queue is created.

## Challenge
Define a method called `isEmpty` that does not take an argument, and returns a boolean indicating whether or not the queue is empty.

## Approach & Efficiency
Bog O(1)

## Link to code
[Link to code](https://github.com/crystal-leesj/data-structures-and-algorithms/blob/master/code401challenges/src/main/java/code401challenges/stacksAndQueues/Queue.java)

***

# Challenge Summary
Create a brand new `PseudoQueue` class. Do not use an existing Queue. Instead, this PseudoQueue class will implement our standard queue interface (the two methods listed below), but will internally only utilize 2 `Stack` objects. Ensure that you create your class with the following methods:

## Challenge Description
- `enqueue(value)` which inserts `value` into the PseudoQueue, using a first-in, first-out approach.
- `dequeue()` which extracts a value from the PseudoQueue, using a first-in, first-out approach.

The `Stack` instances have only `push`, `pop`, and `peek` methods. You should use your own Stack implementation. Instantiate these Stack objects in your PseudoQueue constructor.

## Approach & Efficiency
- O(1)
- O(n)

## Solution
![alt text](https://github.com/crystal-leesj/data-structures-and-algorithms/blob/master/code401challenges/assets/pseudoQueue.jpg "PseudoQueue")

## Link to code
[Link to code](https://github.com/crystal-leesj/data-structures-and-algorithms/blob/master/code401challenges/src/main/java/code401challenges/stacksAndQueues/Queue.java)

***

# Challenge Summary
Create a class called AnimalShelter which holds only dogs and cats. The shelter operates using a first-in, first-out approach.

## Challenge Description
- `enqueue(animal)`: adds `animal` to the shelter. `animal` can be either a dog or a cat object.
- `dequeue(pref)`: returns either a dog or a cat. If `pref` is not `"dog"` or `"cat"` then return null.

## Approach & Efficiency
- O(1)
- O(n)

## Solution
![alt text](https://github.com/crystal-leesj/data-structures-and-algorithms/blob/master/code401challenges/assets/animalShelter.jpg "animal shelter")

## Link to code
[Link to code](https://github.com/crystal-leesj/data-structures-and-algorithms/blob/master/code401challenges/src/main/java/code401challenges/utilities/AnimalShelter.java)

***

# Challenge Summary
Multi-bracket Validation.

## Challenge Description
Your function should take a string as its only argument, and should return a boolean representing whether or not the brackets in the string are balanced. There are 3 types of brackets:

- Round Brackets : `()`
- Square Brackets : `[]`
- Curly Brackets : `{}`

## Approach & Efficiency
O(n)

## Solution
![alt text](https://github.com/crystal-leesj/data-structures-and-algorithms/blob/master/code401challenges/assets/bracketValidation.jpg "animal shelter")

## Link to code
[Link to code](https://github.com/crystal-leesj/data-structures-and-algorithms/blob/master/code401challenges/src/main/java/code401challenges/utilities/MultiBracketValidation.java)

***

# Trees
Create a Node class that has properties for the value stored in the node, the left child node, and the right child node.

## Challenge
Create a BinaryTree class
- Define a method for each of the depth first traversals called `preOrder`, `inOrder`, and `postOrder` which returns an array of the values, ordered appropriately.

Create a BinarySearchTree class
- Define a method named `add` that accepts a value, and adds a new node with that value in the correct location in the binary search tree.
- Define a method named `contains` that accepts a value, and returns a boolean indicating whether or not the value is in the tree at least once.

## Approach & Efficiency
preOrder, inOrder, postOrder - O(n)
BinarySearchTree - O(log2n)

## API
[Link to code](https://github.com/crystal-leesj/data-structures-and-algorithms/tree/master/code401challenges/src/main/java/code401challenges/tree)

[Link to test code] (https://github.com/crystal-leesj/data-structures-and-algorithms/tree/master/code401challenges/src/test/java/code401challenges)

***

# Challenge Summary
Breadth-first Traversal.

## Challenge Description
Write a breadth first traversal method which takes a Binary Tree as its unique input. Without utilizing any of the built-in methods available to your language, traverse the input tree using a Breadth-first approach, and return a list of the values in the tree in the order they were encountered.

## Approach & Efficiency
O(n)

## Solution
![alt text](https://github.com/crystal-leesj/data-structures-and-algorithms/blob/master/code401challenges/assets/breadthFirstTraversals.jpg "breadthFirstTraversal")

[Link to code](https://github.com/crystal-leesj/data-structures-and-algorithms/tree/master/code401challenges/src/main/java/code401challenges/tree)

***

# Challenge Summary
Find the Maximum Value in a Binary Tree

## Challenge Description
Write an instance method called `find-maximum-value`. Without utilizing any of the built-in methods available to your language, return the maximum value stored in the tree. You can assume that the values stored in the Binary Tree will be numeric.

## Approach & Efficiency
O(n)

## Solution
![alt text](https://github.com/crystal-leesj/data-structures-and-algorithms/blob/master/code401challenges/assets/find-maximum-binary-tree.jpg "breadthFirstTraversal")

[Link to code](https://github.com/crystal-leesj/data-structures-and-algorithms/tree/master/code401challenges/src/main/java/code401challenges/tree/BinaryTree.java)

***

# Challenge Summary
Conduct “FizzBuzz” on a tree while traversing through it. Change the values of each of the nodes dependent on the current node’s value

## Challenge Description
- Write a function called `FizzBuzzTree` which takes a tree as an argument.
- Without utilizing any of the built-in methods available to your language, determine whether or not the value of each node is divisible by 3, 5 or both. Create a new tree with the same structure as the original, but the values modified as follows:
    - If the value is divisible by 3, replace the value with “Fizz”
    - If the value is divisible by 5, replace the value with “Buzz”
    - If the value is divisible by 3 and 5, replace the value with “FizzBuzz”
    - If the value is not divisible by 3 or 5, simply turn the number into a String.
- Return the new tree.

## Approach & Efficiency
O(n)

## Solution
![alt text](https://github.com/crystal-leesj/data-structures-and-algorithms/blob/master/code401challenges/assets/fizzBuzzTree.jpg "FizzBuzzTree")

[Link to code](https://github.com/crystal-leesj/data-structures-and-algorithms/tree/master/code401challenges/src/main/java/code401challenges/utilities/FizzBuzzTree.java)

***

# Challenge Summary
Selection Sort

## Challenge Description
Selection Sort is a sortig algorithm that traverses the array multiple times as it slowly builds out the sorting sequence. The traversal keeps track of the minimum value and places it in the front of the array which should be incrimentally sorted.

## Approach & Efficiency
- Time: O(n^2)
    - The basic operaiton of this algorithm is comparison. This will happen n number of times…concluding the algorithm to be n squared.
- Space: O(1)
    - No additional space is being created. This array is being sorted in place…keeping the space at constant O(1).

## Solution
![alt text](https://github.com/crystal-leesj/data-structures-and-algorithms/blob/master/code401challenges/assets/selection-sort1.jpg "selection sort")
![alt text](https://github.com/crystal-leesj/data-structures-and-algorithms/blob/master/code401challenges/assets/selection-sort2.jpg "selection sort")
![alt text](https://github.com/crystal-leesj/data-structures-and-algorithms/blob/master/code401challenges/assets/selection-sort3.jpg "selection sort")

***
# Challenge Summary
Merge Sort

## Challenge Description
Merge sort is a “divide and conquer” algorithm wherein we first divide the problem into subproblems. When the solutions for the subproblems are ready, we combine them together to get the final solution to the problem.
- The algorithm can be described as the following 2 step process:
    - `Divide`: In this step, we divide the input array into 2 halves, the pivot being the midpoint of the array. This step is carried out recursively for all the half arrays until there are no more half arrays to divide.
    - `Conquer`: In this step, we sort and merge the divided arrays from bottom to top and get the sorted array.
    
## Approach & Efficiency
   - Time: 2T(n/2) + O(n)
       - Because merge sort is a recursive algorithm, 2T(n/2) corresponds to the time required to sort the sub-arrays and O(n) time to merge the entire array.
   - Space: O(n)
       - The sort algorithm is creating temporary arrays in every recursive call

## Solution
![alt text](https://github.com/crystal-leesj/data-structures-and-algorithms/blob/master/code401challenges/assets/merge-sort1.jpg "merge sort")
![alt text](https://github.com/crystal-leesj/data-structures-and-algorithms/blob/master/code401challenges/assets/merge-sort2.jpg "merge sort")
![alt text](https://github.com/crystal-leesj/data-structures-and-algorithms/blob/master/code401challenges/assets/merge-sort3.jpg "merge sort")

***

# Challenge Summary
Quick Sort

## Challenge Description
Quicksort is a sorting algorithm, which is leveraging the divide-and-conquer principle. It has an average O(n log n) complexity and it’s one of the most used sorting algorithms, especially for big data volumes.

It's important to remember that Quicksort isn't a stable algorithm. A stable sorting algorithm is an algorithm where the elements with the same values appear in the same order in the sorted output as they appear in the input list.

The input list is divided into two sub-lists by an element called pivot; one sub-list with elements less than the pivot and another one with elements greater than the pivot. This process repeats for each sub-list.

Finally, all sorted sub-lists merge to form the final output.

Resource = https://www.baeldung.com/java-quicksort
    
## Approach & Efficiency
- In the worst case:
   - Time: O(n2)
- In the best case:
   - Time:  \theta(n log n)
- In the average case:
   - Time:  0(n log n)
- Space: O(log(n)) 
   - The sort algorithm is creating temporary arrays in every recursive call

## Solution
![alt text](https://github.com/crystal-leesj/data-structures-and-algorithms/blob/master/code401challenges/assets/quick-sort.jpg "quick sort")

***

# Hashtables
Implement a Hashtable

## Challenge
1. `add`: takes in both the key and value. This method should hash the key, and add the key and value pair to the table, handling collisions as needed.
2. `get`: takes in the key and returns the value from the table.
3. `contains`: takes in the key and returns a boolean, indicating if the key exists in the table already.
4. `hash`: takes in an arbitrary key and returns an index in the collection.

## Approach & Efficiency
- Time: O(1)
   - If the key is provided value can be found in O(1).
- Space: O(n)
   - Because the values are fixed
## API
[Link to code](https://github.com/crystal-leesj/data-structures-and-algorithms/tree/master/code401challenges/src/main/java/code401challenges/hashtable/Hashtable.java)

***

# Challenge Summary
Find the first repeated word in a book.

## Challenge Description
- Write a function that accepts a lengthy string parameter.
- Without utilizing any of the built-in library methods available to your language, return the first word to occur more than once in that provided string.

## Approach & Efficiency
- Time: O(1)
   - If the key is provided value can be found in O(1).
- Space: O(n)
   - Because the values are fixed
## Solution
![alt text](https://github.com/crystal-leesj/data-structures-and-algorithms/blob/master/code401challenges/assets/repeatedWord.jpg "RepeatedWord")

***

# Challenge Summary
Find common values in 2 binary trees.

## Challenge Description
- Write a function called `tree_intersection` that takes two binary tree parameters.
- Without utilizing any of the built-in library methods available to your language, return the first word to occur more than once in that provided string.

## Approach & Efficiency
- Time: O(n)
   - Two different trees were used.
- Space: O(n)
   - Because the values are fixed
## Solution
![alt text](https://github.com/crystal-leesj/data-structures-and-algorithms/blob/master/code401challenges/assets/tree_intersection.jpg "tree_intersection")
***

# Graphs
Graph Implementation

## Challenge
1. AddNode()
- Adds a new node to the graph
- Takes in the value of that node
- Returns the added node

2. AddEdge()
- Adds a new edge between two nodes in the graph
- Include the ability to have a “weight”
- Takes in the two nodes to be connected by the edge
  -Both nodes should already be in the Graph

3. GetNodes()
- Returns all of the nodes in the graph as a collection (set, list, or similar)

4. GetNeighbors()
- Returns a collection of nodes connected to the given node
- Takes in a given node
- Include the weight of the connection in the returned collection

5. Size()
- Returns the total number of nodes in the graph

## Approach & Efficiency
- Time: O(1)
   - Hashtable and LinkedList was user to find the target key.
- Space: O(n)
   - Because the values are fixed.

## API
[Link to code](https://github.com/crystal-leesj/data-structures-and-algorithms/tree/master/code401challenges/src/main/java/code401challenges/graph/Graph.java)

***

# Challenge Summary
Implement a breadth-first traversal on a graph.

## Challenge Description
Extend your graph object with a breadth-first traversal method that accepts a starting node. Without utilizing any of the built-in methods available to your language, return a collection of nodes in the order they were visited. Display the collection.

## Approach & Efficiency
- Time: O(1)
   - Set and LinkedList was user to find the target key.
- Space: O(n)
   - Because the values are fixed.

## API
![alt text](https://github.com/crystal-leesj/data-structures-and-algorithms/blob/master/code401challenges/assets/graph-bsftaversal.jpg "graph-bsftaversal")

***

# Challenge Summary
Given a business trip itinerary, and an Alaska Airlines route map, is the trip possible with direct flights? If so, how much will the total trip cost be?

## Challenge Description
Write a function based on the specifications above, which takes in a graph, and an array of city names. Without utilizing any of the built-in methods available to your language, return whether the full trip is possible with direct flights, and how much it would cost.

## Approach & Efficiency
- Time: 2 O(1)
   - Used two different iterations.
- Space: O(n)
   - Because the values are fixed.

## Solution
![alt text](https://github.com/crystal-leesj/data-structures-and-algorithms/blob/master/code401challenges/assets/graph-get-edges.jpg "graph-get-edges")

***