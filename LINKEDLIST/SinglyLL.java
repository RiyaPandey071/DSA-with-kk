package linkedlist;

public class SinglyLL {
private Node head;
private Node tail;
private int size;
public SinglyLL(){
    this.size=0;
}

public void insertFirst(int val){
    Node node=new Node(val);

    node.next=head;
    head=node;

    if(tail==null){
        tail=head;
    }
    size+=1;

}

public void insertLast(int val){

    if(tail==null){
        insertFirst(val);
        return;
    }
    Node node =new Node(val);
    tail.next=node;
    tail=node;
    size+=1;
}

public void insert(int val,int index){
    if(index==0){
        insertFirst(val);
        return;
    }
    if(index==size){
        insertLast(val);
        return;
    }

    Node temp=head;
    for(int i=1;i<index;i++){
        temp=temp.next;
    }
     Node node=new Node(val,temp.next);
     temp.next=node;
     size++;

}

 public int deleteFirst(){
    int val=head.value;
    head=head.next;
    if(head==null){
        tail=null;
        }
        size--;
        return val;
 }

public Node get(int index){
    Node node=head;
    for(int i=0;i<index;i++){
       node=node.next;
    }
    return node;
}

//insert using recursion
public void insertRec(int val,int index){
  head=insertRec(val,index,head);
}
private Node insertRec(int val,int index,Node node){
   if(index==0){
    Node temp=new Node(val,node);
    size++;
    return temp;
   } 
  node.next= insertRec(val,index-1,node.next);
  return node;
}
public int deleteLast(){
    if(size<=1){
        return deleteFirst();
    }
    Node secondLast=get(size-2);
    int val=tail.value;
    tail=secondLast;
    tail.next=null;
    return val;
}

public int delete(int index){
    if(index==0){
        return deleteFirst();
    }
    if(index == size-1){
        return deleteLast();
    }
    Node prev=get(index-1);
    int val=prev.next.value;
    prev.next=prev.next.next;
    size--;
    return val;     
    
}
public Node find(int value){
    Node node=head;
    while(node!=null){
        if(node.value==value){
            return node;
        }
        node=node.next;
    }
    return null;
}


public void display(){
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.value+" -> ");
        temp=temp.next;
    }
    System.out.println("End");
}


    private class Node{
private int value;
private Node next;

public Node(int value){
    this.value=value;
}
public Node(int value,Node next){
    this.value=value;
    this.next=next;
}
    }



    //ques
    public void duplicates(){
        Node node=head;
        while(node.next!=null){
            if(node.value==node.next.value){
                node.next=node.next.next;
                size--;
            }else{
                node=node.next;
            }
        }
        tail=node;
        tail.next=null;
    }


    //MERGE 
     public static SinglyLL merge(SinglyLL first,SinglyLL second){
        Node f=first.head;
        Node s=second.head;

        SinglyLL ans=new SinglyLL();

        while(f!=null && s!=null){
            if(f.value<s.value){
                ans.insertLast(f.value);
               f=f.next; 
            }
            else{
                ans.insertLast(s.value);
                s=s.next;
            }
        }
        while(f!=null){
           ans.insertLast(f.value);
           f=f.next; 
        }
        while(s!=null){
            ans.insertLast(s.value);
           s=s.next;
        }
        return ans;

     } 
     //cycle in ll
     public boolean hasCycle(Node head) {
        Node fast=head;
        Node slow=head;
        while(fast !=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
    //length of cycle
     public int lengthCycle(Node head) {
        Node fast=head;
        Node slow=head;
        while(fast !=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                //calculate the length
                Node temp=slow;
                int len=0;
                do { 
                    temp=temp.next;
                    len++;
                } while (temp!=slow);
               return len;
            }
        }
        return 0;
    }

    //cycle II
    public Node detectCycle(Node head){
        int length=0;
        Node fast=head;
        Node slow=head;
        while(fast !=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                length=lengthCycle(slow);
                break;
            }
        }
       //find start node
       Node f=head;
       Node s=head;

       while(length>0){
        s=s.next;
        length--;
       }
       if(length==0){
        return null;
       }
       //keep moving both forward and they will meet at cycle start;
       while(f!=s){
        f=f.next;
        s=s.next;
       }
       return s;
    }

    //happy number
      public boolean isHappy(int n) {
        int slow=n;
        int fast=n;
        do{
          slow=findSquare(slow);
          fast=findSquare(findSquare(fast));
        }while(slow!=fast);

        if(slow==1){
            return true;
        }
        return false;

    }
    private int findSquare(int number){
        int ans=0;
        while(number > 0){
            int digit=number%10;
            ans=(digit*digit)+ans;
            number=number/10;
        }
        return ans;
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
//Revere the list
private void reverseList(Node node){
    if(node==tail){
        head=tail;
        return ; 
    }

    reverseList(node.next);

    tail.next=node;
    tail=node;
    tail.next=null;
}
//in place reversion in linkedlist
     public void reverse(){
        if(size==2){
            return;
        }
        Node prev=null;
        Node present=head;
        Node next=present.next;

        while(present != null){
            present.next=prev;
            prev=present;
            present=next;
            
            if(next !=null){
                next=next.next;
            }
        }
        head=prev;
     }

     //reverse2
      public Node reverseBetween(ListNode head, int left, int right) {
        if(left==right){
            return head;
        }
        //skip the first left-1 nodes
Node current=head;
Node prev=null;
for(int i=0;current!=null && i<left-1; i++){
    prev=current;
    current=current.next;

}
Node last=prev;
Node newEnd=current;

//reverse btw left and right
Node next=current.next;
for(int i=0;current!=null && i<right-left+1;i++){
current.next=prev;
            prev=current;
           current=next;
            
            if(next !=null){
                next=next.next;
            }
}
if(last!=null){
    last.next=prev;
}
else{
   head=prev; 
}
newEnd.next=current;
return head;
    }
    //palindrome ll
    public boolean isPalindrome(Node head) {
        Node mid=middleNode(head);
        Node headSecond=reverseList(mid);
        Node reverseHead=headSecond;

        //compare both halves
       while(head!= null && headSecond !=null){
        if(head.value !=headSecond.value){
           break;
        }
        head=head.next;
        headSecond=headSecond.next;
       } 
reverseList(reverseHead);

if(head==null || headSecond ==null){
   return true; 
}
return false;
    }


    public static void main(String[] args) {
        // SinglyLL list=new SinglyLL();
        // list.insertLast(1);
        // list.insertLast(1);
        // list.insertLast(1);
        // list.insertLast(2);
        // list.insertLast(5);
        // list.insertLast(4);
        // list.insertLast(4);
        // list.display();
        // list.duplicates();
        // list.display();

        SinglyLL first=new SinglyLL();
        SinglyLL second=new SinglyLL();

        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);

        second.insertLast(1);
        second.insertLast(2);
        second.insertLast(9);
        second.insertLast(14);

        SinglyLL ans = SinglyLL.merge(first,second);
        ans.display();
        ans.duplicates();
        ans.display();

    }

}
