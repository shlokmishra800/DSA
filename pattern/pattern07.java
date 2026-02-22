// pattern 7 

// 1
// 23
// 456
// 78910





public class pattern07 {
    public static void main(String[] args) {
        int n =4;
        int number = 1;
        for(int i = 1 ; i<=n ; i++){
for(int j=1 ; j<=i ; j++){
System.out.print(number);
number++;
}
System.out.println();
        }
    }
}
