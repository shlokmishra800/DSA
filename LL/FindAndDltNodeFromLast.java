package LL;

public class FindAndDltNodeFromLast {
    public static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
       
    }

    public static class LL {
        Node head = null;
        Node tail = null;
     



        public void DltNthNodeFromEnd(Node head , int n){
if(head == null){
    return;
}

//size

int size = 0;
Node curr  = head;
while(curr != null){
    curr = curr.next;
    size++;
}



int idxToSearch = size - n;
if(idxToSearch < 0 || idxToSearch >= size){
    System.out.println(" invalid index");
    return;


        }
        if(idxToSearch == 0){
            head = head.next;
            return;
        }
        Node prev = head;
        int i = 1;
        while(i < idxToSearch){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;

       

    }
}

}