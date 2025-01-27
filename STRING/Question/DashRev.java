import java.util.Scanner;
public class DashRev {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the word: ");
       
       String word=in.next();
        StringBuilder newword= new StringBuilder();
        for(int i=word.length()-1;i>=0;i--){
            newword.append(word.charAt(i));
            if(i!=0){
                newword.append("-");
            }
        }
        System.out.println(newword);
        }
    }
    

