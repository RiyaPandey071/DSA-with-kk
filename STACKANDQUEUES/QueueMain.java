package STACK;
public class QueueMain {
    public static void main(String[] args) {
        CustomQueue queue=new CustomQueue(5);

        queue.insert(3);
        queue.insert(9);
        queue.insert(6);
        queue.insert(2);
        queue.insert(8);

        queue.display();
    }
}
