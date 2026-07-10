public class SimpleExceptionExample {

    public static void main(String[] args) {

        try {
            int result = 10 / 0;
            System.out.println("output: " + result);
        } catch (ArithmeticException e) { //Exception

            System.out.println("erroe: "+ e.getMessage());
        }

        int[] number = {1,2,3};
        try {
            System.out.println(number[5]);
        } catch (ArrayIndexOutOfBoundsException e){ //Exception
            System.out.println("erroe: " + e.getMessage());
        }
    }

}
