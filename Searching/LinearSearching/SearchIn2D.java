import java.util.Scanner;
import java.util.Arrays;
public class SearchIn2D {

    static int[] search(int [][] arr,int target){
        for(int r=0;r<arr.length;r++){
            for(int c=0;c<arr[r].length;c++){
                if(arr[r][c]==target){
                    return new int[]{r,c};
                }
            }
        }
        return new int[]{-1,-1};

        }


        public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            int [][] arr=new int[3][3];
            for(int r=0;r<arr.length;r++){
                for(int c=0;c<arr[r].length;c++){
                 arr[r][c]=in.nextInt();   
        }
    }
    int target=in.nextInt();
int [] ans=search(arr,target);
   System.out.println(Arrays.toString(ans));
    
}}
