package DoublyLL;

public class DeleteFromStart {
    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public static class DoublyLL {
        Node head = null;
        Node tail = null;
        int length = 0;

        public void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp;
                length++;
            } else {
                tail.next = temp;
                temp.prev = tail;
                tail = temp;
                length++;
            }

        }

        public void insertAtBeg(int val) {
            Node temp = new Node(val);
            if (head == null) {
                insertAtEnd(val);
            } else {
                temp.next = head;
                head.prev = temp;
                temp = head;
                length++;
            }
        }

        void insertAtMid(int idx, int val) {
            Node t = new Node(val);
            Node temp = head;
            if (idx == length) {
                insertAtEnd(val);
                return;
            } else if (idx == 0) {
                insertAtBeg(val);
                return;
            } else {
                for (int i = 0; i < idx - 1; i++) {
                    temp = temp.next;
                }
                t.next = temp.next;
                temp.next.prev = t;
                t.prev = temp;
                temp.next = t;
                length++;
            }
        }

        public void deleteFromEnd() {
            if (head == null) {
                System.out.println(" list is empty");
                return;
            } else if (head == tail) {
                head = null;
                tail = null;
                length--;
            } else {
                tail = tail.prev;
                tail.next = null;
                length--;

            }
        }

        public void deleteFromBeg() {

            if (head == null) {
                System.out.println(" empty list");
                return;

            } else if (head == tail) {
                head = null;
                tail = null;
                length--;
            } else {
                head = head.next;
                head.prev = null;
                length--;
            }
        }

        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println(" Null");
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
        System.out.println(" before deleting");
        list.display();
        System.out.println(" after deleting");
        list.deleteFromBeg();
        list.display();

    }
}

// Output =>

// 19 -> 16 -> 99 -> 11 -> Null
// before deleting
// 19 -> 16 -> 99 -> 11 -> Null
// after deleting
// 16 -> 99 -> 11 -> Null

// Time complexity = O(n)