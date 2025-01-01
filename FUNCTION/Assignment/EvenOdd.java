import java.util.Scanner;
public class EvenOdd {

    static int Evenodd(int n){
        if (n%2==0){
            System.out.println(n+" is even number.");
        }

        else if(n%2 != 0){
            System.out.println(n+" is odd number.");
        }
return 0;
    }
    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        Evenodd(num);
    }
}
