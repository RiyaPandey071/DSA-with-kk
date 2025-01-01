import java.util.Scanner;
public class Sum {

    static int Addition(int a, int b){
        int c=a+b;
        return c;
    }

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int num1=in.nextInt();
        int num2=in.nextInt();
        System.out.println("Sum of two no is: "+Addition(num1,num2));
    }
    
}
