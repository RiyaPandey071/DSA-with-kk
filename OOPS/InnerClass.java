public class InnerClass {
    static class Test{
        String name;
        public Test(String name){
            this.name=name;
        }
    }

    public static void main(String[] args) {
        Test a=new Test("Riya");
        Test b=new Test("riyuu");
        
System.out.println(a.name);
System.out.println(b.name);
    }
}
 