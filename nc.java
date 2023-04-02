import java.util.Scanner;

public class nc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Print numeric series");
            System.out.println("2. Print char series");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    printNumericSeries(scanner);
                    break;
                case 2:
                    printCharSeries(scanner);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        } while (choice != 3);
        scanner.close();
    }

    private static void printNumericSeries(Scanner scanner) {
        System.out.print("Please provide series limits: ");
        String input = scanner.next();
        String[] limits = input.split("-");
        int start = Integer.parseInt(limits[0]);
        int end = Integer.parseInt(limits[1]);
        if (start > end) {
            System.out.print("(");
            for (int i = start; i >= end; i--) {
                System.out.print(i + (i == end ? ")" : ","));
            }
        } else {
            System.out.print("(");
            for (int i = start; i <= end; i++) {
                System.out.print(i + (i == end ? ")" : ","));
            }
        }
        System.out.println();
    }

    private static void printCharSeries(Scanner scanner) {
        System.out.print("Please provide series limits: ");
        String input = scanner.next();
        String[] limits = input.split("-");
        char start = limits[0].charAt(0);
        char end = limits[1].charAt(0);
        if (start > end) {
            System.out.print("(");
            for (char i = start; i >= end; i--) {
                System.out.print(i + (i == end ? ")" : ","));
            }
        } else {
            System.out.print("(");
            for (char i = start; i <= end; i++) {
                System.out.print(i + (i == end ? ")" : ","));
            }
        }
        System.out.println();
    }

}