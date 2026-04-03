






package Array;
 import java.util.*;
public class Print2DArray {
   
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("enter your rows size"); 
   int rows = sc.nextInt();
   System.out.println("enter your column size");
   int columns = sc.nextInt();
   System.out.println("enter numbers in your array");
   int [] [] array = new int[rows][columns];
   for(int i =0 ; i< rows ; i++){
    for(int j = 0 ; j< columns ; j++){
    array [i] [j] = sc.nextInt();

    }
   }
System.out.println("your entered array is ");
for( int i = 0 ; i < rows ; i++){
    for(int j = 0 ; j <columns ; j++){
        System.out.print( + array[i][j] + " ");
    }
    System.out.println();
}
}

}