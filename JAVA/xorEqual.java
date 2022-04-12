import java.util.*;
public class xorEqual {
    static int count(int []a,int v){
        int c=0;
        for(int i:a){
            if(i==v) 
            c++;
        }
        return c;
    }

    static int willbecome(int []a,int y,int x){
        int c=0;
        for(int i:a){
            if((i^x) == y && i != y)
            c++;
        }
        return c;
    }
    public static void main(String[] args){
        Map<Integer, Integer> cMap = new HashMap<Integer, Integer>();
        Map<Integer, Integer> converMAp = new HashMap<Integer, Integer>();
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        while(testCase-- > 0){
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++)
            arr[i] = scanner.nextInt();
        
        for(int i=0;i<arr.length;i++){
            cMap.put(arr[i], count(arr,arr[i]));
            converMAp.put(arr[i],willbecome(arr,arr[i],X));
        }
        int maxComm=0,maxCommTill=Integer.MIN_VALUE;
        int minOper=0,minOperTill=Integer.MAX_VALUE;
        for(Map.Entry<Integer, Integer> Key :  cMap.entrySet()){

            minOper = converMAp.get(Key.getKey());
            maxComm = Key.getValue() + minOper;
            if(maxComm>=maxCommTill){
            maxCommTill = maxComm;
            minOperTill = minOper;
            }
        }
        System.out.println(maxCommTill+" "+minOperTill);
            
        }
        System.out.println(cMap);
        System.out.println(converMAp);
       
        scanner.close();
    }
}
