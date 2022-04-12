// { Driver Code Starts
//Initial Template for Java

import java.util.*;
//import java.lang.*;
//import java.io.*;
class GFGg
{
    
	public static void main (String[] args)
	{
	     //taking input using Scanner class
    	 Scanner sc = new Scanner(System.in);
    	 
    	 //taking total number of testcases
    	 int t = sc.nextInt();
    	 
    	 //boolean flag = false;
    	 while(t-- > 0){
    	   
    	   //taking the 2 strings
    	   String s1=sc.next();
    	   String s2=sc.next();
    	   
    	   //creating an object of class Geeks
    	   Geeko obj=new Geeko();
    	   
    	   //calling coutChars method
    	   //of class Geeks and passing
    	   //both the Strings and printing
    	   //the result
    	   System.out.println(obj.coutChars(s1,s2));
    	   
    	 }
		 sc.close();
    }
}




 // } Driver Code Ends
//User function Template for Java

/*Function to count number of characters 
* to make s1 and s2 equal
* s1 : first string
* s2 : second string
*/
class Geeko{
    
     int coutChars(String s1, String s2)
    {
        
       //Your code here
          char a[] = s1.toCharArray();
		  char b[] = s1.toCharArray();

		  Arrays.sort(a);
		  Arrays.sort(b);
		  System.out.println(a);
		  System.out.println(b);
		  int i =0;
		  while(i< a.length && i< b.length &&a[i] == b[i]){
			i++;
		  }
		  int big;
		  if(a.length>b.length)
		  big = a.length;
		  else
		  big = b.length;
       return big-i;
    }
}

// { Driver Code Starts.
  // } Driver Code Ends