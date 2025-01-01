import java.util.Scanner;
public class Natural {
    static int Sum(int n){
        int s=0;
        for(int i=1;i<=n;i++){
             s=s+i;
           
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        System.out.println("sum of first "+num+" natural no is: "+Sum(num));
    }
}
