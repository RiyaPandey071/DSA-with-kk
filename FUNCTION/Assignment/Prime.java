import java.util.Scanner;
public class Prime {
int c=0;
    static void isPrime(int n){
        int c=0;
        if(n<=1){
            System.out.println(n+" is not a prime number");
        }
for(int i=1;i<=n;i++){
    if(n%i==0){
        c++;
    }

}

if(c==2){
    System.out.println(n+" is prime number");
}
else {
System.out.println(n+" is not a prime no.");
}

    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        isPrime(num); 
    }
    
}
