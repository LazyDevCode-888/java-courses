package J101;
public class StringAndMethod {
    public static void main(String[] args) {

        String str = "Hello, Mood";

        // String Length
        System.out.println(str.length());

        // Case conversion
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        // String manipulation
        System.out.println(str.replace("Hello", "Hi"));
        System.out.println(str.substring(0,5));
        System.out.println(str.charAt(0));

        // Search operations
        System.out.println(str.indexOf("Mood"));
        System.out.println(str.contains("Hello"));

        // Strong propertions
        System.out.println(str.isEmpty());
        System.out.println(str.trim()); // ตัดช่องว่างหน้าหลัง ทิ้งให้หมม
        
    }
}
