import java.util.*;

public class diconnectedDFS {
    static void DFSRec(ArrayList<ArrayList<Integer>> adj,int s, boolean[] visited){
        visited[s] = true;
        System.out.print(s+" ");
        for(int u : adj.get(s)){
            if(visited[u] == false)
                DFSRec(adj,u,visited);
        }
    }

    static void Dfs(ArrayList<ArrayList<Integer>> adj,int vertex){
        boolean[] visited = new boolean[vertex];
        for(int i = 0;i<vertex;i++){
            if(visited[i] == false)
            DFSRec(adj,i,visited);
        }
        
    }


    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> adjlst = new ArrayList<ArrayList<Integer>>();

        adjlst.add(new ArrayList<Integer>());
        adjlst.add(new ArrayList<Integer>());
        adjlst.add(new ArrayList<Integer>());
        adjlst.add(new ArrayList<Integer>());
        adjlst.add(new ArrayList<Integer>());
        adjlst.add(new ArrayList<Integer>());
        adjlst.add(new ArrayList<Integer>());
        
            addEdge(adjlst,0,1);  
        	addEdge(adjlst,2,3); 
        	addEdge(adjlst,2,4);
            addEdge(adjlst,3,5);
            addEdge(adjlst,3,6);

            Dfs(adjlst,7);

        System.out.print(adjlst);

    }

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) 
	{ 
		adj.get(u).add(v); 
		adj.get(v).add(u); 
	}
}
