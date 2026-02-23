import java.util.*;
public class Main {

    public static void main(String[] args) {
        
        Map<Integer,String> firstMap = new HashMap<>();

        // put() 
        firstMap.put(null, "test");
        firstMap.put(0, null);
        firstMap.put(1, "one");
        firstMap.put(2, "two");
        firstMap.put(1, "OnE");
        firstMap.put(null, "TesT");

        // putIfAbsent()
        firstMap.putIfAbsent(null, "TEST");
        firstMap.putIfAbsent(0, "zero");
        firstMap.putIfAbsent(1, "ONE");
        firstMap.putIfAbsent(3, "three");

        // iterating Map
        for(Map.Entry<Integer,String> iterateMap : firstMap.entrySet()){
            Integer key = iterateMap.getKey();
            String value = iterateMap.getValue();
            System.out.println("Key: " + key + "  Value: " + value);
        }

        // isEmpty()
        System.out.println("Is map Empty: " + firstMap.isEmpty());

        // size()
        System.out.println("Size of Map: " + firstMap.size());

        // get(key)
        System.out.println("Value at key :" + firstMap.get(2));

        // containsKey()
        System.out.println("Contains key: " + firstMap.containsKey(8));

        // containsValue()
        System.out.println("Contains value: " + firstMap.containsValue("two"));

        // getOrDefault()
        System.out.println("get or default: " + firstMap.getOrDefault(2, "not two"));
        System.out.println("get or default: " + firstMap.getOrDefault(7, "not two"));

        // remove()
        System.out.println("Removed valur(null) : " + firstMap.remove(null));
        for(Map.Entry<Integer,String> iterateMap : firstMap.entrySet()){
            int key = iterateMap.getKey();
            String value = iterateMap.getValue();
           System.out.println("Key: " + key + "  Value: " + value);

        // keySet()
        for(Integer Key: firstMap.keySet()){
            System.out.println("Key: " + Key);
        }

        // collection values()
        Collection<String> mapValues = firstMap.values();
        for(String val: mapValues){
            System.out.println("values: " + val);
        }

        }
    }
    
}
