package J101;
public class SwitchCaseExample {

    public static void main(String[] args) {

        int dayOfWeek = 1;

        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
            default:
                System.out.println("Invalid day");

        }

    }

}
