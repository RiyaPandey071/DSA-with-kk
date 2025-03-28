import java.util.ArrayList;

public class SubSequence {
  public static void main(String[] args) {
    subseq("","abc");
   //2approach 
    ArrayList<String> sub = new ArrayList<>();
    subseq("", "abc", sub);
    System.out.println(sub);

    //3rd 
   System.out.println(subseqRet("","abc"));
  }
  
  static void subseq(String p, String up){
    if(up.isEmpty()){
        System.out.println(p);
        return ;
    }

    char ch=up.charAt(0);

    subseq(p+ch,up.substring(1));
    subseq(p,up.substring(1));
   
  }
  static void subseq(String p, String up,ArrayList<String> result){
    
    
    if(up.isEmpty()){
       // System.out.println(p);
       result.add(p);
        return  ;
    }

    char ch=up.charAt(0);

   subseq(p+ch,up.substring(1),result);
    subseq(p,up.substring(1),result);
  
  }

  static ArrayList<String> subseqRet(String p, String up){
    if(up.isEmpty()){
       ArrayList<String> list= new ArrayList<>();
       list.add(p);
       return list;
    }

    char ch=up.charAt(0);

    ArrayList<String> left= subseqRet(p+ch,up.substring(1));
    ArrayList<String> right=subseqRet(p,up.substring(1));
   left.addAll(right);
   return left;
  }


}
