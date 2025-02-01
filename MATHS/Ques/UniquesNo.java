public class UniquesNo {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,3,2,2,};
        int ans=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){

             sum+=arr[i];
        }
        ans+=sum%3;
System.out.println(ans); 
    }
}
