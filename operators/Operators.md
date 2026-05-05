### What are Operators in Java?

  - ** Operators are symbols used to perform operations on variables and values.** 

**Example:**

int a = 5 + 3;  // '+' is an operator
### 1. Arithmetic Operators

Used for mathematical calculations.

```java Operator	Name	Example	Result
+	Addition	5 + 3	8
-	Subtraction	5 - 3	2
*	Multiplication	5 * 3	15
/	Division	10 / 2	5
%	Modulus (remainder)	10 % 3	1 ```
**Example:**
```java
int a = 10, b = 3;
System.out.println(a + b); // 13
System.out.println(a % b); // 1 ```

### 2. Increment & Decrement Operators

**Used to increase or decrease value by 1.**

** Increment (++)**

Adds 1 to the variable.

 **Decrement (--)**

Subtracts 1 from the variable.

### Pre vs Post Operators
 **Pre-Increment (++a)**
Value is increased first, then used.
int a = 5;
int b = ++a;  // a becomes 6, then assigned
System.out.println(b); // 6
**Post-Increment (a++)**
Value is used first, then increased.
int a = 5;
int b = a++;  // assign 5, then a becomes 6
System.out.println(b); // 5
 ** Pre-Decrement (--a)**
int a = 5;
int b = --a;  // a becomes 4, then assigned
System.out.println(b); // 4
  **Post-Decrement (a--)**
int a = 5;
int b = a--;  // assign 5, then a becomes 4
System.out.println(b); // 5 


### 3. Logical Operators

**Used to combine or check conditions (mainly in if statements).**

```java Operator	Name	Description	Example
&&	Logical AND	True if both conditions are true	(a>5 && b<10)
 ||	Logical OR  True if any one condition is true 
!	Logical NOT	Reverses the condition	!(a>5)```
      Examples:
**AND (&&)**
```java int a = 10;
if (a > 5 && a < 15) {
    System.out.println("True");
} ```

**OR (||)**
```java
int a = 2;
if (a > 5 || a < 10) {
    System.out.println("True");
}```

**NOT (!)**
```java
int a = 10;
if (!(a < 5)) {
    System.out.println("True");
} ```