package LL;
import java.util.*;

public class BasicLL {

    
    public static class Node {
        int data;
        Node Next;

        Node(int data) {
            this.data = data;
        }
    }

   
    public void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.Next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
      
        Node a = new Node(5);
        Node b = new Node(2);
        Node c = new Node(4);
        Node d = new Node(6);
        Node e = new Node(7);
        Node f = new Node(8);

        // Link nodes
        a.Next = b;
        b.Next = c;
        c.Next = d;
        d.Next = e;
        e.Next = f;

        // Create object of BasicLL to call display
        BasicLL list = new BasicLL();
        list.display(a);
    }
}

// Output =>

//     5->2->4->6->7->8->null