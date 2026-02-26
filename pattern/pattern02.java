

// pattern 2 

// *****
// *   *
// *   *
// *   *
// *****





public class pattern02 {
    public static void main(String[] args) {
        int n=4 ;
      
        for(int i=0 ; i<=n ; i++){
for(int j=0 ; j<=n ; j++){
    //stars
    if(i==0 ||j==0 || i==n ||j==n){
        System.out.print("*");
    }
    //spces
    else{
        System.out.print(" ");
    }
}
  System.out.println();
        }
      
    }
}
