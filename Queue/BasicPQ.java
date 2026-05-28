package Queue;

import java.util.*;

public class BasicPQ {
    public static void main(String[] args) {

        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        pq.add(2);
        pq.add(3);
        pq.add(4);
        pq.add(5);

        System.out.println(" Original Queue" + pq); // insertion

        pq.remove();
        System.out.println(" after removing head element " + pq); // deeltion (from head)

        System.out.println(" head element of Queue" + pq.peek()); // accessing head element

        System.out.println(" poll method" + pq.poll());// poll method removes the head(smallest element) and return it

        System.out.println(" after poll method " + pq);

        Iterator<Integer> iterator = pq.iterator(); // here iterator is like cursor that traverse through the queue
                                                    // elements
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " "); // traversing the queue using iterator
        }
    }
}

// Output =>

// Original Queue[1, 2, 3, 4, 5]
// after removing head element [2, 4, 3, 5]
// head element of Queue2
// poll method2
// after poll method [3, 4, 5]
// 3
// 4
// 5