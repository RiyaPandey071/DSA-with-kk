package QUES;
public class CeilingOfArray {

    static int ceilingofNumber(int [] arr,int target){
        int ans=0;
        for(int i=0;i<arr.length;i++){
           if(arr[i]>=target){
             ans=arr[i];
             break;
           } 
        }
        return ans;
    }
    static int floorONumber(int [] arr,int target){
        int ans2=0;
        for(int i=0;i<arr.length;i++){
           if(arr[i]<=target){
             ans2=arr[i];
             
           } 
        }
        return ans2;
    }

    

    public static void main(String[] args) {
        int [] arr={1,2,4,5,7,8,9};
        int target=6;
        int ans=ceilingofNumber(arr,target);
        System.out.println(ans);
        int ans2= floorONumber(arr,target);
        System.out.println(ans2); 
    }
    
}
