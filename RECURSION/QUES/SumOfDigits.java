public class SumOfDigits {
    public static void main(String[] args) {
      int ans=sum(21);
      System.out.println(ans);
      int p=product(321);
      System.out.println(p);
    }
    static int sum(int n){
       if(n==0){
        return 0;
       }

       return (n%10) + sum(n/10); 
    }
    static int product(int n){
       if(n%10==n){
        return n;
       }

       return (n%10) * product(n/10); 
    }
}
