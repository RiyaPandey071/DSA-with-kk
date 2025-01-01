import java.util.Scanner;
public class Marks {
    static void Grade(int marks){
        if(marks<=100 && marks>=91){
            System.out.println("Grade: AA");
        }
        if(marks<=90 && marks>=81){
            System.out.println("Grade: AB");
        }
        if(marks<=80 && marks>=71){
            System.out.println("Grade: BB");
        }
        if(marks<=70 && marks>=61){
            System.out.println("Grade: BC");
        }
        if(marks<=60 && marks>=51){
            System.out.println("Grade: CD");
        }
        if(marks<=50 && marks>=41){
            System.out.println("Grade: DD");
        }
        if(marks<=40){
            System.out.println("Grade: Fail");
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the marks:");
        int m=in.nextInt();
        Grade(m);
    }
    
}
