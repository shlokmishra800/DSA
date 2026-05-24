package Stack;

public class StackAsLL {
    static class Node {
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    static class Stack {
        public static Node head;

        public static boolean isEmpty(){
            return head == null;
        }

        public static void push(int data){
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        public static int pop(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack S = new Stack();
        S.push(2);
        S.push(3);
        S.push(4);

        System.out.println("Top element: " + S.peek());

        while(!S.isEmpty()){
            System.out.println("Popped: " + S.pop());
        }
    }
}

// Output =>

// Top element: 4
// Popped: 4
// Popped: 3
// Popped: 2

// Timer complexity = O(1)