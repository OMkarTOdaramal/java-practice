import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        // Using List interface
        System.out.println("Using List: ");
        List<Integer> one = new LinkedList<>();
        one.add(1);
        one.add(2);
        one.add(3);
        one.add(4);
        one.add(5);
        printList(one);
        
        List<Integer> mySublist = one.subList(1, 4);
        printList(mySublist);

        mySublist.remove(2);
        printList(mySublist);
        printList(one);

        // Using Deque
        System.out.println("Using Dequeue");
        Deque<Integer> two = new LinkedList<>();
        two.addFirst(6);
        two.addFirst(7);
        two.addFirst(8);
        two.addLast(9);
        two.addLast(10);
        printDeque(two);


    }

    public static void printList(List<Integer> l){
        Iterator<Integer> values = l.iterator();
        System.out.print("Current: ");
        while (values.hasNext()) {
            int val = values.next();
            System.out.print(val + " ");
        }
        System.out.println();
    }
    public static void printDeque(Deque<Integer> l){
        Iterator<Integer> values = l.iterator();
        System.out.print("Current: ");
        while (values.hasNext()) {
            int val = values.next();
            System.out.print(val + " ");
        }
        System.out.println();
    }
    
}
