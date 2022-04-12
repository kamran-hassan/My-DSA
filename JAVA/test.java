// { Driver Code Starts
//Initial Template for Java

//import java.io.*;
import java.util.*;


 // } Driver Code Ends
//User function Template for Java

/*Class Geeks with its member function interchange()
* a[][] = matrix input
* r : number of rows
* c : number of columns
*/
class Geeks{
    
    static void interchange(int a[][],int r, int c){
        
        // Your code here
        for(int j=0;j<r;j++){
            /*a[j][0] = a[j][0] + a[j][c-1];
            a[j][c-1] = a[j][0] - a[j][c-1];
            a[j][0] = a[j][0] - a[j][c-1]; Not use for 1,1 matrix it fails*/
            int temp = a[j][0];
            a[j][0] = a[j][c-1];
            a[j][c-1] = temp;
        }
        for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        } 
        System.out.println("a.length ="+a.length);
        System.out.println("a[0].length ="+a[0].length);
    }
}

// { Driver Code Starts.

// Driver class
class GFG2 {
    
    // Driver code
	public static void main (String[] args) {
	    
	    // Taking input using scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking total testcases
		int testcase = sc.nextInt();
		
		while(testcase-- > 0){
		    
		    //taking row and column count
		    int rows = sc.nextInt();
            int cols = sc.nextInt();
            
            //creating a 2d-array 
		    int a[][] = new int[rows][cols];
		    
		    //adding elements to the 2d-array
		    for(int i = 0;i<rows;i++){
		        for(int j = 0;j<cols;j++){
		            a[i][j] = sc.nextInt();
		        }
		    }
		    
		    //creating an object of class Geeks
		    //Geeks obj = new Geeks();
		    
		    //calling interchange() method 
		    //of class Geeks
		    Geeks.interchange(a, rows, cols);
            sc.close();
		}
	}
}  // } Driver Code Ends