import java.util.*;

public class DFS {

    static void DFSRec(ArrayList<ArrayList<Integer>> adj,int s, boolean[] visited){
        visited[s] = true;
        System.out.print(s+" ");
        for(int u : adj.get(s)){
            if(visited[u] == false)
                DFSRec(adj,u,visited);
        }
    }

    static void Dfs(ArrayList<ArrayList<Integer>> adj,int s,int vertex){
        boolean[] visited = new boolean[vertex];

        DFSRec(adj,s,visited);
    }


    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> adjlst = new ArrayList<ArrayList<Integer>>();

        adjlst.add(new ArrayList<Integer>());
        adjlst.add(new ArrayList<Integer>());
        adjlst.add(new ArrayList<Integer>());
        adjlst.add(new ArrayList<Integer>());
        adjlst.add(new ArrayList<Integer>());
        
            addEdge(adjlst,0,1); 
        	addEdge(adjlst,0,2);  
        	addEdge(adjlst,1,3); 
        	addEdge(adjlst,1,4);
            addEdge(adjlst,2,3);
        	addEdge(adjlst,3,4);

            Dfs(adjlst,0,5);

        System.out.print(adjlst);

    }

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) 
	{ 
		adj.get(u).add(v); 
		adj.get(v).add(u); 
	} 
    
}
