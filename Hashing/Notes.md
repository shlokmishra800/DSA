# Hashing and HashMap in Java

## Hashing

### Definition

Hashing is a technique used to store and retrieve data quickly by converting a key into a unique integer value called a **hash code**. This hash code determines where the data is stored in memory.

### Explanation

 Hashing provides fast data access.
 It converts keys into hash codes using a hash function.
 It is widely used in data structures like `HashMap` and `HashSet`.
 Average time complexity for searching, insertion, and deletion is **O(1)**.

### Advantages of Hashing

1. Very fast searching.
2. Fast insertion of elements.
3. Fast deletion of elements.
4. Efficient memory usage.
5. Used in databases and caching systems.

### Disadvantages of Hashing

1. Hash collisions can occur.
2. Performance may decrease if many collisions occur.
3. Does not maintain sorted order.

---

# HashMap in Java

## Definition

`HashMap` is a class in the Java Collection Framework that stores data in **key-value pairs**. Each key must be unique, while multiple keys can have the same value.

## Explanation

 Part of the `java.util` package.
 Stores data as **Key → Value** pairs.
 Allows one `null` key.
 Allows multiple `null` values.
 Does **not** maintain insertion order.
 Uses hashing for fast data retrieval.

### Syntax

```java
HashMap<KeyType, ValueType> map = new HashMap<>();
```

Example:

```java
HashMap<Integer, String> map = new HashMap<>();
```

---

# Important HashMap Methods

## put()

### Definition

The `put()` method inserts a key-value pair into the HashMap.

### Syntax

```java
map.put(1, "Java");
```

---

## get()

### Definition

The `get()` method returns the value associated with the specified key.

### Syntax

```java
map.get(1);
```

---

## remove()

### Definition

The `remove()` method removes a key-value pair from the HashMap.

### Syntax

```java
map.remove(1);
```

---

## containsKey()

### Definition

The `containsKey()` method checks whether a specified key exists in the HashMap.

### Returns

 `true` → Key exists.
 `false` → Key does not exist.

### Syntax

```java
map.containsKey(1);
```

---

## containsValue()

### Definition

The `containsValue()` method checks whether a specified value exists in the HashMap.

### Returns

 `true` → Value exists.
 `false` → Value does not exist.

### Syntax

```java
map.containsValue("Java");
```

---

## size()

### Definition

The `size()` method returns the total number of key-value pairs in the HashMap.

### Syntax

```java
map.size();
```

---

## isEmpty()

### Definition

The `isEmpty()` method checks whether the HashMap contains any elements.

### Returns

 `true` → HashMap is empty.
 `false` → HashMap contains elements.

### Syntax

```java
map.isEmpty();
```

---

## clear()

### Definition

The `clear()` method removes all key-value pairs from the HashMap.

### Syntax

```java
map.clear();
```

---

## keySet()

### Definition

The `keySet()` method returns all keys present in the HashMap.

### Syntax

```java
map.keySet();
```

---

## values()

### Definition

The `values()` method returns all values stored in the HashMap.

### Syntax

```java
map.values();
```

---

## entrySet()

### Definition

The `entrySet()` method returns all key-value pairs as a set.

### Syntax

```java
map.entrySet();
```

---

# HashMap Features

 Stores data in **Key-Value** pairs.
 Keys must be unique.
 Values can be duplicated.
 Allows one `null` key.
 Allows multiple `null` values.
 Does not maintain insertion order.
 Not synchronized.
 Provides average **O(1)** time complexity for insertion, deletion, and searching.

---

# Applications of HashMap

 Student Record Management
 Employee Database
 Dictionary Applications
 Banking Systems
 User Login Information
 Caching Systems
 Inventory Management
---

# Advantages of HashMap
1. Fast searching.
2. Fast insertion.
3. Fast deletion.
4. Stores data in key-value pairs.
5. Easy to retrieve data using keys.

---

# Disadvantages of HashMap

1. Does not maintain insertion order.
2. Not thread-safe.
3. Performance decreases if many hash collisions occur.

---

# Difference Between HashMap and HashSet

|          HashMap         |         HashSet                    |
|--------------------------|------------------------------------|
| Stores key-value pairs   | Stores only unique values          |
| Allows one null key      | Allows one null element            |
| Values can be duplicated | Duplicate values are not allowed   |
| Uses put() method        |    Uses add() method               |

---

# Conclusion

Hashing is a technique used for fast data storage and retrieval by converting keys into hash codes. `HashMap` is one of the most widely used classes in Java that implements hashing to store data as key-value pairs efficiently. It offers excellent performance for insertion, searching, and deletion, making it ideal for many real-world applications.