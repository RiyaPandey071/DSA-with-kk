public class FindUnique {
    public static void main(String[] args) {
      //every no appear twice find the unique no
      int[] arr={1,2,3,3,1};
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
//After completing all iterations, the value of count is 3, which is the unique number in the array.