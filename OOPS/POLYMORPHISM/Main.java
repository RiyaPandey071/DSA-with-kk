class Shapes {
   void area(){
    System.out.println("Get Area...");

   } 
}
class Circle extends Shapes{
void area(){
    int r=2;
    System.out.println("Area= "+3.14*r*r);
}
}

class Square extends Shapes{
void area(){
    int side=4;
    System.out.println("Area= "+side*side);
}
}
class Main{
    public static void main(String[] args) {
        Square s=new Square();
        s.area();
    }
}