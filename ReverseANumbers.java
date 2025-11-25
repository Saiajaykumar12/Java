
import java.util.Scanner;

class ReverseANumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int reversed = 0;
        while(n>0){
            int remainer = n%10;
            reversed = reversed * 10 + remainer;
            n/=10;
        }
        System.out.println(reversed);
    }
}