package LL;

import javax.xml.soap.SOAPElement;

public class Length2 {
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
        int Length = 0;
        public void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {

                head = temp;

            } else {
                tail.next = temp;
            }
            tail = temp;
            Length++;
        }

        public void insertAtBeg(int val) {
            Node temp = new Node(val);
            if (head == null) {
                insertAtEnd(val);
            } else {
                temp.next = head;
                head = temp;
                Length ++;
            }
        }

        public void insertAtMid(int idx, int val) {
            Node t = new Node(val);
            Node temp = head;
            if (idx == 0) {
                insertAtBeg(val);
            } else if (idx == Length) {
                insertAtEnd(val);
            } else if (idx < 0 || idx > Length(head)) {
                System.out.println(" Wrong index");
            }
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;

            }
            t.next = temp.next;
            temp.next = t;
            Length++;
        }

        int Length(Node head) {

            // Node temp = head;
            // int count = 0;
            // while (temp != null) {
            //     count++;
            //     temp = temp.next;
            // }
            return Length;

        }

        public int GetElementAtIdx(int idx) {
            Node temp = head;
            if (idx < 0 || idx > Length) {
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
        System.out.println(" length of Linked List ids  = " +list.Length);
    }
}

// Output =>

//     90 ->89 ->54 ->8 ->5 ->Null
// element at index(2) is = 54
//  length of Linked List ids  = 5   // time complexity = O(1) Because linked list clas is there.