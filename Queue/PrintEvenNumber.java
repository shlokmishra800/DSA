package Queue;

import java.util.*;

public class PrintEvenNumber {
    public static void main(String[] args) {
        // Create a queue
        Queue<Integer> queue = new LinkedList<>();

        // Add elements to the queue
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);

        System.out.println("Original Queue: " + queue);

        for (int num : queue) {
            if (num % 2 == 0) {
                System.out.println(num + " ");
            }
        }

    }
}

// Output =>

// Original Queue: [1, 2, 3, 4, 5, 6]
// 2
// 4
// 6
// Time Complexity =>O(n)