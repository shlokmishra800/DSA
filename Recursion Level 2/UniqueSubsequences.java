// Question.> Print all UniqueSubSequences Of  a String

import java.util.HashSet;
public class UniqueSubsequences {
    public static void uniqueSubsequences(String str , int idx , String NewString , HashSet <String> set ){   
        if(idx == str.length())
{ 
    if(set.contains(NewString)){
        return ;
    }
    else {
         System.out.println(NewString);
          set.add(NewString);
         
          return ;
    }
    
    
}
char CurrChar = str.charAt(idx);
          //add
        uniqueSubsequences(str, idx+1, NewString+CurrChar, set);
        
        // Dont add
    uniqueSubsequences(str, idx+1, NewString, set);
 }

 public static void main(String[] args) {
    String str = "aaa";
    HashSet<String> set = new HashSet<>();
    uniqueSubsequences(str, 0, "", set);
 }
}

// Output=> 

//     aaa
//     aa
//     a

//we have used HashSet because  Hash set Stores only unique copies  of our element