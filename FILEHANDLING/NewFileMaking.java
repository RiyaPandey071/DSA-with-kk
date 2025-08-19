import java.io.*;

public class NewFileMaking {
    public static void main(String[] args) {
      //create
        // try {
        //   File fo =new File("new- File.txt");
        //   fo.createNewFile(); 
        // } catch (IOException e) {
        //     System.out.println(e.getMessage());
        // }

        //write opn file
        try{
            FileWriter fw=new FileWriter("new-File.txt");
            fw.write("कर्मण्येवाधिकारस्ते मा फलेषु कदाचन।\r\n" +
                                "मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्मणि॥");
            fw.close();
             } catch (IOException e) {
             System.out.println(e.getMessage());

            
            
        }
         //read from file
  try(var br=new BufferedReader(new FileReader("new-File.txt"))){
           
        while(br.ready()){
         System.out.println(br.readLine());
            
         }   

        }
         catch(IOException e){
         System.out.println(e.getMessage());
         }
         //delete
          try {
        File fo =new File("new- File2.txt");
           fo.createNewFile(); 
           if(fo.delete()){
            System.out.println(fo.getName());
           }
         } catch (IOException e) {
             System.out.println(e.getMessage());
         }

    }
}
