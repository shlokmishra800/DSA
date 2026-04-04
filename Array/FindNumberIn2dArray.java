package Array;
import java.util.*;
public class FindNumberIn2dArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row size");
        int row = sc.nextInt();
System.out.println("enter column size");
int column = sc.nextInt();
System.out.println("enter numbers in your 2d array ");
int [] [] array = new int[row] [column];
for(int i = 0 ; i<row ; i++){
    for(int j = 0 ; j< column ; j++){
        array[i][j] = sc.nextInt();
    }
}
System.out.println("enter number you want to search");
int num = sc.nextInt();
for(int i = 0 ; i<row ; i++){
    for(int j = 0 ; j<column ; j++){
        if(num == array[i][j]){
            System.out.println(" we found your number at index " + " (" + i + " ," + j + " )");
        }
      
    }
}
    }
}
