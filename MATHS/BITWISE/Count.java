public class Count {
    public static void main(String[] args) {
      int[] arr={1,2,3,6,2,1,6,8,3};
      System.out.println(count(arr));  
    }
    static int count(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            count^=arr[i]; 
        }
        return count;
    }
    
}
