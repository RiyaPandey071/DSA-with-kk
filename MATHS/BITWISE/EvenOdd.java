public class EvenOdd {
    public static void main(String[] args) {
      int n=20;
      System.out.println(isodd(n));  
    }
    static boolean isodd(int n){
        return (n&1) == 1;
    }
}