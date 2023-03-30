import java.util.Scanner;

public class ao {

    public static void main(String[] args) {

        try (Scanner user_input = new Scanner(System.in)) {
            int num1, num2;
            System.out.print("Enter two numbers : ");
            num1=user_input.nextInt();
            num2=user_input.nextInt();
            System.out.print("\nAddition :"+(num1+num2));
            System.out.print("\nSubtraction :"+(num1-num2));
            System.out.print("\nMultiplication :"+(num1*num2));
            System.out.print("\nDivision :"+(num1/num2));
            System.out.print("\nModulo :"+(num1%num2));
        }
    }
}
