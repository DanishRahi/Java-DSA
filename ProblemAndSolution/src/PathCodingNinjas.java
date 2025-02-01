import java.util.Scanner;

public class PathCodingNinjas {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		
		char[][] matrix = new char[N][M];
		
		for(int i = 0; i < N; i++) {
			String row = scanner.next();
			matrix[i] = row.toCharArray();
		}
		System.out.println(hasPath(matrix, N, M) ? 1 : 0);
		
	}

	private static boolean hasPath(char[][] matrix, int N, int M) {
		String target = "CODINGNINJA";
		int targetIndex = 0;
		
		for(int i = 0 ; i <N; i++) {
			for(int j = 0; j < M; j++) {
				if(matrix[i][j] == target.charAt(targetIndex)) {
					if(dfs(matrix, i, j, N, M, target, targetIndex + 1)) {
						return true;
					}
				}
			}
		}
		return false;
	}

	private static boolean dfs(char[][] matrix, int row, int col, int N, int M, String target, int targetIndex) {
		if(targetIndex == target.length()) {
			return true; // we found the entire path
		}
		
		char originalChar = matrix[row][col];
		matrix[row][col] ='0'; //Mark the current cell as visited
		
		// Check all neighbour cells
		int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
        
        for(int i= 0; i < 8; i++) {
        	int newRow = row + dx[i];
        	int newCol = col + dy[i];
        	
        	if (newRow >= 0 && newRow < N && newCol >= 0 && newCol < M &&
                    matrix[newRow][newCol] == target.charAt(targetIndex)) {
                if (dfs(matrix, newRow, newCol, N, M, target, targetIndex + 1)) {
                    return true;
                }
            }
        }
        matrix[row][col] = originalChar; // Backtrack by restoring the original character

			return false;
	}
	

	
}
