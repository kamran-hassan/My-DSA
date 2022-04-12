import java.util.*;
//optimised version for the following is Andmax.java
public class subarrayAnd {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int x  = s.nextInt();
        int uMax = 1;
        int longSubarray = 1;
        int maxTill = 1;
        for(int i=2; i<=x; i++){
            if((maxTill & i)>0){
                maxTill = maxTill & i;
                longSubarray++;
            }
            else{
                longSubarray = 1; 
                maxTill = i;
            }
            if(uMax<longSubarray) uMax = longSubarray;
        }

        System.out.println(uMax);
        s.close();
    }
    
}
