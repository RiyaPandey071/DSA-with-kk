package QUES;
public class FloorOfNumber {
    static int Floor(int [] arr,int target){

        int start=0;
        int end=arr.length -1;

        
        while(start<=end){
            int mid=start + (end-start)/2;
            
            if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                return mid;
            }

           
        }
        return end;
    }

    public static void main(String[] args) {
        int arr[]={10,11,12,14,15,17,18};
        int target=9;
        System.out.println(Floor(arr,target));
    }

}
