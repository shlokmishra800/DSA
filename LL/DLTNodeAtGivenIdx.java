// Question.> Delete a node from given index in a Linked List

package LL;

public class DLTNodeAtGivenIdx {
    
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

        // Insert at end
        public void insertend(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            } else {
                tail.Next = temp;
            }
            tail = temp;
        }

        // Delete node at given index
        public void deleteAtIndex(int idx) {
            if (head == null) {
                System.out.println("List is empty");
                return;
            }

           
            if (idx < 0 || idx >= length()) {
                System.out.println("Wrong index");
                return;
            }

            if (idx == 0) {
                head = head.Next;
                if (head == null) { // if list becomes empty
                    tail = null;
                }
                return;
            }

   
            Node temp = head;
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.Next;
            }

            // Delete node
            temp.Next = temp.Next.Next;

      
            if (temp.Next == null) {
                tail = temp;
            }
        }

        // Display list
        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.Next;
            }
            System.out.println("Null");
        }

      
        int length() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.Next;
            }
            return count;
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

        System.out.println("Original List:");
        list.display();

        // Delete at index examples
        list.deleteAtIndex(0);   
        list.deleteAtIndex(2);   
        list.deleteAtIndex(list.length() - 1); 

        System.out.println("After Deletions:");
        list.display();
    }
}

// Output =>

//     Original List:
// 5 -> 6 -> 7 -> 8 -> 9 -> 10 -> Null
// After Deletions:
// 6 -> 7 -> 9 -> Null

// Time Complexity = O(n) 
// because we have to traverse the Linked List