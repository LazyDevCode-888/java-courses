package J101;
public class IfElseExample {

    public static void main(String[] args) {

        // example 1
        int number = 10;

        if (number > 0) {
            System.out.println("Positive Number");
        } else {
            System.out.println("Zoro or negative number");

        }

        // example 2
        int score = 75;

        if (score >= 80) {
            System.out.println("Grade A");
        } else if (score >= 70) {
            System.out.println("Grade B");
        } else if (score >= 60) {
            System.out.println("Grade C");
        } else if (score >= 50) {
            System.out.println("Grade D");
        } else {
            System.out.println("Grade F");
        }

        // example 3
        int age = 20;
        boolean hasID = true;

        if(age >= 18 && hasID){
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }

        // example 4
        String dayOfweek = "Saturday";

        if (dayOfweek.equals("Saturday") || dayOfweek.equals("Sunday")) {
            System.out.println("Weekend");
        } else {
            System.out.println("WeekDay");

        }



    }

}