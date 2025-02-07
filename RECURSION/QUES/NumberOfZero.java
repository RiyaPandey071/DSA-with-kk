public class NumberOfZero {
  public static void main(String[] args) {
    zeroes(203000005);
    System.out.println(count);
  }
  static int count=0; 
  static int zeroes(int n){
    if(n<=0){
        return 0;
    }
    
    if(n%10==0){
        count++;
    }
    return zeroes(n/10);
  } 
}
