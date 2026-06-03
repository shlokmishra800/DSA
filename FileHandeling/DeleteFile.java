import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {

        File f1 = new File("index.txt");

        if (f1.delete()) {
            System.out.println(" file deleted");
        } else {
            System.out.println(" failed in deleting file ");
        }

    }
}

// Output =>

//  file deleted