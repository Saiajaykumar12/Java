
import java.util.Scanner;

class BankAccount{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter account number: ");
        long accountNumber = sc.nextLong();
        System.out.println("Enter balance: ");
        float balance = sc.nextFloat();
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        int option = sc.nextInt();
        

        switch (option) {
            case 1:
                System.out.println("Enter the amount you want to deposit :");
                long amt = sc.nextLong();
                System.out.println(amt+ " have been debited into your account");
                break;
            case 2:
                System.out.println("Enter the amount you want to withdraw :");
                long amou = sc.nextLong();
                System.out.println("Collect your amount ");
                break;
            case 3:
                System.out.println("Check balance :");
                System.out.println(balance+" amount");
                break;
            default:
                System.out.println("Enter the correct option");
        }
    }
}