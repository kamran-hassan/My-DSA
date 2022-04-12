import java.util.*;

public class MEXOR {
    //codechef question  not solved yet
    

    public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int x = s.nextInt();
    if(x==0) System.out.println("1");
    else if(x==1) System.out.println("2");
    else if(x==2) System.out.println("1");   // or it could be 2 is 0 OR 1 = 1 , 0 OR 1 OR 2 =3 , O OR 2 = 2
    else if(x==3) System.out.println("2");
    else if(x==4) System.out.println("4");
    else if(x==5) System.out.println("4");
    else if(x==6) System.out.println("4");
    else if(x==7) System.out.println("6");
    else{
    int i=1;
    while(Math.pow(2,i)<=x) i++;
    
    i--;
    System.out.println((int)Math.pow(2,i));

    }

    s.close();

    }
}
