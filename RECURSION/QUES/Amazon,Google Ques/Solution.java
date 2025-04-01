class Solution {
    public static void main(String[] args) {
        
    
    
        // Code Here
        int arr[]={2,4,3,22,1};
      int ans=second_max(arr);
      System.out.println(ans);
        
    }
    static int max(int[] arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
            
        }
        return max;
    }
    
    static int second_max(int[] arr){
        
       int secmax=0;
       
        for(int i=0;i<arr.length;i++){
            if(secmax<max(arr)&& secmax>arr[i]){
                secmax=arr[i];
            }
             
        }
       
        
        if(secmax==max(arr)){
            return -1;
        }
        return secmax;
    }
}