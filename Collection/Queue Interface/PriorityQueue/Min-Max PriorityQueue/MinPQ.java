import java.util.PriorityQueue;

public class MinPQ{

    public static void main(String[] args) {
        
        // minPQ used to solve problems of min heap
        PriorityQueue<Integer> minPQ = new PriorityQueue<>();
        minPQ.add(5);
        minPQ.add(2);
        minPQ.add(8);
        minPQ.add(1);

        // printing minPQ
        minPQ.forEach((Integer val) -> System.out.println(val));

        // remove top element and print
        while (!minPQ.isEmpty()) {
            int val = minPQ.poll();
            System.out.println("remove from top: " + val);
        }
    }
}