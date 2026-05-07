// Calculate  x^n   (Stack Height = n)

public class Recursion6 {
    public static int calcPower(int  x , int n) {
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }

        int x_pow_nm1 = calcPower(x, n-1);
        int x_pown = n * x_pow_nm1;
        return x_pown;
        
    }
    public static void main(String[] args) {
        int x = 2 ;
        int n = 5;
        int ans = calcPower(x, n);
        System.out.println(ans);
    }
}

// Output =>  120