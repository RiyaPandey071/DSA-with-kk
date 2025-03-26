public class Factorial {
    public static void main(String[] args) {
   
       int ans=fact(5 );
       System.out.println(ans);
    int ans2=sum(5);
    System.out.println(ans2);
    
        
    }

    static int fact(int n){
if(n<=1){
    return 1;
}
return n*fact(n-1);

    }
    static int sum(int n){
if(n<=1){
    return 1;
}
return n+sum(n-1);

    }
}
