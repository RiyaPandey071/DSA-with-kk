import java.util.Scanner;
public class Min_Max {
    static void min(int [] arr){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }

        }
        System.out.println("min element is: "+min);
    }

    static void max(int [] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }

        }
        System.out.println("max element is: "+max);
    }


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr=new int[6];
        System.out.println("enter the array element:");
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }

        min(arr);
        max(arr);
    }
}
