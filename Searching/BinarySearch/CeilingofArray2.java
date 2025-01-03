public class CeilingofArray2 {
    static int ceiling(int [] arr,int target){

        int start=0;
        int end=arr.length -1;


        if(target>arr[arr.length-1]){
            return -1;
        }
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
        return start;
    }

    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,7,8,9 };
        int target =6;
        System.out.println(ceiling(arr,target));
    }
}
