import java.io.*;


public class CopyFile {
    public static void main(String[] args) throws IOException
{
    FileInputStream fis = new FileInputStream("input.txt");
    InputStreamReader isr = new InputStreamReader(fis);
    BufferedReader br = new BufferedReader(isr);

    FileOutputStream fos = new FileOutputStream ("OUtput.txt");
      OutputStreamWriter osw = new OutputStreamWriter(fos);
      
        String s =" ";
    
      while((s=br.readLine())!=null)
      {
        
        osw.write(s + "\n");
        
      }
      br.close();
      osw.close();
     
      
      


}   
    
}
