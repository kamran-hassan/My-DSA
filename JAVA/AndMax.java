import java.util.*;
public class AndMax {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        if(x ==1 ){System.out.println("1"); return;}
        int i =1;
        for( i = 1; i <= x; i*=2) {
        }
        int ans = i/2;
        int a = x-ans+1;
        if(x == ans){System.out.println(ans/2);}
        else { System.out.println(Math.max(a, ans/2));}
        s.close();
    }
}
