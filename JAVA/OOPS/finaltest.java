package OOPS;

public class finaltest{
    final void add(int a, int b){
       System.out.println(a+b);
    }
    void add(int a, int b, int c){
       System.out.println(a+b+c);

       
    }
    public static void main(String args[]){
       finaltest obj = new finaltest();
       obj.add(20, 40);
       obj.add(40, 50, 60);
    }
 }