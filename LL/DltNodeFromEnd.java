package LL;

public class DltNodeFromEnd {
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

        // Insert at End
        public void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            length++;
        }

        // Insert at Beginning
        void insertAtBeg(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
            length++;
        }

        // Insert at Mid (by index)
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

        // Delete from Beginning
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

        // Delete from End
        void deleteFromEnd() {
            if (head == null) {
                System.out.println("List is empty");
                return;
            } else if (head.next == null) {
                head = null;
                tail = null;
                length--;
            } else {
                Node temp = head;
                while (temp.next != tail) {
                    temp = temp.next;   
                }
                temp.next = null;      
                tail = temp;            
                length--;
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

        System.out.println("After deleting last node:");
        list.deleteFromEnd();
        list.display();
    }
}

// Output =>

// 54 -> 10 -> 89 -> 20 -> Null
// After deleting first node:
// 10 -> 89 -> 20 -> Null
// After deleting last node:
// 10 -> 89 -> Null