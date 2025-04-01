import java.util.Scanner;
public class Password {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter first name: ");
        String firstName=in.next();
        System.out.println("enter last name: ");
        String lastName=in.next();
        System.out.println("enter age: ");
        String age=in.next();
        
        System.out.println("enter middleName: ");
        String middleName=in.next();
       char ls= lastName.charAt(0);
       char lls=lastName.charAt(lastName.length()-1);
       char fa=age.charAt(0);
       char fn=firstName.charAt(0);
       char lfn=firstName.charAt(firstName.length()-1);
       char la=age.charAt(age.length()-1);
       char mn=middleName.charAt(0);
      char lmn= middleName.charAt(middleName.length()-1);

      String password= ""+ls+lls+fa+fn+lfn+la+mn+lmn;

        System.out.println("Password: "+password   );

    }
}
