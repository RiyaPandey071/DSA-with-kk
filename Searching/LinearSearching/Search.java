import java.util.Scanner;

public class Search {

    static int search(int [] arr, int target){
        if(arr.length==0){
            return -1;
        }

        for(int i=0;i<arr.length;i++){
           
            if(target==arr[i]){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
int [] arr=new int[6];
System.out.println("enter the arr element: ");
for(int i=0;i<arr.length;i++){
     arr[i]=in.nextInt();
    
}
System.out.println("enter the element to search: ");
int target=in.nextInt();
int ans=search(arr,target);
System.out.print("ans: "+ans);
    }
    
}
