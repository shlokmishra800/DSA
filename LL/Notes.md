# Singly Linked List (SLL)

## Definition
A **Singly Linked List** is a linear data structure where elements (called **nodes**) are connected sequentially using pointers.  
Each node contains:
- **Data** → the actual value stored
- **Next** → a pointer/reference to the next node in the list

The last node’s `next` pointer is always `null`, indicating the end of the list.

---

## Explanation
Unlike arrays, a singly linked list does not store elements in contiguous memory locations.  
Instead, each node is dynamically allocated and linked together using pointers.  

### Key Characteristics:
- **Dynamic Size** → Can grow or shrink at runtime.
- **Efficient Insert/Delete** → Operations at the beginning or middle are faster compared to arrays.
- **Sequential Access** → Traversal is only possible in one direction (forward).

### Structure of a Node (in Java):
```java
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
