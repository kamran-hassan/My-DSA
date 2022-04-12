import java.util.*;

public class BFS{
    static void Bfs(ArrayList<ArrayList<Integer>> adj,int v,int s){
        boolean[] visited = new boolean[v+1];
        Queue<Integer> q = new LinkedList<Integer>();
        visited[s] = true;
        q.add(s);
        while(q.isEmpty() == false){
            int u = q.poll();
            System.out.println(u + " ");
            for(int n :adj.get(u)){
                if(visited[n] == false){
                    visited[n] = true;
                    q.add(n);
                }
            }
        }
        }

    
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    
    public static void main(String[] args){

        ArrayList<ArrayList<Integer>> adjlst = new ArrayList<>();
        adjlst.add(new ArrayList<Integer>());
        adjlst.add(new ArrayList<Integer>());
        adjlst.add(new ArrayList<Integer>());
        adjlst.add(new ArrayList<Integer>());
        adjlst.add(new ArrayList<Integer>());
		addEdge(adjlst, 0, 1); 
		addEdge(adjlst, 0, 2); 
		addEdge(adjlst, 1, 2); 
		addEdge(adjlst, 1, 3); 
        addEdge(adjlst, 2, 3);
        addEdge(adjlst, 2, 4);
        addEdge(adjlst, 3, 4);         
        //adjlst.get(0).add(2);

        Bfs(adjlst,4,0);


        System.out.println(adjlst);
    }
}