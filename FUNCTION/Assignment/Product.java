import java.util.Scanner;
public class Product {
   static int Multiply(int a,int b){
    int c=a*b;

    return c;
   } 

   public static void main(String[] args) {
    Scanner sn=new Scanner(System.in);
    int num1=sn.nextInt();
    int num2=sn.nextInt();
    System.out.println("Product of two no is: "+Multiply(num1,num2));
}
}
