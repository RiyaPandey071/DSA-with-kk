 import java.util.Arrays;
 public class FlipImage {
    public static void main(String[] args) {
        int[][] image={{0,0,1},{1,0,1},{1,1,1}};
     int[][] ans=flipAndInvertImage(image); 
     System.out.println(Arrays.deepToString(ans));



     // for (int[] row : flippedImage) {
        //for (int pixel : row) {
          //  System.out.print(pixel + " ");
       // }
       // System.out.println();
    //}
//}
   
    }
   
        static int[][] flipAndInvertImage(int[][] image) {
           //reverse an array 
           for(int[] row:image){
            for(int i=0;i<(image[0].length+1)/2;i++){
                //swap
                int temp=row[i]^1;
                row[i]=row[image[0].length-i-1]^1;
                row[image[0].length-i-1]=temp;
            }
           } 
           return image;
        }
    } 

