public class RatInMaze2 {

    public static void ratInAMaze(int maze[][], int n) {
        int[][] solution = new int[n][n];
        printPaths(maze, solution, 0, 0, n);
    }

    private static void printPaths(int[][] maze, int[][] solution, int row, int col, int n) {
        // Base case: if the rat reaches the destination
        if (row == n - 1 && col == n - 1) {
            solution[row][col] = 1;
            printSolution(solution, n);
            return;
        }

        // Check if the current cell is valid to move
        if (row >= 0 && col >= 0 && row < n && col < n && maze[row][col] == 1 && solution[row][col] == 0) {
            // Mark the current cell as part of the solution path
            solution[row][col] = 1;

            // Move up
            printPaths(maze, solution, row - 1, col, n);
            // Move down
            printPaths(maze, solution, row + 1, col, n);
            // Move left
            printPaths(maze, solution, row, col - 1, n);
            // Move right
            printPaths(maze, solution, row, col + 1, n);

            // Backtrack: unmark the current cell
            solution[row][col] = 0;
        }
    }

    private static void printSolution(int[][] solution, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(solution[i][j] + " ");
            }
        }
        System.out.println();
    }
    
  
}
