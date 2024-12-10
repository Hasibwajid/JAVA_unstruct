package DATA_STRUCTURE_AND_ALGO.TERMINAL_PREP;
import java.util.LinkedList;
import java.util.Queue;

public class GRAPH_USING_ADJACENCY_LIST {
    int V;
    LinkedList<LinkedList<Integer>> adjList = new LinkedList<>();

    public GRAPH_USING_ADJACENCY_LIST(int v){
        this.V = v;
        this.adjList = new LinkedList<>();

        for (int i =0; i< V; i++){
            adjList.add(new LinkedList<>());
        }
    }

    public void addEdge(int u, int v, boolean isDirect){
        if (!isDirect){
//            undirected
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }else {
            adjList.get(u).add(v);
        }
    }

    public void bfs(int s){
        Queue <Integer> q = new LinkedList<>();
        Boolean[] isVisited = new Boolean[V];
        for (int i=0; i< V; i++){
            isVisited[i] = false;
        }
        q.add(s);
        isVisited[s] = true;
        int curr;
        while (!q.isEmpty()){
            curr = q.remove();
            System.out.print(curr+" ");
            for (int i : adjList.get(curr)){
                if (!isVisited[i]){
                    q.add(i);
                    isVisited[i] = true;
                }
            }
        }
    }

    public void Dfs(int s, boolean[] visited){
        System.out.print(s+" ");
        visited[s] = true;

        for (int i : adjList.get(s)){
            if (!visited[i]){
                Dfs(i, visited);
            }
        }
    }


    public static void main(String[] args) {
        GRAPH_USING_ADJACENCY_LIST o = new GRAPH_USING_ADJACENCY_LIST(6);
        o.addEdge(1,2,true);
        o.addEdge(2,4,true);
        o.addEdge(4,1,true);
        o.addEdge(5,4,true);
        o.addEdge(5,3,true);
        o.addEdge(3,2,true);
        o.addEdge(2,5,true);
//        o.bfs(2);

        boolean[] v = new boolean[o.V];
        for (int i =0 ; i < o.V; i++)
            v[i] = false;

//        o.Dfs(2,v);


    }

}


