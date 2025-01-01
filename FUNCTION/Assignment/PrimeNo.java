import java.util.Scanner;
public class PrimeNo {
     
    static boolean isPrime(int num){
       int c=0;
       if(num<=1){
return false;
       }
        for(int i=2;i<num;i++){
if(num%i==0){
    return false;
}}
return true;
        
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        System.out.println("prime no between "+a+" and "+b+" is:");
        for(int i=a;i<=b;i++){
            if(isPrime(i)){
                System.out.print(i+"\t");
            }
        }
    }
}
