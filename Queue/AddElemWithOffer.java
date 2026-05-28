// Question.>   program to add elements to Queue using add() and offer() methods

package Queue;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class AddElemWithOffer {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        System.out.println(" using normal add method");
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4); // now if i add more elements , Linked List willl grow

        System.out.println(" Queue elements are" + queue);
        System.out.println(" adding using offer");

        Queue<Integer> BoundedQueue = new ArrayBlockingQueue<>(3);
        BoundedQueue.offer(1);
        BoundedQueue.offer(2);
        BoundedQueue.offer(3);
        System.out.println(" before adding 4th elements " + BoundedQueue);
        System.out.println("adding 4th element in queue =>" + BoundedQueue.offer(4)); // this will return false without
                                                                                      // any exception

    }
}

// Output =>

// using normal add method
// Queue elements are[1, 2, 3, 4]
// adding using offer
// before adding 4th elements [1, 2, 3]
// adding 4th element in queue =>false

// Timr Complexity = O(1)
