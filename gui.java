import java.util.Scanner;

public class gui {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a line of text: ");

        String line = sc.nextLine();

        System.out.println("You entered: " + line);
    }
}
