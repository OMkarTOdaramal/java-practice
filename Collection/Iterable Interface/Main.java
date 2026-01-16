import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);
        values.add(5);

        // Using iterator() method
        System.out.println("Iterating the values using iterator method");
        Iterator<Integer> iteratingValues = values.iterator();
        while(iteratingValues.hasNext()){
            int val = iteratingValues.next();
             System.out.println(val);
            if(val == 3){
                iteratingValues.remove();
            }
        }

        // Using forEach() method
        System.out.println("printing using forEach() method");
        values.forEach((Integer val) -> System.out.println(val));

        // Using forEach loop
        System.out.println("printing using forEach loop");
        for (Integer val: values) {
            System.out.println(val);
        }


    }
}
