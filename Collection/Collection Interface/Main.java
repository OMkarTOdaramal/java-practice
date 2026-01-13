import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// common methods of Collection Interface

public class Main {

    public static void main(String[] args) {
        
        List<Integer> values = new ArrayList<>();

        // add
        values.add(1);
        values.add(2);
        values.add(3);

         System.out.println("Elements in ArrayList : ");
         values.forEach((Integer val) -> System.out.println(val));

        // size
        System.out.println("Size of ArrayList "+ values.size());

        // isEmpty()
        System.out.println(values.isEmpty());

        // contains
        System.out.println(values.contains(4));
        values.add(4);
        System.out.println(values.contains(4));

        // remove()
        values.remove(3);
        System.out.println("Removed using index: " + values.contains(4));
        values.remove(Integer.valueOf(2));
        System.out.println("Removed using element: " + values.contains(2));

        System.out.println("Elements in ArrayList : ");
        for(int i:values){
            System.out.println(i);
        }

        // creating another collection
        Stack<Integer> elements = new Stack<>();
        elements.add(5); 
        elements.add(6); 
        elements.add(7); 

        // addAll()
        values.addAll(elements);
        System.out.println("After addAll : ");
         System.out.println("Elements in ArrayList : ");
        values.forEach((Integer val) -> System.out.println(val));

        // containsAll()
        System.out.println("testing addAll : "+ values.containsAll(elements));
        values.remove(Integer.valueOf(6));
        System.out.println("testing addAll : "+ values.containsAll(elements));

        // removeAll()
        values.removeAll(elements);
        System.out.println(values.contains(7));

        // clear()
        values.clear();
        System.out.println("clear: " + values.isEmpty());

    }
    
}
