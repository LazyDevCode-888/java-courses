package J101;
import java.io.FileWriter;
import java.io.IOException;

public class WeiteFileExample {

    public static void main(String[] args) {


        try {

            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hello World");
            writer.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }


}
