	import java.util.Scanner;

public class Graph {

	

	public static void printDFSHelper(int edges[][], int sv, boolean visited[]) {
		System.out.println(sv);
		visited[sv] = true;
		int n = edges.length;
		for (int i = 0; i < n; i++) {
			if (edges[sv][i] == 1 && !visited[i]) {
				printDFSHelper(edges, i, visited);

			}
		}
	}

	public static void DFS(int edges[][]) {
		boolean visited[] = new boolean[edges.length];
		for(int i = 0; i < edges.length; i++) {
			if(!visited[i]) {
				printDFSHelper(edges, i, visited);
		
			}
	}
	}
	
	
	public static void printBFSHelper(int edges[][], int sv, boolean visited[]) {
		QueueUsingLL<Integer> q = new QueueUsingLL<>();
		q.enqueue(sv);
		int n = edges.length;
		visited[sv] = true;
		while(!q.isEmpty()) {
			int front;
			try {
				front = q.dequeue();
			} catch (QueueEmptyException e) {
				return ;
			}
			// first number in queue is visited and print first number;
			System.out.println(front);
			for(int i = 0; i < n; i++) {
				// check edges present or not || i don't visited 
				if(edges[front][i] == 1 && !visited[i]) {
					q.enqueue(i);
					visited[i] = true;
				}
			}
		}
	}
	
	
	
	
	
	public static void BFS(int edges[][]) {
		boolean visited[] = new boolean[edges.length];
		for(int i = 0; i < edges.length; i++) {
			if(!visited[i]) {
		printBFSHelper(edges, i, visited);
		}
	}
	}
	
	
	
	public static void main(String[] args) {

		int n;
		int e;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		e = s.nextInt();
		int edges[][] = new int[n][n];
		
		for (int i = 0; i < e; i++) {
			int fv = s.nextInt();
			int sv = s.nextInt();
			edges[fv][sv] = 1;
			edges[sv][fv] = 1;
		}
		System.out.println("DFS");
		DFS(edges);
		System.out.println("BFS");
		BFS(edges);
	}
}
