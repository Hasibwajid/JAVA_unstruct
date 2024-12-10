package DATA_STRUCTURE_AND_ALGO.GRAPH_DS;

import java.util.LinkedList;

class WeightedGraph2 {
    int node, dist;

    public WeightedGraph2(int node, int dist) {
        this.node = node;
        this.dist = dist;
    }
}
public class Distance_bw_locations {
    int V;
    LinkedList<LinkedList<WeightedGraph>> adj_List;

    public Distance_bw_locations(int V) {
        this.V = V;
        this.adj_List = new LinkedList<>();

        for (int i = 0; i < V; i++) {
            adj_List.add(new LinkedList<>());
        }
    }

    public void addEdge(int n1, int n2, int w) {
        adj_List.get(n1).add(new WeightedGraph(n2, w));
        adj_List.get(n2).add(new WeightedGraph(n1, w));
    }


}
