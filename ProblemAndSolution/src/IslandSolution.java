import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class IslandSolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int V = scanner.nextInt();
        int E = scanner.nextInt();

        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int i = 0; i < E; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            adjList.get(a).add(b);
            adjList.get(b).add(a);
        }

        int connectedGroups = countConnectedGroups(V, adjList);
        System.out.println(connectedGroups);
    }

    private static int countConnectedGroups(int V, ArrayList<ArrayList<Integer>> adjList) {
        boolean[] visited = new boolean[V];
        int connectedGroups = 0;

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfs(i, adjList, visited);
                connectedGroups++;
            }
        }

        return connectedGroups;
    }

    private static void dfs(int start, ArrayList<ArrayList<Integer>> adjList, boolean[] visited) {
        Stack<Integer> stack = new Stack<>();
        stack.push(start);
        visited[start] = true;

        while (!stack.isEmpty()) {
            int current = stack.pop();

            for (int neighbor : adjList.get(current)) {
                if (!visited[neighbor]) {
                    stack.push(neighbor);
                    visited[neighbor] = true;
                }
            }
        }
    }
}
