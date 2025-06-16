# ARRAY
" ARRAY is list of elements which stores the same type , stored in contiguous(ek ke bad ek) memory locations"
+ static type
```java
 // Different ways to declare arrays
int[] numbers1;      // Preferred style
int numbers2[];      // Valid but less conventional
```

main funcion get update if pass an argument in small function

## 📘 Linear Search – Definition (English)
Linear Search is a simple searching algorithm that sequentially checks each element of an array until the desired element is found or the end of the array is reached.

It is also called sequential search and is useful for unsorted or small arrays.

## 🔍 Logic:
+ Start from index 0

+ Compare each element with the key

+ If match found → return index

+ If not found → return -1 

## 📘 Binary Search – Definition :
"Binary Search is an efficient algorithm used to find the position of a target element in a sorted array by repeatedly dividing the search interval in half."
---
>  start =0  end =arr.length-1 

🔍 Working Principle:
+ Array must be sorted (ascending or descending).

+ Check middle element.

+ If key == mid, return index.

+ If key < mid, search in left half.

+ If key > mid, search in right half.

+ Repeat until found or start > end.