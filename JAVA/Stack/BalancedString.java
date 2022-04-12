import java.util.*;
import java.io.*;
import java.lang.*;

public class BalancedString
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        //Reading total number of testcases
        int t= sc.nextInt();
        
        while(t-- >0)
        {
            //reading the string
            String st = sc.next();
            
            //calling ispar method of Paranthesis class 
            //and printing "balanced" if it returns true
            //else printing "not balanced"
            if(new Solution().ispar(st) == true)
                System.out.println("balanced");
            else
                System.out.println("not balanced");
        
        }
    }
}// } Driver Code Ends




class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
        Boolean St = x.contains("(") || x.contains("{") || x.contains("[");
        Boolean En = x.contains(")") || x.contains("}") || x.contains("]");
        if(St == false && En == false) return true;
        if(St != En) return false;
        Stack<Character> s = new Stack<>();
        for(char c : x.toCharArray()){
            if(c == '[' || c == '{' || c == '(' ){
                s.push(c);
            }
            else if(s.isEmpty() == false && c==']' && s.peek() == '[') s.pop();
            
            else if(s.isEmpty() == false && c=='}' && s.peek() == '{') s.pop();
            
            else if(s.isEmpty() == false && c==')' && s.peek() == '(') s.pop();

            s.push(c);
            
            
        }
        
        if(s.isEmpty())
        return true;
        else
        return false;
    }
}
