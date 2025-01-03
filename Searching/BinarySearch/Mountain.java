public class Mountain {
    public static void main(String[] args) {
        int arr[]={1,2,1,0};
        System.out.println(peakIndexInMountainArray(arr));
    }
    
        static int peakIndexInMountainArray(int[] arr) {
            //int ans=0;
         // for(int i=1;i<arr.length-1;i++){
            //if(arr[i]>arr[i-1]&&arr[i]>arr[i+1]){
                //ans= i;
            //}
        //}
           //return ans; 
        //}
        int start=0;
      int end=arr.length -1;
      while(start<end){
        int mid=start+(end-start)/2;

        if(arr[mid]>arr[mid+1]){
           end =mid;
        }
        else{
            start=mid+1;
        }
       
      }
      return start;  
    }
    }
    

