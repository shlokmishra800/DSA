// Question.> Count path in maze to move from (0 , 0) to (n, m);
// note.> we can only move right or down 

public class CountPath {
    public static int countpath(int i , int j , int n , int m){
        if(i == n || j == m){
            return 0;
        }
        if(i == n -1 || j == m -1){
            return 1;
        }

        // move downward

        int downward = countpath(i+1, j, n, m);

        // move rightward 

        int rightward = countpath(i, j+1, n, m);

        return downward + rightward ;
    }
    public static void main(String[] args) {
        int n =3 , m = 3;
         int totalPath = countpath(0, 0, n, m);
         System.out.println(totalPath); 
    }
}

// Output => 6

//we can improve time complexity for this program using Dynamic Programming