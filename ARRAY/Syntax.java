import java.util.Scanner;
import java.util.Arrays;
public class Syntax {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
      //  int [] arr=new int[5];
       //for(int i=0;i<arr.length;i++){
        //arr[i]=in.nextInt();
       
    
      // for(int i=0;i<arr.length;i++){
       //System.out.print(arr[i]+" ");
    //   }

    //for(int num:arr){
//System.out.print(num+" ");
   // }
   //System.out.println(Arrays.toString(arr));
   
   
  
  // String[] str=new String[4];
   //for(int i=0; i<str.length;i++){
   // str[i]=in.next();
   //}
   //System.out.println(Arrays.toString(str));
   //str[3]="riya";
   //System.out.println(Arrays.toString(str));
int [][] arr=new int[3][3];

for(int row=0;row<arr.length;row++){
    for(int col=0;col<arr[row].length;col++){
        arr[row][col]=in.nextInt();
    }
}

//for(int row=0;row<arr.length;row++){
   // for(int col=0;col<arr[row].length;col++){
     //  System.out.print(arr[row][col]+" ");
    //}
    //System.out.println();
//}

//for (int row=0;row<arr.length;row++){
    //System.out.println(Arrays.toString(arr[row]));
//}


for(int [] a:arr){
    System.out.println(Arrays.toString(a));
}

}}
