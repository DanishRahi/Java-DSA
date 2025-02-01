import java.util.Scanner;

public class Prims { // GREADY ALGORITHMS FOLLOW FOR BETTER RESULTS

	private static void prims(int[][] adjacencyMatrix) {

		int v = adjacencyMatrix.length;

		// Take v size 3 Arrays for maintaining and storing arrays ;
		boolean visited[] = new boolean[v];
		int weight[] = new int[v];
		int parent[] = new int[v];
		// initial every edges weighted is (infinte) except {0}
		weight[0] = 0;
		parent[0] = -1;
		for (int i = 0; i < v; i++) {
//			it means weight of i is infinte;
			weight[i] = Integer.MAX_VALUE;

		}
		for (int i = 0; i < v; i++) {
			// PICK VERTIX WITH MIM WEIGHT
			int minVertex = findMinVertex(weight, visited);
			visited[minVertex] = true;
			// Explore its un-visited neighbors;
			for (int j = 0; j < v; j++) {
				if (adjacencyMatrix[minVertex][j] != 0 && !visited[j]) { // TO CHECK WHETHER ITS HAVE NEIGHBORS OR NOT
					if (adjacencyMatrix[minVertex][j] < weight[j]) {
						weight[j] = adjacencyMatrix[minVertex][j];
						parent[j] = minVertex;
					}

				}
			}
		}

		// Print edges of MST
		for (int i = 1; i < v; i++) {
			if (parent[i] < i) {
				System.out.println(parent[i] + " " + i + " " + weight[i]);
			} else {
				System.out.println(i + " " + parent[i] + " " + weight[i]);

			}
		}

	}

	private static int findMinVertex(int[] weight, boolean visited[]) {
		int minVertex = -1;
		for (int i = 0; i < weight.length; i++) {
			if (!visited[i] && (minVertex == -1 || weight[i] < weight[minVertex])) {
				minVertex = i;
			}
		}
		return minVertex;	
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int v = s.nextInt();
		int e = s.nextInt();
		int adjacencyMatrix[][] = new int[v][v];

		for (int i = 0; i < e; i++) {
			int v1 = s.nextInt();
			int v2 = s.nextInt();
			int weight = s.nextInt();
			adjacencyMatrix[v1][v2] = weight;
			adjacencyMatrix[v2][v1] = weight;

		}

		// Prims Algorithms
		prims(adjacencyMatrix);
	}

}
