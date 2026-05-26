package Stack;

public class BasicStack {
    public static class Stack {
        int arr[];
        int size;
        int top;

        Stack(int size) {
            this.size = size;
            this.arr = new int[size];
            top = -1;
        }

        // Push
        public void push(int val) {
            if (top == size - 1) {
                System.out.println("Stack is full");
            } else {
                arr[++top] = val;
                System.out.println("Element inserted: " + val);
            }
        }

        // Pop
        void pop() {
            if (top == -1) {
                System.out.println("Stack is empty");
            } else {
                System.out.println("Element popped: " + arr[top]);
                top--;
            }
        }

        // Traverse
        void traverse() {
            if (top == -1) {
                System.out.println("Stack is empty");
            } else {
                System.out.print("Elements are: ");
                for (int i = 0; i <= top; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack(5);
        st.push(23);
        st.push(45);
        st.push(67);
        st.pop();
        st.traverse();
    }
}

// Output =>

// Element inserted: 23
// Element inserted: 45
// Element inserted: 67
// Element popped: 67
// Elements are: 23 45

// Time complexity => O(1) for push and pop
// and O(n) for traverse