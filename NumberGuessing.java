import java.util.Random;
import java.util.Scanner;

class NumberGuessing{
    public static void main(String[] args) {
        Random r = new Random();
        int numberGuess = r.nextInt(10);
        System.out.println("Guess a number between 0 to 9:");
        System.out.println("You have four chances:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first guess:");
        int guess1 = sc.nextInt();
        System.out.println("Your firstguess is: " + guess1);
        System.out.println("Enter your second guess:");
        int guess2 = sc.nextInt();
        System.out.println("Your second guess is: " + guess2);
        System.out.println("Enter your third guess:");
        int guess3 = sc.nextInt();
        System.out.println("Your third guess is: " + guess3);
        System.out.println("Enter your fourth guess:");
        int guess4 = sc.nextInt();
        System.out.println("Your fourth guess is: " + guess4);

        if(guess1 == numberGuess || guess2 == numberGuess || guess3 == numberGuess || guess4 == numberGuess){
            System.out.println("Congratulations! You guessed the number correctly.");
        }
        else{
            System.out.println("Sorry! You did not guess the number. The correct number was: " + numberGuess);
        }
    }
}