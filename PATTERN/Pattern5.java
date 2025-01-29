

public class Pattern5 {
  public static void main(String[] args) {
    pattern(9);
  }  
  static void pattern(int n){
    for(int row=1;row<=2*n;row++){
      int totalcolsInrow=row>n? 2*n-row-1:row;
        for(int col=1;col<totalcolsInrow;col++){
            System.out.print("+ ");
        }
        System.out.println();
    }
 }   
}
 