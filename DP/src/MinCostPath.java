
public class MinCostPath {

	public static int minCostPath(int arr[][]) {
		return minCostPath(arr, 0, 0);
	}

	// min cost path from cell(i,j) to cell(m-1, n-1);

	private static int minCostPath(int[][] arr, int i, int j) {

		int m = arr.length;
		int n = arr[0].length;

		if (i == m - 1 && j == n - 1) {
			return arr[i][j];
		}
		// for last row and last collum
		if (i >= m || j >= n) {
			return Integer.MAX_VALUE;
		}

		int op1 = minCostPath(arr, i, j + 1);
		int op2 = minCostPath(arr, i + 1, j + 1);
		int op3 = minCostPath(arr, i + 1, j);

		return arr[i][j] + Math.min(op1, Math.min(op2, op3));
	}

	public static int minCostPathM(int arr[][]) {
		int m = arr.length;
		int n = arr[0].length;
		int storage[][] = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				storage[i][j] = -1;
			}
		}
		return minCostPathM(arr, 0, 0, storage);
	}

	private static int minCostPathM(int[][] arr, int i, int j, int[][] storage) {

		int m = arr.length;
		int n = arr[0].length;

		if (i >= m || j >= n) {
			return Integer.MAX_VALUE;
		}

		if (i == m - 1 && j == n - 1) {
			storage[m - 1][n - 1] = arr[i][j];
			return storage[i][j];
		}
		if (storage[i][j] != -1) {
			return storage[i][j];
		}

		int op1 = minCostPathM(arr, i, j + 1, storage);
		int op2 = minCostPathM(arr, i + 1, j + 1, storage);
		int op3 = minCostPathM(arr, i + 1, j, storage);
		storage[i][j] = arr[i][j] + Math.min(op1, Math.min(op2, op3));
		return storage[i][j];
	}

	public static int minCostPathDP(int arr[][]) {

		int m = arr.length;
		int n = arr[0].length;
		int storage[][] = new int[m][n];

		storage[m - 1][n - 1] = arr[m - 1][n - 1];
		// last Row
		for (int j = n - 2; j >= 0; j--) {
			storage[m - 1][j] = storage[m - 1][j + 1] + arr[m - 1][j];
		}
		// Last Column
		for (int i = m - 2; i >= 0; i--) {
			storage[i][n - 1] = storage[i + 1][n - 1] + arr[i][n - 1];
		}

		for (int i = m - 2; i >= 0; i--) {
			for (int j = n - 2; j >= 0; j--) {
				storage[i][j] = arr[i][j]
						+ Math.min(storage[i][j + 1], Math.min(storage[i + 1][j + 1], storage[i + 1][j]));
			}
		}
		return storage[0][0];

	}

	public static void main(String[] args) {
		int arr[][] = { { 1, 1, 1 }, { 4, 5, 2 }, { 7, 8, 9 } };
		System.out.println(minCostPathM(arr));
		System.out.println(minCostPathDP(arr));
		System.out.println(minCostPath(arr));
	}
}
