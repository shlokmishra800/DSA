// Question .> Implement a Priority Queue using Java's built-in PriorityQueue class.

package Queue;

import java.util.*;

public class priorityQueue {
    public static void main(String args[]){
    Queue <Integer> pq = new PriorityQueue<>();
    
    pq.add(1);
    pq.add(2);
    pq.add(3);
    pq.add(4);
    pq.add(5);

System.out.println(" elements in priority queue " +pq);

    }
}

// Output =>

//  elements in priority queue [1, 2, 3, 4, 5]