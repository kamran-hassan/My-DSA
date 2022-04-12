public class nonPrim {
    // they more likly to be said that it is class actually and
    public static void main(String[] args){
        Point p1 = new Point();
        p1.x = 10;
        p1.y = 20;
        System.out.println("x+y="+p1.x+p1.y);
        Point p2;
        p2 = p1;
        p2.x = 40;
        System.out.println("p1.x="+p1.x);
        //But if 
        Point p3 = new Point();
        p3 = p1;
        p3.x = 50;
        System.out.println("p1.x="+p1.x);
        System.out.println("p2.x="+p2.x);
        System.out.println("p3 all = "+p3);
        System.out.println("p2 all = "+p2);
        System.out.println("p1 all = "+p1);
        System.out.println("Path:C:\\xyz\\abc.txt");
    }
}

class Point{
    int x;
    int y;
}