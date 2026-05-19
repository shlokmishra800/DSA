package LL;

public class InsertEnd {

    public static class Node {
        int data;
        Node Next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class LinkL {
        Node head = null;
        Node tail = null;

        public void insertend(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            } else {
                tail.Next = temp;

            }
            tail = temp;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.Next;
            }
            System.out.println("Null");
        }

    }

    public static void main(String[] args) {

        LinkL list = new LinkL();
        list.insertend(5);
        list.insertend(6);
        list.insertend(7);
        list.insertend(8);
        list.insertend(9);
        list.insertend(10);
        list.display();
    }
}
// Output => 5 -> 6 -> 7 -> 8 -> 9 -> 10 -> Null