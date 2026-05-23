package LL;

public class ReverseIterative {
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

        void insertAtMid(int val) {

            Node temp = new Node(val);
            if (head == null) { // empty list
                insertend(val);
            } else {
                temp.Next = head;
                head = temp;

            }

        }

        void insertAtBeg(int val) {
            Node temp = new Node(val);
            if (head == null) { // empty list
                insertend(val);
            } else {
                temp.Next = head;
                head = temp;

            }
        }

        public void insertAtMid(int idx, int val) {
            Node t = new Node(val);
            Node temp = head;
            if (idx == Length(head)) {
                insertend(val);
                return;
            } else if (idx == 0) {
                insertAtBeg(val);
                return;
            } else if (idx < 0 || idx > Length(head)) {
                System.out.println("invalid index");
            }
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.Next;

            }
            t.Next = temp.Next;
            temp.Next = t;

        }

        int Length(Node head) {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.Next;
            }

            return count;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.Next;
            }
            System.out.println("Null");
        }

        public void reverseIterative() {

            if (head == null || head.Next == null) {
                return;
            } else {
                Node PrevNode = head;
                Node currNode = head.Next;
                while (currNode != null) {
                    Node nextNode = currNode.Next;
                    currNode.Next = PrevNode;

                    PrevNode = currNode;
                    currNode = nextNode;
                }
                head.Next = null;
                head = PrevNode;

            }
        }

    }

    public static void main(String[] args) {

        LinkL list = new LinkL();
        list.insertAtBeg(23);
        list.insertend(5);
        list.insertend(6);
        list.insertAtMid(2, 54);
        System.out.println(" before reversing the list");
        list.display();
        list.reverseIterative();
        System.out.println(" After reversing the list");
        list.display();
    }
}

// Output =>

// before reversing the list
// 23 -> 5 -> 54 -> 6 -> Null
// After reversing the list
// 6 -> 54 -> 5 -> 23 -> Null

// Time complexity => O(n) where n is the number of nodes in the list
