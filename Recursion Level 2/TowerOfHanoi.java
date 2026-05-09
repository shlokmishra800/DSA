// Question => Solve Tower Of Hanoi Of 3 disk


public class TowerOfHanoi {
   
    public static void TowerOfHanoi(int n  , char aux , char  src  , char dest) {
        
        if(n==1) {
            System.out.println( src + " -> " + dest);
            return ;
        }
        TowerOfHanoi( n-1 , src , dest , aux);
        TowerOfHanoi(1, src, aux, dest);
        TowerOfHanoi(n-1, aux, src, dest);
        
    }

public static void main(String[] args) {

    TowerOfHanoi(3, 'A', 'B', 'C');

}
}


// Output => 
// A -> B
// B -> A
// C -> A
// A -> C
// C -> A
// A -> C
// B -> C