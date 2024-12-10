package DATA_STRUCTURE_AND_ALGO.GRAPH_DS;

import java.util.Iterator;
import java.util.LinkedList;

public class adj_list_2 {
    private int V;
    private LinkedList<Integer> adj[];

    adj_list_2(int v) {
        this.V = v;
        this.adj = new LinkedList[V];

        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList();
        }
    }

    void addEdge(int s, int d) {
        adj[s].add(d);
        adj[d].add(s);
    }

    void DFSUtil(int v, boolean visited[]) {
        // Mark the current node as visited and print it
        visited[v] = true;
        System.out.print(v + " ");

        // Recur for all the vertices adjacent to this
        // vertex
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }

    void DFS(int s) {
        boolean[] visited = new boolean[V];
        DFSUtil(s, visited);
    }

    void BFS(int s) {
        boolean[] visited = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<Integer>();
        visited[s] = true;
        queue.add(s);

        while (!queue.isEmpty()) {
            s = queue.poll();
            System.out.print(s + " ");
            Iterator<Integer> i = adj[s].listIterator();

            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    queue.add(n);
                    visited[n] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        adj_list_2 g = new adj_list_2(7);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 4);
        g.addEdge(3, 5);
        g.addEdge(3, 6);
//        System.out.println("Following is Depth Fist Traversal");
////        g.DFS(2);
//        System.out.println("");
//        g.BFS(3);
        g.DFS(3);

    }

}
