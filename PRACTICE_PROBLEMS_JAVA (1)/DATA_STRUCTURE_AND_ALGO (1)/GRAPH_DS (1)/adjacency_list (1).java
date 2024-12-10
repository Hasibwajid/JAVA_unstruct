package DATA_STRUCTURE_AND_ALGO.GRAPH_DS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class graph {
    int V;
    ArrayList<ArrayList<Integer>> adj;

    public graph(int v) {
        this.V = v;
        this.adj = new ArrayList<>(V);

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public void BFS(int s) {
        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);
        int curr;
        visited[s] = true;

        while (!queue.isEmpty()) {
            curr = queue.poll();
            System.out.print(curr + " ");

            for (int i : adj.get(curr)) {
                if (!visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }

    public void DFS(int s, boolean[] visited) {
        visited[s] = true;
        System.out.print(s + " ");
        for (int i : adj.get(s)) {
            if (!visited[i]) {
                DFS(i, visited);
            }
        }
    }

    public void print() {
        for (int i = 0; i < adj.size(); i++) {
            System.out.println("Adjacency list for Vertex " + i);

            System.out.print("Head");

            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(" -> " + adj.get(i).get(j));
            }
            System.out.println();
        }
    }


}

public class adjacency_list {

    public static void main(String[] args) {
        graph g = new graph(7);


        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 4);
        g.addEdge(3, 5);
        g.addEdge(3, 6);
//        g.print();
        g.BFS(3);
//        boolean[] visited = new boolean[g.V];
//        g.DFS(3, visited);
    }
}
