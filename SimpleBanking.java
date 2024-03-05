import java.util.Scanner;
public class SimpleBanking {
    private static double balance = 10000;
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to Simple Banking Application!");

        boolean quit = false;
        while (!quit) {
            printMenu();
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    deposit();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    quit = true;
                    System.out.println("Thank you for using Simple Banking Application!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
    private static void printMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }
    private static void deposit() {
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid amount. Deposit failed.");
        }
    }
    private static void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient funds or invalid amount. Withdrawal failed.");
        }
    }
    private static void checkBalance() {
        System.out.println("Your balance is: $" + balance);
    }
}
