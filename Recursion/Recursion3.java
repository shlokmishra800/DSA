// Print sum of  first n natural numbers 

public class Recursion3 {
    public static void PrintSum(int i ,int   n ,int  sum) {
        if(i==n){
            sum += i;
        System.out.println(sum);
        return;
        }
         sum +=i;
         PrintSum(i+1, n, sum);

    }
    public static void main(String[] args) {
        PrintSum(1, 6, 0);      
    }
}


// output  => 21