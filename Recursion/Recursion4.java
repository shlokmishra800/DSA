// Print Factorial of n numbers

public class Recursion4 {
    public static int PrintFact(int n) {

if(n==0 || n==1){
    return 1;
}

      int fact_nm1 = PrintFact(n-1);
int fact_n = n* fact_nm1;
return fact_n;


        }
        public static void main(String[] args) {
            int n = 5 ;
            int ans = PrintFact(n);
        System.out.println(ans);
        }
        
    }

    // output => 120

