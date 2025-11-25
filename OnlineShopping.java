
import java.util.Scanner;

class OnlineShopping{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the details of the Flipkart");
        System.out.println("Enter the amount of the shirt: ");
        float amtFlipkart = sc.nextFloat();
        System.out.println("Enter the discount offered: ");
        float discFlipkart = sc.nextFloat();
        System.out.println("Enter the shipping charges: ");
        float shipFlipkart = sc.nextFloat();

         System.out.println("Enter the details of the Snapdeal");
        System.out.println("Enter the amount of the shirt: ");
        float amtSnapdeal = sc.nextFloat();
        System.out.println("Enter the discount offered: ");
        float discSnapdeal = sc.nextFloat();
        System.out.println("Enter the shipping charges: ");
        float shipSnapdeal = sc.nextFloat();

         System.out.println("Enter the details of the Amazon");
        System.out.println("Enter the amount of the shirt: ");
        float amtAmazon = sc.nextFloat();
        System.out.println("Enter the discount offered: ");
        float discAmazon = sc.nextFloat();
        System.out.println("Enter the shipping charges: ");
        float shipAmazon = sc.nextFloat();

        float discAmtFlipkart = amtFlipkart * (discFlipkart / 100);
        float finalAmtFlipkart = amtFlipkart - discAmtFlipkart + shipFlipkart;
        System.out.println("In flipkart: "+finalAmtFlipkart);

        float discAmtSnapdeal = amtSnapdeal * (discSnapdeal / 100);
        float finalAmtSnapdeal = amtSnapdeal - discAmtSnapdeal + shipSnapdeal;
        System.out.println("In Snapdeal: "+finalAmtSnapdeal);

        float discAmtAmazon = amtAmazon * (discAmazon / 100);
        float finalAmtAmazon = amtAmazon - discAmtAmazon + shipAmazon;
        System.out.println("In Amazon: "+finalAmtAmazon);

        if(finalAmtFlipkart < finalAmtSnapdeal && finalAmtFlipkart < finalAmtAmazon){
            System.out.println("He will prefer flipkar");
        }
        else if (finalAmtSnapdeal < finalAmtAmazon) {
            System.out.println("He will prefer snapdeal");
        }
        else{
            System.out.println("He will prefer amazon");
        }

    }
}