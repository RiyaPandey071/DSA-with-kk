package package1.Main;
public class Human {
  int age;
  String name;
  int salary;
  boolean married;
  static long population;
  
  
  public Human(int age, String name,int salary,boolean married){
    this.age=age;
    this.name=name;
    this.salary=salary;
    this.married=married;
    Human.population++;
  }
  public static void main(String[] args) {
    Human riya=new Human(22,"Riya",1000,false);
    Human rahul=new Human(23,"Rahul",1000,true);
   



System.out.println(riya.population);
System.out.println(rahul.population);

} 
  
}
