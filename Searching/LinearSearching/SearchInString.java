import java.util.Scanner;

public class SearchInString {

    static boolean search(String str,char target){
            if(str.length()==0){
                return false;
            }
    
            for(int i=0;i<str.length();i++){
                if(target==str.charAt(i)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        System.out.println("enter the string:");
        String str=in.next();
        
                
            
        char target= 'a';

        System.out.print("does element "+"'"+target+"'"+" is present: ");
        
        System.out.println(search(str,target));
    }


    
}
