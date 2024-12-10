package DATA_STRUCTURE_AND_ALGO.TERMINAL_PREP;

public class DijkstraAlgo {
    int[][] mat;
    int V;

    public DijkstraAlgo(int v){
        this.V = v;
        mat = new int[v][v];

    }
    public void addEdge(int u, int v, int w){
        mat[u][v] = w;
        mat[v][u] = w;
    }

    private int minDistIdx(int[] distances , Boolean[] visited){
        int minIdx = 0;
        int min = Integer.MAX_VALUE;
        for (int i=0; i< V; i++){
            if (!visited[i] && distances[i] < min){
                min= distances[i];
                minIdx = i;
            }
        }
        return minIdx;
    }

    public int[] shortestDistanceOfAllVertexFromSource(int s){
        int[] dist = new int[V];
        Boolean[] visited = new Boolean[V];

        for (int i =0; i< V; i++){
            visited[i] = false;
            dist[i] = Integer.MAX_VALUE;
        }

        dist[0] = 0;

        for (int i=0 ;i< V; i++){
            int u = minDistIdx(dist, visited);
            visited[u] = true;

//            adjacent
            for (int v =0; v< V; v++){
                int d = dist[u] + mat[u][v];

                if ( mat[u][v] != 0 && !visited[v] && d < dist[v]){
                    dist[v] = d;
                }
            }
        }
        return dist;
    }

    public static void main(String[] args) {
        DijkstraAlgo mat = new DijkstraAlgo(6);
        mat.addEdge(0, 1,21);
        mat.addEdge(0, 2,18);
        mat.addEdge(2, 1,7);
        mat.addEdge(1, 4,6);
        mat.addEdge(4, 5,10);
        mat.addEdge(4, 2,11);
        mat.addEdge(5, 3,7);
        int[] dist = mat.shortestDistanceOfAllVertexFromSource(0);
        System.out.println("Edges\t  Distance");
        for (int i=0 ; i< dist.length; i++){
            System.out.println("0 - "+ i+"  \t"+ dist[i]);
        }
    }
}
