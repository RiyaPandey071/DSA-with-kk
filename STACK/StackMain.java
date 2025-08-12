package STACK;
public class StackMain  {
    public static void main(String[] args) throws StackException {
        CustomStack stack=new DynamicStack(5);

        stack.push(23);
        stack.push(21);
        stack.push(25);
        stack.push(67);
        stack.push(34);
        stack.push(22);

       
         System.out.println(stack.pop());
         System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        

    }
}
