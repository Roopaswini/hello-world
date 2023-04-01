

public class alphabets {
    
    public static void main(String[] args) {

        char ch;

        for(ch = 'D'; ch <= 'Z'; ch++) {
            if(ch != 'D')
            {
                System.out.print(", ");
            }
            System.out.print(ch);
        }
    }
}
