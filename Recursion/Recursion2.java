//Print numbers from 1 to 5

public class Recursion2 {
    public static void PrintNum(int n) {
        if(n==6){
            return;
        }
        System.out.println(n);
        PrintNum(n+1);
        
    }

    public static void main(String[] args) {
        int n = 1;
        PrintNum(n);
    }
}


// output => 
// 1
// 2
// 3
// 4
// 5