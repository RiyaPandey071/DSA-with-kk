public class StepReduce {
   public static void main(String[] args) {
    
    int num=7;
    System.out.println(numberOfSteps(num));
    
    }
    static int numberOfSteps(int num) {
        return helper(num,0);
   
   }
    static int helper(int num,int steps){
        if(num==0){
             return steps;
        }
    
        if(num%2==0){
            return helper(num/2,steps+1);
    
        }
        return helper(num-1,steps+1);
    }
   } 

