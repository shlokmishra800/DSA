// Print number from 5 to 1 


 class Recursion1 {
public static void PrintNum(int n ) {
    if(n==0){
        return;
    }
    System.out.println(n);

    PrintNum(n-1);
    
}
public static void main(String[] args) {
    int n = 5;
    PrintNum(n);
}
}
//output => 
// 5
// 4
// 3
// 2
// 1