import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(3);
        values.add(5);
        values.add(2);
        values.add(4);

        // As Collections contains only the static methods we can call that methods directly using class name
        System.out.println("Max value: " + Collections.max(values));
        System.out.println("Min value: " + Collections.min(values));
        Collections.sort(values);
        System.out.println("sorted: ");
        values.forEach((Integer val) -> System.out.println(val));

    }
    
}
