import java.util.*;



public class MinimumSpanningSetPrimsAlgo {

    
    static int minimumSpanningTree(int graph[][]){
        int res=0;
        boolean mstSet[] = new boolean[graph.length];
        int key[] = new int[graph.length];    // for storing weight of adacent 
        Arrays.fill(key,Integer.MAX_VALUE);
        key[0] = 0;
        for(int counter = 0; counter < graph.length; counter++){
            int u = -1;
            int i;
            for(i = 0; i < graph.length; i++){
                if(mstSet[i] == false && (u ==-1 || key[i] < key[u])){ u = i;}
            }
            mstSet[u] = true;
            res += key[u];
            for(int v=0; v < graph.length; v++){
                if(!mstSet[v] && graph[u][v]!=0 && graph[u][v]<key[v]) key[v] = graph[u][v];
            }
        }
        return res;

    }
    public static void main(String[] args){

        int[][] graph = {{0,5,8,0},
                         {5,0,10,0},
                         {8,10,0,20},
                         {0,15,20,0}};

        
        System.out.print("result = " + minimumSpanningTree(graph));
        

    }
    
}
