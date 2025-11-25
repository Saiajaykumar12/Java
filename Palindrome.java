
import java.util.Scanner;

class Palindrome{
    public static void main(String[] args) {
        System.out.println("Enter your number");
        Scanner sc = new Scanner(System.in);
        int originalNumber = sc.nextInt();
        int temp = originalNumber;
        int reversedNumber = 0;
        while(temp>0){
            int rem = temp % 10;
            reversedNumber = reversedNumber * 10 + rem;
            temp/=10;
        }
        if(originalNumber == reversedNumber){
            System.out.println("Given number is palindrome "+reversedNumber);
        }
        else{
            System.out.println("Given number is not palindrome "+reversedNumber);
        }
    }
}