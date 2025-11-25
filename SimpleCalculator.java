
import java.util.Scanner;

class SimpleCalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter the operation you want to perform: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Divison");
        int opt = sc.nextInt();
        switch (opt) {
            case 1:
                int sum = num1+num2;
                System.out.println("The addition is: "+sum);
                break;
            case 2:
                int diff = num1+ -num2;
                System.out.println("The subttaction is: "+diff);
                break;
            case 3:
                int mul = num1*num2;
                System.out.println("The multiplication is: "+mul);
                break;
            case 4:
                int div = num1/num2;
                System.out.println("The divison is: "+div);
                break;
            default:
                System.out.println("Enter the correct option: ");
        }

    }
}