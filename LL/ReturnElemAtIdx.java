// Question.> Impliment a method to  return the element at the given index in a linked list.
package LL;

public class ReturnElemAtIdx {
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

        public void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {

                head = temp;

            } else {
                tail.next = temp;
            }
            tail = temp;
        }

        public void insertAtBeg(int val) {
            Node temp = new Node(val);
            if (head == null) {
                insertAtEnd(val);
            } else {
                temp.next = head;
                head = temp;
            }
        }

        public void insertAtMid(int idx, int val) {
            Node t = new Node(val);
            Node temp = head;
            if (idx == 0) {
                insertAtBeg(val);
            } else if (idx == Length(head)) {
                insertAtEnd(val);
            } else if (idx < 0 || idx > Length(head)) {
                System.out.println(" Wrong index");
            }
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;

            }
            t.next = temp.next;
            temp.next = t;
        }

        int Length(Node head) {

            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;

        }

        public int GetElementAtIdx(int idx) {
            Node temp = head;
            if (idx < 0 || idx > Length(temp)) {
                System.out.println(" wrong index");
                return -1;
            }
            for (int i = 0; i < idx; i++) {
                temp = temp.next;

            }

            return temp.data;
        }

        void Display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ->");
                temp = temp.next;
            }
            System.out.println("Null");
        }
    }

    public static void main(String[] args) {
        LinkL list = new LinkL();
        list.insertAtEnd(54);
        list.insertAtEnd(8);
        list.insertAtEnd(5);
        list.insertAtBeg(90);
        list.insertAtMid(1, 89);
        list.Display();
        list.GetElementAtIdx(2);
        System.out.println("element at index(2) is = " + list.GetElementAtIdx(2));
    }
}

// Output =>

// 90 ->89 ->54 ->8 ->5 ->Null
// element at index(2) is =54

//time complexity = > O(n) 
// beacause we have to traverse the linked list to reach the given index.   