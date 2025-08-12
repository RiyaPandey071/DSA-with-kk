class Box{
    double l,h,w;
    Box(){
        this.l=-1;
        this.h=-1;
        this.w=-1;
    }
    Box(double side){
        this.l=side;
        this.h=side;
        this.w=side;
    }
    Box(double l,double h,double w){
        this.l=l;
        this.h=h;
        this.w=w;
    }
    Box(Box old){
        this.l=old.l;
        this.h=old.h;
        this.w=old.w;
    }
   public void information(){
    System.out.println("running the box..");
   }
}

 class BoxWeight extends Box{
    double weight;

    BoxWeight(){
        this.weight=-1;
    }
    BoxWeight(double l,double h,double w,double weight){
       super(l,h,w); //this call parent class constructor
       //used to initialise parent vlass constructor
       this.weight=weight;
    }
 }



public class Main {
   public static void main(String[] args) {
   // Box box1=new Box();
  //  Box box2=new Box(box1);
   // System.out.println(box1.l+" "+box1.h+" "+box1.w);
   //BoxWeight wt=new BoxWeight();
  // BoxWeight wt1=new BoxWeight(2,4,5,6);
//System.out.println(wt.h+" "+wt.weight);
Box box3=new BoxWeight(3,4,5,4);
System.out.println(box3.weight);

} 
}
