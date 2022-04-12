class Rectangle{
    int width,height;

    Rectangle(int width,int height){
        this.width = width;
        this.height = height;
    }

    int area(){
        return width*height;
    }
}

public class javaclass {
    public static void main(String[] args){
    Rectangle r1 = new Rectangle(10,15);
    System.out.println(r1.area());
    
    }
}
