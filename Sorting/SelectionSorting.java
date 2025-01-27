import java.util.Scanner;
import java.util.Arrays;
public class SelectionSorting {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       int[] arr=new int[5];
       for(int i=0;i<5;i++){
       arr[i]=in.nextInt(); }
       Selection(arr);
       System.out.println(Arrays.toString(arr));
    }

    static void Selection(int[] arr){
      //find  the max item in the remaining array and swap with correct index
      for(int i=0;i<arr.length;i++){
      int last= arr.length-i-1;
      int maxIndex=getMaxIndex(arr,0,last); 
      swap(arr,maxIndex,last);}
       
            }
            static void swap(int[] arr,int first,int second){
               int temp=arr[first];
               arr[first]=arr[second];
               arr[second]=temp;
            }

    static int getMaxIndex(int [] arr,int start,int end){
int max=start;
for(int i=start;i<=end;i++){
    if(arr[max]<arr[i]){
        max=i;
    }
   
}
return max;
  }


        }
    

