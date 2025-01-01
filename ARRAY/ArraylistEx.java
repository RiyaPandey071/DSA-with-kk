import java.util.ArrayList;
import java.util.Scanner;
public class ArraylistEx {


    public static void main(String[] args) {
        
    Scanner in=new Scanner(System.in);
    //syntax

   // ArrayList<Integer> list= new ArrayList<>(10);
    



    
   // list.add(67);
    //list.add(63);
    //list.add(64);
    //list.add(65);
    //list.add(66);
   // list.add(67);
   // list.add(68);
   // list.add(69);

   // list.set(0,24);
   // list.remove(3);
//System.out.println(list);
//System.out.println(list.contains(14));

//input
//for(int i=0;i<5;i++){
   // list.add(in.nextInt());
//}
//for(int i=0;i<5;i++){
    //System.out.print(list.get(i)+" ");
//}
//System.out.println(list);

//2d arraylist

ArrayList<ArrayList<Integer>> list = new ArrayList<>();

//intialisation
for(int i=0; i<3;i++){
list.add(new ArrayList<>());
}

//add element
for(int i=0;i<3;i++){
    for(int j=0;j<3;j++){
      list.get(i).add(in.nextInt())  ;
    }
}

System.out.println(list);


}}
