# Doubly Linked List (DLL)

## Definition
A **Doubly Linked List** is a linear data structure where each element (called a **node**) is connected using two pointers:
- **Data** → the actual value stored
- **Next** → pointer/reference to the next node
- **Prev** → pointer/reference to the previous node

This allows traversal in **both directions** (forward and backward).

---

## Explanation
Unlike a singly linked list, a doubly linked list provides two-way navigation.  
Each node maintains links to both its **next** and **previous** nodes, making certain operations more efficient.

### Key Characteristics:
- **Bidirectional Traversal** → Can move forward and backward.
- **Dynamic Size** → Can grow or shrink at runtime.
- **Efficient Insert/Delete** → Operations at both ends and in the middle are easier.

### Structure of a Node (in Java):
```java
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
