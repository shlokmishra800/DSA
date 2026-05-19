package LL;

public class LengthLL {
    
    public static class Node {
        int data;
        Node Next;

        Node(int data) {
            this.data = data;
        }
    }

   
    public void Length(Node head) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
          count++;
            temp = temp.Next;
        }
        System.out.println(count);
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
        LengthLL list = new LengthLL();
        list.Length(a);
    }
}
// Output => 6
