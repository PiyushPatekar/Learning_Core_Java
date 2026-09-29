import java.io.File;
import java.io.IOException;

public class CreateFolderAndFile {

    public static void main(String[] args) {

        try {
            File folder = new File("C:\\\\Github\\\\Learning_Core_Java");
            if (!folder.exists()) {
                folder.mkdir();
            }

            File file = new File(folder, "new.text");
            if (file.createNewFile()) {
                System.out.println("File created successfully: " + file.getName() + file.getAbsolutePath());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occured while creating the file.");
            e.printStackTrace();
        }

    }
}
