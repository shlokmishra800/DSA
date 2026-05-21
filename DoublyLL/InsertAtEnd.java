package DoublyLL;

public class InsertAtEnd {
    

    public static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
            this .next = null;
            this.prev = null;
           
        }

    }
    public static class DoublyLL{
         int length = 0;
      Node head = null;
      Node tail = null;
         void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head == null) {
head = temp;
tail = temp;

            }else{
               tail.next = temp;
               tail.prev = tail;
                tail = temp;
            }
            length ++;

         }
         void display(){
            Node temp = head;
            while(temp != null){
               
                System.out.print(temp.data + " -> ");
                 temp = temp.next;
                
            }
            System.out.println("Null");

         }
    }
    public static void main(String[] args) {
        DoublyLL list = new DoublyLL();
         list.insertAtEnd(34);
          list.insertAtEnd(32);
           list.insertAtEnd(38);
           list.display();
    }
}

// Output =->

// 34 -> 32 -> 38 -> Null
