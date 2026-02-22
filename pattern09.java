

// pattern 9 


// 12345
// 1234
// 123
// 12
// 1



public class pattern09 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = n;i>0 ; i--){
            for(int j=1 ; j<=i ; j++) {
                System.out.print(j);

            }
            System.out.println();
        }
    }
}
