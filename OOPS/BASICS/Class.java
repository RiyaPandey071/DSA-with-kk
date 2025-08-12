import java.util.Arrays;
public class Class {
   
        public static void main(String[] args) {
         
     
        // Student[] students= new Student[5];
    // System.out.println(Arrays.toString(students));
     
        Student kunal=new Student(13,"Riya Pandey",99);
        //kunal.names="RIYAPandey";
    //kunal.rno=14;
      //  kunal.marks=100;
        System.out.println(kunal.name);
        System.out.println(kunal.rno);
        System.out.println(kunal.marks);

    Student random=new Student(kunal);
System.out.println(random.name);


Student random2=new Student();
System.out.println(random2.name);

Student one=new Student();
Student two=one;
one.name="somethhg vfvtrtrtr";
System.out.println(two.name);

    } 
    
    }
        class Student{
         int rno;
         String name; ;
         float marks;

//Student(){
    //this.rno=13;
  //  this.name="Riya";
   // this.marks=100;
//}
Student(Student other){
    this.rno=other.rno;
    this.name=other.name;
    this.marks=other.marks;
}
// Student arpit=new Student(14,"Riya",87);
//hrer, this will be replaced with arpit
Student(int rno,String name,int marks){
    this.rno=rno;
   this.name=name;
    this.marks=marks;
}

Student(){
    this(13,"riiru",89);
}


        }
     
     

