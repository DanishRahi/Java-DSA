import java.util.Arrays;
import java.util.Scanner;



class Edge implements Comparable<Edge>{
	int source;
	int dest;
	int weight;
	@Override
	public int compareTo(Edge o) {
		return this.weight - o.weight;   // THIS FOR INCREASING ORDER ARRAY "METHODS" in decrese order then use just opposite o.weight - this.weight;
	
	}
}


public class Graphs {
	
	
	public static int findParent(int v, int parent[]) {
		if(parent[v] == v) {
			return v;
		}
		return findParent(parent[v], parent);
		  
		
	}

	
	public static void kurskals(Edge input[], int n) {
		
		Arrays.sort(input);
		
		Edge output[] = new Edge[n-1];
		
		int parent[] = new int[n];
		for(int i = 0; i < n; i++) {
			parent[i] = i;
		}
		int count = 0;
		int i = 0;  // current edges
		 while(count != n-1) {
			 Edge currentEdge  = input[i];
			 
			 int sourceParent = findParent(currentEdge.source, parent);
			 int destParent   = findParent(currentEdge.dest, parent);
			 
			 if(sourceParent != destParent) {
				 output[count]  = currentEdge;
				 count++;
				 parent[sourceParent]  = destParent;
				 
			 }
			 i++;
		 }
		 
		 
		 
		 for(int j = 0; j < n-1; j++) {
			 if(output[j].source < output[j].dest ) 
			 System.out.println(output[j].source + " " + output[j].dest + " " + output[j].weight);
			 else
				 System.out.println(output[j].dest + " " + output[j].source + " " + output[j].weight);

		 }
		 
	}
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int E = s.nextInt();

		// create edge types array
		Edge input[] = new Edge[E];
		for(int i = 0; i<E; i++ ) {
			input[i] = new Edge();
			input[i].source = s.nextInt();
			input[i].dest = s.nextInt();
			input[i].weight = s.nextInt();
		}
		
		kurskals(input, n);
		
	}

}
