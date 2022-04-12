// { Driver Code Starts
//Initial Template for Java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class sum {

    
 // } Driver Code Ends
//User function Template for Java


public static int nSum(int n){
    int ans = 0;

    //Write your code here to calculate and return sum of n number.
    
    ans = (n*n)+n;
    ans = ans/2;
    return ans;
}

// { Driver Code Starts.

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while(t-- > 0) {
            int n = Integer.parseInt(reader.readLine());
            int ans = nSum(n);
            System.out.println(ans);
        }
        
    }
}  // } Driver Code Ends