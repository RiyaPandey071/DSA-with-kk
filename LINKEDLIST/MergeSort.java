package linkedlist;
public class MergeSort {
    

  public Node mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyHead =new ListNode();
        ListNode tail=dummyHead;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                tail.next=list1;
                list1=list1.next;
                tail=tail.next;            }
                else{
                    tail.next=list2;
                    list2=list2.next;
                    tail=tail.next;
                }
        }
        tail.next=(list1!=null)? list1:list2;
        return dummyHead.next;
    }


    ///MIddle of linkedlist
public Node middleNode(Node head) {
       Node fast=head;
       Node slow=head;
       
       while(fast!=null && fast.next!=null){
        fast=fast.next.next;
        slow=slow.next;
       } 
       return slow;
}
}
