/* package codechef; // don't place package name! */

import java.util.*;


/* Name of the class has to be "Main" only if the class is public. */
class test
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
        s.nextLine();
        int E,I,D,r;
		while(n--!=0){
            E=0;I=0;D=0;
            for(int i = 0; i <5;i++){
            r = s.nextInt();
            if(r == 1) I++;
            else if(r ==2) E++;
            else if(r ==0) D++;
            }
            if(E>I) System.out.println("ENGLAND");
            else if(I>E) System.out.println("INDIA");
            else System.out.println("DRAW");
        }
       s.close(); 
	}
}
