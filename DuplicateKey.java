
import java.util.*;
import java.io.*;

public class DuplicateKey {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integers");
        String str = sc.nextLine();
        String[] st = str.split("\\s+");
        
        int[] num = new int[st.length];
        boolean hasDuplicate = false ;
        for (int i = 0; i < st.length; i++) {
            try {
                num[i] = Integer.parseInt(st[i]); 
            } catch (NumberFormatException e) {
                System.err.println("Invalid input: " + st[i]);
                return;
            }

            for (int j = 0; j < i; j++) { 
                if (num[i] == num[j]) {
                    hasDuplicate = true;
                    break;
                }
            }

            if (hasDuplicate) {
                System.err.println("Duplicate no: " + num[i]);
                break;
            }
        }

        if (!hasDuplicate) {
            System.out.println("No duplicate numbers!");
        }
    }
    
}
