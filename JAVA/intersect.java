// { Driver Code Starts
// Initial Template for Java
// Initial Template for Java

import java.util.*;
//import java.lang.*;
import java.io.*;

class intersect {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {

            int i = 0;
            int N = Integer.parseInt(br.readLine().trim());

            int lines[][] = new int[(int)(N)][2];

            for (int j = 0; j < 2; j++) {
                String inputLine2[] = br.readLine().trim().split(" ");
                for (i = 0; i < N; i++) {
                    lines[i][j] = Integer.parseInt(inputLine2[i]);
                }
            }
            Solution ob = new Solution();
            System.out.println(ob.maxIntersections(lines, N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int maxIntersections(int[][] lines, int N) {
        // Code here
        int min = getMinValue(lines,N);
        int correction = (min<0)?(-min):(-min);
        int max = getMaxValue(lines,N);
        int[] xAxis = new int[max-min];
        Arrays.fill(xAxis,0);
        if(correction<0){
        for(int i=0;i<N;i++){
            for(int j = (correction + lines[i][0]);j<=(correction+lines[i][1]);j++)
            xAxis[j]++;
        }
        }
        else{
            for(int i=0;i<N;i++){
            for(int j = (correction - lines[i][0]);j<=(correction-lines[1][0]);j++)
            xAxis[j]++;
        }
        
        
        }
        
        
        return getMaxValue1d(xAxis,xAxis.length); 
    }
    
        public static int getMaxValue1d(int[] numbers,int N) {
        int maxValue = numbers[0];
        for (int j = 0; j < N; j++) {
                if (numbers[j] > maxValue) {
                    maxValue = numbers[j];
                }
            }
            return maxValue;
        }
    
    
        public static int getMaxValue(int[][] numbers,int N) {
        int maxValue = numbers[0][1];
        for (int j = 0; j < N; j++) {
                if (numbers[j][1] > maxValue) {
                    maxValue = numbers[j][1];
                }
            }
            return maxValue;
        }
        
        public static int getMinValue(int[][] numbers,int N) {
        int minValue = numbers[0][0];
        for (int j = 0; j < N; j++) {
                if (numbers[j][0] < minValue) {
                    minValue = numbers[j][0];
                }
            }
            return minValue;
        }
        
    
}

