


import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        //Reading input using BufferedReader class
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        //taking count of total testcases
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            //Reading the String
            String s = read.readLine();
            Get obj = new Get();
            
            //calling validate method of class Get and
            //printing the result "1" if true else "0"
            System.out.println(obj.validate(s) ? "1":"0");
            
            
        }
    }
}// } Driver Code Ends


//User function Template for Java


class Get
{
    public static boolean validate(String str)
    {
          //Your code here
          int ch[]= new int[5];
          if(str.length()>=10) c[0] = 1;
          
          if(c[0] != 1) return false;
          
          String num = "1234567890";
          for(char c : num.toCharArray()){
          String x = Character.toString(c);
          if(str.contains(x) == true) {ch[1] = 1;break;};
          }
          
           if(ch[1] != 1) return false;
           
          for(char i : str.toCharArray())
          if(i>=65 && i<=91) {ch[2] = 1;break;}
           
          if(ch[2] != 1) return false; 
          
          for(char i : str.toCharArray())
          if(i>=97 && i<=123) {ch[3] = 1;break;}
          
          if(ch[3] != 1) return false;
          
          String spe = "@#$-*";
          
          for(char c : spe.toCharArray()){
          String x = Character.toString(c);
          if(str.contains(x) == true) {return true;}
          }
          return false;
    }
}