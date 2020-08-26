import java.util.*;

/**
 * BinaryTree1
 */
public class BinaryTree1 {
    public static void main(String[] args) {
        // Queue<String> pq = new LinkedList<>();
        Queue<String> pq = new PriorityQueue<>();
        pq.add("Geeks");
        pq.add("For");
        pq.add("Geeks");
        // Elements are inserted in ascending order in a priority queue by default.
        Object[] arr = pq.toArray();

        for (Object obj : arr) {
            System.out.println(obj);
        }
    }

}