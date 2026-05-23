package DoublyLL;

public class DeleteFromMid {
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

                return;
            } else {
                temp.next = head;
                head.prev = temp;
                head = temp;
                length++;
            }
        }

        public void insertAtMid(int idx, int val) {
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
                    temp = temp.next;
                }
                t.next = temp.next;
                temp.next.prev = t;
                temp.next = t;
                t.prev = temp;
                length++;
            }
        }

        public void deleteFromStart() {
            if (head == null) {
                System.out.println(" list is empty");
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

        public void deleteFromEnd() {
            if (head == null) {
                System.out.println(" List is empty");
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

        public void deleteFromMid(int idx) {
            // Node t = new Node(idx);
            Node temp = head;
            if (head == null) {
                System.out.println(" list is empty");
                return;
            } else if (head == tail) {
                head = null;
                tail = null;
                length--;
            } else if (idx == 0) {
                deleteFromStart();
                return;
            } else if (idx == length) {
                deleteFromEnd();
                return;
            } else if (idx < 0 || idx > length) {
                System.out.println(" invalid index");
                return;
            } else if (temp.next == tail) {
                System.out.println(" there is no mid value");
                return;
            } else {
                for (int i = 0; i < idx - 1; i++) {
                    temp = temp.next;
                }
                Node t = temp.next;
                temp.next = t.next;
                t.next.prev = temp;
                length--;
            }
        }

        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("Null");
        }
    }

    public static void main(String[] args) {
        DoublyLL list = new DoublyLL();
        list.insertAtEnd(23);
        list.insertAtEnd(24);
        list.insertAtEnd(25);
        list.insertAtBeg(30);
        System.out.println(" Before deleting");
        list.display();
        list.deleteFromMid(2);
        System.out.println(" After deleting");
        list.display();
    }
}

// output = >

// Before deleting
// 30 -> 23 -> 24 -> 25 -> Null
// After deleting
// 30 -> 23 -> 25 -> Null

// Time Complexity = > O(n)
// because we have to traverse the list