
public class RatInMaze {

	public static void ratInAMaze(int maze[][]) {
		int n = maze.length;
		int path[][] = new int[n][n];
		printAllPaths(maze, 0, 0, path);
//		return solveMaze(maze, 0, 0, path);

	}

	public static boolean solveMaze(int maze[][], int i, int j, int path[][]) {
		int n = maze.length;
		if (i < 0 || i >= n || j < 0 || j >= n || maze[i][j] == 0 || path[i][j] == 1) {
			return false;
		}

		path[i][j] = 1;
		if (i == n - 1 && j == n - 1) {
			return true;
		}

		if (solveMaze(maze, i - 1, j, path)) {
			return true;
		}
		if (solveMaze(maze, i, j + 1, path)) {
			return true;
		}
		if (solveMaze(maze, i + 1, j, path)) {
			return true;
		}
		if (solveMaze(maze, i, j - 1, path)) {
			return true;
		}
		return false;
	}

	public static void printAllPaths(int maze[][], int i, int j, int path[][]) {
		// To check if i,j cell is valid or not
		int n = maze.length;
		if (i < 0 || i >= n || j < 0 || j >= n || maze[i][j] == 0 || path[i][j] == 1) {
			return;
		}

		// Include the cells in current path
		path[i][j] = 1;
		// Destination cell
		if (i == n - 1 && j == n - 1) {
			// for print path also
			for (int r = 0; r < n; r++) {
				for (int c = 0; c < n; c++) {
					System.out.print(path[r][c] + " ");
				}
				System.out.println();
			}
			System.out.println();
			path[i][j] = 0;
			return;
		}

		// Explore further in all direction
		// TOP direction 1
		printAllPaths(maze, i - 1, j, path);

		// Right
		printAllPaths(maze, i, j + 1, path);

		// Down
		printAllPaths(maze, i + 1, j, path);

		// left
		printAllPaths(maze, i, j - 1, path);
		path[i][j] = 0;
	}

	public static void main(String[] args) {
		int maze[][] = { { 1, 1, 0 }, { 1, 1, 0 }, { 1, 1, 1 } };
		ratInAMaze(maze);
//		boolean pathPossible = ratInAMaze(maze);
//		System.out.println(pathPossible);
	}
}
