package DoublyLL;

public class InsertAtBeg {
    public static class Node{
        
int data;
Node next;
Node prev;
           Node(int data){
    this.data = data;
    this.next = null;
    this.prev = null;


}
    }
    public static class DoublyLL{
        Node head = null;
        Node tail = null;
        int length = 0;
  //insert at end
              public void insertAtEnd(int val) {
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
   //insert at beg
          public void insertAtBeg(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                temp.next = head;
                head.prev = temp;
                head = temp;
            }
            length++;
        }
        void display(){   //display
          Node temp = head;
                while(temp != null){
                    System.out.print(temp.data + " ->" );
                    temp = temp.next;
                }
                System.out.println("Null");
            }
        }

    
    public static void main(String[] args) {
        DoublyLL list = new DoublyLL();
        list.insertAtEnd(34);
          list.insertAtEnd(67);
            list.insertAtEnd(89);
            list.insertAtBeg(11);
            list.display();
    }
}

// Output =>

// 11 ->34 ->67 ->89 ->Null