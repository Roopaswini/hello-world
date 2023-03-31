
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class scanner {
    
    public static void main(String[] args) throws FileNotFoundException {
        //String fileName = "C:/users/John/Desktop/example.txt";

        String fileName = "example.txt";
        File textfile = new File(fileName);

        Scanner in = new Scanner(textfile);
            String value = in.nextLine();
            System.out.println("Read value: " + value);
            
            int count = 2;
            while(in.hasNextLine()) {
                String line = in.nextLine();

                System.out.println(count + ": " + line);
                count++;
                    
            }
        in.close();
    }
}
 
