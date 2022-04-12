import java.util.*;

public class hashmap{
    public static void main(String[] args) {
        Map<Integer, String> m = new TreeMap<Integer, String>();
        // hashmap and LinkedList is faster
        // treeMap has lower key higer key
        // in linkedHashMap is in ordered way;
        m.put(100,"GFG");
        m.put(120,"DSA");
        m.put(80,"ALGO");
        System.out.println("::"+m);
        m.remove(100);
        System.out.println("After remove\n::"+m);
        System.out.println("Finding 120="+m.get(120));
        System.out.println("Finding 120="+m.get(140)); // return null        
        System.out.println("contains 80 as key ="+m.containsKey(80));
        System.out.println("Contains \"DSA\" as value ="+m.containsValue("DSA"));
        System.out.println("contains 90 as key ="+m.containsKey(90));
        System.out.println("Contains \"GFG\" as value ="+m.containsValue("GFG"));
        m.put(90,"OS");
        m.put(90,"SD");
        System.out.println("");


    }
}