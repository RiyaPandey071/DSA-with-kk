package p2;
public class Fun {
   public void fun(){
    System.out.println("fun is game ,game is fun");
   }
   
   private void fun2(){
      System.out.println(" print fun2");
   }

   public void fun3(){
      fun2();
     }

     private int num=7;
    public void print(){
      System.out.println(num);
    }  
}
