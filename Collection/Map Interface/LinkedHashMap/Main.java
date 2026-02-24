import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Normal HashMap
        Map<Integer, String> one = new HashMap<>();
        one.put(12, "A");
        one.put(24, "B");
        one.put(36, "C");
        one.put(48, "D");
        one.put(60, "E");
        System.out.println("Normal Hashmap (Insertion order not maintain): ");
        for (Map.Entry<Integer, String> values : one.entrySet()) {
            System.out.println(values);
        }
        System.out.println();

        // LinkedHashMap
        System.out.println("LinkedHashMap (Insertion order maintain): ");
        Map<Integer, String> two = new LinkedHashMap<>();
        two.put(12, "A");
        two.put(24, "B");
        two.put(36, "C");
        two.put(48, "D");
        two.put(60, "E");
        for(Map.Entry<Integer,String> val: two.entrySet()){
            System.out.println(val);
        }
        System.out.println();

        // LinkedHashMap with Access order TRUE
        System.out.println("LinkedHashMap (with Access order): ");
        Map<Integer, String> three = new LinkedHashMap<>(16,.75F,true);
        three.put(12, "A");
        three.put(24, "B");
        three.put(36, "C");
        three.put(48, "D");
        three.put(60, "E");

        three.get(48);
        three.get(36);
        for(Map.Entry<Integer,String> val: three.entrySet()){
            System.out.println(val);
        }
    }
}
