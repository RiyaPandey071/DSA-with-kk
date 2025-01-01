

import java.util.Scanner;

public class Sum {


//return the value
    static int sum(){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the two no:");
        int num1=in.nextInt(); 
        int num2=in.nextInt();
        int sum=num1+num2;
        return sum;
    }

//pass the value of no when u are calling the method in main()
static int sum2(int a, int b){
    int sum=a+b;
    return sum;
}

    public static void main(String[] args) {
       
     //int ans=sum();
    // System.out.println("sum: "+sum());

     System.out.println("sum: "+sum2(23,56));
    }




    
}
