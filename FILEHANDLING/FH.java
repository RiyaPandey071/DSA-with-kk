
import java.io.*;
public class FH {
    public static void main(String[] args) {
        //convert byte stream into char stream
        // try(InputStreamReader isr=new InputStreamReader(System.in))  {
        //     System.out.print("ENter some letters: "); 
        //     int letters=isr.read();
        //     while(isr.ready()){
        //         System.out.println((char)letters);
        //         letters=isr.read();
        //     }
        //     isr.close();
        //     System.out.println();
        // } catch (IOException e) {
        //     System.out.println(e.getMessage());
        // }
        // try(FileReader fr=new FileReader("note.txt"))  {
        //     System.out.print("ENter some letters: "); 
        //     int letters=fr.read();
        //     while(fr.ready()){
        //         System.out.println((char)letters);
        //         letters=fr.read();
        //     }
        //     fr.close();
        //     System.out.println();
        // } catch (IOException e) {
        //     System.out.println(e.getMessage());
        // }

       
        // //byte to char stream and then reading char stream
        // try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
            
        // System.out.println("You typed: "+br.readLine()); 

        // }
        // catch(IOException e){
        // System.out.println(e.getMessage());
        // }


        // try(BufferedReader br=new BufferedReader(new FileReader("note.txt"))){
           
        //  while(br.ready()){
        //    System.out.println(br.readLine());
            
        //  }   

        // }
        // catch(IOException e){
        // System.out.println(e.getMessage());
        // }

         //output
        // OutputStream os=System.out;
        // // os.write(🤪); range is exceeded


        // System.out.println();

        // try(OutputStreamWriter osw=new OutputStreamWriter(System.out)){
        //     osw.write("Hello Riya!!");
        //     osw.write(87);
        //     osw.write(10);
        //     osw.write('A');
        //     osw.write('\n');
        //     char[] arr="hello world".toCharArray();
        //     osw.write(arr);
        //     //os.write(🤪);

        // }catch(IOException e){
        // System.out.println(e.getMessage());
        // }
        // try(FileWriter fw=new FileWriter("note.txt")){
        //     fw.write("Hello Riya!!");
            

        // }catch(IOException e){
        // System.out.println(e.getMessage());
        // }
        //append
        // try(FileWriter fw=new FileWriter("note.txt",true)){
        //     fw.write("this file is appended ");
            

        // }catch(IOException e){
        // System.out.println(e.getMessage());
        // }
        try(BufferedWriter bw=new BufferedWriter(new FileWriter("note.txt"))){
            bw.write("Hare Krishna ");
            

        }catch(IOException e){
        System.out.println(e.getMessage());
        }
    }
}
 