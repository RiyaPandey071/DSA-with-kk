import java.text.DecimalFormat;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        //constructor 1
        StringBuffer sb=new StringBuffer();
        System.out.println(sb.capacity());

        //constructor 2
        StringBuffer sb2=new StringBuffer("RIYA PANDEY");

        //constructor 3
        StringBuffer sb3=new StringBuffer(30);
System.out.println(sb3.capacity());


        sb.append("WeMakeDays");
        sb.append(" nice");

        // sb.insert(2," Riya ");

        sb.replace(2,6," Pandey");
        sb.delete(2,6);
        sb.reverse();


         String str=sb .toString();
        System.out.println(str);
        
    //     Random random=new Random();
    //     System.out.println(random.nextFloat());

    //  System.out.println((char)(97+1));

    int n=20;
    String name=RandomString.generate(n);
    System.out.println(name);

    //removing whitespaces

    String sentence="we are too good at this";
    System.out.println(sentence);

    System.out.println(sentence.replaceAll(" ",""));
    System.out.println(sentence.replaceAll("a",""));

    //split
    String arr="DO what you want ";
    String[] names =arr.split(" ");
    System.out.println(Arrays.toString(names)); 

    //rounding off
    DecimalFormat df=new DecimalFormat("00.0000");
    System.out.println(df.format(7.29));
   }
}
