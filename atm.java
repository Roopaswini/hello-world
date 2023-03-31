import java.util.Scanner;

public class atm {
    
    public static void main(String[] args) {

        int balance = 1000, withdraw, deposit;
        try (Scanner sc = new Scanner(System.in)) {
            while(true) {
                System.out.println("choose 1 for Withdraw");
                System.out.println("choose 2 for Deposit");
                System.out.println("choose 3 for CheckBalance");
                System.out.println("choose 4 for Exit");
                
                int choice = sc.nextInt();
                switch(choice)
                {
                    case 1:
                    System.out.print("Enter money to withdraw:");

                    withdraw = sc.nextInt();

                    if(balance >= withdraw) {
                        balance = balance-withdraw;
                        System.out.println("Please collect u r money");
                    }
                    
                    else

                    {
                        System.out.println("Insufficent Balance");
                    }

                    System.out.println("");
                    break;

                    case 2:
                    System.out.print("Enter money to deposit");

                    deposit = sc.nextInt();

                    balance = balance + deposit;
                    System.out.println("Your money has been deposited");
                    System.out.println("");
                    break;

                    case 3:

                    System.out.println("Balance : "+balance);
                    System.out.println("");
                    break;

                    case 4:

                    System.exit(0);

                }
            }
        }
    }
}
