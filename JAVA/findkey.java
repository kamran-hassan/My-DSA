import java.util.*;

class helpme{
    static int getSize(int x,int i){
        if(x==0) return i;
        else
        return getSize(x/10,++i);

    }

    static void fillAtCol(int[][] a,int col,int val,int n){
        if(val==0) return;
        else{
            a[--n][col] = val%10;
            fillAtCol(a,col,val/10,n);
        }
    }

    static int giveMeTheKey(int[][] a,int size){
        int key=0;
        int m=10;
        for(int i=0;i<size;i++){
            Arrays.sort(a[i]);
        }
        key = a[0][size-1];
        for(int i=1;i<size;i++){
            key = key + m*a[i][size-1];
            m *= 10;
        }

        return key;
    }
    static int maxOfAll(int[][] a,int n){
        // chck last column as matrix is sorted
        int max = a[0][n-1];
        for(int i=1;i<n;i++){
            if(a[i][n-1]>max) max = a[i][n-1];
        }
        return (max*(int)Math.pow(10,n));
    }
}


public class findkey {

    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    System.out.println("give size of square matrix");
    int x = sc.nextInt();
    int[] n = new int[x];
    System.out.println("Give Number of given size to generate Keys");
    for(int i=0;i<x;i++){ n[i] = sc.nextInt(); }
    int size = helpme.getSize(n[0],0);
    System.out.println(size);

    int a[][] = new int[size][size];

    for(int i=0;i<size;i++) {
    helpme.fillAtCol(a,i,n[i],size);
    }
    for(int[] i:a){
        for(int j:i){
            System.out.print(j);
        }
        System.out.print("\n");
    }

    //System.out.println(helpme.giveMeTheKey(a,size));
    //System.out.println(helpme.maxOfAll(a,size));
    int rawKey = helpme.giveMeTheKey(a,size);
    System.out.println("Your Key Is "+(rawKey + helpme.maxOfAll(a, size)));

    sc.close();
    }
    
}
