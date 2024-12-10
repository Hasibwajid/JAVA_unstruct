package DATA_STRUCTURE_AND_ALGO.GRAPH_DS;

import java.util.LinkedList;
import java.util.Queue;

class adj_Mat {
    int V;
    int mat[][];

    public adj_Mat(int V) {
        this.V = V;
        this.mat = new int[V][V];
    }


    //    undirected graph
    public void addEge(int source, int destination) {
//        set the position = 1 where the edge exist
        mat[source][destination] = 1;
        mat[destination][source] = 1;
    }


    public void print() {
        System.out.println("   0 1 2 3");
        for (int i = 0; i < V; i++) {
            System.out.print(i + "  ");
            for (int j = 0; j < V; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    /////////////////////////////////////////////////    TRAVERSALS

    public void BFS(int start) {
        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        int curr;

        while (!queue.isEmpty()) {
            curr = queue.poll();
            System.out.print(curr + " ");

            for (int i = 0; i < V; i++) {
                if (mat[i][curr] == 1 && (!visited[i])) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }

    public void DFS(int start, boolean[] visited) {
        System.out.print(start + " ");
        visited[start] = true;
        for (int i = 0; i < mat[start].length; i++) {
            if (mat[i][start] == 1 && (!visited[i])) {
                DFS(i, visited);
            }
        }
    }

}


public class adj_Matrix {
    public static void main(String[] args) {
        adj_Mat mat = new adj_Mat(7);
        mat.addEge(0, 1);
        mat.addEge(0, 2);
        mat.addEge(1, 3);
        mat.addEge(1, 4);
        mat.addEge(2, 4);
        mat.addEge(3, 5);
        mat.addEge(3, 6);

//
//        mat.print();
//        System.out.println("-------");
//


//        pass index to start from(source) it can be any node / vertex
        mat.BFS(3);

//        System.out.println();
//        boolean[] visited = new boolean[mat.V];
//
//        mat.DFS(3,visited);

    }
}
