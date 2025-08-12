
package STACK;
import java.util.*;
  
public class InBuiltExample {
    public static void main(String[] args) {
        // Stack<Integer> stack=new Stack<>();
        // stack.push(23);
        // stack.push(13);
        // stack.push(53);
        // stack.push(38);
        // stack.push(33);
        // stack.push(3);

        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());

        // Queue<Integer> queue=new LinkedList<>();

        // queue.add(97);
        // queue.add(3);
        // queue.add(4);
        // queue.add(65);
        // queue.add(38);
        // queue.add(31);

        // System.out.println(queue.peek());
        // System.out.println(queue.remove());
        // System.out.println(queue.remove());
        // System.out.println(queue);


        Deque<Integer> deque=new ArrayDeque<>();
        deque.add(89);
        deque.addLast(78);
        deque.removeFirst();
    }
}
