/* package codechef; // don't place package name! */

import java.util.*;
//import java.lang.*;
//import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int tCase = sc.nextInt();
        while(tCase-- > 0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            int arrEven=0,arrOdd=0;
            for(int i =0;i<n;i++){
                arr[i] = sc.nextInt();
                if(evenOdd(arr[i]))
                arrEven++;
                else
                arrOdd++;
            }
            //int ans = Math.abs(arrOdd - (int)(n/2)) + Math.abs(arrEven - (n-(int)(n/2)));
            //System.out.println(arrEven+" "+arrOdd);
            //System.out.println("Even = "+(int)n/2);
            //System.out.println("Odd = "+(n-(int)(n/2)));
            //System.out.println((arrEven-(n-(int)(n/2))));
            int ans1 = (arrEven<=(n-(int)(n/2)))?arrEven:(n-(int)(n/2));
            int ans2 = (arrOdd<=(int)(n/2))?arrOdd:(int)(n/2);
            System.out.println(ans1+ans2);

        }
        sc.close();

	}
    public static boolean evenOdd(int n){
        if(n==1) return false;
        if(n%2==0) return true;
        else return false;
    } 
}
