
import java.util.Scanner;

class StationeryShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the item you want to buy (pen/pencil/notebook/eraser): ");
        String item = sc.next();
        System.out.println("Number of items available in the stock: ");
        int stock = sc.nextInt();
        System.out.println("Enter the amount of one item:");
        float price = sc.nextFloat();
        System.out.println("Number of items asked by the customer: ");
        int asked = sc.nextInt();

        if(stock == 0){
            System.out.println("Out of stock");
        }
        else{
            float totalPrice = asked * price;
            int remStock = stock - asked;
            System.out.println("The amount for "+asked+" is "+totalPrice);
            System.out.println("Remaining number of "+item+ "prsent in the stock " +remStock);
        }
        

    }
}