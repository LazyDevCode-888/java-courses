import java.io.UnsupportedEncodingException;

public class DecoceAndEncode {

    public static void main(String[] args) {
        try {

            String str = "Hello World!";
            byte[] encoded = str.getBytes("UTF-8");
            String decode = new String(encoded, "UTF-8");

            System.out.println("Encoded: " + encoded);
            System.out.println("Decode: " + decode);

        } catch (UnsupportedEncodingException e) {

            e.printStackTrace();
        }
    }

}
