# Stack

## Definition
A **Stack** is a linear data structure that follows the **LIFO (Last In, First Out)** principle.  
This means the element inserted last is the first one to be removed.  

It works like a pile of plates: you can only add or remove from the **top**.

---

## Explanation
A stack allows insertion and deletion of elements only at one end, called the **top**.  
It is widely used in programming for function calls, expression evaluation, and backtracking algorithms.

### Key Characteristics:
- **Push** → Insert an element at the top.  
- **Pop** → Remove the element from the top.  
- **Peek/Top** → View the element at the top without removing it.  
- **isEmpty** → Check if the stack is empty.  
- **isFull** → Check if the stack is full (in case of array implementation).

---

## Advantages
-  **Simple and efficient** for managing data in LIFO order.  
-  **Useful in recursion** → Function call stack is managed using stacks.  
-  **Efficient operations** → Push and Pop are O(1).  
-  **Helps in solving problems** like undo/redo, backtracking, and expression evaluation.  

---

## Disadvantages
-  **Limited access** → Only the top element can be accessed directly.  
-  **Fixed size (array implementation)** → Can cause overflow if stack is full.  
-  **Underflow** → Trying to pop from an empty stack leads to error.  
-  **Not suitable for random access** → Unlike arrays, you cannot access elements by index.  

---
