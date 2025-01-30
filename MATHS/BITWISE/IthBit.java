public class IthBit {
    public static void main(String[] args) {
      int num=10;
      int bit=2;
      System.out.println(bit(num,bit));  
    }
    static int bit(int num,int bit){
        int n=bit&(1<<(bit - 1));
        return num^n;
    }
    
}
