
import java.util.Scanner;
public class EvenDigit {

    static int findNumbers(int [] nums){
        int count=0;
        for(int num: nums){
            if(Even(num)){
                count++;
            }
        }
        return count;
    }

    static boolean Even(int num){
      int nod = digits(num);
      if(nod%2==0){
        return true;
      }
      return false;
    }

    static int digits(int num){
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
     return count;
    }

    //static int digits(int num){
      //  if(num<0){
          //  num=num*-1; //for negative no
       // }
       // return (int)(Math.log10(num))+1;    }

   
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
