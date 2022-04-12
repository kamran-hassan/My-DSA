import java.util.*;
//import java.io.*;
public class pattern {

    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String s = scanner.next();
    solution.myFunction(s);
    scanner.close();

    }
 

}

class solution {

    static void myFunction(String s){
        int num=0;
        System.out.println(s);
        for(int i=0;i<s.length();){
            while( i < s.length() && s.charAt(i) == 'x'){
                num++;
                i++;
            }
            while(i < s.length() && s.charAt(i) == 'y'){
                num--;
                i++;
            }
            if(num != 0){
                System.out.println("0");
                return;
            }
        }
        System.out.println("1");
    }


}

