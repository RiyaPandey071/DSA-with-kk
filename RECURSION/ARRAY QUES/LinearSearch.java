import java.util.ArrayList;
public class LinearSearch {
   public static void main(String[] args) {
    int[] arr={1,2,4,4,5,78,9,0};
    
    System.out.println(search(arr,4,0));
    System.out.println(findIndex(arr,4,0));
    System.out.println(findIndexLast(arr,4,arr.length-1));
    findIndexx(arr,4 ,0);
    System.out.println(list);
    ArrayList<Integer> ans=find(arr,4,0,new ArrayList<>());
   System.out.println(ans);
  System.out.println(searchList(arr,4,0));


} 
static boolean search(int[] arr, int target, int index){
   if(index==arr.length){
    return false;
   } 
    return  arr[index]==target||search(arr,target,index+1);
}



//return the index
static int findIndex(int[] arr, int target, int index){
   if(index==arr.length){
    return -1;
   } 
   if(arr[index]==target){
    return index;
   }
    return  findIndex(arr,target,index+1);
}


//start from last index
static int findIndexLast(int[] arr, int target, int index){
   if(index==-1){
    return -1;
   } 
   if(arr[index]==target){
    return index;
   }
    return  findIndexLast(arr,target,index-1);
}




//add in list
static ArrayList<Integer> list=new ArrayList<>();
static void findIndexx(int[] arr, int target, int index){
   if(index==arr.length){
    return ;
   } 
   if(arr[index]==target){
    list.add(index);
   }
     findIndexx(arr,target,index+1);
}


//return a list ,by taking in arguement 
static ArrayList find(int[] arr, int target, int index,ArrayList<Integer> list ){
   if(index==arr.length){
    return list;
   } 
   if(arr[index]==target){
    list.add(index);
   }
    return find(arr,target,index+1,list);
}



//return list ,by taking in body
static ArrayList searchList(int[] arr,int target,int index){
   ArrayList<Integer> list=new ArrayList<>();
   if(index==arr.length){
      return list;
     } 
     //this will contain ans for that function call only
     if(arr[index]==target){
      list.add(index);
     }
      ArrayList<Integer> ansFromBelowCalls=searchList(arr,target,index+1);
      list.addAll(ansFromBelowCalls);
return list;

}

}
