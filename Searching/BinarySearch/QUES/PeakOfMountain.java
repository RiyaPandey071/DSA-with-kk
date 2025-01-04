package QUES;
public class PeakOfMountain {

    public static void main(String[] args) {
    }
      int search(int[] arr,int target){
        int peak=peakIndexInMountainArray(arr);
      int firstTry=orderagnosticBS(arr,target,0,peak);
      if(firstTry!=-1){
        return firstTry;
      } 
      return orderagnosticBS(arr,target,peak+1,arr.length-1);
    }
    static int peakIndexInMountainArray(int[] arr){
       
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
       
       
        static int orderagnosticBS(int [] arr,int target,int start,int end){
            
        boolean isASC;
        if(arr[start]<arr[end]){
            isASC=true;
        }
        else{ isASC=false;
            
        }
            while(start<=end){
            int mid=start+(end-start)/2;
        
            if(arr[mid]==target){
                return mid;
            }
            if(isASC){
                if(target<arr[mid]){
                    end =mid-1;
                 }
                 else if(target>arr[mid]){
                     start=mid+1;
                 }
            }
            else{
                if(target>arr[mid]){
                    end =mid-1;
                 }
                 else if(target<arr[mid]){
                     start=mid+1;
                 }
            }
          }
          return -1;
           
        }
}
