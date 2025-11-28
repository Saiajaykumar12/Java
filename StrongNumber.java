import java.util.Scanner;
class StrongNumber{

    static int factorial(int m){
        int fact = 1;
        for(int i=1;i<=m;i++){
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int originalNumber = n;
        int sum = 0;
        while(originalNumber>0){
            int digit = originalNumber % 10;
            sum += factorial(digit);
            originalNumber/=10;
        }

        if(sum == n){
            System.out.println(n+" is a strong number");
        }
        else{
            System.out.println(n+" is not a strong number");
        }

    }
}