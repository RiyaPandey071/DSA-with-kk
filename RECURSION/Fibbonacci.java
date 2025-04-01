

public class Fibbonacci {
    public static void main(String[] args) {
      int n = 10;
      for (int i = 0; i <= n; i++) {
          System.out.print(fibo(i) + " ");
      }
      System.out.println();
fibbo(10);
       
       }
    static int fibo(int n){
        if(n<2){
           return n;
        }  
            return fibo(n-1) + fibo(n-2);
 }
 static int fibbo(int n){
   
   int firstTerm =0;
    int secondTerm=1;
for(int i=0;i<=n;++i){
    System.out.print(firstTerm + " ");
    int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
}

return 0;

}
}
