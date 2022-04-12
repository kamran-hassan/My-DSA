import java.util.*;
public class DetectCycleInUnDirected {

    public static Boolean Detect(ArrayList<ArrayList<Integer>> adjList,int vertexCount){
        boolean visited[] = new boolean[vertexCount];
        for(int i=0;i<vertexCount;i++){
            if(visited[i]==false){
                if(DFSRec(adjList,visited,i,-1) == true){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean DFSRec(ArrayList<ArrayList<Integer>> adjList, boolean[] visited,int sourceIndex, int parent){
        visited[sourceIndex] = true;    
        for(int v:adjList.get(sourceIndex)){
            if(visited[v]==false){
                if(DFSRec(adjList,visited,v,sourceIndex) == true) return true;
                        } 
            else{
                if(v != parent)
                    return true;
            }
    }
    return false;
}

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>();
        int t = 4;
        while(t--!=0) {adjList.add(new ArrayList<Integer>());}
        addEdge(adjList,0,1);
        addEdge(adjList,1,2);
        addEdge(adjList,1,3);
        addEdge(adjList,2,3);

        System.out.println(adjList);

        System.out.println(Detect(adjList,4));




    }

    public static void addEdge(ArrayList<ArrayList<Integer>> adjList, int u, int v) {
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }
    
}
