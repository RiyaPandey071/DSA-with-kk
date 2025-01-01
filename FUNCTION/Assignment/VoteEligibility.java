import java.util.Scanner;
public class VoteEligibility {

    static void voter(int age ){
        if(age>=18){
            System.out.println("Congrats!! You are eligible for voting.");
        }
        else{
            System.out.println("Not eligible for voting!!");
        }
    }
    public static void main(String[] args) {
     Scanner in =new Scanner(System.in);
     int n=in.nextInt();
     voter(n);   
    }
}
