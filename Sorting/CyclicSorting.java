import java.util.Arrays;
import java.util.Scanner;

public class CyclicSorting {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       int[] arr=new int[5];
       for(int i=0;i<5;i++){
       arr[i]=in.nextInt(); }
       Cyclic(arr);
       System.out.println(Arrays.toString(arr)); 

    }

    static void Cyclic(int[] arr){
        int i=0;
        while(i<arr.length){
           int correct= arr[i]-1;
            if(arr[i]!=arr[correct]){
               swap(arr,i,correct); 
            }
            else{
                i++;
            }
        }
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
     }
}
