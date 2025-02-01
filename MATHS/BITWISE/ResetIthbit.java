public class ResetIthbit {public static void main(String[] args) {
    //if bit is 0 change to 1,and vice-versa
    
    int num=10;
    int bitPosition= 3;
    System.out.println(bit(num,bitPosition));
   
  }
  static int bit(int num,int bitPosition){
  
    int mask=~(1<<(bitPosition - 1));
    int n=num&mask;
     return n>0?1:0;
  
  }
}
    

