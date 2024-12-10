package DATA_STRUCTURE_AND_ALGO.GRAPH_DS;

public class PRIMS_Min_Spanning_Tree {
    int V;

    public PRIMS_Min_Spanning_Tree(int v) {
        this.V = v;
    }

    public int minKey(int[] keys, Boolean[] mstSet) {
        int min = Integer.MAX_VALUE;
        int min_index = 0;

        for (int i = 0; i < V; i++) {
            if (!mstSet[i] && keys[i] < min) {
                min = keys[i];
                min_index = i;
            }
        }
        return min_index;
    }

    public void printMST(int[][] graph, int[] parent) {

        System.out.println("Edge\tWeight");
        for (int i = 1; i < V; i++) {
            System.out.println(parent[i] + " - " + i + "\t" + graph[i][parent[i]]);
        }
    }

    public void prims(int[][] graph) {
        int[] keys = new int[V];
        Boolean[] MstSet = new Boolean[V];
        int[] parent = new int[V];

        for (int i = 0; i < V; i++) {
            keys[i] = Integer.MAX_VALUE;
            MstSet[i] = false;
        }

        parent[0] = -1;

        for (int j = 0; j < V - 1; j++) {
//        select min weight vertex
            int u = minKey(keys, MstSet);
//        mark visited/included in mst
            MstSet[u] = true;

//        find check all adjacent vertex of selected one
//        adjacent should not be 0
//        adjacent should not be selected already
//        then check the new sum is less than previous
            for (int v = 0; v < V; v++) {
                if (graph[u][v] != 0 && (!MstSet[v]) && graph[u][v] < keys[v]) {
                    parent[v] = u;
//                update weight of edge
                    keys[v] = graph[u][v];
                }
            }
        }

//    printing
        printMST(graph, parent);
    }

/*    public void prims(int [][] graph){
        int[] keys = new int[V];
        Boolean[] visited = new Boolean[V];
        int [] parent = new int[V];

        for (int i = 0 ; i< V; i++){
            visited[i] = false;
            keys[i] = Integer.MAX_VALUE;
        }

        parent [0] = -1;


        for (int i = 0 ; i < V-1; i++){
            int u = minKey(keys,visited);
            visited[u] = true;

//            find adjacent of u
            for (int v = 0 ; v < V; v++){
                if (graph[u][v] != 0 && !visited[v] && graph[u][v] < keys[v]){
                    parent[v] = u;
                    keys[v] = graph[u][v];

                }
            }
        }
        printMST(graph,parent);
    }*/

    public static void main(String[] args) {
        PRIMS_Min_Spanning_Tree prims = new PRIMS_Min_Spanning_Tree(7);
        int[][] graph = {
                {0, 28, 0, 0, 0, 10, 0},
                {28, 0, 16, 0, 0, 0, 14},
                {0, 16, 0, 12, 0, 0, 0},
                {0, 0, 12, 0, 22, 0, 18},
                {0, 0, 0, 22, 0, 25, 24},
                {10, 0, 0, 0, 25, 0, 0},
                {0, 14, 0, 18, 24, 0, 0}
        };
        prims.prims(graph);
    }
}