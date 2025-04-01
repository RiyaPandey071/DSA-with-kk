public class Comparison {
    public static void main(String[] args) {
//when both pointing toward same value
        String a="Riya";
        String b="Riya";
        //==
        System.out.println(a==b);

        //when both contain different value
        //when u only need  to check value use .equal
        String name1=new String("Riya");
        String name2=new String("Riya");
System.out.println(name1 == name2);

System.out.println(name1.charAt(0));
    }
}
