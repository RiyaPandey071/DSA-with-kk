import java.util.ArrayList;
public class Fcators {
    public static void main(String[] args) {
     
        facts3(36); 
    }
    static void facts(int n){
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
    static void facts2(int n){
        for(int i=1; i<=Math.sqrt(n) ;i++){

            if(n%i==0){
                if(n/i==i){
                    System.out.println(i+" ");
                }
                else{
                System.out.print(i+" "+n/i+" ");}
            }
        }
    }
    static void facts3(int n){
ArrayList<Integer> list=new ArrayList<>();
        for(int i=1; i<=Math.sqrt(n) ;i++){

            if(n%i==0){
                if(n/i==i){
                    System.out.print(i+" ");
                }
                else{
                System.out.print(i+" ");
            list.add(n/i);}
            }
        }
for(int i=list.size()-1; i>=0;i--){
    System.out.print(list.get(i)+" ");
}


    }

   
}
