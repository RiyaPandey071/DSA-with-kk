import java.util.Scanner;
public class IsPalindrome {
    static void Palindrome(int num){
        int a=num%10;
        int b=num/10;
        int c=b%10;
        int d=b/10;
        int e= a*100+c*10+d;

        if(e==num){
            System.out.println(num+" is Palindrome number.");
        }
        else{
System.out.println(num+" is not Palindrome number.");
        }

        
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
      Palindrome(n);
    }
}
