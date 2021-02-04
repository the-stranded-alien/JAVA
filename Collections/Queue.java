import java.util.PriorityQueue;

public class Queue {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        for(int i = 10; i > 0; i--) {
            queue.add(i);
        }
        // Priority Queue sorts the data
        // Peeking -> Obtain head
        // Polling -> Remove head
        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.size());
        queue.poll();
        System.out.println(queue.peek());
        System.out.println(queue.size());
    }
}