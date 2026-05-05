|  &       | AND         | Sets bit to 1 if both bits are 1         | 5 & 3 = 1      |
| \|       | OR          | Sets bit to 1 if at least one bit is 1   | 5 \| 3 = 7     |
| ^        | XOR         | Sets bit to 1 if bits are different      | 5 ^ 3 = 6      |
| ~        | NOT         | Inverts all bits                         | ~5 = -6        |
| <<       | Left Shift  | Shifts bits to left                      | 5 << 1 = 10    |
| >>       | Right Shift | Shifts bits to right                     | 5 >> 1 = 2     |

---

### Binary Operators Example

```java
int a = 5;  // 0101 in binary
int b = 3;  // 0011 in binary

System.out.println(a & b); // 0001 → 1
System.out.println(a | b); // 0111 → 7
System.out.println(a ^ b); // 0110 → 6
Shift Operators Example
int a = 5;  // 0101

System.out.println(a << 1); // 1010 → 10
System.out.println(a >> 1); // 0010 → 2

---

##  Quick Understanding (Simple Way)

- `&` → both 1 → 1  
- `|` → any 1 → 1  
- `^` → different → 1  
- `~` → reverse bits  
- `<<` → multiply by 2  
- `>>` → divide by 2  

---
