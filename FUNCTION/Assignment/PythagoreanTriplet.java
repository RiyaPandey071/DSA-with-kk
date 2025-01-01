import java.util.Scanner;
public class PythagoreanTriplet {
   
    static boolean PT(int a, int b, int c){
        
        if((a*a+b*b)==c*c){
            return true;
        }

            return false;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num1=in.nextInt();
        int num2=in.nextInt();
        int num3=in.nextInt();
        System.out.println(PT(num1,num2,num3));
    }
}
