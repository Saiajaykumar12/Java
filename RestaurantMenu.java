
import java.util.Scanner;

class RestaurantMenu{
    public static void main(String[] args) {
        System.out.println("--- Enter the menu item number ---");
        System.out.println("1: Pizza - 120/- ");
        System.out.println("2: Burger - 80/- ");
        System.out.println("3: Momos - 60/- ");
        System.out.println("4: Coffee - 40/- ");
        Scanner sc = new Scanner(System.in);
        int itemNumber = sc.nextInt();
        switch (itemNumber) {
            case 1:
                System.out.println("Thankyou for ordering pizza!");
                break;
            case 2:
                System.out.println("Thankyou for ordering burger!");
                break;
            case 3:
                System.out.println("Thankyou for ordering momos!");
                break;
            case 4:
                System.out.println("Thankyou for ordering coffee!");
                break;
            default:
                System.out.println("Item not available");
        }
    }
}