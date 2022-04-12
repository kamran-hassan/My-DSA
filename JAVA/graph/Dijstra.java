// Show a very nieve implementation of Dijstra algorithm
import java.util.*;

public class Dijstra {

    static int[] dijstraAlgo(int graph[][],int src){
        int v = graph.length;
        int[] dist = new int[v];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src] = 0;
        boolean finished[] = new boolean[v];
        for(int count = 0;count < v-1;count++){
            int u = -1;
            for(int i=0;i<v;i++){
                if(!finished[i] && (u == -1 || dist[i] < dist[u])) u=i;
            }
            finished[u] = true;
            for(int x=0;x<v;x++){
                if(!finished[x] && graph[u][x] != 0)
                    dist[x] = Math.min(dist[x],dist[u]+graph[u][x]);
            }
        }
        return dist;
    }
    public static void main(String[] args){

        int graph[][] = {{0,50,100,0},
                         {50,0,30,200},
                         {100,30,0,20},
                         {0,200,20,0}};

        int arr[] = dijstraAlgo(graph,0);
        for(int i: arr) System.out.print(i + " ");

    }
    
}
