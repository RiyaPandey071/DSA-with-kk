import java.util.Scanner;
public class Circle {
    static double Circumference(int r){
        double c= (2*3.14*r);
    return c;
    }

    static double Area(int r){
       double a=3.14*r*r;

       return a;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
         int radius=in.nextInt();
         System.out.println("Circumference of circle: "+Circumference(radius)+"\nArea of circle: "+Area(radius));
    }
}
