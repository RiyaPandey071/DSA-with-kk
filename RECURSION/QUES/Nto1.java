
public class Nto1 {
    public static void main(String[] args) {
     funboth(5);   
    }
    //concept
    static void concept(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        //fun(n--); xxx
        fun(--n);
        //n-- vs --n 
    }
    static void fun(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        fun(n-1);
    }
    static void funrev(int n){
        if(n==0){
            return;
        }
        
        funrev(n-1);  //reverse
        System.out.print(n+" "); 
    }
    static void funboth(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        funboth(n-1);  //reverse
        System.out.print(n+" "); 
    }
}
