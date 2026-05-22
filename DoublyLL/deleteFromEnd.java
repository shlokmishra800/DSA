package DoublyLL;

public class deleteFromEnd {
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

        public void insertAtEnd(int val) { // InsertEnd
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

        public void insertAtBeg(int val) { // InsertBeg
            Node temp = new Node(val);
            if (head == null) {
                insertAtEnd(val);
                return;
            } else {
                temp.next = head;
                head.prev = temp;
                head = temp;
                length++;
            }

        }

        public void insertAtMid(int idx, int val) { // InsertMid
            Node temp = head;
            Node t = new Node(val);
            if (idx == length) {
                insertAtEnd(val);
                return;
            } else if (idx < 0 || idx > length) {
                System.out.println(" invalid index");
                return;
            } else if (idx == 0) {
                insertAtBeg(val);
                return;
            } else {
                for (int i = 0; i < idx - 1; i++) {
                    t.next = temp.next;
                    temp.next.prev = t;
                    t.prev = temp;
                    temp.next = t;
                    length++;
                }
            }
        }

        public void deleteFromEnd() { // deleteFromEnd
            if (head == null) {
                System.out.println(" empty list");
                return;
            } else if (head.next == null) {
                head = null;
                tail = null;
                length--;

            } else {
                Node temp = head;
                for (int i = 0; i < length - 1; i++) {
                    temp = temp.next;
                }
                tail = tail.prev;
                tail.next = null;
                length--;
            }
        }

        public void display() { // Display
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
        list.deleteFromEnd();
        list.display();
    }
}
// Output =>

// 100 -> 99 -> 19 -> 16 -> 11 -> Null
// before deleting
// 100 -> 99 -> 19 -> 16 -> 11 -> Null
// after deleting
// 100 -> 99 -> 19 -> 16 -> Null

// time complexity = O(n)
// because we have to traverse the list
