import java.util.Scanner;
class digits {
    static int findNumbers(int[] nums) {
        int count = 0;
        for(int i:nums){
            if(((int)Math.log10(i)+1)%2==0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int [] arr= new int[6];
        System.out.println("enter the array element: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }

        System.out.println(findNumbers(arr));
    }
}