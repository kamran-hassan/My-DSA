// based on kahn's Algorithm
import java.util.*;
public class TopologicalSort {
    static void addEdge(ArrayList<ArrayList<Integer>> adj,int u, int v){
        adj.get(u).add(v);
    }
    static void topoLogicalSortUsinBFS(ArrayList<ArrayList<Integer>> adj,int V){
        int[] inDegree = new int[V];

        for(ArrayList<Integer> u : adj){
            for(int v: u)
                inDegree[v]++;
        }
        //for(int i : inDegree){System.out.print(" "+i);}  print Indegree inital values
        Queue<Integer> q = new LinkedList<Integer>();

        for(int i=0;i<inDegree.length;i++){
            if(inDegree[i] == 0) q.add(i);
        }
        while(q.isEmpty() == false){
            int x = q.poll();
            System.out.print(x+" ");
            for(int i:adj.get(x)){
                if(--inDegree[i] == 0) q.add(i); 
            }
        }
    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        int V = 5;
        for(int i = 0; i < V; i++) adj.add(new ArrayList<Integer>());

        addEdge(adj,0,2);
        addEdge(adj,0,3);
        addEdge(adj,1,3);
        addEdge(adj,1,4);
        addEdge(adj,2,3);

        System.out.println(adj);

        topoLogicalSortUsinBFS(adj,V);

    }
}
