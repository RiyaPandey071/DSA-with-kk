

public class Swap {



    
    public static void main(String[] args) {
       //swaping a no int a=23;
        //int b=45;
        //int temp=a;
       // a=b;
       // b=temp;
int a=20;
int b=10;
       swap(a,b);
       System.out.println(a+" "+b);

       
    }

    static void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;  
    }
    
}
