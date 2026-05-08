//  Calculate x^n (Stack height = logn)
 
 
 
 class Recursion7{


    public static int calcPow(int x , int n) {
        
        if(n==0){   //base condition 1
            return 1;
        }
        if(x==0){     //base condition 2
            return 0;
        }
        if(n%2==0){      //if n is even 
           return calcPow(x, n/2) * calcPow(x, n/2); 
        }
        else {     //n is odd
            return calcPow(x, n/2) * calcPow(x, n/2) * x ;
        }

    }
    public static void main(String[] args) {
        int x = 2 ;
        int n = 5 ;
        int ans = calcPow(x, n);
        System.out.println(ans);
    }
}

// output =>  32