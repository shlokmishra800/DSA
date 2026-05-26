package Stack;

public class CountElem {
    public static class stackCount {
        int top;
        int arr[];
        int size;

        stackCount(int size) {
            this.size = size;
            this.top = -1;
            this.arr = new int[size];
        }

        public void CountStack() {
            if (top == -1) {
                System.out.println(" stacl is empty");
                return;
            }
            int count = 0;
            for (int i = 0; i <= top; i++) {
                count++;
            }
            System.out.println(" total elements are " + count);
        }

        void push(int val) {
            if (top == size - 1) {
                System.out.println(" stack is full");
                return;
            } else {
                arr[++top] = val;
                System.out.println(" element inserted " + val);
            }
        }

    }

    public static void main(String[] args) {
        stackCount s1 = new stackCount(7);
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.CountStack();
    }
}

// Output =>

// element inserted 1
// element inserted 2
// element inserted 3
// element inserted 4
// total elements are 4
// time complexity for push = O(1)
// and for CountStack = O(n)