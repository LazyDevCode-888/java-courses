import java.util.Arrays;

public class ArratAndMethon {

    public static void main(String[] args) {
        int[] number = { 1, 5, 3, 5, 7, 9 };
        System.out.println("Array Length: " + number.length);

        System.out.println("Array elements: " + Arrays.toString(number));

        Arrays.sort(number);
        System.out.println("Sorted array: " + Arrays.toString(number));

        int[] newArray = new int[5]; //ประกาศแต่ยังไม่กำหนดค่า
        Arrays.fill(newArray, 10);
        System.out.println("Filled array: "+ Arrays.toString(newArray));

        int[] copyArray = Arrays.copyOf(number, number.length);
        System.out.println("Copied array: " + Arrays.toString(copyArray));
        
    }
}
