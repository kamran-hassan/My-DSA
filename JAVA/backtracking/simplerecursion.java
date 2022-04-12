// see permutation using backtrack
// Q print only if AB is not a substring in combination
public class simplerecursion{
    public static void main(String[] args){
        //String st = new String("0123");
        permutation("0123",0);
    }

    static void permutation(String str, int l){
        if(str.length()-1 == l ){System.out.print(str+" "); 
        return;}
        else{
        for(int j = l; j < str.length(); j++){
            str = swap(str,l,j);
            permutation(str,l+1);
            str = swap(str,l,j);
        }
    }
    }
    static String swap(String str,int i,int j){
        char[] ch = str.toCharArray();
        char c = ch[i];
        ch[i]  = ch[j];
        ch[j] = c;
        return new String(ch);
    }
}

