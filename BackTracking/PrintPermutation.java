// Question.> Print all possible arrangements 

package BackTracking;

public class PrintPermutation {
     

    public static void printpermutation(String str , String Permutation , int idx){

if(str.length() == 0){
    System.out.println(Permutation);
}

for(int i = 0 ; i<str.length() ; i++){
    char curchar = str.charAt(i);
    String NewStr = str.substring(0, i) + str.substring(i+1);
    printpermutation(NewStr, Permutation + curchar, idx+1);

}

    }
    public static void main(String[] args) {
        String str = "ABC";
     printpermutation(str, "", 0);
    }
}

// Output => 

//     ABC
//     ACB
//     BAC
//     BCA
//     CAB
//     CBA

// time complexity for this program  = O( n*n!)
// beacuse total nyumber of possible combination = n!
// and path to react that combinations  = n