public class Sorted {
    public static void main(String[] args) {
      int arr[]={1,2,9,5,6,8};
      System.out.println(sortedorNot(arr,0));  
    }
    static boolean sortedorNot(int[] arr ,int index){
       //base condition  
       if(index==arr.length-1){
         return true;
       } 
       return arr[index]<arr[index+1] && sortedorNot(arr,index+1);
    }
}
