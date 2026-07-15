package J101;
import java.io.File;

public class FileExists {

    public static void main(String[] args) {

        File file = new File("text.txt");

        if (file.exists()) {
            System.out.println("File exists");
        } else {
            System.out.println("File does not exist");
        }
    }

}
