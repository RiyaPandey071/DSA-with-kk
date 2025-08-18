import java.math.BigDecimal;
import java.math.BigInteger;
public class Main {
    public static void main(String[] args){
      BD(); 

    }

    static void BD(){
        double x=0.03;
        double y=0.04;
        // double ans=y-x;
        // System.out.println(ans);

        BigDecimal X=new BigDecimal("0.03");
        BigDecimal Y=new BigDecimal("0.04");
        BigDecimal ans=Y.subtract(X);
      
        System.out.println(ans);

    }

        static void BI(){
             int a=30;
        int b=67;
        BigInteger A=BigInteger.valueOf(33);
        BigInteger B=BigInteger.valueOf(33324734);
        int c=B.intValue();//convert bigInt to int 
        BigInteger C= new BigInteger("2234734");
        BigInteger X= new BigInteger("22347765776565643643634");

        //constants
        BigInteger D=BigInteger.TEN;

        //ADDITION
        BigInteger add= A.add(X);

        //multiply

        BigInteger m=C.multiply(X);
        //divide 
        BigInteger d=X.divide(C);
      //substract
        BigInteger s=C.subtract(X);
      //remainder
        BigInteger r=C.remainder(X);

        System.out.println(s);
        System.out.println(D);

        if(C.compareTo(X)<0){
            System.out.println("Yes");
        }

        System.out.println(Factorial.fact(100));
    }

    }

