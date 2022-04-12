/* package codechef; // don't place package name! */

import java.util.*;
//import java.lang.*;
//import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Airlinprb
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int i;
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        while(i-- > 0){
            int a,b,c,d,e;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            d = sc.nextInt();
            e = sc.nextInt();
            if((a+b <= d && c<=e) || (a+b <= e && c<=d) || (a+c <= d && b <=e) ||(a+c <= e && b <=d) || (b+c<=d && a<=e) || (b+c<=e && a<=d))
            System.out.println("YES");
            else
            System.out.println("NO");
            
        }
		sc.close();
	}
}