public class Wrapper {
    public static void main(String[] args) {
        //int a=10;
        //  int b=32;
        //Integer num=45;  // Integer num=new Integer(45);
        Integer a=10;
        Integer b=32;
          
final int d=23;//u cant modify final keyword
//d=23;
       
      
       swap(a,b);
       System.out.println(a+"   "+b); 
    }
    static void swap(Integer a,Integer b){
        Integer temp=a;
        a=b;
        b=temp;
    }
}
