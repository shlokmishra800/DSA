package LL;

public class DelFromBeg {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class LinkL {
        Node head = null;
        Node tail = null;
        int length = 0;

        public void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
            length++;
        }

        void insertAtBeg(int val) {
            Node temp = new Node(val);
            if (head == null) {
                insertAtEnd(val);
            } else {
                temp.next = head;
                head = temp;
                length++;
            }
        }

        void insertAtMid(int idx, int val) {
            if (idx < 0 || idx > length) {
                System.out.println("Invalid index");
                return;
            }

            if (idx == 0) {
                insertAtBeg(val);
                return;
            } else if (idx == length) {
                insertAtEnd(val);
                return;
            }

            Node t = new Node(val);
            Node temp = head;
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
            }

            t.next = temp.next;
            temp.next = t;
            length++;
        }

        void deleteFromBeg() {
            if (head == null) {
                System.out.println("List is empty");
                return;
            }
            head = head.next;
            length--;
            if (head == null) { 
                tail = null;
            }
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("Null");
        }
    }

    public static void main(String[] args) {
        LinkL list = new LinkL();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtBeg(54);
        list.insertAtMid(2, 89);
        list.display();

        System.out.println("After deleting first node:");
        list.deleteFromBeg();
        list.display();
    }
}
