

public class FiboFormula {
    public static void main(String[] args) {
        int n=50;
        for(int i=0;i<n;i++){
            System.out.println(fiboformula(i));
        }
    }
    static int fiboformula(int n){
        //return (int)((Math.pow(((1+Math.sqrt(5))/2),n)-Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5));
        return (int)((Math.pow(((1+Math.sqrt(5))/2),n)/Math.sqrt(5)));
    }
}
