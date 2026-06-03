import java.io.File;


public class FileExist {
    public static void main(String[] args) {

        File f1 = new File("index.txt");

        if (f1.exists()) {
            System.out.println("The file exists."); // One-line explanation
        } else {
            System.out.println("The file does not exist.");
        }

    }
}

// Output => The file exists
