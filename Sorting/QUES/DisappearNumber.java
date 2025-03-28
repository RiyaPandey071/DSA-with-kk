import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class DisappearNumber {

    public static void main(String[] args) {
       int [] arr={4,3,2,7,8,2,3,1};
       System.out.println(findDisappearedNumbers(arr));
       //System.out.println(Arrays.toString(arr));  
    }
    static List<Integer> findDisappearedNumbers(int[] nums) {
     int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i] != nums[correct] &&nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }
        List<Integer> ans=new  ArrayList<>();
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index+1){
                ans.add(index+1);
            }
        }
        return ans;
    }
    static void swap(int[] arr,int first,int second){
       int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp; 
     }
}
