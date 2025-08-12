public class Shapes {
  void area(){
    System.out.println("Get Area...");
    
  }  
 final void perimeter() { //final keyword prevent from overriding
    System.out.println("Get Perimeter..");

  }
}
class Circle extends Shapes{
    void area(){
        int side=7;
        System.out.println(side*side);
    }
}
    class Main{
        public static void main(String[] args) {
            
        
Circle ob=new Circle();
    ob.area();
    }
    }
//static method can be inherited but do not override them coz they are not dependent on object