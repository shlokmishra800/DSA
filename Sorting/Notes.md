### **Sorting Algorithms in Java**

**Sorting algorithms are techniques used to arrange elements of an array in a specific order (ascending or descending) to make data easier to search and process efficiently.**

---


## Bubble Sort
- **Definition**: Bubble Sort repeatedly compares adjacent elements and swaps them if they are in the wrong order, “bubbling” the largest element to the end in each pass.


- **Explanation**: On each pass, the largest element moves to its correct position at the end. This continues until no swaps are needed. 


  - **Time Complexity**: Best case O(n) (already sorted), Average/Worst case O(n²).  
  - **Advantages**: Very simple to implement, adaptive (can stop early if sorted).  
  - **Disadvantages**: Extremely inefficient for large datasets compared to other algorithms.




## Insertion Sort
- **Definition**: Insertion Sort builds the final sorted array one item at a time by repeatedly inserting the next element into its correct position among the already sorted elements.


- **Explanation**: It works like sorting playing cards in your hand. Each new card is compared with the already sorted cards and placed in the right spot. 


  - **Time Complexity**: Best case O(n) (already sorted), Average/Worst case O(n²).  
  - **Advantages**: Simple, efficient for small datasets, adaptive (fast when nearly sorted).  
  - **Disadvantages**: Slow for large datasets.

---

## Selection Sort
- **Definition**: Selection Sort repeatedly selects the smallest (or largest) element from the unsorted portion and places it at the beginning of the sorted portion.


- **Explanation**: It works by scanning the entire array to find the minimum element, swapping it with the first unsorted element, and repeating until the array is sorted.  


  - **Time Complexity**: Always O(n²) regardless of input order.  
  - **Advantages**: Easy to understand, performs minimal swaps.  
  - **Disadvantages**: Inefficient for large datasets, not adaptive.

---

# Sorting Algorithms – Definitions and Explanations

## Quick Sort
- **Definition**: Quick Sort is a divide-and-conquer sorting algorithm that works by selecting a pivot element and partitioning the array into two subarrays: elements less than the pivot and elements greater than the pivot.



- **Explanation**: After partitioning, Quick Sort recursively sorts the subarrays. It is efficient on average with **O(n log n)** time complexity, but in the worst case (poor pivot choice, e.g., already sorted array) it can degrade to **O(n²)**. 


  - **Advantages**: In-place (requires little extra memory), fast for arrays, good cache performance.  
  - **Disadvantages**: Not stable by default, worst-case performance can be poor.

## Merge Sort
- **Definition**: Merge Sort is a divide-and-conquer sorting algorithm that splits the array into two halves, recursively sorts each half, and then merges the sorted halves back together.



- **Explanation**: Merge Sort guarantees **O(n log n)** time complexity in best, average, and worst cases. It is stable and works well for linked lists and large datasets. However, it requires **O(n)** extra memory for merging.  


  - **Advantages**: Predictable performance, stable sorting, suitable for external sorting (large data sets).  
  - **Disadvantages**: Requires additional memory, slower than Quick Sort in practice for small arrays.