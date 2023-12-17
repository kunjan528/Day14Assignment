import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountFileInput {
    public static void main(String args[]) throws IOException
    {
        FileInputStream fio = new FileInputStream("input.txt");
        InputStreamReader isr = new InputStreamReader(fio);
        BufferedReader br = new BufferedReader(isr);

        String s ;
        int p_Count = 0;
        int char_Count = 0;
        int word_count = 0;
        int line_count = 0 ;
        

        while((s = br.readLine()) != null)
        {
            if(s.equals(""))
            {
                p_Count +=1;
            }
            else{
                char_Count +=s.length();
                String Words[] = s.split("\\s+");
                word_count += Words.length;
                String line[] = s.split("[!?.:]+");
                line_count += line.length;



            }
        }
        System.out.println("Word count:"+word_count);
        System.out.println("lines count :"+line_count);
        System.out.println("Character count :"+char_Count);
    }
    
}
