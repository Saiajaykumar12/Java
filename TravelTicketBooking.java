
import java.util.Scanner;

class TravelTicketBooking{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter passanger name: ");
        String name = sc.nextLine();
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        System.out.println("From city: ");
        String fromCity = sc.nextLine();
        System.out.println("To city: ");
        String toCity = sc.nextLine();
        System.out.println("Enter ticket price: ");
        float ticketPrice = sc.nextFloat();
        System.out.println(name);
        System.out.println(age);
        System.out.println(fromCity);
        System.out.println(toCity);
    }
}