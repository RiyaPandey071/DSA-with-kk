public class SwapAdjacentPair {
    public static void main(String[] args) {
        String word="riya";
        char[] newword=word.toCharArray();
      for(int i=0;i<newword.length-1;i+=2){
       swap(newword,i,i+1);
      }
      System.out.println(new String(newword));  
    }
    static void  swap(char[] array,int a,int b){
            char temp=array[a];
            array[a]=array[b];
            array[b]=temp;
    }
    
}
