//set i^th bit means turn the i^th bit to 1.
public class SetIthBit {
   public static void main(String[] args) {
   int num=10;
   int bitPosition=3;
    System.out.println(bit(num,bitPosition));
   } 
   static int bit(int num,int bitPosition){
    
    int mask=1<<(bitPosition - 1);
    int n=num|mask;
     return n>0?1:0;
  
  }
}
