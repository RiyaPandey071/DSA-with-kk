import java.util.Scanner;
public class Factorial {
    static int Facto(int num){
int m=1;
if(num==0){
    return 1;
}

        for(int i=1;i<=num;i++){
m=m*i;

        }

        return m;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.print(n+"! = "+Facto(n));
        
    }
}
