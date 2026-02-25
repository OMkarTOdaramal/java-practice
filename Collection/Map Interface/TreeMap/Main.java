import java.util.*;
public class Main {
    public static void main(String[] args) {
        
        // natural TreeMap - default Ascending order
        Map<Integer,String> one = new TreeMap<>();
        System.out.println("default order treemap: ");
        one.put(36, "TS");
        one.put(12, "TW");
        one.put(48, "FE");
        one.put(60, "SX");
        one.put(24, "TF");
        for(Map.Entry<Integer,String> values: one.entrySet()){
            System.out.println(values);
        }
        System.out.println();

        // TreeMap - with Comparator order
        Map<Integer,String> two = new TreeMap<>((Integer val1,Integer val2) -> val2-val1);
        System.out.println("Comparator order: ");
        two.put(36, "TS");
        two.put(12, "TW");
        two.put(48, "FE");
        two.put(60, "SX");
        two.put(24, "TF");
        two.forEach((Integer key,String value) -> System.out.println(key + " : " + value));
        System.out.println();
    }
}
