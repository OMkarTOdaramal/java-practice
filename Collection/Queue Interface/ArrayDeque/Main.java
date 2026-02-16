import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        
        Deque<Integer> one = new ArrayDeque<>();

        // Deque methods

        // add(),remove(),element()
        one.add(1);
        one.add(2);
        one.add(3); 
        one.add(3);      // Duplicate allowed
        printQueue(one);
        int removed1 = one.remove();
        System.out.println("Removed: " + removed1);
        printQueue(one);
        int topEle1 = one.element();
        System.out.println("Top: " + topEle1);

         Deque<Integer> two = new ArrayDeque<>();

        // offer(),poll(),peek()
        two.offer(4);
        two.offer(5);
        two.offer(6);
        printQueue(two);
        int removed2 = two.poll();
        System.out.println("Removed: " + removed2);
        printQueue(two);
        int topEle2 = two.peek();
        System.out.println("Top: " + topEle2);   

        // Deque methods

        // front(first) ---- rear(last)
        Deque<Integer> three = new ArrayDeque<>();
        three.addFirst(1);
        three.addFirst(2);
        three.addFirst(3);
        printQueue(three);
        three.addFirst(4);
        printQueue(three);
        three.addLast(5);
        three.addLast(6);
        printQueue(three);
        int removed3 = three.removeFirst();
        System.out.println("Removed: " + removed3);
        printQueue(three);
        int topEle3 = three.getFirst();
        System.out.println("Top: " + topEle3);
        int removed4 = three.removeLast();
        System.out.println("Removed: " + removed4);
        printQueue(three);
        int topEle4 = three.getLast();
        System.out.println("Top: " + topEle4);

        
    }

    public static void printQueue(Deque<Integer> q){

        Iterator<Integer> values = q.iterator();
        System.out.print("Current queue: ");
        while (values.hasNext()) {
            int val = values.next();
            System.out.print(val + " ");
        }
        System.out.println();
    }
    
}
