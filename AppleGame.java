
import java.util.Scanner;

class AppleGame{
    public static void main(String[] args){
        System.out.println("Welcome to the Apple Game!");
        Scanner sc = new Scanner(System.in);
        int apples = sc.nextInt();
        if(apples % 2 == 0){
            System.out.println("Friend");
        }
        else{
            System.out.println("You");
        }
    }
}