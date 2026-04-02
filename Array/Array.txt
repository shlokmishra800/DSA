 #Array:
  A linear data structure that holds elements of the same data type at contiguous memory addresses.
 ## Indexing
  Each element is identified by an index (starting from 0 in most languages).
##Memory Formula:
 The address of an element can be calculated directly using its index, which makes access time 



# Advantages
1. Fast access: Accessing the i-th element is constant time, O(1).
2. Cache friendly: Contiguous memory improves performance due to locality of reference.
3. Foundation for other structures: Arrays are used to build stacks, queues, heaps, hash tables, and graphs.

 #Limitations
1. Insertion/Deletion cost: Adding or removing elements in the middle requires shifting, which is O(n).
2. Fixed size: Cannot grow or shrink dynamically (unless using dynamic arrays like ArrayList in Java).
3. Wasted memory: If declared larger than needed, unused memory is wasted.

