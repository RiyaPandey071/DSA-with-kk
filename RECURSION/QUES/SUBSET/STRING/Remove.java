package SUBSET.STRING;
public class Remove {
  public static void main(String[] args) {
    String x="acdfhvhgjcad";
    System.out.println(Word(x));
    //skip("","baccdah");  
    System.out.println(skip("baccdah"));
    System.out.println(skipApple("   bacapplecdah"));  
  }  


static void Wordd(String name){
    StringBuilder ans=new StringBuilder();
    for(int i=0;i<name.length();i++){
    if(name.charAt(i)!='a'){
        ans.append(name.charAt(i));
    }}
    //System.out.println(ans);
    
}
static String Word(String name){
    StringBuilder ans=new StringBuilder();
    for(int i=0;i<name.length();i++){
    if(name.charAt(i)!='a'){
        ans.append(name.charAt(i));
    }}
    
    String result=ans.toString();
    return result;
}

static void skip(String p,String up){
  if(up.isEmpty()){
    System.out.println(p);
    return;
  }
  char ch=up.charAt(0);

  if(ch=='a'){
    skip(p,up.substring(1));
  }
  else{
    skip(p+ch,up.substring(1));
  }
}
static String skip(String up){
  if(up.isEmpty()){
    
    return "";
  }
  char ch=up.charAt(0);

  if(ch=='a'){
   return skip(up.substring(1));
  }
  else{
    return ch+skip(up.substring(1));
  }
  
}
static String skipApple(String up){
  if(up.isEmpty()){
    
    return "";
  }
  

  if(up.startsWith("apple")){
   return skipApple(up.substring(5));
  }
  else{
    return up.charAt(0)+skipApple(up.substring(1));
  }
  
}







}