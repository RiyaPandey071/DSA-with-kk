package p1;
import p2.Fun;
public class Main {
   public static void main(String[] args) {
   Fun f=new Fun();
   f.fun();
   f.fun3();
   f.print();
   
    

    //Main funn=new Main();
    //funn.fun2();
   } 


   //static void fun(){
    // greetig(); //u cant use this bcoz it requires an instance
    //but the fnction u are using it in does not depend on instances
    
    //u cant access non static stuff without referencing their instancesin static context
    
    //hence here i am referencing it
  //  Main obj=new Main();
  // obj.greeting();
  // }
//void fun2(){
   // greeting();
//}
   //void greeting(){
    //fun();
    //System.out.println("Hello World");
  // }
}
