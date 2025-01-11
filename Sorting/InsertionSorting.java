import java.util.Arrays;
import java.util.Scanner;
public class InsertionSorting {
    public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
       int[] arr=new int[5];
       for(int i=0;i<5;i++){
       arr[i]=in.nextInt(); }
       Insertion(arr);
       System.out.println(Arrays.toString(arr));
    }
    static void Insertion(int[] arr){
        for(int i=0;i<arr.length-1;i++){ //or i<=arr.length-2
 for(int j=i+1;j>0;j--){
    if(arr[j]<arr[j-1]){
        swap(arr,j,j-1);
    }else{
        break;
    }
 }
        }
    }

    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
     }
}
