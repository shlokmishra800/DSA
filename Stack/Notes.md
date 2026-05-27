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



# HashSet in Java

## Definition
`HashSet` is a class in Java that stores unique elements and does not allow duplicate values.

## Explanation
- It is a part of the Java Collection Framework.
- Duplicate elements are automatically removed.
- Elements are not stored in insertion order.
- It provides fast searching and insertion.
- Mainly used when uniqueness of data is important.

## Syntax
```java
HashSet<Integer> set = new HashSet<>();
```

---

# LinkedHashSet in Java

## Definition
`LinkedHashSet` is a class in Java that stores unique elements while maintaining insertion order.

## Explanation
- It does not allow duplicate values.
- Elements are stored in the order they are inserted.
- It combines features of both HashSet and LinkedList.
- Slightly slower than HashSet because it maintains order.

## Syntax
```java
LinkedHashSet<Integer> set = new LinkedHashSet<>();
```

---

# isEmpty() Function in Java

## Definition
`isEmpty()` is a method used to check whether a collection is empty or not.

## Explanation
- It returns `true` if the collection contains no elements.
- It returns `false` if the collection has elements.
- Commonly used with ArrayList, HashSet, LinkedHashSet, Stack, etc.

## Syntax
```java
list.isEmpty();
```

---

# Math.min() Function in Java

## Definition
`Math.min()` is a method used to find the smaller value between two numbers.

## Explanation
- It compares two values.
- Returns the minimum value.
- Works with integers, floats, doubles, and long values.

## Syntax
```java
Math.min(a, b);
```

---

# Math.max() Function in Java

## Definition
`Math.max()` is a method used to find the larger value between two numbers.

## Explanation
- It compares two values.
- Returns the maximum value.
- Works with integers, floats, doubles, and long values.

## Syntax
```java
Math.max(a, b);
```

---

# Stack in Java

## Definition
`Stack` is a linear data structure that follows the LIFO (Last In First Out) principle.

## Explanation
- The element added last is removed first.
- Common operations are push, pop, and peek.
- Used in recursion, undo operations, and expression evaluation.

## Syntax
```java
Stack<Integer> stack = new Stack<>();
```

---