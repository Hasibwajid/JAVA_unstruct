package DATA_STRUCTURE_AND_ALGO.TERMINAL_PREP;

public class Prims_MST {
//    int[][] adj ;
    int V;

    Prims_MST(int v){
        this.V = v;
//        adj = new int[v][v];

    }

//    public void addEdge(int u,int v,int w){
//        adj[u][v] = w;
//        adj[v][u] = w;
//    }

    private int minIdx(int[] keys, Boolean[] visited){
        int minIdx = 0;
        int min = Integer.MAX_VALUE;

        for (int i =0; i< V; i++){
            if (keys[i] <  min && !visited[i] ){
                min = keys[i];
                minIdx = i;
            }
        }
        return minIdx;
    }


    public void prims(int [][] graph) {
        int[] keys = new int[V];
        Boolean[] visited = new Boolean[V];
        int[] parent = new int[V];

        for (int i = 0; i < V; i++){
            visited[i] = false;
            keys[i] = Integer.MAX_VALUE;
        }

        parent[0] = -1;

        for (int i = 0; i < V-1; i++){
            int u = minIdx(keys,visited);
            visited[u] = true;

//            find adjacent of u
            for (int v = 0; v< V; v++){
                if (graph[u][v] != 0 && !visited[v] && graph[u][v] < keys[v]){
                    keys[v] = graph[u][v];
                    parent[v] = u;
                }
            }
        }

        printMst(graph, parent);
    }

    private void printMst(int[][] graph, int[] parent) {
        System.out.println("Edge \t\t weight");
        for (int i = 1; i< V; i++){
            System.out.println(parent[i] +" - "+i+ " \t\t\t"+ graph[i][parent[i]]);
        }
    }

    public static void main(String[] args) {
        int[][] graph= {
                {0, 28, 0, 0, 0, 10, 0},
                {28, 0, 16, 0, 0, 0, 14},
                {0, 16, 0, 12, 0, 0, 0},
                {0, 0, 12, 0, 22, 0, 18},
                {0, 0, 0, 22, 0, 25, 24},
                {10, 0, 0, 0, 25, 0, 0},
                {0, 14, 0, 18, 24, 0, 0}
        };

        Prims_MST o = new Prims_MST(7);
        o.prims(graph);
    }
}
