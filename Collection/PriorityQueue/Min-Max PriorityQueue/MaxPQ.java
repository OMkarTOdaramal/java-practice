import java.util.PriorityQueue;

public class MaxPQ {

    public static void main(String[] args) {
        
        // maxPQ helps to solve problems of Max-Heap
        // If you do'nt provide anything in declaration it will be minHeap
        // If you provide comparator it will be maxHeap
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>((Integer a,Integer b) -> b-a);
        maxPQ.add(5);
        maxPQ.add(2);
        maxPQ.add(8);
        maxPQ.add(1);

        // printing all elements
        maxPQ.forEach((Integer val)-> System.out.println(val));

        // Removing elements
        while (!maxPQ.isEmpty()) {
            Integer val = maxPQ.poll();
            System.out.println("Removed from top: " + val);
        }
    }
    
}
