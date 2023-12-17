import java.util.Scanner;
import java.io.*;

public class NoMatch
{
    public static void main(String[] args) throws NoMatchException
    {
        String s3 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        s3= sc.nextLine();

        try
        {
            if(!"india".equalsIgnoreCase(s3))
                throw new NoMatchException("String Not Matched.");
            else
            {
                System.out.println("String Matched.");
            }
        }
            catch(NoMatchException e)
            {
                System.out.println(e);
            }
        }
    }
