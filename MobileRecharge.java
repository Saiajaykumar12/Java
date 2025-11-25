import java.util.Scanner;

public class MobileRecharge{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1: 1GB/day - 199/-");
        System.out.println("2: 1.5GB/day - 249/-");
        System.out.println("3: 2GB/day - 299/-");
        int planNumber = sc.nextInt();
        switch (planNumber) {
            case 1:
                System.out.println("Recharge of 199rs with 1GB/day has been activated");
                break;
            case 2:
                System.out.println("Recharge of 249rs with 1.5GB/day has been activated");
                break;
            case 3:
                System.out.println("Recharge of 299rs with 2GB/day has been activated");
                break;
            default:
                System.out.println("Invalid input!");
        }
    }
}