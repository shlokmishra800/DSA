//  implement Queue using ArrayDeque class

package Queue;

import java.util.*;

public class QueueUsingArrDeque {
    public static void main(String[] args) {
        Queue<Integer> arrque = new ArrayDeque<>();
        arrque.add(1);
        arrque.add(2);
        arrque.add(3);
        arrque.add(4);
        arrque.add(5);

        Iterator itr = arrque.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next() + " ");
        }
    }
}

// Output =>

// 1
// 2
// 3
// 4
// 5

//Time Complexity => O(n)