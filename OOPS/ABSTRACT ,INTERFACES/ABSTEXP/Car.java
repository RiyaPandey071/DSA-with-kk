package p2;
public class Car implements Engine, Brake {
    public void brake(){
        System.out.println("I brake like a normal car");

    }


    public void start(){
        System.out.println("I start like a noramal car");
    }
   
    public void stop(){
        System.out.println("I stop like a noramal car");
    }
    public void acc(){
        System.out.println("I accelerate like a noramal car");
    }
   
}
