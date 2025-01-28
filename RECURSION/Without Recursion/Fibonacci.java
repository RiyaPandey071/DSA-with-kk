public class Fibonacci {
    
        public static void main(String[] args) {
            int n = 10; // number of terms
            int[] fibSequence = new int[n+1];
            
            if (n >0) {
                fibSequence[0] = 0;;
            }
            if (n > 1) {
                fibSequence[1] = 1;
            }
            
            for (int i = 2; i <=n; i++) {
                fibSequence[i] = fibSequence[i - 1] + fibSequence[i - 2];
            }
            
            // Print the Fibonacci sequence
            for (int i = 0; i <= n; i++) {
                System.out.print(fibSequence[i] + " ");
            }
        }
    }
     
