public class NQueen {

    public static void placeNQueens(int n) {
        int[][] board = new int[n][n];
        solveNQueens(board, 0, n);
    }

    private static void solveNQueens(int[][] board, int row, int n) {
        if (row == n) {
            printBoard(board, n);
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col, n)) {
                board[row][col] = 1;
                solveNQueens(board, row + 1, n);
                board[row][col] = 0; // Backtrack
            }
        }
    }

    private static boolean isSafe(int[][] board, int row, int col, int n) {
        // Check if there is a queen in the same column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1) {
                return false;
            }
        }

        // Check if there is a queen in the left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        // Check if there is a queen in the right diagonal
        for (int i = row, j = col; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    private static void printBoard(int[][] board, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 4; // You can change this to the desired value of N
        placeNQueens(n);
    }
}
