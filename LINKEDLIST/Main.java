package linkedlist;
public class Main {
    public static void main(String[] args) {
        SinglyLL list=new SinglyLL();
         list.insertFirst(5);
         list.insertFirst(7);
         list.insertFirst(6);
         list.insertFirst(2);
         list.insertLast(99);
        //list.insert(100,3);
        list.display();
        // System.out.println(list.deleteFirst());
        // list.display();
        // System.out.println(list.deleteLast());
        // list.display();
        // System.out.println(list.delete(2));
        // list.display();
    
        list.insertRec(88,2);
        list.display();

    }

    
}
