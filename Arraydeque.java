
import java.util.ArrayDeque;

public class Arraydeque {

    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.add(10);
        deque.add(20);
        deque.add(5);
        deque.add(30);
        System.out.println("Deque: " + deque);
        System.out.println("first element : " + deque.peekFirst());
        System.out.println("Last element: " +deque.peekLast());
        deque.removeFirst();
        deque.removeLast();
        System.out.println("After removal: " +deque);
    }
}
