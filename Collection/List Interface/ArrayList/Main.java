import java.util.*;
public class Main {

    public static void main(String[] args) {
        
        List<Integer> one = new ArrayList<>();

        one.add(0);
        one.add(1);
        one.add(2);
        one.add(3);
        one.add(4);

        // Forward Traversal
        ListIterator<Integer> forwardIterate = one.listIterator();
        while (forwardIterate.hasNext()) {
            int val = forwardIterate.next();
            System.out.println("previous index: " + forwardIterate.previousIndex() + " Current Value: " + val + " next index: " + forwardIterate.nextIndex());
        }
        printList(one);
        System.out.println();

        // Backward Traversal
        ListIterator<Integer> backwardIterate = one.listIterator(one.size());
        while (backwardIterate.hasPrevious()) {
             int val = backwardIterate.previous();
            System.out.println("previous index: " + forwardIterate.previousIndex() + " Current Value: " + val + " next index: " + forwardIterate.nextIndex());
            // set method
            one.set(4, 1);
        }
        printList(one);
        System.out.println();

        // sublist of list
        List<Integer> mySublist = one.subList(2, 4);
        printList(mySublist);
        System.out.println();

        List<Integer> two = new ArrayList<>();
        two.add(8);
        two.add(6);
        two.add(9);
        two.add(5);
        two.add(4);
        System.out.println("\nSecond List\n");
        printList(two);
        System.out.println();

        // sort list
        two.sort((Integer val1,Integer val2) -> val1-val2);
        printList(two);
        System.out.println();

        // replaceAll
        two.replaceAll((Integer val) -> val * 2);
         printList(two);
        System.out.println();

        // get and set
        two.set(2, 100);
         printList(two);
        System.out.println();
        System.out.println(two.get(2));
        System.out.println();

        // addAll
        System.out.println("After Combining ");
        one.addAll(2,two);
         printList(one);
        System.out.println();

        // remove 
        System.out.println(one.indexOf(100));
        one.remove(4);
         printList(one);
        System.out.println();

        // removeAll
        one.removeAll(two);
         printList(one);
        System.out.println();
        
        // indexOf() and lastIndexOf()
        System.out.println(one.indexOf(1));
        System.out.println(one.lastIndexOf(1));


    }

    public static void printList(List<Integer> obj){
        obj.forEach((Integer val) -> System.out.print(val + " "));
    }

    
}
