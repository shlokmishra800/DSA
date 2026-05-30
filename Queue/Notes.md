# Queue in Java

### **What is a Queue?**

**A Queue is a linear data structure that follows the FIFO (First In, First Out) principle. This means that the element inserted first is removed first. Elements are added from the rear (enqueue) and removed from the front (dequeue).**

---

### **Explanation**

**A Queue works similarly to a real-life queue, such as people standing in line at a ticket counter. The person who joins the line first gets served first. In Java, queues are commonly used for scheduling tasks, managing requests, buffering data, and implementing algorithms such as Breadth-First Search (BFS).**

---

### **Basic Operations of Queue**

- **Enqueue** → Adds an element to the rear of the queue.
- **Dequeue** → Removes an element from the front of the queue.
- **Peek/Front** → Returns the front element without removing it.
- **isEmpty** → Checks whether the queue is empty.
- **Size** → Returns the number of elements in the queue.

---

### **Advantages of Queue**

- **Follows FIFO order, making processing fair and organized.**
- **Efficient insertion and deletion operations.**
- **Useful for task scheduling and resource management.**
- **Widely used in BFS, CPU scheduling, and printer spooling.**
- **Helps manage data in the order it arrives.**

---

### **Disadvantages of Queue**

- **Elements can only be accessed from the front, limiting direct access.**
- **Searching for a specific element can be slow.**
- **Memory may be wasted in simple array-based implementations.**
- **Not suitable when random access to elements is required.**
- **Fixed-size queues may suffer from overflow issues.**

---

### **Applications of Queue**

- **CPU Scheduling**
- **Printer Queue Management**
- **Breadth-First Search (BFS)**
- **Handling Requests in Web Servers**
- **Call Center Systems**
- **Message Queues and Buffers**

---

### **FIFO Principle**

**FIFO (First In, First Out) means that the first element inserted into the queue will be the first element removed from the queue. This principle ensures that elements are processed in the order they arrive.**