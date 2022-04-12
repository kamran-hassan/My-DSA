//import java.util.*
public class Strings {
    public static void main(String []args) {
        String str = "Kamran";
        System.out.println(str.length());
        System.out.println(str.substring(1));
        String str1 = "Hi";
        String str2 = "Hi";
        if(str1 == str2) {
            System.out.println("str1 and str2 are same");
        }
        String str3 = new String("Hi");
        if(str3 == str1) {
            System.out.println("str3 and str1 are same");
        }
        else{
            System.out.println("str3 and str1 are different");
        }

        System.out.println("value of str1 is " + str1+" and value of str2 is " + str2+" and value of str3 is " + str3);
        //int x = 1;
        StringBuffer s = new StringBuffer("The Date is ");
        s.insert(12,"05-09-2021");
        s.append("and time is 06:47");
        System.out.println(s.indexOf("and time is"));
        System.out.println(s);
        System.out.println(s.reverse());
        
    }
    
}
