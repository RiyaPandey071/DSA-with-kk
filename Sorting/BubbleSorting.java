import java.util.Arrays;
public class BubbleSorting {
   public static void main(String[] args) {
    int[] arr={1,-2,3,4,5};
    bubble(arr);
    System.out.println(Arrays.toString(arr));
      
   } 
   static void bubble(int[] arr){
    boolean swapped;
    for(int i=0;i<arr.length;i++){
        swapped=false;
       for(int j=i+1;j<arr.length-i;j++){
        if(arr[j]<arr[j-1]){
            int temp=arr[j];
           arr[j]=arr[j-1];
            arr[j-1]=temp;
            swapped=true;
        }
       } 
       if(!swapped){//swapped==trueOR!false=true
        break;
       }
    }
   } 
}
