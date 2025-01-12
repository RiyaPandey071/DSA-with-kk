import java.util.Arrays;
import java.util.Scanner;

public class MissingNumber { 
    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       int[] arr=new int[5];
       for(int i=0;i<5;i++){
       arr[i]=in.nextInt(); }
       missingNumber(arr);
       System.out.println(Arrays.toString(arr)); 
 
    }
     static int missingNumber(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct=nums[i];
            if(nums[i]<nums.length&&nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index){
                return index;
            }
        }
        return nums.length;
    }
    static void swap(int[] arr,int first,int second){
       int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
     }}


       