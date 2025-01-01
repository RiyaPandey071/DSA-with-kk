import java.util.Scanner;

public class SearchInRange {
    
    static int  search(int[] arr, int target,int start,int end ){
    if(arr.length==0){
        return -1;
    }

    for(int i=start;i<arr.length;i++){
        if(arr[i]==target){
            return i;
        }

        
    }return -1;
}

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int [] arr=new int[9];

        System.out.println("enter the arr element:");
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }

        System.out.println("enter the range:");
        int s=in.nextInt();
        int e=in.nextInt();

        System.out.println("enter the target to search:");
        int target=in.nextInt();

        System.out.println(search(arr,target,s,e));
    }
}
