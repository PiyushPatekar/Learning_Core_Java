import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutput {
    public static void main(String[] args) {
        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.txt"));
            dos.writeInt(100);
            dos.writeDouble(99.5);
            dos.writeBoolean(true);
            dos.writeUTF("Pranav");
            dos.close();
            System.out.println("Data written successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}