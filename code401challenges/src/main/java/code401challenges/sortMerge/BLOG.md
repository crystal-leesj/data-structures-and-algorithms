# Merge Sort

> Divide: In this step, we divide the input array into 2 halves, the pivot being the midpoint of the array. This step is carried out recursively for all the half arrays until there are no more half arrays to divide.
> Conquer: In this step, we sort and merge the divided arrays from bottom to top and get the sorted array.

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

![alt text](https://github.com/crystal-leesj/data-structures-and-algorithms/blob/master/code401challenges/assets/merge-sort1.jpg "merge sort")

1. Find the middle point (int mid) to divide the array into two halves.
2. Call mergeSort for first half.
3. Merge function compares the elements of both sub-arrays one by one and places the smaller element into the input array.

![alt text](https://github.com/crystal-leesj/data-structures-and-algorithms/blob/master/code401challenges/assets/merge-sort2.jpg "merge sort")

4. Call mergeSort for second half.
5. Merge function compares the elements of both sub-arrays one by one and places the smaller element into the input array.

![alt text](https://github.com/crystal-leesj/data-structures-and-algorithms/blob/master/code401challenges/assets/merge-sort3.jpg "merge sort")
6. Now the array is back to two parts. Merge arrays back while sorting.