/* package codechef; // don't place package name! */

import java.util.*;
//import java.lang.*;
//import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class travell
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int tCase = sc.nextInt();
        while (tCase-- > 0){
            int n,a,b;
            n= sc.nextInt();
            a= sc.nextInt();
            b= sc.nextInt();
            n = n*2; // suggestion comming value of n never used so just ignore this added YUHI
            String travel = sc.next();
            char[] trr = travel.toCharArray();
            int time=0;
            for(char c:trr){
                time += (c=='0')? a:b;
            }
            System.out.println(time);
        }



        sc.close();
	}
}
