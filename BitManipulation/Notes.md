---

### Bit Manipulation in Java

**Bit manipulation refers to performing operations directly on binary representations (bits) of numbers using bitwise operators.  
It is commonly used for optimization, low-level programming, and efficient data handling.**

---

** 1. Get Bit**

**Definition:**  
The **get bit** operation is used to check whether a specific bit (position) in a number is **0 or 1**.

**Logic:**  
- Use AND (`&`) with a bitmask.
- If result = 0 → bit is 0  
- If result ≠ 0 → bit is 1  

**Formula:**
```java
bitMask = 1 << position;
result = number & bitMask;

```java
int n = 5;        // 0101
int position = 2; // checking 3rd bit

int bitMask = 1 << position;
if ((n & bitMask) == 0) {
    System.out.println("Bit is 0");
} else {
    System.out.println("Bit is 1");
} ```

** 2. Set Bit**

Definition:
The set bit operation is used to change a specific bit to 1, regardless of its previous value.

Logic:

Use OR (|) with a bitmask.

Formula:

```java
bitMask = 1 << position;
result = number | bitMask;
```

Example:
```java
int n = 5;        // 0101
int position = 1; // set 2nd bit

int bitMask = 1 << position;
int newNumber = n | bitMask;

System.out.println(newNumber); // 7 (0111)
```
**3. Clear Bit**

Definition:
The clear bit operation is used to change a specific bit to 0, regardless of its previous value.

Logic:

```java
Use AND (&) with NOT (~) of bitmask.
```

Formula:

```java
bitMask = 1 << position;
result = number & (~bitMask);
```

Example:

```java
int n = 5;        // 0101
int position = 2; // clear 3rd bit

int bitMask = 1 << position;
int newNumber = n & (~bitMask);

System.out.println(newNumber); // 1 (0001)
```
** 4. Update Bit**

Definition:
The update bit operation is used to change a specific bit to either 0 or 1.

Logic:

First clear the bit
Then set it according to required value

Formula:

```java
bitMask = 1 << position;
number = number & (~bitMask);   // clear bit

if (newBit == 1) {
    number = number | bitMask;  // set bit
}
```
Example:

```java
int n = 5;         // 0101
int position = 1;  
int newBit = 1;    // value to update (0 or 1)

int bitMask = 1 << position;
n = n & (~bitMask);  // clear

if (newBit == 1) {
    n = n | bitMask;
}

System.out.println(n); // 7 (0111)
```