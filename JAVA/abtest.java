public class abtest {
    public static void main(String[] args){
    honda h = new honda();
    h.run();
    h.jump();
    //System.out.println(Bike.x);

    }
}

abstract class Bike{
    static int x = 0;
    Bike(){
        System.out.println("abstract contructor runnnig");
    }
    void run(){
        System.out.println("Normal Running");
    };
    abstract void jump();
}

class honda extends Bike{
    void run(){   // not compulsory to override
        System.out.println("Speed Running");
    };
    void jump(){ // compulsory to override 
        System.out.println("Jumming Jampak Jampak Jampak");
    }
}


