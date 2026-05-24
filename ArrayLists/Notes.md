# ArrayList

## Definition
An **ArrayList** in Java is a **resizable array implementation** of the `List` interface.  
Unlike normal arrays, the size of an ArrayList can **grow or shrink dynamically** as elements are added or removed.

---

## Explanation
ArrayList is part of the **Java Collections Framework** and provides a way to store elements in a list-like structure with dynamic resizing.  
It internally uses an array, but automatically manages capacity when elements are inserted or deleted.

### Key Characteristics:
- **Dynamic Size** → No need to declare fixed size.  
- **Index-based access** → Elements can be accessed using indices (like arrays).  
- **Allows duplicates** → Multiple identical elements can be stored.  
- **Maintains insertion order** → Elements are stored in the order they are added.  

---

## Advantages
-  **Dynamic resizing** → Automatically grows/shrinks as needed.  
-  **Fast random access** → Accessing elements by index is O(1).  
-  **Easy to use** → Provides built-in methods like `add()`, `remove()`, `get()`, `set()`.  
-  **Part of Collections Framework** → Rich set of utilities and compatibility with other collection types.  

---

## Disadvantages
-  **Slower insert/delete in middle** → Requires shifting elements (O(n)).  
-  **Not synchronized** → Multiple threads need external synchronization.  
-  **Memory overhead** → May allocate extra unused capacity.  
-  **Performance drops with frequent resizing** → Continuous growth/shrink operations can be costly.  

---
