
import java.util.Scanner;

class TemperatureController{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        if(temp>30){
            System.out.println("Turn ON AC");
        }
        else if (temp<18) {
            System.out.println("Turn ON Heater");
        }
        else if(temp>=18 && temp<=30){
            System.out.println("Comfortable Temperature");
        }
        else{
            System.out.println("Enter the correct input!");
        }
    }
}