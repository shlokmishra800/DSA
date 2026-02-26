
// pattern --

// *              *
// **            **
// ***          ***
// ****        ****
// *****      *****
// ******    ******
// *******  *******
// ****************
// ****************
// *******  *******
// ******    ******
// *****      *****
// ****        ****
// ***          ***
// **            **
// *              *










public class pattern10 {
    public static void main(String[] args) {
//upper half 

        int n = 8;
        //1st part 
        for(int i=1;i<=n;i++){
            for(int j=1; j<=i ;j++){
                System.out.print("*");
            }

            //spaces 
            int spaces = 2*(n-i);
            for(int j=1;j<=spaces;j++){
System.out.print(" ");
            }
           // 2nd part 
            for(int j=1 ; j<=i;j++){
                System.out.print("*");
            }
             System.out.println();
        }


//lower half

          //first part 
         for(int i=n;i>=1;i--){
            for(int j=1; j<=i ;j++){
                System.out.print("*");
            }
            //spaces
            int spaces = 2*(n-i);
            for(int j=1;j<=spaces;j++){
System.out.print(" ");
            }
            //second part 
            for(int j=1 ; j<=i;j++){
                System.out.print("*");
            }
             System.out.println();
        }
       
    }
}