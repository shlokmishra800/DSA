import java.io.File;
import java.io.IOException;

public class CanReadFile {
  public static void main(String[] args) {
    try{

        File f1 = new File("index.txt");

        if(f1.createNewFile()){
            System.out.println( "file  created");
         }else{
            System.out.println(" file already exist");
         } if (f1.canRead()) {
            System.out.println(" file is readable ");
        } else {
            System.out.println(" file is not readable");
        }
    }catch(IOException e){
        System.out.println(" error caught" +e.getStackTrace());
    }
  }  
}

// Output =>

//  file already exist
//  file is readable 