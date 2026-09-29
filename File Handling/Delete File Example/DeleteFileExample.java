
import java.io.File;

public class DeleteFileExample {

    public static void main(String[] args) {

        File file = new File("data.txt");
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("Deleted Successfully");
            } else {
                System.out.println("Unable to delete");
            }
        } else {
            System.out.println("File not found");
        }
    }
}
