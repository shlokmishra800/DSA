package DoublyLL;

public class InsertAtMid {
    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static class DoublyLL {
        Node head = null;
        Node tail = null;
        int length = 0;

        public void insertAtEnd(int val) { // insertEnd
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                temp.prev = tail;
                tail = temp;
            }
            length++;
        }

        public void insertAtBeg(int val) { // insertBeg
            Node temp = new Node(val);
            if (head == null) {
                insertAtEnd(val);
            } else {
                temp.next = head;
                head.prev = temp;
                head = temp;
            }
            length++;
        }

        public void insertAtMid(int idx, int val) { // insertMid
            Node t = new Node(val);
            Node temp = head;
            if (idx == length) {
                insertAtEnd(val);
            } else if (idx == 0) {
                insertAtBeg(val);
            } else if (idx > length || idx < 0) {
                System.out.println(" invalid index");
            } else {
                for (int i = 0; i < idx - 1; i++) {
                    temp = temp.next;
                }

                t.next = temp.next;
                t.prev = temp;
                temp.next.prev = t;
                temp.next = t;
                length++;
            }

        }

        public void display() { // Display
            Node temp = head;
            while (temp != null) {

                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println(" NUll");
        }
    }

    public static void main(String[] args) {
        DoublyLL list = new DoublyLL();

        list.insertAtEnd(19);
        list.insertAtEnd(16);
        list.insertAtEnd(11);
        list.insertAtBeg(100);
        list.insertAtMid(2, 99);
        list.display();

    }
}

// Output=>
// 100 -> 19 -> 99 -> 16 -> 11 -> NUll

// TimeComplexity = O(n)