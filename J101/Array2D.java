package J101;
public class Array2D {

    public static void main(String[] args) {

        // 3x3
        int[][] number = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // 2x3
        int[][] scores = new int[2][3];
        scores[0][0] = 80;
        scores[0][1] = 75;
        scores[0][2] = 90;
        scores[1][0] = 85;
        scores[1][1] = 95;
        scores[1][2] = 100;

        System.out.println(number[2][2]);
        System.out.println(scores.length);

    }

}
