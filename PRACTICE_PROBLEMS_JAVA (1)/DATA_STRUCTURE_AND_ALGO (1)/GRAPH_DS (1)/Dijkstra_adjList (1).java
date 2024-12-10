package DATA_STRUCTURE_AND_ALGO.GRAPH_DS;

import java.util.LinkedList;

class WeightedGraph {
    int node, dist;

    public WeightedGraph(int node, int dist) {
        this.node = node;
        this.dist = dist;
    }
}

class Pair<first, second> {
    first f;
    second s;

    public Pair(first f, second s) {
        this.f = f;
        this.s = s;
    }
}

public class Dijkstra_adjList {
    int V;
    LinkedList<LinkedList<WeightedGraph>> adj_List;

    public Dijkstra_adjList(int V) {
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


    public void shortestDist() {
        int[] dists = new int[V];
        for (int i = 0; i < V; i++) {
            dists[i] = Integer.MAX_VALUE;
        }


    }


    public void print() {
        System.out.println("Node1 ->  [(Node2 : Distance), ...]\n");
        for (int i = 0; !adj_List.get(i).isEmpty(); i++) {
            System.out.print(" " + i + "   ->  [");
            for (int j = 0; j < adj_List.get(i).size(); j++) {
                System.out.print("(" + adj_List.get(i).get(j).node + " : " + adj_List.get(i).get(j).dist + ") , ");
            }
            System.out.println("]");
        }
    }

    public static void main(String[] args) {
        Dijkstra_adjList d = new Dijkstra_adjList(4);
        d.addEdge(0, 1, 3);
        d.addEdge(0, 2, 4);
        d.addEdge(1, 2, 6);
        d.print();
    }
}
