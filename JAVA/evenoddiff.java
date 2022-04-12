import java.util.*;
//import java.lang.*;
//import java.io.*;
public class evenoddiff {
    /* package codechef; // don't place package name! */



/* Name of the class has to be "Main" only if the class is public. */
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc =  new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
            int[] arr = new int[n];
		    int x;
		    int even = 0,odd = 0;
		    for(int i=0;i<n;i++){
		        x = sc.nextInt();
		        arr[i] = x;
		        if(x%2 == 0) even++;
		        else odd++;
		    }
		    if(even == odd){
                Arrays.sort(arr);
            if(arr[0]%2 == 0){
                for(int j=2;j<n;j=j+2){
                    if(arr[j]%2 != 0){
                        for(int k = 1;k<n;k=k+2){
                            if(arr[k]%2 == 0){
                                int temp = arr[k];
                                arr[k] = arr[j];
                                arr[j] = temp;
                            }
                        }
                    }
                }
            }
            else if(arr[0]%2 != 0){
                for(int j=2;j<n;j=j+2){
                    if(arr[j]%2 == 0){
                        for(int k = 2;k<n;k++){
                            if(arr[k]%2 != 0){
                                int temp = arr[k];
                                arr[k] = arr[j];
                                arr[j] = temp;
                            }
                        }
                    }
                }
            }   
            for(int l:arr){
                System.out.print(l+" ");
            }
            }
            else System.out.println("-1");
		}

        sc.close();
	}
}

