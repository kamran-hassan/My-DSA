public class permutationusingbacktrack {
    public static void main(String[] args){
        //String st = new String("ABCD");
        permutation("ABC",0);
    }

    static void permutation(String str, int l){
        if(str.length()-1 == l){System.out.print(str+" "); 
        return;}
        else{
        for(int j = l; j < str.length(); j++){
            if(isSafe(str, l,j)){
            str = swap(str,l,j);
            permutation(str,l+1);
            str = swap(str,l,j);
            }
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
    static boolean isSafe(String str, int i, int j){
        if(i != 0 && str.charAt(i-1) == 'A' && str.charAt(j) == 'B') return false;            // will nominate ABC   
        if(str.length() == (i+1) && str.charAt(j) == 'A' && str.charAt(i) == 'B') return false;   // will nominate CAB kinds of things

        return true;
    }
}
