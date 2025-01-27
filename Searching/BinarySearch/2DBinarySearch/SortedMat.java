public class SortedMat {
    public static void main(String[] args) {
        
    }

    static int binarySearch(int [] arr,int target){
        int start=0;
        int end=arr.length -1;
        while(start<=end){
          int mid=start+(end-start)/2;
  
          if(target<arr[mid]){
             end =mid-1;
          }
          else if(target>arr[mid]){
              start=mid+1;
          }
          else{
              return mid;
          }
        }
        return -1;  
      }

      static int search(int[][] matrix,int target){
        for(int i=0;i<matrix.length-1;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][0]<=target && target<=arr[i][matrix.length-1]){
                binarySearch()
                }
            }
        }
      }
  }
    
}
