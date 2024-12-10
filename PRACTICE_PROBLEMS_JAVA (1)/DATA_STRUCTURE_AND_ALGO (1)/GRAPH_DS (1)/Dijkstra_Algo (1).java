package DATA_STRUCTURE_AND_ALGO.GRAPH_DS;

import java.util.Arrays;

public class Dijkstra_Algo {
    int[][] mat ;
    int V;

    public Dijkstra_Algo( int v){
        this.mat = new int[v][v];
        this.V = v;
    }

    public void addEdge(int u , int v, int w){
        mat[u][v] = w;
        mat[v][u] = w;
    }

    public int minDistVertex(int [] dist, Boolean [] visited){
        int min = Integer.MAX_VALUE;
        int min_index = -1;

        for (int i = 0; i< dist.length; i++){
            if (dist[i] < min && !visited[i]){
                min = dist[i];
                min_index= i;
            }
        }
        return min_index;
    }

    public int[] shortestDistance(int s) {
        int[] dist = new int[V];
        Boolean[] visited = new Boolean[V];

        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
            visited[i] = false;
        }

//        distance of source from source srt 0
        dist[s] = 0;

        for (int i = 0; i < V; i++) {
            int u = minDistVertex(dist, visited);

            //if closest node is infinite distance away ,it means that no other node can be reached
            if (u == Integer.MAX_VALUE)
                return dist;

            visited[u] = true;

//            adjacent
            for (int v = 0; v < V; v++) {
//                distance of vertex u + weight of u and v
                int d = dist[u] + mat[u][v];
                if (mat[u][v] != 0 && !visited[v] && (d < dist[v])) {
                    dist[v] = d;
                }
            }
        }
        return dist;
    }

    public static void main(String[] args) {
        Dijkstra_Algo mat = new Dijkstra_Algo(6);
        mat.addEdge(0, 1,21);
        mat.addEdge(0, 2,18);
        mat.addEdge(2, 1,7);
        mat.addEdge(1, 4,6);
        mat.addEdge(4, 5,10);
        mat.addEdge(4, 2,11);
        mat.addEdge(5, 3,7);


        int[] dist = mat.shortestDistance(0);
        System.out.println(Arrays.toString(dist));
    }
}
