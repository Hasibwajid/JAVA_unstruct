package DATA_STRUCTURE_AND_ALGO.GRAPH_DS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class shortestPathIn_UndirectedGraph {
    int V;
    LinkedList<LinkedList<Integer>> locations;

    public shortestPathIn_UndirectedGraph(int V) {
        this.V = V;
        this.locations = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            locations.add(new LinkedList<>());
        }
    }

    public void addEdge(int u, int v) {
        locations.get(u).add(v);
        locations.get(v).add(u);
    }

    public StringBuilder shortest(int s, int dist) {
        Boolean[] visited = new Boolean[V];
        int[] parents = new int[V];
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < V; i++) {
            visited[i] = false;
        }
        parents[s] = -1;
        visited[s] = true;
        queue.add(s);
//       STEP i - First find parent of each ( Using BFS )
        while (!queue.isEmpty()) {
            int curr = queue.remove();

            for (int i : locations.get(curr)) {
                if (!visited[i]) {
                    parents[i] = curr;
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
//        Now we know the parent of each location
//       STEP ii - So just start from dist and backtrack its parent until reached source node
        String output = "";
        boolean found = false;
        int curr = dist;
        while (curr != s) {
            output = output + curr + " >- ";
            curr = parents[curr];
        }
        output = output + s;
//        STEP iii - Reverse from (dist to source) to (source to dist)
        StringBuilder sb = new StringBuilder(output);
        return sb.reverse();
    }

    public static void main(String[] args) {
        shortestPathIn_UndirectedGraph g = new shortestPathIn_UndirectedGraph(7);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0, 4);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 4);
        g.addEdge(3, 5);
        g.addEdge(4, 5);
        g.addEdge(4, 6);
        g.addEdge(3, 6);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter source: ");
        int s = scan.nextInt();
        System.out.println("Enter Destination: ");
        int d = scan.nextInt();
        System.out.println("Shortest Root From " + s + " To " + d + " Is :: " + g.shortest(s, d));
    }

}
