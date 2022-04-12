public class afterDOT {

    public static void main(String[] args){
        double x = 52.5822;
        String str = new String();
        str = str+x;
        System.out.println(str);
        System.out.println(numAfterDot(str));

    }

    public static String numAfterDot(String s){
        int in = s.indexOf(".");
        if(in>=0){
        return s.substring(in+1, s.length());
        }
        return new String(); 
    }
    
}

