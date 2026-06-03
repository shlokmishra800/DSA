
import java.io.File;
import java.io.IOException;


public class CreateFile {
   public static void main(String[] args) {
      try {
         File f1 = new File("index.txt");
         if (f1.createNewFile()) {
            System.out.println("file created => " + f1.getName());
         } else {
            System.out.println(" file creation failed");
         }

      } catch (IOException e) {
         System.out.println(" error caught" + e.getStackTrace());
      }

   }
}

// Output =>

// file createdindex.txt
