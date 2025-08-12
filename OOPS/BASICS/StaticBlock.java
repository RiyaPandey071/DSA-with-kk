public class StaticBlock {
  static int a=8;
  static int b;
  //will only run once whwn the first obj is created 
  static {
    System.out.println("i am in Static bloxk");
    b=a*5;
  }

public static void main(String[] args) {
    StaticBlock obj=new StaticBlock();
    System.out.println(StaticBlock.a+" "+StaticBlock.b);
    StaticBlock.b+=3;
    System.out.println(StaticBlock.a+" "+StaticBlock.b);

    StaticBlock obj2=new StaticBlock();
    System.out.println(StaticBlock.a+" "+StaticBlock.b);
    
}



}
