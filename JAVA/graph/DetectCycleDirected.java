import java.util.*;


public class DetectCycleDirected {
    static boolean DFS(ArrayList<ArrayList<Integer>> adj,int V){
        boolean visited[] = new boolean[V];
        boolean ActiveVertex[] = new boolean[V];
        for(int i=0;i<V;i++){
            if(visited[i] ==  false){
                if (DFSRec(adj, visited,ActiveVertex,i) == true)
                return true;
            }
        }  
        return false; 
    }

    static boolean DFSRec(ArrayList<ArrayList<Integer>> adj,boolean visited[],boolean ActiveVertex[],int source){
        ActiveVertex[source] = true;
        visited[source] = true;
        for(int i:adj.get(source)){
            if(visited[i] ==  false && DFSRec(adj, visited,ActiveVertex,i)){return true;}
            else if(ActiveVertex[i] == true){return true;}
        }
        ActiveVertex[source] = false;
        return false;
    }
    
    
    static void addEdge(ArrayList<ArrayList<Integer>> adj,int v, int u){
        adj.get(v).add(u);    // directed graph

    }

    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        int V = 4;
        for(int i=1;i<=V;i++) adj.add(new ArrayList<Integer>());

        addEdge(adj,0,1);
        addEdge(adj,1,2);
        addEdge(adj,2,3);
        addEdge(adj,3,1);

        System.out.println(adj);

        System.out.println(DFS(adj,V));

    }
}

