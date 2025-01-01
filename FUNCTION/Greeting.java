

public class Greeting {


static String greet(){
    String greeting ="hello!! ,how are you?";
    return greeting;
}


static String greet2(String msg){
String message="riya"+ msg;
return message;
}

  public static void main(String[] args) {
    System.out.println("message: "+greet());
    System.out.println(greet2("how are u?"));
  }  
}
