package Queue;

public class ArrayImplimentQueue {
    public static class QueueA {
        int f = -1;
        int r = -1;
        int size = 0;
        int arr[] = new int[5];

        public void add(int val) {
            if (r == arr.length - 1) {
                System.out.println(" Queue is full");
                return;
            } else if (f == -1) {
                f = r = 0;
                arr[r] = val;
            } else {
                arr[++r] = val;
            }

            size++;
        }

        public int pop() {
            if (size == 0) {
                System.out.println(" Queue is empty");
                return -1;
            } else {
                int val = arr[f];
                f++;
                size--;
                return val;
            }
        }

        public int peek() {
            if (size == 0) {
                System.out.println(" Queue is empty");
                return -1;
            } else {
                return arr[f];
            }
        }

        public boolean isEmpty() {
            if (size == 0) {
                return true;
            } else {
                return false;
            }
        }

        public void display() {
            if (size == 0) {
                System.out.println(" Queue is empty");
                return;
            } else {
                for (int i = f; i <= r; i++) {
                    System.out.print(arr[i]);
                }
                System.out.println("");
            }
        }

    }

    public static void main(String[] args) {
        QueueA q = new QueueA();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.peek();
        q.display();
        q.pop();
        q.peek();
        q.display();

    }
}

// Output =>

// 01234
// 1234
// Timer Complexity => O(1) for add , pop , peek
// Time Complexity O(n) for Display