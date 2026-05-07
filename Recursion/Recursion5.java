// Print Fibonacci Series till the nth term

public class Recursion5 {

public static void PrintFib(int a , int b , int n) {
    if(n==0){
        return;
    }
    int c = a+ b;
    System.out.println(c);
    PrintFib(b, c, n-1);
}

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
    int n = 7 ;
    PrintFib(a, b, n-2);
    }
}

// output =>

// 0
// 1
// 1
// 2
// 3
// 5
// 8
