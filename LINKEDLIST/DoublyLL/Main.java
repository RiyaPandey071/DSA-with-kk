package DoublyLL;
public class Main {
   public static void main(String[] args) {
//     DoublyLinkedlist list=new DoublyLinkedlist();
// list.insertFirst(3);
// list.insertFirst(5);
// list.insertFirst(9);
// list.insertFirst(8);
// list.insertLast(34);
// list.insert(9,21);
// list.display();

CircularLL list=new CircularLL();
list.insert(23);
list.insert(24);
list.insert(2);
list.insert(25);
list.display();
list.delete(2);
list.display();
   } 
}
