import java.io.File;

public class CreateFolderDirectory {

    public static void main(String[] args) {

        // Create Folder using mkdir
        File folder = new File("C:\\Github\\Learning_Core_Java\\DemoFiles");
        if (folder.mkdir()) {
            System.out.println("Folder create Successfully");
        } else {
            System.out.println("Folder Already exits");
        }

        // Create nested folder using mkdirs
        File folder2 = new File("C:\\Github\\Learning_Core_Java\\DemoFiles\\java");
        if (folder2.mkdirs()) {
            System.out.println("Folder create Successfully");
        } else {
            System.out.println("Folder Already exits");
        }

    }
}
