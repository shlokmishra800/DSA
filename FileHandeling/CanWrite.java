import java.io.File;
import java.io.IOException;

public class CanWrite {
    public static void main(String[] args) {
        try {

            File f1 = new File("index.txt");

            if (f1.createNewFile()) {
                System.out.println(" file created");
            } else {
                System.out.println("file already exist");
            }

            if (f1.canWrite()) {
                System.out.println(" this file is writable ");
            } else {
                System.out.println(" file is not writable");
            }
        } catch (IOException e) {
            System.out.println(" error caught" + e.getStackTrace());
        }
    }
}

// Output =>

// file already exist
// this file is writable
