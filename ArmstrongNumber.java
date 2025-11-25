
import java.util.Scanner;

class ArmstrongNumber{
    public static void main(String[] args) {
        System.out.println("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int armstrong = 0;
        while(temp>0){
            int rem = temp % 10;
            int result = rem * rem * rem;
            armstrong+=result;
            temp/=10;
        }
        if(armstrong == n){
            System.out.println("Given number is armstrong: "+armstrong);
        }
        else{
            System.out.println("Given number is not armstrong");
        }
    }
}