import java.util.Scanner;

 public class MaxMin {
   
    static int Maximum(int a, int b, int c){
        int max=0;
if(a>b && a>c){
     max=a;}
   
else if(b>a && b>c){
    max=b;
    
}
else{
    max=c;
    
}

return max;
    }


    static int Minimum(int a,int b,int c){
        int min=0;
        if(a<b && a<c){
            min=a;
        }
        else if(b<a && b<c){
            min=b;
        }
        else {
            min=c;
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int num1,num2,num3;
        num1=in.nextInt();
        num2=in.nextInt();
        num3=in.nextInt();
      
        System.out.println("max: " + Maximum(num1,num2,num3) +"\nmin: "+Minimum(num1,num2,num3));
    }
    
}
