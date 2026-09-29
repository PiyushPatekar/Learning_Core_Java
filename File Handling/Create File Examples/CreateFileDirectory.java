import java.io.File;
import java.io.IOException;

public class CreateFileDirectory {
    public static void main(String[] args) {

        try {

            File file = new File("C:\\Github\\Learning_Core_Java\\newfile.txt"); // This line does not creates file //

            if (file.createNewFile()) { // createNewFile() returns Boolean value & also shows throw IO Exception //

                System.out.println("File created successfully: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occured while creating the file.");
            e.printStackTrace();
        }
    }
}
