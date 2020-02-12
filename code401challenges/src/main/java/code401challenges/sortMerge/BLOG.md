# Merge Sort

> Divide: In this step, we divide the input array into 2 halves, the pivot being the midpoint of the array. This step is carried out recursively for all the half arrays until there are no more half arrays to divide.
> Conquer: In this step, we sort and merge the divided arrays from bottom to top and get the sorted array.

![alt text](https://media.geeksforgeeks.org/wp-content/uploads/insertionsort.png "selection sort")

## Pseudocode
```
ALGORITHM Mergesort(arr)
    DECLARE n <-- arr.length
           
    if n > 1
      DECLARE mid <-- n/2
      DECLARE left <-- arr[0...mid]
      DECLARE right <-- arr[mid...n]
      // sort the left side
      Mergesort(left)
      // sort the right side
      Mergesort(right)
      // merge the sorted left and right sides together
      Merge(left, right, arr)

ALGORITHM Merge(left, right, arr)
    DECLARE i <-- 0
    DECLARE j <-- 0
    DECLARE k <-- 0

    while i < left.length && j < right.length
        if left[i] <= right[j]
            arr[k] <-- left[i]
            i <-- i + 1
        else
            arr[k] <-- right[j]
            j <-- j + 1
            
        k <-- k + 1

    if i = left.length
       set remaining entries in arr to remaining values in right
    else
       set remaining entries in arr to remaining values in left  
```

## Trace

Sample Array: `[8,4,23,42,16,15]`

![alt text](https://github.com/crystal-leesj/data-structures-and-algorithms/blob/master/code401challenges/assets/merge-sort1.jpg "selection sort")

1. In the first pass through of the selection sort, We evaluate if there is a smaller number in the array than what is currently present in index 0. We find this smaller number right away in index 1. The minimum value gets updated to remember this index. At the end of the evaluation, the smaller number will be swapped with the current value in index i. This results in our smallest number of our array being placed first.
2. The second pass through the array evaluates the remaining values in the array to see if there is a smaller value other than the current position of i. 8 is the 2nd smallest number in the array, so it “swaps” with itself. The minimum value does not change at all during the iteration of this pass.

![alt text](https://github.com/crystal-leesj/data-structures-and-algorithms/blob/master/code401challenges/assets/merge-sort2.jpg "selection sort")

3. The third pass through evaluates the remaining indexes in the array, starting at position 2. Both position 4 and 5 are smaller than the value in position 2. Each time a smaller number than the current minimum is found, the variable will update to the new smallest number. In this case, 15 is the next smallest number. As a result, it will swap with position 2.
4. The 4th pass through on the array proves that 16 is the next smallest number in the array, and as a result, switches places with the 42.

![alt text](https://github.com/crystal-leesj/data-structures-and-algorithms/blob/master/code401challenges/assets/merge-sort3.jpg "selection sort")
5. The 5th pass through of the array only has one other index to evaluate. Since the last index value is larger than index of 4, the two values will swap.
6. On it’s final iteratation through the array, it will swap places with itself as it evaluates the value against itself.

After this iteration, i will incriment to 6, forcing it to break out of the outer for loop and leaving our array now sorted.