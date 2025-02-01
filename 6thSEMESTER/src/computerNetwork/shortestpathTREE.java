package computerNetwork;
import java.util.*;


public class shortestpathTREE {

	public static void main(String[] args) {

		        int[][] graph = {
		            {0, 2, 5, 1, 0},
		            {2, 0, 3, 2, 0},
		            {5, 3, 0, 3, 1},
		            {1, 2, 3, 0, 4},
		            {0, 0, 1, 4, 0}
		        };
		        
		        int root = 0;
		        
		        int n = graph.length;
		        
		        int[] dist = new int[n];
		        boolean[] visited = new boolean[n];
		        for (int i = 0; i < n; i++) {
		            dist[i] = Integer.MAX_VALUE;
		            visited[i] = false;
		        }
		        
		        dist[root] = 0;
		        
		        for (int i = 0; i < n - 1; i++) {
		            int minDist = Integer.MAX_VALUE;
		            int minNode = -1;
		            for (int j = 0; j < n; j++) {
		                if (!visited[j] && dist[j] < minDist) {
		                    minDist = dist[j];
		                    minNode = j;
		                }
		            }
		            
		            visited[minNode] = true;
		            
		            for (int j = 0; j < n; j++) {
		                if (graph[minNode][j] > 0 && !visited[j]) {
		                    int newDist = dist[minNode] + graph[minNode][j];
		                    if (newDist < dist[j]) {
		                        dist[j] = newDist;
		                    }
		                }
		            }
		        }
		        
		        System.out.println("Shortest path tree:");
		        for (int i = 0; i < n; i++) {
		            System.out.println("Node " + i + ": " + dist[i]);
		        }
		    }
		    
		
	}


