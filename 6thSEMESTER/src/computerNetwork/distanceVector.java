package computerNetwork;
import java.util.Scanner;

public class distanceVector {
	


	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        // Step 1: Start

	        // Step 2: Read number of nodes and path in the given network.
	        System.out.print("Enter the number of nodes in the network: ");
	        int n = sc.nextInt();
	        System.out.print("Enter the number of paths in the network: ");
	        int m = sc.nextInt();

	        // Step 3: Read the distance matrix from the user.
	        int[][] graph = new int[n][n];
	        System.out.println("Enter the cost of transmitting data between nodes:");
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                graph[i][j] = sc.nextInt();
	            }
	        }

	        // Step 4: Initialize the routing table
	        int[][] routingTable = new int[n][n];
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                if (i == j) {
	                    routingTable[i][j] = 0;
	                } else if (graph[i][j] != 0) {
	                    routingTable[i][j] = graph[i][j];
	                } else {
	                    routingTable[i][j] = Integer.MAX_VALUE;
	                }
	            }
	        }

	        // Display the complete routing table
	        System.out.println("Routing Table:");
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                if (routingTable[i][j] == Integer.MAX_VALUE) {
	                    System.out.print("INF ");
	                } else {
	                    System.out.print(routingTable[i][j] + " ");
	                }
	            }
	            System.out.println();
	        }

	        // Step 5: Enter the source node and destination node to find shortest
	        System.out.print("Enter the source node: ");
	        int source = sc.nextInt();
	        System.out.print("Enter the destination node: ");
	        int destination = sc.nextInt();

	        // Step 6 and 7: Calculate the minimum distance between two nodes
	        // and update the routing table if a shorter path is found.
	        for (int k = 0; k < n; k++) {
	            for (int i = 0; i < n; i++) {
	                for (int j = 0; j < n; j++) {
	                    if (routingTable[i][k] != Integer.MAX_VALUE &&
	                            routingTable[k][j] != Integer.MAX_VALUE &&
	                            routingTable[i][k] + routingTable[k][j] < routingTable[i][j]) {
	                        routingTable[i][j] = routingTable[i][k] + routingTable[k][j];
	                    }
	                }
	            }
	        }

	        // Step 8: Display the shortest path calculated and its cost between
	        // source node and destination node.
	        System.out.println("Shortest path from " + source + " to " + destination + ":");
	        System.out.println(routingTable[source][destination]);
	        
	        sc.close();

	        // Step 9: Go to step 5 to find other shortest routes or go to step 10.
	    }
	}

	

	
	  
	

	


	   

	

