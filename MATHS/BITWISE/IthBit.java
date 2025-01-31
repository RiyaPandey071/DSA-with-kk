public class IthBit {
    public static void main(String[] args) {
      int num=10;
      int bitPosition=7;
      System.out.println(bit(num,bitPosition));
     
    }
    static int bit(int num,int bitPosition){
    
      int mask=1<<(bitPosition - 1);
      int n=num&mask;
       return n>0?1:0;
    
    }
    
}
