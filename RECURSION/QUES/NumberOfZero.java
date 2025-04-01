public class NumberOfZero {
  public static void main(String[] args) {
    zeroes(203000005);
    System.out.println(count);
    System.out.println(count(2030400));
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
 
static int count(int n){
  return helper(n,0);
}
static int helper(int n,int c){
if(n==0){
  return c;
}
int rem=n%10;
if(rem==0){
  return helper(n/10,c+1);
}
return helper(n/10,c);
}
}
