# File Handling in Java

## Definition

File Handling in Java is the process of creating, reading, writing, updating, and deleting files using Java classes and methods. It allows programs to store and retrieve data permanently from the storage device.

## Explanation

- File handling enables data persistence.
- Java provides the `File`, `FileReader`, `FileWriter`, `BufferedReader`, and `Scanner` classes for file operations.
- It is commonly used for storing user data, logs, reports, and configuration files.

---

# File Class in Java

## Definition

The `File` class is a part of the `java.io` package and is used to create, delete, and obtain information about files and directories.

### Syntax

```java
File file = new File("example.txt");
```

---

# createNewFile()

## Definition

The `createNewFile()` method is used to create a new file in the specified location.

## Explanation

- Creates a new empty file.
- Returns `true` if the file is created successfully.
- Returns `false` if the file already exists.

### Syntax

```java
file.createNewFile();
```

---

# exists()

## Definition

The `exists()` method checks whether a file or directory exists.

## Explanation

- Returns `true` if the file exists.
- Returns `false` if the file does not exist.

### Syntax

```java
file.exists();
```

---

# delete()

## Definition

The `delete()` method is used to remove a file or directory.

## Explanation

- Permanently deletes the file.
- Returns `true` if deletion is successful.
- Returns `false` if deletion fails.

### Syntax

```java
file.delete();
```

---

# canRead()

## Definition

The `canRead()` method checks whether a file can be read.

## Explanation

- Returns `true` if the file has read permission.
- Returns `false` otherwise.

### Syntax

```java
file.canRead();
```

---

# canWrite()

## Definition

The `canWrite()` method checks whether a file can be modified or written to.

## Explanation

- Returns `true` if write permission is available.
- Returns `false` otherwise.

### Syntax

```java
file.canWrite();
```

---

# getAbsolutePath()

## Definition

The `getAbsolutePath()` method returns the complete path of a file.

## Explanation

- Provides the full location of the file in the system.
- Useful for locating files during execution.

### Syntax

```java
file.getAbsolutePath();
```

---

# getPath()

## Definition

The `getPath()` method returns the path used to create the file object.

## Explanation

- Returns the file path as a string.
- May be relative or absolute.

### Syntax

```java
file.getPath();
```

---

# Reading a File in Java

## Definition

Reading a file means retrieving data stored inside a file.

## Explanation

- Used to access saved information.
- Commonly performed using `Scanner`, `FileReader`, or `BufferedReader`.

### Syntax

```java
Scanner sc = new Scanner(file);
```

---

# Writing to a File in Java

## Definition

Writing to a file means storing data inside a file.

## Explanation

- Used to save information permanently.
- Commonly performed using the `FileWriter` class.

### Syntax

```java
FileWriter writer = new FileWriter("example.txt");
```

---

# write()

## Definition

The `write()` method is used to write text into a file.

## Explanation

- Stores data in the specified file.
- Can write characters, strings, and text content.

### Syntax

```java
writer.write("Hello World");
```

---

# FileReader Class

## Definition

`FileReader` is a class used to read character data from files.

## Explanation

- Reads one character at a time.
- Suitable for small text files.

### Syntax

```java
FileReader reader = new FileReader("example.txt");
```

---

# FileWriter Class

## Definition

`FileWriter` is a class used to write character data into files.

## Explanation

- Creates a file if it does not exist.
- Overwrites existing content by default.

### Syntax

```java
FileWriter writer = new FileWriter("example.txt");
```

---

# Advantages of File Handling

1. Provides permanent data storage.
2. Enables data sharing between programs.
3. Supports large amounts of information.
4. Helps maintain records and logs.
5. Improves application functionality.

---

# Disadvantages of File Handling

1. Slower than memory operations.
2. Requires exception handling.
3. Risk of data corruption if not handled properly.
4. Additional storage space is required.

---

# Conclusion

File Handling is an important feature of Java that allows programs to create, read, write, update, and delete files. It provides permanent storage for data and is widely used in real-world applications such as databases, logs, reports, and configuration management.