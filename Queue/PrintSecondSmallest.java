// Question.> Print second smallest element of Queue

package Queue;

import java.util.*;

public class PrintSecondSmallest {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println(" original queue" + queue);

        int smallest = Integer.MAX_VALUE;
        int secondSmallerst = Integer.MAX_VALUE;

        for (int num : queue) {
            if (num < smallest) {
                secondSmallerst = smallest;
                smallest = num;
            } else if (num < secondSmallerst && num != smallest) {
                secondSmallerst = num;
            }
        }
        if (secondSmallerst == Integer.MAX_VALUE) {
            System.out.println(" Queue has less than 2 elements ");
        } else {
            System.out.println(" Second smallest element is " + secondSmallerst);
        }
    }
}

// Output.>
// original queue[1, 2, 3, 4]
// Second smallest element of Queue is =>2
// Time complexity => O(n)
// Space complexity = O(1)