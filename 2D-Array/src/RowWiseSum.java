import java.util.Scanner;

public class RowWiseSum {

    public static void rowWiseSum(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            int sum = 0;
            for (int j = 0; j < mat[0].length; j++) {
                sum += mat[i][j];
            }
            System.out.print(sum + " ");
        }
        System.out.println();  // Move to the next line after printing the row sums
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for the number of test cases
        int t = sc.nextInt();

        for (int k = 0; k < t; k++) {
            // Input for each test case
            int rows = sc.nextInt();
            int cols = sc.nextInt();

            // Input for the 2D array
            int[][] mat = new int[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    mat[i][j] = sc.nextInt();
                }
            }

            rowWiseSum(mat);
        }
    }
}
